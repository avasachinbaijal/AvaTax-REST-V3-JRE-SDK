package Avalara.SDK.auth;

import Avalara.SDK.AccessToken;
import Avalara.SDK.ApiException;
import Avalara.SDK.Pair;
import com.nimbusds.oauth2.sdk.*;
import com.nimbusds.oauth2.sdk.auth.ClientAuthentication;
import com.nimbusds.oauth2.sdk.auth.ClientSecretBasic;
import com.nimbusds.oauth2.sdk.auth.Secret;
import com.nimbusds.oauth2.sdk.id.ClientID;
import com.nimbusds.oauth2.sdk.token.RefreshToken;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.*;

public class RetryingOAuth extends OAuth implements Interceptor {

    String tokenUrl;
    String clientId;
    String secret;
    AuthorizationGrant authorizationGrant;
    Map<String, List<String>> parameters;


    private Map<String, AccessToken> accessTokenCache = new HashMap<>();


    /**
    @param tokenUrl The token URL to be used for this OAuth2 flow.
        Applicable to the following OAuth2 flows: "password", "clientCredentials" and "authorizationCode".
        The value must be an absolute URL.
    @param clientId The OAuth2 client ID for the "clientCredentials" flow.
    @param clientSecret The OAuth2 client secret for the "clientCredentials" flow.
    */
    public RetryingOAuth(
            String tokenUrl,
            String clientId,
            String clientSecret,
            AuthorizationGrant authorizationGrant,
            Map<String, List<String>> parameters
    ) {
        this.tokenUrl = tokenUrl;
        this.clientId = clientId;
        this.secret = clientSecret;
        this.authorizationGrant = authorizationGrant;
        this.parameters = parameters;
    }



    @Override
    public Response intercept(Chain chain) throws IOException {
        return retryingIntercept(chain, true);
    }

    private Response retryingIntercept(Chain chain, boolean updateTokenAndRetryOnAuthorizationFailure) throws IOException {
        Request request = chain.request();
        ScopeWrapper wrapper = request.tag(ScopeWrapper.class);
        String scope = wrapper.getScope();
        // If the request already has an authorization (e.g. Basic auth), proceed with the request as is
        if (request.header("Authorization") != null) {
            return chain.proceed(request);
        }

        // Get the token if it has not yet been acquired
        if (getAccessToken(scope) == null) {
            updateAccessToken(scope, null);
        }

        OAuthClientRequest oAuthRequest;
        if (getAccessToken(scope) != null) {
            // Build the request
            Request.Builder requestBuilder = request.newBuilder();

            String requestAccessToken = getAccessToken(scope);
            try {
                oAuthRequest =
                        new OAuthBearerClientRequest(request.url().toString()).
                                setAccessToken(requestAccessToken).
                                buildHeaderMessage();
            } catch (OAuthSystemException e) {
                throw new IOException(e);
            }

            Map<String, String> headers = oAuthRequest.getHeaders();
            for (String headerName : headers.keySet()) {
                requestBuilder.addHeader(headerName, headers.get(headerName));
            }
            requestBuilder.url(oAuthRequest.getLocationUri());

            // Execute the request
            Response response = chain.proceed(requestBuilder.build());

            // 401/403 response codes most likely indicate an expired access token, unless it happens two times in a row
            if (
                    response != null &&
                            (   response.code() == HttpURLConnection.HTTP_UNAUTHORIZED ||
                                    response.code() == HttpURLConnection.HTTP_FORBIDDEN     ) &&
                            updateTokenAndRetryOnAuthorizationFailure
            ) {
                try {
                    //String scope, String requestAccessToken, String tokenUrl, String clientId, String secret
                    if (updateAccessToken(scope, requestAccessToken)) {
                        response.body().close();
                        return retryingIntercept(chain, false);
                    }
                } catch (Exception e) {
                    response.body().close();
                    throw e;
                }
            }
            return response;
        }
        else {
           // return chain.request().newBuilder().removeHeader("_avalara-temp-scope").build();
            return chain.proceed(chain.request());
        }
    }




    // Applying authorization to parameters is performed in the retryingIntercept method
    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                             String payload, String method, URI uri) throws ApiException {
        // No implementation necessary
    }

    public String getAccessToken(String scope) {
        // We will first check if we have the token created recently in our
        // cache. If present then we will return from cache otherwise return NULL
        AccessToken accessToken = accessTokenCache.get(standardizeScopes(scope));
        if(!Objects.isNull(accessToken)) {
          // Check if the token expiry is in next 5 minutes or not, return NULL if true
          Instant nowPlus5Minutes = Instant.now().plusSeconds(300);
          if(nowPlus5Minutes.isBefore(accessToken.getExpiryTime()))
            return accessToken.getToken();
        }
        return null;
    }

    public void setAccessToken(String scope, String accessToken, long expiresInSeconds) {
        Instant expiryTime = Instant.now().plusSeconds(expiresInSeconds);
        AccessToken token = new AccessToken(accessToken, expiryTime);
        this.accessTokenCache.put(standardizeScopes(scope), token);
    }

    private String standardizeScopes(String scope) {
        String[] strArray = scope.split(" ");
        Arrays.sort(strArray);
        return String.join(" ", strArray);
    }

    public synchronized boolean updateAccessToken(String scope, String requestAccessToken) {

        if (getAccessToken(scope) == null || getAccessToken(scope).equals(requestAccessToken)) {
            try {

                // Construct the code grant from the code obtained from the authz endpoint
                // and the original callback URI used at the authz endpoint
                // The credentials to authenticate the client at the token endpoint
                ClientID clientID = new ClientID(this.clientId);
                Secret clientSecret = new Secret(this.secret);
                ClientAuthentication clientAuth = new ClientSecretBasic(clientID, clientSecret);

                // The token endpoint
                URI tokenEndpoint = null;
                try {
                    tokenEndpoint = new URI(tokenUrl);
                } catch (URISyntaxException e) {
                    System.out.println("Error while creating the token URI");
                    throw e;
                }


                // Make the token request
                TokenRequest request = new TokenRequest(tokenEndpoint, clientAuth, this.authorizationGrant, new Scope(scope), null, this.parameters);
                TokenResponse tokenResponse = null;
                try {
                    tokenResponse = TokenResponse.parse(request.toHTTPRequest().send());
                } catch (IOException e) {
                    System.out.println("Error sending the token request");
                    throw e;
                } catch (ParseException e) {
                    System.out.println("Error parsing the reponse from Token request");
                    throw e;
                }


                if (!tokenResponse.indicatesSuccess()) {
                    // We got an error response...
                    TokenErrorResponse errorResponse = tokenResponse.toErrorResponse();
                }

                AccessTokenResponse successResponse = tokenResponse.toSuccessResponse();

// Get the access token, the server may also return a refresh token
                com.nimbusds.oauth2.sdk.token.AccessToken accessToken = successResponse.getTokens().getAccessToken();
                RefreshToken refreshToken = successResponse.getTokens().getRefreshToken();

                if (accessToken != null && accessToken.getValue() != null) {
                    setAccessToken(scope, accessToken.getValue(), accessToken.getLifetime());
                }
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return getAccessToken(scope) == null || !getAccessToken(scope).equals(requestAccessToken);
    }
}

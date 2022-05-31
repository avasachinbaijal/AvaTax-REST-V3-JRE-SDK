package Avalara.SDK.auth;

import Avalara.SDK.AccessToken;
import Avalara.SDK.ApiException;
import Avalara.SDK.Pair;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.time.Instant;
import java.util.*;

public class RetryingOAuth extends OAuth implements Interceptor {
    private OAuthClient oAuthClient;

    private TokenRequestBuilder tokenRequestBuilder;
    private Map<String, AccessToken> accessTokenCache = new HashMap<>();

    public RetryingOAuth(OkHttpClient client, TokenRequestBuilder tokenRequestBuilder) {
        this.oAuthClient = new OAuthClient(new OAuthOkHttpClient(client));
        this.tokenRequestBuilder = tokenRequestBuilder;
    }

    public RetryingOAuth(TokenRequestBuilder tokenRequestBuilder) {
        this(new OkHttpClient(), tokenRequestBuilder);
    }

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
            OAuthFlow flow,
            String clientSecret,
            Map<String, String> parameters
    ) {
        this(OAuthClientRequest.tokenLocation(tokenUrl)
                .setClientId(clientId)
                .setClientSecret(clientSecret));
        setFlow(flow);
        if (parameters != null) {
            for (String paramName : parameters.keySet()) {
                tokenRequestBuilder.setParameter(paramName, parameters.get(paramName));
            }
        }
    }

    public void setFlow(OAuthFlow flow) {
        switch(flow) {
            case accessCode:
                tokenRequestBuilder.setGrantType(GrantType.AUTHORIZATION_CODE);
                break;
            case implicit:
                tokenRequestBuilder.setGrantType(GrantType.IMPLICIT);
                break;
            case password:
                tokenRequestBuilder.setGrantType(GrantType.PASSWORD);
                break;
            case application:
                tokenRequestBuilder.setGrantType(GrantType.CLIENT_CREDENTIALS);
                break;
            default:
                break;
        }
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

    /*
     * Returns true if the access token has been updated
     */
    public synchronized boolean updateAccessToken(String scope, String requestAccessToken) throws IOException {
        if (getAccessToken(scope) == null || getAccessToken(scope).equals(requestAccessToken)) {
            try {
                OAuthJSONAccessTokenResponse accessTokenResponse =
                        oAuthClient.accessToken(tokenRequestBuilder.setScope(scope).buildBodyMessage());
                if (accessTokenResponse != null && accessTokenResponse.getAccessToken() != null) {
                    setAccessToken(scope, accessTokenResponse.getAccessToken(), accessTokenResponse.getExpiresIn());
                }
            } catch (OAuthSystemException | OAuthProblemException e) {
                throw new IOException(e);
            }
        }
        return getAccessToken(scope) == null || !getAccessToken(scope).equals(requestAccessToken);
    }

    public TokenRequestBuilder getTokenRequestBuilder() {
        return tokenRequestBuilder;
    }

    public void setTokenRequestBuilder(TokenRequestBuilder tokenRequestBuilder) {
        this.tokenRequestBuilder = tokenRequestBuilder;
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
}

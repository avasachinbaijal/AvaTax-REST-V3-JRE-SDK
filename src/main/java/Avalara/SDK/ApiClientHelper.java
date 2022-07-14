package Avalara.SDK;

import com.nimbusds.oauth2.sdk.*;
import com.nimbusds.oauth2.sdk.device.*;
import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import com.nimbusds.oauth2.sdk.http.HTTPResponse;
import com.nimbusds.oauth2.sdk.id.ClientID;
import com.nimbusds.oauth2.sdk.token.RefreshToken;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ApiClientHelper {

    // Initiates a device authorization OAuth flow
    public static DeviceAuthResponse initiateDeviceAuthorizationOAuth(String scope, Configuration configuration) throws Exception {
        OpenIdHelper.populateConfigWithOpenIdDetails(configuration);
        DeviceAuthResponse authResponse;
        try {
            HTTPRequest deviceAuthorizationRequest;
            try {
                deviceAuthorizationRequest = new DeviceAuthorizationRequest.Builder(new ClientID(configuration.getClientId()))
                        .scope(StringUtils.isNotEmpty(scope)?new Scope(scope):null)
                        .endpointURI(new URI(configuration.getDeviceAuthorizationUrl()))
                        .build()
                        .toHTTPRequest();
            } catch (URISyntaxException e) {
                System.out.println("Unable to parse the device authorization uri");
                throw e;
            }


            HTTPResponse deviceAuthorizationHttpResponse = null;
            try {
                deviceAuthorizationHttpResponse = deviceAuthorizationRequest.send();
            } catch (IOException e) {
                System.out.println("Unable to get the response from device Authorization HTTP Request");
                throw e;
            }

            // Parse the response
            DeviceAuthorizationResponse deviceAuthorizationResponse = null;
            try {
                deviceAuthorizationResponse = DeviceAuthorizationResponse.parse(deviceAuthorizationHttpResponse);
            } catch (ParseException e) {
                System.out.println("Unable to parse the response from device Authorization Request");
                throw e;
            }

            if (!deviceAuthorizationResponse.indicatesSuccess()) {
                System.out.println("Error: " + deviceAuthorizationResponse.toErrorResponse().getErrorObject());
                throw new Exception(deviceAuthorizationResponse.toErrorResponse().getErrorObject().toString());
            }

            DeviceAuthorizationSuccessResponse successResponse = deviceAuthorizationResponse.toSuccessResponse();
            authResponse = new DeviceAuthResponse(successResponse.getDeviceCode().getValue(), successResponse.getUserCode().getValue(),
                    successResponse.getVerificationURI().toString(), successResponse.getVerificationURIComplete().toString(),
                    successResponse.getLifetime(), successResponse.getInterval());

        } catch (Exception e){
            throw new RuntimeException(e);
        }
        return  authResponse;
    }

    public static DeviceAccessTokenResponse getAccessTokenForDeviceFlow(String deviceAuthCode, Configuration configuration){
        return getAccessTokenForDeviceFlow(deviceAuthCode, null, configuration);
    }


    private static DeviceAccessTokenResponse getAccessTokenForDeviceFlow(String deviceAuthCode, String refreshToken, Configuration configuration){
        DeviceAccessTokenResponse tokenResponse = null;
        try {
            AuthorizationGrant codeGrant = null;
            if(StringUtils.isNotEmpty(deviceAuthCode)) {
                codeGrant = new DeviceCodeGrant(new DeviceCode(deviceAuthCode));
            } else if(StringUtils.isNotEmpty(refreshToken)) {
                codeGrant = new RefreshTokenGrant(new RefreshToken(refreshToken));
            }
            ClientID clientID = new ClientID(configuration.getClientId());
            URI tokenEndpoint = new URI(configuration.getTokenUrl());
            TokenRequest request = new TokenRequest(tokenEndpoint, clientID, codeGrant);
            TokenResponse response = TokenResponse.parse(request.toHTTPRequest().send());

            if (!response.indicatesSuccess()) {
                // We got an error response...
                TokenErrorResponse errorResponse = response.toErrorResponse();
                tokenResponse =  new DeviceAccessTokenResponse(errorResponse.getErrorObject().getHTTPStatusCode(),
                        errorResponse.getErrorObject().getCode(),null, null,
                        null, 0, null, null);
                return tokenResponse;
            }

            AccessTokenResponse successResponse = response.toSuccessResponse();
            tokenResponse = new DeviceAccessTokenResponse(200, null, (String)successResponse.getCustomParameters().get("id_token"),
                    successResponse.getTokens().getRefreshToken().getValue(),successResponse.getTokens().getAccessToken().getValue(),
                    successResponse.getTokens().getAccessToken().getLifetime(), successResponse.getTokens().getAccessToken().getType().getValue(),
                    successResponse.getTokens().getAccessToken().getScope().toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return tokenResponse;
    }

    public static DeviceAccessTokenResponse getAccessTokenUsingRefreshTokenForDeviceCodeFlow(String refreshToken, Configuration configuration) {
        return getAccessTokenForDeviceFlow(null, refreshToken, configuration);
    }
}

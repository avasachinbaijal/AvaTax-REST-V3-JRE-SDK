package Avalara.SDK;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OpenIdHelper {
    public static void populateConfigWithOpenIdDetails(Configuration config) throws Exception {
        AvaTaxEnvironment env = config.getEnvironment();
        switch (env) {
            case Production:
                fetchOpenIdConnectObject(ApiConstants.OPENID_CONNECT_URL_PRD, config);
            case Sandbox:
                fetchOpenIdConnectObject(ApiConstants.OPENID_CONNECT_URL_SBX, config);
            case QA:
                fetchOpenIdConnectObject(ApiConstants.OPENID_CONNECT_URL_QA, config);
            case Test:
                if(StringUtils.isEmpty(config.getTokenUrl())) {
                    throw new Exception("When using the Test Environment, a tokenUrl must be specified for OAuth2 token retrieval.");
                }
        }
    }

    /**
     * Method to fetch the Token URL from OpenID Configuration
     */
    private static void fetchOpenIdConnectObject(String url, Configuration config) throws Exception {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            OpenIdConnectURLs openIdConnectURLs = new Gson().fromJson(response.body(), OpenIdConnectURLs.class);
            config.setTokenUrl(openIdConnectURLs.getTokenEndpoint());
            config.setDeviceAuthorizationUrl(openIdConnectURLs.getDeviceAuthorizationEndpoint());
        } catch(Exception ex) {
            System.err.println("Exception when calling OpenIdConnect to fetch the token endpoint");
            ex.printStackTrace();
            throw ex;
        }
    }
}

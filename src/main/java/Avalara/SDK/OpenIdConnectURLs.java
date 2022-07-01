package Avalara.SDK;

import com.google.gson.annotations.SerializedName;

public class OpenIdConnectURLs {
    public static final String TOKEN_ENDPOINT = "token_endpoint";
    public static final String DEVICE_AUTHORIZATION_ENDPOINT = "device_authorization_endpoint";



    @SerializedName(TOKEN_ENDPOINT)
    private String tokenEndpoint;

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }


    @SerializedName(DEVICE_AUTHORIZATION_ENDPOINT)
    private String deviceAuthorizationEndpoint;

    public String getDeviceAuthorizationEndpoint() {
        return deviceAuthorizationEndpoint;
    }

    public void setDeviceAuthorizationEndpoint(String deviceAuthorizationEndpoint) {
        this.deviceAuthorizationEndpoint = deviceAuthorizationEndpoint;
    }


}

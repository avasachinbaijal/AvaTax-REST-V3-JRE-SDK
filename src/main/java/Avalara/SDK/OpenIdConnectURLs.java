package Avalara.SDK;

import com.google.gson.annotations.SerializedName;

public class OpenIdConnectURLs {
    public static final String TOKEN_ENDPOINT = "token_endpoint";

    @SerializedName(TOKEN_ENDPOINT)
    private String tokenEndpoint;


    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }
}

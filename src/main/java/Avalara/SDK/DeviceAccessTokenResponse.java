package Avalara.SDK;

public class DeviceAccessTokenResponse {
    int httpStatusCode;
    String errorMessage;
    String idToken;
    String refreshToken;
    String accessToken;
    long expiryTime;
    String tokenType;
    String scope;

    public DeviceAccessTokenResponse(int httpStatusCode, String errorMessage, String idToken, String refreshToken,
                                     String accessToken, long expiryTime, String tokenType, String scope) {
        this.httpStatusCode = httpStatusCode;
        this.errorMessage = errorMessage;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
        this.accessToken = accessToken;
        this.expiryTime = expiryTime;
        this.tokenType = tokenType;
        this.scope = scope;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getIdToken() {
        return idToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public long getExpiryTime() {
        return expiryTime;
    }

    public String getTokenType() {
        return tokenType;
    }

    public String getScope() {
        return scope;
    }
}

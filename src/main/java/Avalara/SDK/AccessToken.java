package Avalara.SDK;

import java.time.Instant;

public class AccessToken {
    private String token;
    private Instant expiryTime;

    public AccessToken() {
    }

    public AccessToken(String token, Instant expiryTime) {
        this.token = token;
        this.expiryTime = expiryTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Instant getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Instant expiryTime) {
        this.expiryTime = expiryTime;
    }
}

package Avalara.SDK;

import com.nimbusds.oauth2.sdk.device.DeviceCode;
import com.nimbusds.oauth2.sdk.device.UserCode;

import java.net.URI;

public class DeviceAuthResponse {
    /**
     * The device verification code.
     */
    private final String deviceCode;


    /**
     * The end-user verification code.
     */
    private final String userCode;


    /**
     * The end-user verification URI on the authorization server. The URI
     * should be and easy to remember as end-users will be asked to
     * manually type it into their user-agent.
     */
    private final String verificationURI;


    /**
     * Optional. A verification URI that includes the "user_code" (or other
     * information with the same function as the "user_code"), designed for
     * non-textual transmission.
     */
    private final String verificationURIComplete;


    /**
     * The lifetime in seconds of the "device_code" and "user_code".
     */
    private final long lifetime;


    /**
     * Optional. The minimum amount of time in seconds that the client
     * SHOULD wait between polling requests to the token endpoint. If no
     * value is provided, clients MUST use 5 as the default.
     */
    private final long interval;

    public DeviceAuthResponse(String deviceCode, String userCode, String verificationURI, String verificationURIComplete, long lifetime, long interval) {
        this.deviceCode = deviceCode;
        this.userCode = userCode;
        this.verificationURI = verificationURI;
        this.verificationURIComplete = verificationURIComplete;
        this.lifetime = lifetime;
        this.interval = interval;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getVerificationURI() {
        return verificationURI;
    }

    public String getVerificationURIComplete() {
        return verificationURIComplete;
    }

    public long getLifetime() {
        return lifetime;
    }

    public long getInterval() {
        return interval;
    }
}

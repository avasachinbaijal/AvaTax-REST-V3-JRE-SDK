/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * IAMDS
 *
 * Platform IAMDS consists of services on top of which the Avalara Compliance Cloud platform is built. These services are foundational and provide functionality such as common organization, tenant and user management for the rest of the compliance platform.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    2.4.33
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Configuration {

    public Configuration() {
        Timeout = 10000;
    }

    /**
     * Official URL of AvaTax (Sandbox)
     */
    private static final String AVATAX_SANDBOX_URL = "https://sandbox-rest.avatax.com";

    /**
     * Official URL of AvaTax (Production)
     */
    private static final String AVATAX_PRODUCTION_URL = "https://rest.avatax.com";

    /**
     * Gets or sets the Username (HTTP basic authentication).
     */
    private String Username;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    /**
     * Gets or sets the password (HTTP basic authentication).
     */
    private String Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    /**
     * Gets or sets the access token (OAuth 2.0).
     */
    private String BearerToken;

    public String getBearerToken() {
        return BearerToken;
    }

    public void setBearerToken(String bearerToken) {
        BearerToken = bearerToken;
    }

    /**
     * Gets or sets the AvaTax Environment the API is targeting.
     */
    private AvaTaxEnvironment Environment;

    public AvaTaxEnvironment getEnvironment() {
        return Environment;
    }

    public void setEnvironment(AvaTaxEnvironment environment) {
        Environment = environment;
    }

    /**
     * Gets or sets the HTTP timeout (milliseconds) of ApiClient. Default to 100000 milliseconds.
     */
    private int Timeout;

    public int getTimeout() {
        return Timeout;
    }

    public void setTimeout(int timeout) {
        Timeout = timeout;
    }

    /**
     * Gets or sets the Application Name.
     */
    private String AppName;

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    /**
     * Gets or sets the Application Version.
     */
    private String AppVersion;

    public String getAppVersion() {
        return AppVersion;
    }

    public void setAppVersion(String appVersion) {
        AppVersion = appVersion;
    }

    /**
     * Gets or sets the Machine Name.
     */
    private String MachineName;

    public String getMachineName() {
        return MachineName;
    }

    public void setMachineName(String machineName) {
        MachineName = machineName;
    }

    /**
     * Gets or sets the Test Url. Used for local developer testing.
     */
    private String TestBasePath;

    public String getTestBasePath() {
        return TestBasePath;
    }

    public void setTestBasePath(String testBasePath) {
        TestBasePath = testBasePath;
    }

    /**
     * Gets or sets the Test Toke URL. Used for local developer testing for retrieving OAuth tokens.
     */
    private String tokenUrl;

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    /**
     * Gets or sets the ClientId Used for OAuth2 Client Credentials flow.
     */
    private String ClientId;

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    /**
     * Gets or sets the ClientSecret Used for OAuth2 Client Credentials flow.
     */
    private String ClientSecret;

    public String getClientSecret() {
        return ClientSecret;
    }

    public void setClientSecret(String clientSecret) {
        ClientSecret = clientSecret;
    }

    /**
     * Gets the Base Path.
     */
    public String getBasePath() {
        switch (this.getEnvironment()) {
            case Production:
                return AVATAX_PRODUCTION_URL;
            case Sandbox:
            case QA:
                return AVATAX_SANDBOX_URL;
            case Test:
                if (this.getTestBasePath() == null)
                    throw new NullPointerException("When Environment is set to 'Test', the Test URL is a required parameter.");
                return this.getTestBasePath();
        }
        throw new Error("Environment does not match any base path.");
    }
}
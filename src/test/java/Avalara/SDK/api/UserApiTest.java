/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara Shipping Verification for Beverage Alcohol
 *
 * API for evaluating transactions against direct-to-consumer Beverage Alcohol shipping regulations.  This API is currently in beta.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    2.4.22
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.api;

import Avalara.SDK.*;
import Avalara.SDK.auth.OAuthFlow;
import Avalara.SDK.auth.RetryingOAuth;
import Avalara.SDK.model.IAMDS.User;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;
import io.github.cdimascio.dotenv.Dotenv;

import java.util.UUID;

/**
 * API tests for ShippingVerificationApi
 */
public class UserApiTest {
    private Avalara.SDK.api.IAMDS.UserApi api;

    /**
     * Removes the transaction from consideration when evaluating regulations that span multiple transactions.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws Exception {
        Configuration configuration = getConfiguration(AvaTaxEnvironment.Test);
        configuration.setTokenUrl("https://dev-75323271.okta.com/oauth2/default/v1/token");
        ApiClient apiClient = new ApiClient(configuration);
        api = new Avalara.SDK.api.IAMDS.UserApi(apiClient);
        UUID correlationId = UUID.randomUUID();
        User user = new User();
        try {
            api.listUsers("","","", "", false, false, "", "");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        try {
            api.createUser("1.2.3", correlationId.toString(), user);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        try {
            api.createUser("1.2.3", correlationId.toString(), user);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        // TODO: test validations
    }

    @Test
    public void accessTokenCacheExpiryTest() {
        Configuration configuration = getConfiguration(AvaTaxEnvironment.Test);
        configuration.setTokenUrl("https://dev-75323271.okta.com/oauth2/default/v1/token");
        RetryingOAuth retryingOAuth = new RetryingOAuth(configuration.getTokenUrl(), configuration.getClientId(), OAuthFlow.application, configuration.getClientSecret(), null);
        // Scenario 1: When Token is going to expire with 5 minutes of GetAccessToken Call.
        // In this case, it should return NULL
        retryingOAuth.setAccessToken("scope1", "abc", 10L);
        String token = retryingOAuth.getAccessToken("scope1");
        Assert.assertNull(token);

        // Scenario 2: When token is going to expire in more than 5 minutes of GetAccessToken Call.
        // In this case, it should return the existing token
        retryingOAuth.setAccessToken("scope1", "def", 500L);
        token = retryingOAuth.getAccessToken("scope1");
        Assert.assertNotNull(token);
    }

    @Test
    public void verifyOpenIdConfigurationTest() throws Exception {
        Configuration configuration = getConfiguration(AvaTaxEnvironment.QA);
        ApiClient apiClient = new ApiClient(configuration);
        // As we don't have .env file in repo therefore ignore this test case if we choose to
        // set clientId/secret otherwise it will go in retryingIntercept and fail. The following method call is
        // just to make sure that the response comes back fine and we can parse the right URL
        String tokenUrl = apiClient.getTokenUrl(configuration);
        Assert.assertEquals("https://ai-awscqa.avlr.sh/connect/token", tokenUrl);
    }

    @NotNull
    private Configuration getConfiguration(AvaTaxEnvironment env) {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().ignoreIfMalformed().load();
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        // Configure Auth to run test here.
        //configuration.setUsername("foo");
        //configuration.setPassword("bar");
        configuration.setTimeout(5000);
        configuration.setEnvironment(env);
        //configuration.setClientId(dotenv.get("CLIENT_ID"));
        //configuration.setClientSecret(dotenv.get("CLIENT_SECRET"));
        //configuration.setAccessToken(dotenv.get("ACCESS_TOKEN"));
        configuration.setTestBasePath("https://localhost:3000");
        return configuration;
    }
}
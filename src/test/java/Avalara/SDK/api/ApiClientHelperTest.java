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
import io.github.cdimascio.dotenv.Dotenv;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ShippingVerificationApi
 */
public class ApiClientHelperTest {
    private Configuration configuration;

    public ApiClientHelperTest() {
        configuration = getConfiguration();
    }

    @NotNull
    private Configuration getConfiguration() {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().ignoreIfMalformed().load();
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.QA);
        configuration.setClientId("sdkDeviceFlowWebClient");
        //configuration.setClientSecret(null);
        //configuration.setTokenUrl("https://ai-awsfqa.avlr.sh/connect/token");
        //configuration.setDeviceAuthorizationUrl("https://ai-awsfqa.avlr.sh/connect/deviceauthorization");


        //configuration.setClientId(dotenv.get("CLIENT_ID"));
        //configuration.setClientSecret(dotenv.get("CLIENT_SECRET"));
        //configuration.setBearerToken(dotenv.get("ACCESS_TOKEN"));


        configuration.setTestBasePath("https://localhost:3000");
        return configuration;
    }


    @Test
    public void verifyDeviceAuthorizationFlow() throws Exception {
        DeviceAuthResponse response = ApiClientHelper.initiateDeviceAuthorizationOAuth(null, configuration);
        DeviceAccessTokenResponse tokenResponse = ApiClientHelper.getAccessTokenForDeviceFlow(response.getDeviceCode(), configuration);
        Assert.assertEquals(tokenResponse.getErrorMessage(),"authorization_pending");
    }

    @Test
    @Ignore("For this test to run, you need to authenticate manually using user code by pausing the flow at line 145 and then proceed")
    public void verifyRefreshTokenFlow() throws Exception {
        DeviceAuthResponse response = ApiClientHelper.initiateDeviceAuthorizationOAuth(null, configuration);
        DeviceAccessTokenResponse tokenResponse = ApiClientHelper.getAccessTokenForDeviceFlow(response.getDeviceCode(), configuration);
        String refreshToken = tokenResponse.getRefreshToken();
        tokenResponse = ApiClientHelper.getAccessTokenUsingRefreshTokenForDeviceCodeFlow(refreshToken, configuration);
        Assert.assertNotNull(tokenResponse.getIdToken());
        Assert.assertNotNull(tokenResponse.getAccessToken());
    }
}
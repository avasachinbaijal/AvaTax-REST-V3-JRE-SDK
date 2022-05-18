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

import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.AvaTaxEnvironment;
import Avalara.SDK.Configuration;
import Avalara.SDK.model.IAMDS.User;
import org.junit.Test;
import io.github.cdimascio.dotenv.Dotenv;

import java.util.UUID;

/**
 * API tests for ShippingVerificationApi
 */
public class UserApiTest {
    private Avalara.SDK.api.IAMDS.UserApi api;

    public UserApiTest() {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().ignoreIfMalformed().load();
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        // Configure Auth to run test here.
        configuration.setUsername("foo");
        configuration.setPassword("bar");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.Test);
        configuration.setClientId(dotenv.get("CLIENT_ID"));
        configuration.setClientSecret(dotenv.get("CLIENT_SECRET"));
        configuration.setTestTokenUrl("https://dev-75323271.okta.com/oauth2/default/v1/token");
        configuration.setTestBasePath("https://localhost:3000");
        try {
            ApiClient apiClient = new ApiClient(configuration);
            api = new Avalara.SDK.api.IAMDS.UserApi(apiClient);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    /**
     * Removes the transaction from consideration when evaluating regulations that span multiple transactions.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
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

}
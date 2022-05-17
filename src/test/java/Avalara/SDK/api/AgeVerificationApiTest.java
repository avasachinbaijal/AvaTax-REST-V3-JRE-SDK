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
import  Avalara.SDK.api.AgeVerification.AgeVerificationApi;
import Avalara.SDK.ApiException;
import Avalara.SDK.AvaTaxEnvironment;
import Avalara.SDK.Configuration;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for AgeVerificationApi
 */
@Ignore
public class AgeVerificationApiTest {
    private AgeVerificationApi api;

    public AgeVerificationApiTest() {
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        // Configure Auth to run test here.
        configuration.setUsername("foo");
        configuration.setPassword("bar");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
        try {
            ApiClient apiClient = new ApiClient(configuration);
            api = new AgeVerificationApi(apiClient);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    /**
     * Determines whether an individual meets or exceeds the minimum legal drinking age.
     *
     * The request must meet the following criteria in order to be evaluated: * *firstName*, *lastName*, and *address* are required fields. * One of the following sets of attributes are required for the *address*:   * *line1, city, region*   * *line1, postalCode*  Optionally, the transaction and its lines may use the following parameters: * A *DOB* (Date of Birth) field. The value should be ISO-8601 compliant (e.g. 2020-07-21). * Beyond the required *address* fields above, a *country* field is permitted   * The valid values for this attribute are [*US, USA*]  **Security Policies** This API depends on the active subscription *AgeVerification*
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyAgeTest() throws ApiException {
        Avalara.SDK.model.AgeVerification.AgeVerifyRequest ageVerifyRequest = null;
        Avalara.SDK.model.AgeVerification.AgeVerifyFailureCode simulatedFailureCode = null;
        Avalara.SDK.model.AgeVerification.AgeVerifyResult response = api.verifyAge(ageVerifyRequest, simulatedFailureCode);
        // TODO: test validations
    }
    
}
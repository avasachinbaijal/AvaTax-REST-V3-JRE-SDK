/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara Shipping Verification only
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
import Avalara.SDK.model.ErrorDetails;
import Avalara.SDK.model.ShippingVerifyResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShippingVerificationApi
 */
@Ignore
public class ShippingVerificationApiTest {
    private ShippingVerificationApi api;

    public ShippingVerificationApiTest() {
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        // Configure Auth to run test here.
        configuration.setUsername("foo");
        configuration.setPassword("bar");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
        ApiClient apiClient = new ApiClient(configuration);
        api = new ShippingVerificationApi(apiClient);
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
    public void deregisterShipmentTest() throws ApiException {
        String companyCode = null;
        String transactionCode = null;
        String documentType = null;
                api.deregisterShipment(companyCode, transactionCode, documentType);
        // TODO: test validations
    }
    
    /**
     * Registers the transaction so that it may be included when evaluating regulations that span multiple transactions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerShipmentTest() throws ApiException {
        String companyCode = null;
        String transactionCode = null;
        String documentType = null;
                api.registerShipment(companyCode, transactionCode, documentType);
        // TODO: test validations
    }
    
    /**
     * Evaluates a transaction against a set of direct-to-consumer shipping regulations and, if compliant, registers the transaction so that it may be included when evaluating regulations that span multiple transactions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerShipmentIfCompliantTest() throws ApiException {
        String companyCode = null;
        String transactionCode = null;
        String documentType = null;
                ShippingVerifyResult response = api.registerShipmentIfCompliant(companyCode, transactionCode, documentType);
        // TODO: test validations
    }
    
    /**
     * Evaluates a transaction against a set of direct-to-consumer shipping regulations.
     *
     * The transaction and its lines must meet the following criteria in order to be evaluated: * The transaction must be recorded. Using a type of *SalesInvoice* is recommended. * A parameter with the name *AlcoholRouteType* must be specified and the value must be one of the following: &#39;*DTC*&#39;, &#39;*Retailer DTC*&#39; * A parameter with the name *RecipientName* must be specified and the value must be the name of the recipient. * Each alcohol line must include a *ContainerSize* parameter that describes the volume of a single container. Use the *unit* field to specify one of the following units: &#39;*Litre*&#39;, &#39;*Millilitre*&#39;, &#39;*gallon (US fluid)*&#39;, &#39;*quart (US fluid)*&#39;, &#39;*ounce (fluid US customary)*&#39; * Each alcohol line must include a *PackSize* parameter that describes the number of containers in a pack. Specify *Count* in the *unit* field.  Optionally, the transaction and its lines may use the following parameters: * The *ShipDate* parameter may be used if the date of shipment is different than the date of the transaction. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *RecipientDOB* parameter may be used to evaluate age restrictions. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *PurchaserDOB* parameter may be used to evaluate age restrictions. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *SalesLocation* parameter may be used to describe whether the sale was made *OnSite* or *OffSite*. *OffSite* is the default value. * The *AlcoholContent* parameter may be used to describe the alcohol percentage by volume of the item. Specify *Percentage* in the *unit* field.  **Security Policies** This API depends on all of the following active subscriptions: *AvaAlcohol, AutoAddress, AvaTaxPro*
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyShipmentTest() throws ApiException {
        String companyCode = null;
        String transactionCode = null;
        String documentType = null;
                ShippingVerifyResult response = api.verifyShipment(companyCode, transactionCode, documentType);
        // TODO: test validations
    }
    
}
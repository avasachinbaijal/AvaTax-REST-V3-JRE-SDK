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
 * @version    2.4.20
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model;

import Avalara.SDK.model.ShippingVerifyResultLines;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ShippingVerifyResult
 */
public class ShippingVerifyResultTest {
    private final ShippingVerifyResult model = new ShippingVerifyResult();

    /**
     * Model tests for ShippingVerifyResult
     */
    @Test
    public void testShippingVerifyResult() {
        // TODO: test ShippingVerifyResult
    }

    /**
     * Test the property 'compliant'
     */
    @Test
    public void compliantTest() {
        // TODO: test compliant
    }

    /**
     * Test the property 'message'
     */
    @Test
    public void messageTest() {
        // TODO: test message
    }

    /**
     * Test the property 'successMessages'
     */
    @Test
    public void successMessagesTest() {
        // TODO: test successMessages
    }

    /**
     * Test the property 'failureMessages'
     */
    @Test
    public void failureMessagesTest() {
        // TODO: test failureMessages
    }

    /**
     * Test the property 'failureCodes'
     */
    @Test
    public void failureCodesTest() {
        // TODO: test failureCodes
    }

    /**
     * Test the property 'warningCodes'
     */
    @Test
    public void warningCodesTest() {
        // TODO: test warningCodes
    }

    /**
     * Test the property 'lines'
     */
    @Test
    public void linesTest() {
        // TODO: test lines
    }

}
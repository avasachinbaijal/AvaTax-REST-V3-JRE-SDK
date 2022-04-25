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

package Avalara.SDK.model;

import Avalara.SDK.model.AgeVerification.AgeVerifyResult;
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
 * Model tests for AgeVerifyResult
 */
public class AgeVerifyResultTest {
    private final AgeVerifyResult model = new AgeVerifyResult();

    /**
     * Model tests for AgeVerifyResult
     */
    @Test
    public void testAgeVerifyResult() {
        // TODO: test AgeVerifyResult
    }

    /**
     * Test the property 'isOfAge'
     */
    @Test
    public void isOfAgeTest() {
        // TODO: test isOfAge
    }

    /**
     * Test the property 'failureCodes'
     */
    @Test
    public void failureCodesTest() {
        // TODO: test failureCodes
    }

}

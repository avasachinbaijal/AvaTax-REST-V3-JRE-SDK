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
 * @version    2.4.25
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model;

import java.util.Objects;
import java.util.Arrays;
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

/**
 * The Result of a call to the /ageVerification/verify endpoint.
 */
@ApiModel(description = "The Result of a call to the /ageVerification/verify endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AgeVerifyResult {
  public static final String SERIALIZED_NAME_IS_OF_AGE = "isOfAge";
  @SerializedName(SERIALIZED_NAME_IS_OF_AGE)
  private Boolean isOfAge;

  public static final String SERIALIZED_NAME_FAILURE_CODES = "failureCodes";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODES)
  private List<AgeVerifyResult> failureCodes = null;

  public AgeVerifyResult() { 
  }

  public AgeVerifyResult isOfAge(Boolean isOfAge) {
    
    this.isOfAge = isOfAge;
    return this;
  }

   /**
   * Describes whether the individual meets or exceeds the minimum legal drinking age.
   * @return isOfAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes whether the individual meets or exceeds the minimum legal drinking age.")

  public Boolean getIsOfAge() {
    return isOfAge;
  }


  public void setIsOfAge(Boolean isOfAge) {
    this.isOfAge = isOfAge;
  }


  public AgeVerifyResult failureCodes(List<AgeVerifyResult> failureCodes) {
    
    this.failureCodes = failureCodes;
    return this;
  }

  public AgeVerifyResult addFailureCodesItem(AgeVerifyResult failureCodesItem) {
    if (this.failureCodes == null) {
      this.failureCodes = new ArrayList<AgeVerifyResult>();
    }
    this.failureCodes.add(failureCodesItem);
    return this;
  }

   /**
   * A list of failure codes describing why a *false* age determination was made.
   * @return failureCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of failure codes describing why a *false* age determination was made.")

  public List<AgeVerifyResult> getFailureCodes() {
    return failureCodes;
  }


  public void setFailureCodes(List<AgeVerifyResult> failureCodes) {
    this.failureCodes = failureCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeVerifyResult ageVerifyResult = (AgeVerifyResult) o;
    return Objects.equals(this.isOfAge, ageVerifyResult.isOfAge) &&
        Objects.equals(this.failureCodes, ageVerifyResult.failureCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOfAge, failureCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeVerifyResult {\n");
    sb.append("    isOfAge: ").append(toIndentedString(isOfAge)).append("\n");
    sb.append("    failureCodes: ").append(toIndentedString(failureCodes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


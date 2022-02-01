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
 * @version    2.4.5.4
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package org.openapitools.client.model;

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
 * ShippingVerifyResultLines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingVerifyResultLines {
  /**
   * Describes whether the line is compliant or not. In cases where a determination could not be made, resultCode will provide the reason why.
   */
  @JsonAdapter(ResultCodeEnum.Adapter.class)
  public enum ResultCodeEnum {
    COMPLIANT("Compliant"),
    
    NOTCOMPLIANT("NotCompliant"),
    
    UNSUPPORTEDTAXCODE("UnsupportedTaxCode"),
    
    UNSUPPORTEDADDRESS("UnsupportedAddress"),
    
    INVALIDLINE("InvalidLine");

    private String value;

    ResultCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultCodeEnum fromValue(String value) {
      for (ResultCodeEnum b : ResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private ResultCodeEnum resultCode;

  public static final String SERIALIZED_NAME_LINE_NUMBER = "lineNumber";
  @SerializedName(SERIALIZED_NAME_LINE_NUMBER)
  private String lineNumber;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SUCCESS_MESSAGES = "successMessages";
  @SerializedName(SERIALIZED_NAME_SUCCESS_MESSAGES)
  private String successMessages;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGES = "failureMessages";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGES)
  private String failureMessages;

  /**
   * Gets or Sets failureCodes
   */
  @JsonAdapter(FailureCodesEnum.Adapter.class)
  public enum FailureCodesEnum {
    BELOWLEGALDRINKINGAGE("BelowLegalDrinkingAge"),
    
    SHIPPINGPROHIBITEDTOADDRESS("ShippingProhibitedToAddress"),
    
    MISSINGREQUIREDLICENSE("MissingRequiredLicense"),
    
    VOLUMELIMITEXCEEDED("VolumeLimitExceeded"),
    
    INVALIDFIELDVALUE("InvalidFieldValue"),
    
    MISSINGREQUIREDFIELD("MissingRequiredField"),
    
    INVALIDFIELDTYPE("InvalidFieldType"),
    
    INVALIDFORMAT("InvalidFormat"),
    
    INVALIDDATE("InvalidDate");

    private String value;

    FailureCodesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FailureCodesEnum fromValue(String value) {
      for (FailureCodesEnum b : FailureCodesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FailureCodesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FailureCodesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FailureCodesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FailureCodesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FAILURE_CODES = "failureCodes";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODES)
  private List<FailureCodesEnum> failureCodes = null;

  public ShippingVerifyResultLines() { 
  }

  public ShippingVerifyResultLines resultCode(ResultCodeEnum resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Describes whether the line is compliant or not. In cases where a determination could not be made, resultCode will provide the reason why.
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes whether the line is compliant or not. In cases where a determination could not be made, resultCode will provide the reason why.")

  public ResultCodeEnum getResultCode() {
    return resultCode;
  }


  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }


  public ShippingVerifyResultLines lineNumber(String lineNumber) {
    
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * The lineNumber of the line evaluated.
   * @return lineNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lineNumber of the line evaluated.")

  public String getLineNumber() {
    return lineNumber;
  }


  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }


  public ShippingVerifyResultLines message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A short description of the result of the checks made against this line.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the result of the checks made against this line.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ShippingVerifyResultLines successMessages(String successMessages) {
    
    this.successMessages = successMessages;
    return this;
  }

   /**
   * A detailed description of the result of each of the passed checks made against this line.
   * @return successMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed description of the result of each of the passed checks made against this line.")

  public String getSuccessMessages() {
    return successMessages;
  }


  public void setSuccessMessages(String successMessages) {
    this.successMessages = successMessages;
  }


  public ShippingVerifyResultLines failureMessages(String failureMessages) {
    
    this.failureMessages = failureMessages;
    return this;
  }

   /**
   * A detailed description of the result of each of the failed checks made against this line.
   * @return failureMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed description of the result of each of the failed checks made against this line.")

  public String getFailureMessages() {
    return failureMessages;
  }


  public void setFailureMessages(String failureMessages) {
    this.failureMessages = failureMessages;
  }


  public ShippingVerifyResultLines failureCodes(List<FailureCodesEnum> failureCodes) {
    
    this.failureCodes = failureCodes;
    return this;
  }

  public ShippingVerifyResultLines addFailureCodesItem(FailureCodesEnum failureCodesItem) {
    if (this.failureCodes == null) {
      this.failureCodes = new ArrayList<FailureCodesEnum>();
    }
    this.failureCodes.add(failureCodesItem);
    return this;
  }

   /**
   * An enumeration of all the failure codes received for this line.
   * @return failureCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An enumeration of all the failure codes received for this line.")

  public List<FailureCodesEnum> getFailureCodes() {
    return failureCodes;
  }


  public void setFailureCodes(List<FailureCodesEnum> failureCodes) {
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
    ShippingVerifyResultLines shippingVerifyResultLines = (ShippingVerifyResultLines) o;
    return Objects.equals(this.resultCode, shippingVerifyResultLines.resultCode) &&
        Objects.equals(this.lineNumber, shippingVerifyResultLines.lineNumber) &&
        Objects.equals(this.message, shippingVerifyResultLines.message) &&
        Objects.equals(this.successMessages, shippingVerifyResultLines.successMessages) &&
        Objects.equals(this.failureMessages, shippingVerifyResultLines.failureMessages) &&
        Objects.equals(this.failureCodes, shippingVerifyResultLines.failureCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, lineNumber, message, successMessages, failureMessages, failureCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingVerifyResultLines {\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    successMessages: ").append(toIndentedString(successMessages)).append("\n");
    sb.append("    failureMessages: ").append(toIndentedString(failureMessages)).append("\n");
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


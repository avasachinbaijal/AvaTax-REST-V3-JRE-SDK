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
 * @version    2.4.7.2
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
import org.openapitools.client.model.ShippingVerifyResultLines;

/**
 * The Response of the /shippingverify endpoint. Describes the result of checking all applicable shipping rules against each line in the transaction.
 */
@ApiModel(description = "The Response of the /shippingverify endpoint. Describes the result of checking all applicable shipping rules against each line in the transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingVerifyResult {
  public static final String SERIALIZED_NAME_COMPLIANT = "compliant";
  @SerializedName(SERIALIZED_NAME_COMPLIANT)
  private Boolean compliant;

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

  /**
   * Gets or Sets warningCodes
   */
  @JsonAdapter(WarningCodesEnum.Adapter.class)
  public enum WarningCodesEnum {
    UNSUPPORTEDTAXCODE("UnsupportedTaxCode"),
    
    UNSUPPORTEDADDRESS("UnsupportedAddress");

    private String value;

    WarningCodesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WarningCodesEnum fromValue(String value) {
      for (WarningCodesEnum b : WarningCodesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WarningCodesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WarningCodesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WarningCodesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WarningCodesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WARNING_CODES = "warningCodes";
  @SerializedName(SERIALIZED_NAME_WARNING_CODES)
  private List<WarningCodesEnum> warningCodes = null;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<ShippingVerifyResultLines> lines = null;

  public ShippingVerifyResult() { 
  }

  public ShippingVerifyResult compliant(Boolean compliant) {
    
    this.compliant = compliant;
    return this;
  }

   /**
   * Whether every line in the transaction is compliant.
   * @return compliant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether every line in the transaction is compliant.")

  public Boolean getCompliant() {
    return compliant;
  }


  public void setCompliant(Boolean compliant) {
    this.compliant = compliant;
  }


  public ShippingVerifyResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A short description of the result of the compliance check.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the result of the compliance check.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ShippingVerifyResult successMessages(String successMessages) {
    
    this.successMessages = successMessages;
    return this;
  }

   /**
   * A detailed description of the result of each of the passed checks made against this transaction, separated by line.
   * @return successMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed description of the result of each of the passed checks made against this transaction, separated by line.")

  public String getSuccessMessages() {
    return successMessages;
  }


  public void setSuccessMessages(String successMessages) {
    this.successMessages = successMessages;
  }


  public ShippingVerifyResult failureMessages(String failureMessages) {
    
    this.failureMessages = failureMessages;
    return this;
  }

   /**
   * A detailed description of the result of each of the failed checks made against this transaction, separated by line.
   * @return failureMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed description of the result of each of the failed checks made against this transaction, separated by line.")

  public String getFailureMessages() {
    return failureMessages;
  }


  public void setFailureMessages(String failureMessages) {
    this.failureMessages = failureMessages;
  }


  public ShippingVerifyResult failureCodes(List<FailureCodesEnum> failureCodes) {
    
    this.failureCodes = failureCodes;
    return this;
  }

  public ShippingVerifyResult addFailureCodesItem(FailureCodesEnum failureCodesItem) {
    if (this.failureCodes == null) {
      this.failureCodes = new ArrayList<FailureCodesEnum>();
    }
    this.failureCodes.add(failureCodesItem);
    return this;
  }

   /**
   * An enumeration of all the failure codes received across all lines.
   * @return failureCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An enumeration of all the failure codes received across all lines.")

  public List<FailureCodesEnum> getFailureCodes() {
    return failureCodes;
  }


  public void setFailureCodes(List<FailureCodesEnum> failureCodes) {
    this.failureCodes = failureCodes;
  }


  public ShippingVerifyResult warningCodes(List<WarningCodesEnum> warningCodes) {
    
    this.warningCodes = warningCodes;
    return this;
  }

  public ShippingVerifyResult addWarningCodesItem(WarningCodesEnum warningCodesItem) {
    if (this.warningCodes == null) {
      this.warningCodes = new ArrayList<WarningCodesEnum>();
    }
    this.warningCodes.add(warningCodesItem);
    return this;
  }

   /**
   * An enumeration of all the warning codes received across all lines that a determination could not be made for.
   * @return warningCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An enumeration of all the warning codes received across all lines that a determination could not be made for.")

  public List<WarningCodesEnum> getWarningCodes() {
    return warningCodes;
  }


  public void setWarningCodes(List<WarningCodesEnum> warningCodes) {
    this.warningCodes = warningCodes;
  }


  public ShippingVerifyResult lines(List<ShippingVerifyResultLines> lines) {
    
    this.lines = lines;
    return this;
  }

  public ShippingVerifyResult addLinesItem(ShippingVerifyResultLines linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<ShippingVerifyResultLines>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Describes the results of the checks made for each line in the transaction.
   * @return lines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes the results of the checks made for each line in the transaction.")

  public List<ShippingVerifyResultLines> getLines() {
    return lines;
  }


  public void setLines(List<ShippingVerifyResultLines> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingVerifyResult shippingVerifyResult = (ShippingVerifyResult) o;
    return Objects.equals(this.compliant, shippingVerifyResult.compliant) &&
        Objects.equals(this.message, shippingVerifyResult.message) &&
        Objects.equals(this.successMessages, shippingVerifyResult.successMessages) &&
        Objects.equals(this.failureMessages, shippingVerifyResult.failureMessages) &&
        Objects.equals(this.failureCodes, shippingVerifyResult.failureCodes) &&
        Objects.equals(this.warningCodes, shippingVerifyResult.warningCodes) &&
        Objects.equals(this.lines, shippingVerifyResult.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compliant, message, successMessages, failureMessages, failureCodes, warningCodes, lines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingVerifyResult {\n");
    sb.append("    compliant: ").append(toIndentedString(compliant)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    successMessages: ").append(toIndentedString(successMessages)).append("\n");
    sb.append("    failureMessages: ").append(toIndentedString(failureMessages)).append("\n");
    sb.append("    failureCodes: ").append(toIndentedString(failureCodes)).append("\n");
    sb.append("    warningCodes: ").append(toIndentedString(warningCodes)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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


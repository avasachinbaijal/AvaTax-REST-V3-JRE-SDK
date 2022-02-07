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
 * @version    2.4.24
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

/**
 * Message Details Object
 */
@ApiModel(description = "Message Details Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorDetailsErrorDetails {
  /**
   * Name of the error or message.
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    AUTHENTICATIONEXCEPTION("AuthenticationException"),
    
    SUBSCRIPTIONREQUIRED("SubscriptionRequired"),
    
    UNHANDLEDEXCEPTION("UnhandledException"),
    
    INVALIDADDRESS("InvalidAddress"),
    
    ENTITYNOTFOUNDERROR("EntityNotFoundError");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FAULT_CODE = "faultCode";
  @SerializedName(SERIALIZED_NAME_FAULT_CODE)
  private String faultCode;

  public static final String SERIALIZED_NAME_HELP_LINK = "helpLink";
  @SerializedName(SERIALIZED_NAME_HELP_LINK)
  private String helpLink;

  /**
   * Severity of the message
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    ERROR("Error");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SeverityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private SeverityEnum severity;

  public ErrorDetailsErrorDetails() { 
  }

  public ErrorDetailsErrorDetails code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * Name of the error or message.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "InvalidAddress", value = "Name of the error or message.")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public ErrorDetailsErrorDetails message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Concise summary of the message, suitable for display in the caption of an alert box.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The address is not deliverable.", value = "Concise summary of the message, suitable for display in the caption of an alert box.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ErrorDetailsErrorDetails number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Unique ID number referring to this error or message.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "309", value = "Unique ID number referring to this error or message.")

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public ErrorDetailsErrorDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The physical location exists but there are no homes on this street. One reason might be railroad tracks or rivers running alongside this street, as they would prevent construction of homes in this location.", value = "A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ErrorDetailsErrorDetails faultCode(String faultCode) {
    
    this.faultCode = faultCode;
    return this;
  }

   /**
   * Indicates the SOAP Fault code, if this was related to an error that corresponded to AvaTax SOAP v1 behavior.
   * @return faultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client", value = "Indicates the SOAP Fault code, if this was related to an error that corresponded to AvaTax SOAP v1 behavior.")

  public String getFaultCode() {
    return faultCode;
  }


  public void setFaultCode(String faultCode) {
    this.faultCode = faultCode;
  }


  public ErrorDetailsErrorDetails helpLink(String helpLink) {
    
    this.helpLink = helpLink;
    return this;
  }

   /**
   * URL to help for this message
   * @return helpLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://developer.avalara.com/avatax/errors/InvalidAddress", value = "URL to help for this message")

  public String getHelpLink() {
    return helpLink;
  }


  public void setHelpLink(String helpLink) {
    this.helpLink = helpLink;
  }


  public ErrorDetailsErrorDetails severity(SeverityEnum severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Severity of the message
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Error", value = "Severity of the message")

  public SeverityEnum getSeverity() {
    return severity;
  }


  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetailsErrorDetails errorDetailsErrorDetails = (ErrorDetailsErrorDetails) o;
    return Objects.equals(this.code, errorDetailsErrorDetails.code) &&
        Objects.equals(this.message, errorDetailsErrorDetails.message) &&
        Objects.equals(this.number, errorDetailsErrorDetails.number) &&
        Objects.equals(this.description, errorDetailsErrorDetails.description) &&
        Objects.equals(this.faultCode, errorDetailsErrorDetails.faultCode) &&
        Objects.equals(this.helpLink, errorDetailsErrorDetails.helpLink) &&
        Objects.equals(this.severity, errorDetailsErrorDetails.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, number, description, faultCode, helpLink, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetailsErrorDetails {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    faultCode: ").append(toIndentedString(faultCode)).append("\n");
    sb.append("    helpLink: ").append(toIndentedString(helpLink)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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


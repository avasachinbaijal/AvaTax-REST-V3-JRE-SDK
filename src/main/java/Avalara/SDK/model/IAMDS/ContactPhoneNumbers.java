/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * foundation
 *
 * Platform foundation consists of services on top of which the Avalara Compliance Cloud platform is built. These services are foundational and provide functionality such as common organization, tenant and user management for the rest of the compliance platform.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    2.4.33
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model.IAMDS;

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
 * ContactPhoneNumbers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactPhoneNumbers {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  /**
   * Type of phone number
   */
  @JsonAdapter(PhoneTypeEnum.Adapter.class)
  public enum PhoneTypeEnum {
    WORK("work"),
    
    HOME("home"),
    
    MOBILE("mobile"),
    
    FAX("fax"),
    
    OTHER("other");

    private String value;

    PhoneTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneTypeEnum fromValue(String value) {
      for (PhoneTypeEnum b : PhoneTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhoneTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhoneTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phoneType";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private PhoneTypeEnum phoneType;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;


  public ContactPhoneNumbers number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Phone number of the contact
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number of the contact")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public ContactPhoneNumbers phoneType(PhoneTypeEnum phoneType) {
    
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Type of phone number
   * @return phoneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of phone number")

  public PhoneTypeEnum getPhoneType() {
    return phoneType;
  }


  public void setPhoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
  }


  public ContactPhoneNumbers isPrimary(Boolean isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Is this the primary phone number for the contact
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is this the primary phone number for the contact")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPhoneNumbers contactPhoneNumbers = (ContactPhoneNumbers) o;
    return Objects.equals(this.number, contactPhoneNumbers.number) &&
        Objects.equals(this.phoneType, contactPhoneNumbers.phoneType) &&
        Objects.equals(this.isPrimary, contactPhoneNumbers.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, phoneType, isPrimary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPhoneNumbers {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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


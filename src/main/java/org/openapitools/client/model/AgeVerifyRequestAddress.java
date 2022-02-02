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
 * @version    2.4.7.1
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

/**
 * AgeVerifyRequestAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AgeVerifyRequestAddress {
  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  /**
   * The country code of the address.
   */
  @JsonAdapter(CountryEnum.Adapter.class)
  public enum CountryEnum {
    US("US"),
    
    USA("USA");

    private String value;

    CountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountryEnum fromValue(String value) {
      for (CountryEnum b : CountryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryEnum country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public AgeVerifyRequestAddress() { 
  }

  public AgeVerifyRequestAddress line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * Get line1
   * @return line1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public AgeVerifyRequestAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public AgeVerifyRequestAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The state code of the address.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state code of the address.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public AgeVerifyRequestAddress country(CountryEnum country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country code of the address.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country code of the address.")

  public CountryEnum getCountry() {
    return country;
  }


  public void setCountry(CountryEnum country) {
    this.country = country;
  }


  public AgeVerifyRequestAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeVerifyRequestAddress ageVerifyRequestAddress = (AgeVerifyRequestAddress) o;
    return Objects.equals(this.line1, ageVerifyRequestAddress.line1) &&
        Objects.equals(this.city, ageVerifyRequestAddress.city) &&
        Objects.equals(this.region, ageVerifyRequestAddress.region) &&
        Objects.equals(this.country, ageVerifyRequestAddress.country) &&
        Objects.equals(this.postalCode, ageVerifyRequestAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, city, region, country, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeVerifyRequestAddress {\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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


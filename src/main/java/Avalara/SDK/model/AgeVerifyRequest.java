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
 * @version    2.4.22-beta
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model;

import java.util.Objects;
import java.util.Arrays;
import Avalara.SDK.model.AgeVerifyRequestAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The Request for the /ageVerification/verify endpoint. Describes information about the person whose age is being verified.
 */
@ApiModel(description = "The Request for the /ageVerification/verify endpoint. Describes information about the person whose age is being verified.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AgeVerifyRequest {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AgeVerifyRequestAddress address;

  public static final String SERIALIZED_NAME_D_O_B = "DOB";
  @SerializedName(SERIALIZED_NAME_D_O_B)
  private String DOB;

  public AgeVerifyRequest() { 
  }

  public AgeVerifyRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public AgeVerifyRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public AgeVerifyRequest address(AgeVerifyRequestAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AgeVerifyRequestAddress getAddress() {
    return address;
  }


  public void setAddress(AgeVerifyRequestAddress address) {
    this.address = address;
  }


  public AgeVerifyRequest DOB(String DOB) {
    
    this.DOB = DOB;
    return this;
  }

   /**
   * The value should be ISO-8601 compliant (e.g. 2020-07-21).
   * @return DOB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value should be ISO-8601 compliant (e.g. 2020-07-21).")

  public String getDOB() {
    return DOB;
  }


  public void setDOB(String DOB) {
    this.DOB = DOB;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeVerifyRequest ageVerifyRequest = (AgeVerifyRequest) o;
    return Objects.equals(this.firstName, ageVerifyRequest.firstName) &&
        Objects.equals(this.lastName, ageVerifyRequest.lastName) &&
        Objects.equals(this.address, ageVerifyRequest.address) &&
        Objects.equals(this.DOB, ageVerifyRequest.DOB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, DOB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeVerifyRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    DOB: ").append(toIndentedString(DOB)).append("\n");
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


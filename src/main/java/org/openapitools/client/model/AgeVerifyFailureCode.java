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
 * @version    2.3.4
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AgeVerifyFailureCode
 */
@JsonAdapter(AgeVerifyFailureCode.Adapter.class)
public enum AgeVerifyFailureCode {
  
  NOT_FOUND("not_found"),
  
  DOB_UNVERIFIABLE("dob_unverifiable"),
  
  UNDER_AGE("under_age"),
  
  SUSPECTED_FRAUD("suspected_fraud"),
  
  DECEASED("deceased"),
  
  UNKNOWN_ERROR("unknown_error");

  private String value;

  AgeVerifyFailureCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgeVerifyFailureCode fromValue(String value) {
    for (AgeVerifyFailureCode b : AgeVerifyFailureCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgeVerifyFailureCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgeVerifyFailureCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgeVerifyFailureCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgeVerifyFailureCode.fromValue(value);
    }
  }
}


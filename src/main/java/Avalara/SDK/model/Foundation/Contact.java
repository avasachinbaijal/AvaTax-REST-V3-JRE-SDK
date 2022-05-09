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
 * Platform foundation consists of services on top of which the Avalara Compliance Cloud platform is built. These services are foundational and provide functionality such as common organization, account and user management for the rest of the compliance platform.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    2.4.32
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model.Foundation;

import java.util.Objects;
import java.util.Arrays;
import Avalara.SDK.model.Foundation.ContactEmails;
import Avalara.SDK.model.Foundation.ContactName;
import Avalara.SDK.model.Foundation.ContactPhoneNumbers;
import Avalara.SDK.model.Foundation.Reference;
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
 * Representation of a contact within the Avalara Compliance Cloud platform
 */
@ApiModel(description = "Representation of a contact within the Avalara Compliance Cloud platform")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Contact {
  /**
   * Source of truth for the contact
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    REFERENCED("referenced"),
    
    MANAGED("managed");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private SourceEnum source;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Reference user;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private ContactName name;

  /**
   * Type of contact
   */
  @JsonAdapter(ContactTypeEnum.Adapter.class)
  public enum ContactTypeEnum {
    PRIMARY("primary"),
    
    SECONDARY("secondary"),
    
    OTHER("other");

    private String value;

    ContactTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContactTypeEnum fromValue(String value) {
      for (ContactTypeEnum b : ContactTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContactTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContactTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContactTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContactTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTACT_TYPE = "contactType";
  @SerializedName(SERIALIZED_NAME_CONTACT_TYPE)
  private ContactTypeEnum contactType;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<ContactEmails> emails = new ArrayList<ContactEmails>();

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<ContactPhoneNumbers> phoneNumbers = null;


  public Contact source(SourceEnum source) {
    
    this.source = source;
    return this;
  }

   /**
   * Source of truth for the contact
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Source of truth for the contact")

  public SourceEnum getSource() {
    return source;
  }


  public void setSource(SourceEnum source) {
    this.source = source;
  }


  public Contact user(Reference user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Reference getUser() {
    return user;
  }


  public void setUser(Reference user) {
    this.user = user;
  }


  public Contact name(ContactName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContactName getName() {
    return name;
  }


  public void setName(ContactName name) {
    this.name = name;
  }


  public Contact contactType(ContactTypeEnum contactType) {
    
    this.contactType = contactType;
    return this;
  }

   /**
   * Type of contact
   * @return contactType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of contact")

  public ContactTypeEnum getContactType() {
    return contactType;
  }


  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }


  public Contact emails(List<ContactEmails> emails) {
    
    this.emails = emails;
    return this;
  }

  public Contact addEmailsItem(ContactEmails emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ContactEmails> getEmails() {
    return emails;
  }


  public void setEmails(List<ContactEmails> emails) {
    this.emails = emails;
  }


  public Contact phoneNumbers(List<ContactPhoneNumbers> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public Contact addPhoneNumbersItem(ContactPhoneNumbers phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<ContactPhoneNumbers>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ContactPhoneNumbers> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<ContactPhoneNumbers> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.source, contact.source) &&
        Objects.equals(this.user, contact.user) &&
        Objects.equals(this.name, contact.name) &&
        Objects.equals(this.contactType, contact.contactType) &&
        Objects.equals(this.emails, contact.emails) &&
        Objects.equals(this.phoneNumbers, contact.phoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, user, name, contactType, emails, phoneNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
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


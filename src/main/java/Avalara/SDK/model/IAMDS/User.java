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
 * @version    2.4.34
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model.IAMDS;

import java.util.Objects;
import java.util.Arrays;
import Avalara.SDK.model.IAMDS.Aspect;
import Avalara.SDK.model.IAMDS.Instance;
import Avalara.SDK.model.IAMDS.InstanceMeta;
import Avalara.SDK.model.IAMDS.Reference;
import Avalara.SDK.model.IAMDS.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Representation of an User
 */
@ApiModel(description = "Representation of an User")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class User {
  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Reference organization;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_NICK_NAME = "nickName";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profileUrl";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private URI profileUrl;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_TYPE = "userType";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private String userType;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGE = "preferredLanguage";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGE)
  private String preferredLanguage;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<Object> emails = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<Object> phoneNumbers = null;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Object> addresses = null;

  public static final String SERIALIZED_NAME_DEFAULT_TENANT = "defaultTenant";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TENANT)
  private Reference defaultTenant;

  public static final String SERIALIZED_NAME_CUSTOM_CLAIMS = "customClaims";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CLAIMS)
  private List<Object> customClaims = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private InstanceMeta meta;

  public static final String SERIALIZED_NAME_ASPECTS = "aspects";
  @SerializedName(SERIALIZED_NAME_ASPECTS)
  private List<Aspect> aspects = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;


  public User externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Identifier for the user in external systems (clients). The external systems manage this
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier for the user in external systems (clients). The external systems manage this")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public User userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Human readable unique identifier of the user, typically used to authenticate with an identity provider
   * @return userName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Human readable unique identifier of the user, typically used to authenticate with an identity provider")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public User organization(Reference organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Reference getOrganization() {
    return organization;
  }


  public void setOrganization(Reference organization) {
    this.organization = organization;
  }


  public User name(Object name) {
    
    this.name = name;
    return this;
  }
 

   /**
   * The components of the user&#39;s real name.  Providers MAY return just the full name as a single string in the formatted sub-attribute, or they MAY return just the individual component attributes using the other sub-attributes, or they MAY return both.  If both variants are returned, they SHOULD be describing the same name, with the formatted name indicating how the component attributes should be combined.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The components of the user's real name.  Providers MAY return just the full name as a single string in the formatted sub-attribute, or they MAY return just the individual component attributes using the other sub-attributes, or they MAY return both.  If both variants are returned, they SHOULD be describing the same name, with the formatted name indicating how the component attributes should be combined.")

  public Object getName() {
    return name;
  }


  public void setName(Object name) {
    this.name = name;
  }


  public User displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the User, suitable for display to end-users.  The name SHOULD be the full name of the User being described, if known
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the User, suitable for display to end-users.  The name SHOULD be the full name of the User being described, if known")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public User nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * The casual way to address the user in real life, e.g., &#39;Bob&#39; or &#39;Bobby&#39; instead of &#39;Robert&#39;.  This attribute SHOULD NOT be used to represent a User&#39;s username (e.g., &#39;bjensen&#39; or &#39;mpepperidge&#39;)
   * @return nickName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The casual way to address the user in real life, e.g., 'Bob' or 'Bobby' instead of 'Robert'.  This attribute SHOULD NOT be used to represent a User's username (e.g., 'bjensen' or 'mpepperidge')")

  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public User profileUrl(URI profileUrl) {
    
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * A fully qualified URL pointing to a page representing the User&#39;s online profile
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A fully qualified URL pointing to a page representing the User's online profile")

  public URI getProfileUrl() {
    return profileUrl;
  }


  public void setProfileUrl(URI profileUrl) {
    this.profileUrl = profileUrl;
  }


  public User title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The user&#39;s title, such as \&quot;Vice President.\&quot;
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's title, such as \"Vice President.\"")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public User userType(String userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * Used to identify the relationship between the organization and the user.  Typical values used might be &#39;Contractor&#39;, &#39;Employee&#39;, &#39;Intern&#39;, &#39;Temp&#39;, &#39;External&#39;, and &#39;Unknown&#39;, but any value may be used
   * @return userType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to identify the relationship between the organization and the user.  Typical values used might be 'Contractor', 'Employee', 'Intern', 'Temp', 'External', and 'Unknown', but any value may be used")

  public String getUserType() {
    return userType;
  }


  public void setUserType(String userType) {
    this.userType = userType;
  }


  public User preferredLanguage(String preferredLanguage) {
    
    this.preferredLanguage = preferredLanguage;
    return this;
  }

   /**
   * Indicates the User&#39;s preferred written or spoken language.  Generally used for selecting a localized user interface; e.g., &#39;en_US&#39; specifies the language English and country US
   * @return preferredLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the User's preferred written or spoken language.  Generally used for selecting a localized user interface; e.g., 'en_US' specifies the language English and country US")

  public String getPreferredLanguage() {
    return preferredLanguage;
  }


  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }


  public User locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Used to indicate the User&#39;s default location for purposes of localizing items such as currency, date time format, or numerical representations
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to indicate the User's default location for purposes of localizing items such as currency, date time format, or numerical representations")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public User timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The User&#39;s time zone in the &#39;Olson&#39; time zone database format, e.g., &#39;America/Los_Angeles&#39;
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The User's time zone in the 'Olson' time zone database format, e.g., 'America/Los_Angeles'")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public User active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A Boolean value indicating the User&#39;s administrative status
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Boolean value indicating the User's administrative status")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public User password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The User&#39;s cleartext password.  This attribute is intended to be used as a means to specify an initial password when creating a new User or to reset an existing User&#39;s password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The User's cleartext password.  This attribute is intended to be used as a means to specify an initial password when creating a new User or to reset an existing User's password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public User emails(List<Object> emails) {
    
    this.emails = emails;
    return this;
  }

  public User addEmailsItem(Object emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * A List of email addresses associated with the user
   * @return emails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A List of email addresses associated with the user")

  public List<Object> getEmails() {
    return emails;
  }


  public void setEmails(List<Object> emails) {
    this.emails = emails;
  }


  public User phoneNumbers(List<Object> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public User addPhoneNumbersItem(Object phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<Object>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * A List of phone numbers associated with the user
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A List of phone numbers associated with the user")

  public List<Object> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<Object> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public User addresses(List<Object> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public User addAddressesItem(Object addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Object>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * A physical mailing address for this User, as described in (address Element). Canonical Type Values of work, home, and other. The value attribute is a complex type with the following sub-attributes
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A physical mailing address for this User, as described in (address Element). Canonical Type Values of work, home, and other. The value attribute is a complex type with the following sub-attributes")

  public List<Object> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<Object> addresses) {
    this.addresses = addresses;
  }


  public User defaultTenant(Reference defaultTenant) {
    
    this.defaultTenant = defaultTenant;
    return this;
  }

   /**
   * Get defaultTenant
   * @return defaultTenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Reference getDefaultTenant() {
    return defaultTenant;
  }


  public void setDefaultTenant(Reference defaultTenant) {
    this.defaultTenant = defaultTenant;
  }


  public User customClaims(List<Object> customClaims) {
    
    this.customClaims = customClaims;
    return this;
  }

  public User addCustomClaimsItem(Object customClaimsItem) {
    if (this.customClaims == null) {
      this.customClaims = new ArrayList<Object>();
    }
    this.customClaims.add(customClaimsItem);
    return this;
  }

   /**
   * Custom claims that are returned along with a requested scope during authentication
   * @return customClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom claims that are returned along with a requested scope during authentication")

  public List<Object> getCustomClaims() {
    return customClaims;
  }


  public void setCustomClaims(List<Object> customClaims) {
    this.customClaims = customClaims;
  }


   /**
   * Unique identifier for the Object
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the Object")

  public String getId() {
    return id;
  }




  public User meta(InstanceMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstanceMeta getMeta() {
    return meta;
  }


  public void setMeta(InstanceMeta meta) {
    this.meta = meta;
  }


  public User aspects(List<Aspect> aspects) {
    
    this.aspects = aspects;
    return this;
  }

  public User addAspectsItem(Aspect aspectsItem) {
    if (this.aspects == null) {
      this.aspects = new ArrayList<Aspect>();
    }
    this.aspects.add(aspectsItem);
    return this;
  }

   /**
   * Identifier of the Resource (if any) in other systems
   * @return aspects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the Resource (if any) in other systems")

  public List<Aspect> getAspects() {
    return aspects;
  }


  public void setAspects(List<Aspect> aspects) {
    this.aspects = aspects;
  }


  public User tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public User addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * User defined tags in the form of key:value pair
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User defined tags in the form of key:value pair")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.externalId, user.externalId) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.organization, user.organization) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.nickName, user.nickName) &&
        Objects.equals(this.profileUrl, user.profileUrl) &&
        Objects.equals(this.title, user.title) &&
        Objects.equals(this.userType, user.userType) &&
        Objects.equals(this.preferredLanguage, user.preferredLanguage) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.timezone, user.timezone) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.emails, user.emails) &&
        Objects.equals(this.phoneNumbers, user.phoneNumbers) &&
        Objects.equals(this.addresses, user.addresses) &&
        Objects.equals(this.defaultTenant, user.defaultTenant) &&
        Objects.equals(this.customClaims, user.customClaims) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.meta, user.meta) &&
        Objects.equals(this.aspects, user.aspects) &&
        Objects.equals(this.tags, user.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, userName, organization, name, displayName, nickName, profileUrl, title, userType, preferredLanguage, locale, timezone, active, password, emails, phoneNumbers, addresses, defaultTenant, customClaims, id, meta, aspects, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    defaultTenant: ").append(toIndentedString(defaultTenant)).append("\n");
    sb.append("    customClaims: ").append(toIndentedString(customClaims)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    aspects: ").append(toIndentedString(aspects)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


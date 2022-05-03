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
 * @version    2.4.35
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model.Foundation;

import java.util.Objects;
import java.util.Arrays;
import Avalara.SDK.model.Foundation.Aspect;
import Avalara.SDK.model.Foundation.Instance;
import Avalara.SDK.model.Foundation.InstanceMeta;
import Avalara.SDK.model.Foundation.Reference;
import Avalara.SDK.model.Foundation.Tag;
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
 * An App represents any software package that intends to interact with Avalara Compliance Cloud
 */
@ApiModel(description = "An App represents any software package that intends to interact with Avalara Compliance Cloud")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class App {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * Type of application
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SPA("spa"),
    
    WEB("web"),
    
    NATIVE("native");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Reference organization;

  public static final String SERIALIZED_NAME_IS_TENANT_AGNOSTIC = "isTenantAgnostic";
  @SerializedName(SERIALIZED_NAME_IS_TENANT_AGNOSTIC)
  private Boolean isTenantAgnostic = false;

  public static final String SERIALIZED_NAME_IS_ORG_AGNOSTIC = "isOrgAgnostic";
  @SerializedName(SERIALIZED_NAME_IS_ORG_AGNOSTIC)
  private Boolean isOrgAgnostic = false;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<Object> accounts = null;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirectUris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  private List<String> redirectUris = null;

  public static final String SERIALIZED_NAME_GRANTS = "grants";
  @SerializedName(SERIALIZED_NAME_GRANTS)
  private List<Reference> grants = null;

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


  public App displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the App/Service
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the App/Service")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public App type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of application
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of application")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public App organization(Reference organization) {
    
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


  public App isTenantAgnostic(Boolean isTenantAgnostic) {
    
    this.isTenantAgnostic = isTenantAgnostic;
    return this;
  }

   /**
   * Whether the App is allowed to access information across all Tenants (Accounts) within its Organization
   * @return isTenantAgnostic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the App is allowed to access information across all Tenants (Accounts) within its Organization")

  public Boolean getIsTenantAgnostic() {
    return isTenantAgnostic;
  }


  public void setIsTenantAgnostic(Boolean isTenantAgnostic) {
    this.isTenantAgnostic = isTenantAgnostic;
  }


  public App isOrgAgnostic(Boolean isOrgAgnostic) {
    
    this.isOrgAgnostic = isOrgAgnostic;
    return this;
  }

   /**
   * Whether the App is allowed to access information across all Organizations and Accounts
   * @return isOrgAgnostic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the App is allowed to access information across all Organizations and Accounts")

  public Boolean getIsOrgAgnostic() {
    return isOrgAgnostic;
  }


  public void setIsOrgAgnostic(Boolean isOrgAgnostic) {
    this.isOrgAgnostic = isOrgAgnostic;
  }


  public App accounts(List<Object> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public App addAccountsItem(Object accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<Object>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<Object> accounts) {
    this.accounts = accounts;
  }


   /**
   * The clientId used for OAuth flows
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The clientId used for OAuth flows")

  public String getClientId() {
    return clientId;
  }




  public App redirectUris(List<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public App addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<String>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * Defines the registered redirect URIs for the app - determines where tokens are sent after authentication
   * @return redirectUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the registered redirect URIs for the app - determines where tokens are sent after authentication")

  public List<String> getRedirectUris() {
    return redirectUris;
  }


  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }


  public App grants(List<Reference> grants) {
    
    this.grants = grants;
    return this;
  }

  public App addGrantsItem(Reference grantsItem) {
    if (this.grants == null) {
      this.grants = new ArrayList<Reference>();
    }
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * List of grants associated with the App
   * @return grants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of grants associated with the App")

  public List<Reference> getGrants() {
    return grants;
  }


  public void setGrants(List<Reference> grants) {
    this.grants = grants;
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




  public App meta(InstanceMeta meta) {
    
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


  public App aspects(List<Aspect> aspects) {
    
    this.aspects = aspects;
    return this;
  }

  public App addAspectsItem(Aspect aspectsItem) {
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


  public App tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public App addTagsItem(Tag tagsItem) {
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
    App app = (App) o;
    return Objects.equals(this.displayName, app.displayName) &&
        Objects.equals(this.type, app.type) &&
        Objects.equals(this.organization, app.organization) &&
        Objects.equals(this.isTenantAgnostic, app.isTenantAgnostic) &&
        Objects.equals(this.isOrgAgnostic, app.isOrgAgnostic) &&
        Objects.equals(this.accounts, app.accounts) &&
        Objects.equals(this.clientId, app.clientId) &&
        Objects.equals(this.redirectUris, app.redirectUris) &&
        Objects.equals(this.grants, app.grants) &&
        Objects.equals(this.id, app.id) &&
        Objects.equals(this.meta, app.meta) &&
        Objects.equals(this.aspects, app.aspects) &&
        Objects.equals(this.tags, app.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, type, organization, isTenantAgnostic, isOrgAgnostic, accounts, clientId, redirectUris, grants, id, meta, aspects, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    isTenantAgnostic: ").append(toIndentedString(isTenantAgnostic)).append("\n");
    sb.append("    isOrgAgnostic: ").append(toIndentedString(isOrgAgnostic)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
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


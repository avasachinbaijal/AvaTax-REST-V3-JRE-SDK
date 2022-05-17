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
import java.util.ArrayList;
import java.util.List;

/**
 * Representation of an Entitlement between an Tenant and a System
 */
@ApiModel(description = "Representation of an Entitlement between an Tenant and a System")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Entitlement {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private Reference system;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private Reference tenant;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<Reference> features = null;

  public static final String SERIALIZED_NAME_CUSTOM_GRANTS = "customGrants";
  @SerializedName(SERIALIZED_NAME_CUSTOM_GRANTS)
  private List<Reference> customGrants = null;

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


  public Entitlement displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the entitlement, used for display purposes
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the entitlement, used for display purposes")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Entitlement system(Reference system) {
    
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Reference getSystem() {
    return system;
  }


  public void setSystem(Reference system) {
    this.system = system;
  }


  public Entitlement tenant(Reference tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Reference getTenant() {
    return tenant;
  }


  public void setTenant(Reference tenant) {
    this.tenant = tenant;
  }


  public Entitlement active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Status of the entitlement - active or inactive
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the entitlement - active or inactive")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Entitlement features(List<Reference> features) {
    
    this.features = features;
    return this;
  }

  public Entitlement addFeaturesItem(Reference featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<Reference>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * List of features associated with the entitlement
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of features associated with the entitlement")

  public List<Reference> getFeatures() {
    return features;
  }


  public void setFeatures(List<Reference> features) {
    this.features = features;
  }


  public Entitlement customGrants(List<Reference> customGrants) {
    
    this.customGrants = customGrants;
    return this;
  }

  public Entitlement addCustomGrantsItem(Reference customGrantsItem) {
    if (this.customGrants == null) {
      this.customGrants = new ArrayList<Reference>();
    }
    this.customGrants.add(customGrantsItem);
    return this;
  }

   /**
   * List of custom grants applicable for the entitlement
   * @return customGrants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of custom grants applicable for the entitlement")

  public List<Reference> getCustomGrants() {
    return customGrants;
  }


  public void setCustomGrants(List<Reference> customGrants) {
    this.customGrants = customGrants;
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




  public Entitlement meta(InstanceMeta meta) {
    
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


  public Entitlement aspects(List<Aspect> aspects) {
    
    this.aspects = aspects;
    return this;
  }

  public Entitlement addAspectsItem(Aspect aspectsItem) {
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


  public Entitlement tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Entitlement addTagsItem(Tag tagsItem) {
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
    Entitlement entitlement = (Entitlement) o;
    return Objects.equals(this.displayName, entitlement.displayName) &&
        Objects.equals(this.system, entitlement.system) &&
        Objects.equals(this.tenant, entitlement.tenant) &&
        Objects.equals(this.active, entitlement.active) &&
        Objects.equals(this.features, entitlement.features) &&
        Objects.equals(this.customGrants, entitlement.customGrants) &&
        Objects.equals(this.id, entitlement.id) &&
        Objects.equals(this.meta, entitlement.meta) &&
        Objects.equals(this.aspects, entitlement.aspects) &&
        Objects.equals(this.tags, entitlement.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, system, tenant, active, features, customGrants, id, meta, aspects, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entitlement {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    customGrants: ").append(toIndentedString(customGrants)).append("\n");
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


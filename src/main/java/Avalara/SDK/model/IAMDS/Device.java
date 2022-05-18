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
import java.util.ArrayList;
import java.util.List;

/**
 * Representation of a Device
 */
@ApiModel(description = "Representation of a Device")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Device {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private Reference tenant;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_GRANTS = "grants";
  @SerializedName(SERIALIZED_NAME_GRANTS)
  private List<Reference> grants = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<Reference> groups = null;

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


  public Device displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the Device, used for display purposes
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Device, used for display purposes")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Device tenant(Reference tenant) {
    
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


  public Device identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Identity of the device, for example, a public X.509 certificate
   * @return identity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identity of the device, for example, a public X.509 certificate")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public Device active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A Boolean value indicating the Device&#39;s administrative status
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Boolean value indicating the Device's administrative status")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Device grants(List<Reference> grants) {
    
    this.grants = grants;
    return this;
  }

  public Device addGrantsItem(Reference grantsItem) {
    if (this.grants == null) {
      this.grants = new ArrayList<Reference>();
    }
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * List of grants associated with the Device
   * @return grants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of grants associated with the Device")

  public List<Reference> getGrants() {
    return grants;
  }


  public void setGrants(List<Reference> grants) {
    this.grants = grants;
  }


  public Device groups(List<Reference> groups) {
    
    this.groups = groups;
    return this;
  }

  public Device addGroupsItem(Reference groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<Reference>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of groups to which the Device belongs
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of groups to which the Device belongs")

  public List<Reference> getGroups() {
    return groups;
  }


  public void setGroups(List<Reference> groups) {
    this.groups = groups;
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




  public Device meta(InstanceMeta meta) {
    
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


  public Device aspects(List<Aspect> aspects) {
    
    this.aspects = aspects;
    return this;
  }

  public Device addAspectsItem(Aspect aspectsItem) {
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


  public Device tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Device addTagsItem(Tag tagsItem) {
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
    Device device = (Device) o;
    return Objects.equals(this.displayName, device.displayName) &&
        Objects.equals(this.tenant, device.tenant) &&
        Objects.equals(this.identity, device.identity) &&
        Objects.equals(this.active, device.active) &&
        Objects.equals(this.grants, device.grants) &&
        Objects.equals(this.groups, device.groups) &&
        Objects.equals(this.id, device.id) &&
        Objects.equals(this.meta, device.meta) &&
        Objects.equals(this.aspects, device.aspects) &&
        Objects.equals(this.tags, device.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, tenant, identity, active, grants, groups, id, meta, aspects, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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


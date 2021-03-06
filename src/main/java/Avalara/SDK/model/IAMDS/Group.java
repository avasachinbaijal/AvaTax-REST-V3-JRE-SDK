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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Representation of a Group that can contain other principals
 */
@ApiModel(description = "Representation of a Group that can contain other principals")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Group {
  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private Reference tenant;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<Object> members = null;

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


  public Group externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Identifier for the group in external systems (clients). The external systems manage this
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier for the group in external systems (clients). The external systems manage this")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Group displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the group, unique within the Tenant
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the group, unique within the Tenant")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Group tenant(Reference tenant) {
    
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


  public Group members(List<Object> members) {
    
    this.members = members;
    return this;
  }

  public Group addMembersItem(Object membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<Object>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * List of members belonging to the group
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of members belonging to the group")

  public List<Object> getMembers() {
    return members;
  }


  public void setMembers(List<Object> members) {
    this.members = members;
  }


  public Group grants(List<Reference> grants) {
    
    this.grants = grants;
    return this;
  }

  public Group addGrantsItem(Reference grantsItem) {
    if (this.grants == null) {
      this.grants = new ArrayList<Reference>();
    }
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * List of grants assigned to the Group
   * @return grants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of grants assigned to the Group")

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




  public Group meta(InstanceMeta meta) {
    
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


  public Group aspects(List<Aspect> aspects) {
    
    this.aspects = aspects;
    return this;
  }

  public Group addAspectsItem(Aspect aspectsItem) {
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


  public Group tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Group addTagsItem(Tag tagsItem) {
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
    Group group = (Group) o;
    return Objects.equals(this.externalId, group.externalId) &&
        Objects.equals(this.displayName, group.displayName) &&
        Objects.equals(this.tenant, group.tenant) &&
        Objects.equals(this.members, group.members) &&
        Objects.equals(this.grants, group.grants) &&
        Objects.equals(this.id, group.id) &&
        Objects.equals(this.meta, group.meta) &&
        Objects.equals(this.aspects, group.aspects) &&
        Objects.equals(this.tags, group.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, displayName, tenant, members, grants, id, meta, aspects, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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


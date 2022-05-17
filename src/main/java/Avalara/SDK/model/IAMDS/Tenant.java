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
 * A Tenant represents a virtual space that provides a logical container and security boundary for customer data
 */
@ApiModel(description = "A Tenant represents a virtual space that provides a logical container and security boundary for customer data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Tenant {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Reference organization;

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


  public Tenant displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Human readable name for this Tenant
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Human readable name for this Tenant")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Tenant organization(Reference organization) {
    
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


   /**
   * Unique identifier for the Object
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the Object")

  public String getId() {
    return id;
  }




  public Tenant meta(InstanceMeta meta) {
    
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


  public Tenant aspects(List<Aspect> aspects) {
    
    this.aspects = aspects;
    return this;
  }

  public Tenant addAspectsItem(Aspect aspectsItem) {
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


  public Tenant tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Tenant addTagsItem(Tag tagsItem) {
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
    Tenant tenant = (Tenant) o;
    return Objects.equals(this.displayName, tenant.displayName) &&
        Objects.equals(this.organization, tenant.organization) &&
        Objects.equals(this.id, tenant.id) &&
        Objects.equals(this.meta, tenant.meta) &&
        Objects.equals(this.aspects, tenant.aspects) &&
        Objects.equals(this.tags, tenant.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, organization, id, meta, aspects, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenant {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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


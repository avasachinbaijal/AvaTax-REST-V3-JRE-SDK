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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import org.threeten.bp.OffsetDateTime;

/**
 * Meta data associated with this object. This information is automatically inserted by the service.
 */
@ApiModel(description = "Meta data associated with this object. This information is automatically inserted by the service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstanceMeta {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private OffsetDateTime lastModified;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private URI location;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public InstanceMeta created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Date and time information when this object was created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time information when this object was created")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public InstanceMeta createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Id of the user/app that created this object
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the user/app that created this object")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public InstanceMeta lastModified(OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Date and time information when this object was last modified
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time information when this object was last modified")

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }


  public InstanceMeta modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Id of the user/app that last modified this object
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the user/app that last modified this object")

  public String getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public InstanceMeta location(URI location) {
    
    this.location = location;
    return this;
  }

   /**
   * The URI of the Resource being returned
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI of the Resource being returned")

  public URI getLocation() {
    return location;
  }


  public void setLocation(URI location) {
    this.location = location;
  }


  public InstanceMeta version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the resource being returned in Etag format
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the resource being returned in Etag format")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceMeta instanceMeta = (InstanceMeta) o;
    return Objects.equals(this.created, instanceMeta.created) &&
        Objects.equals(this.createdBy, instanceMeta.createdBy) &&
        Objects.equals(this.lastModified, instanceMeta.lastModified) &&
        Objects.equals(this.modifiedBy, instanceMeta.modifiedBy) &&
        Objects.equals(this.location, instanceMeta.location) &&
        Objects.equals(this.version, instanceMeta.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, createdBy, lastModified, modifiedBy, location, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceMeta {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


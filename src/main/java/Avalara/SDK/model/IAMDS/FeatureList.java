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
import Avalara.SDK.model.IAMDS.Feature;
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
 * FeatureList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeatureList {
  public static final String SERIALIZED_NAME_AT_RECORDSET_COUNT = "@recordsetCount";
  @SerializedName(SERIALIZED_NAME_AT_RECORDSET_COUNT)
  private Integer atRecordsetCount;

  public static final String SERIALIZED_NAME_AT_NEXT_LINK = "@nextLink";
  @SerializedName(SERIALIZED_NAME_AT_NEXT_LINK)
  private String atNextLink;

  public static final String SERIALIZED_NAME_PAGE_KEY = "pageKey";
  @SerializedName(SERIALIZED_NAME_PAGE_KEY)
  private String pageKey;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Feature> items = null;


  public FeatureList atRecordsetCount(Integer atRecordsetCount) {
    
    this.atRecordsetCount = atRecordsetCount;
    return this;
  }

   /**
   * Get atRecordsetCount
   * @return atRecordsetCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAtRecordsetCount() {
    return atRecordsetCount;
  }


  public void setAtRecordsetCount(Integer atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
  }


  public FeatureList atNextLink(String atNextLink) {
    
    this.atNextLink = atNextLink;
    return this;
  }

   /**
   * Get atNextLink
   * @return atNextLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAtNextLink() {
    return atNextLink;
  }


  public void setAtNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
  }


  public FeatureList pageKey(String pageKey) {
    
    this.pageKey = pageKey;
    return this;
  }

   /**
   * Get pageKey
   * @return pageKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPageKey() {
    return pageKey;
  }


  public void setPageKey(String pageKey) {
    this.pageKey = pageKey;
  }


  public FeatureList items(List<Feature> items) {
    
    this.items = items;
    return this;
  }

  public FeatureList addItemsItem(Feature itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Feature>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Feature> getItems() {
    return items;
  }


  public void setItems(List<Feature> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureList featureList = (FeatureList) o;
    return Objects.equals(this.atRecordsetCount, featureList.atRecordsetCount) &&
        Objects.equals(this.atNextLink, featureList.atNextLink) &&
        Objects.equals(this.pageKey, featureList.pageKey) &&
        Objects.equals(this.items, featureList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atRecordsetCount, atNextLink, pageKey, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureList {\n");
    sb.append("    atRecordsetCount: ").append(toIndentedString(atRecordsetCount)).append("\n");
    sb.append("    atNextLink: ").append(toIndentedString(atNextLink)).append("\n");
    sb.append("    pageKey: ").append(toIndentedString(pageKey)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


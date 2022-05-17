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

package Avalara.SDK.auth;

import Avalara.SDK.Pair;
import Avalara.SDK.ApiException;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OAuth implements Authentication {
  private Map<String, String> accessTokenCache = new HashMap<String, String>();

  public String getAccessToken(String scope) {
    return accessTokenCache.get(standardizeScopes(scope));
  }

  public void setAccessToken(String scope, String accessToken) {
    this.accessTokenCache.put(standardizeScopes(scope), accessToken);
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                            String payload, String method, URI uri) throws ApiException {
    String scope = headerParams.get("scope");
    if (accessTokenCache.get(standardizeScopes(scope)) != null) {
      headerParams.put("Authorization", "Bearer " + accessTokenCache.get(scope));
    }
  }

  private String standardizeScopes(String scope) {
    String[] strArray = scope.split(" ");
    Arrays.sort(strArray);
    return String.join(" ", strArray);
  }
}

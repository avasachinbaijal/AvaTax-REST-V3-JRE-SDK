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

import Avalara.SDK.AccessToken;
import Avalara.SDK.Pair;
import Avalara.SDK.ApiException;

import java.net.URI;
import java.time.Instant;
import java.util.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OAuth implements Authentication {
  public static String CLIENT_CONFIG_ACCESS_TOKEN = null;
  private Map<String, AccessToken> accessTokenCache = new HashMap<String, AccessToken>();

  public String getAccessToken(String scope) {
    // We will first check if we have the token created recently in our
    // cache. If present then we will return from cache otherwise return NULL
    AccessToken accessToken = accessTokenCache.get(standardizeScopes(scope));
    if(!Objects.isNull(accessToken)) {
      // Check if the token expiry is in next 5 minutes or not, return NULL if true
      Instant nowPlus5Minutes = Instant.now().plusSeconds(300);
      if(nowPlus5Minutes.isBefore(accessToken.getExpiryTime()))
        return accessToken.getToken();
    }
    return null;
  }

  public void setAccessToken(String scope, String accessToken, long expiresInSeconds) {
    Instant expiryTime = Instant.now().plusSeconds(expiresInSeconds);
    AccessToken token = new AccessToken(accessToken, expiryTime);
    this.accessTokenCache.put(standardizeScopes(scope), token);
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

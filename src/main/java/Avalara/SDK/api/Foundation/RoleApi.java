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

package Avalara.SDK.api.Foundation;

import Avalara.SDK.ApiCallback;
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.ApiResponse;
import Avalara.SDK.Configuration;
import Avalara.SDK.Pair;
import Avalara.SDK.ProgressRequestBody;
import Avalara.SDK.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Avalara.SDK.model.Foundation.Role;
import Avalara.SDK.model.Foundation.RoleList;
import Avalara.SDK.model.Foundation.VersionError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RoleApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createRole
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param role  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * Location - Full path to the created entity. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createRoleCall(String avalaraVersion, String xCorrelationId, Role role, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = role;

        // create path and map variables
        String localVarPath = "/roles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (avalaraVersion != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(avalaraVersion));
        }

        if (xCorrelationId != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(xCorrelationId));
        }

        final String[] localVarAccepts = {
            "application/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createRoleValidateBeforeCall(String avalaraVersion, String xCorrelationId, Role role, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createRoleCall(avalaraVersion, xCorrelationId, role, _callback);
        return localVarCall;

    }

    /**
     * Create a role.
     * The response contains the same object as posted and fills in the newly assigned role ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param role  (optional)
     * @return Role
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * Location - Full path to the created entity. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public Role createRole(String avalaraVersion, String xCorrelationId, Role role) throws ApiException {
        ApiResponse<Role> localVarResp = createRoleWithHttpInfo(avalaraVersion, xCorrelationId, role);
        return localVarResp.getData();
    }

    /**
     * Create a role.
     * The response contains the same object as posted and fills in the newly assigned role ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param role  (optional)
     * @return ApiResponse&lt;Role&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * Location - Full path to the created entity. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<Role> createRoleWithHttpInfo(String avalaraVersion, String xCorrelationId, Role role) throws ApiException {
        okhttp3.Call localVarCall = createRoleValidateBeforeCall(avalaraVersion, xCorrelationId, role, null);
        Type localVarReturnType = new TypeToken<Role>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a role. (asynchronously)
     * The response contains the same object as posted and fills in the newly assigned role ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param role  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * Location - Full path to the created entity. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createRoleAsync(String avalaraVersion, String xCorrelationId, Role role, final ApiCallback<Role> _callback) throws ApiException {

        okhttp3.Call localVarCall = createRoleValidateBeforeCall(avalaraVersion, xCorrelationId, role, _callback);
        Type localVarReturnType = new TypeToken<Role>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteRole
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteRoleCall(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles/{role-id}"
            .replaceAll("\\{" + "role-id" + "\\}", localVarApiClient.escapeString(roleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (avalaraVersion != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(avalaraVersion));
        }

        if (xCorrelationId != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(xCorrelationId));
        }

        if (ifMatch != null) {
            localVarHeaderParams.put("If-Match", localVarApiClient.parameterToString(ifMatch));
        }

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteRoleValidateBeforeCall(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling deleteRole(Async)");
        }
        

        okhttp3.Call localVarCall = deleteRoleCall(roleId, avalaraVersion, xCorrelationId, ifMatch, _callback);
        return localVarCall;

    }

    /**
     * Delete a role.
     * Deletes the specified role.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public void deleteRole(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch) throws ApiException {
        deleteRoleWithHttpInfo(roleId, avalaraVersion, xCorrelationId, ifMatch);
    }

    /**
     * Delete a role.
     * Deletes the specified role.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteRoleWithHttpInfo(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch) throws ApiException {
        okhttp3.Call localVarCall = deleteRoleValidateBeforeCall(roleId, avalaraVersion, xCorrelationId, ifMatch, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a role. (asynchronously)
     * Deletes the specified role.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteRoleAsync(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRoleValidateBeforeCall(roleId, avalaraVersion, xCorrelationId, ifMatch, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRole
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifNoneMatch Only return the resource if the ETag is different from the ETag passed in. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getRoleCall(String roleId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles/{role-id}"
            .replaceAll("\\{" + "role-id" + "\\}", localVarApiClient.escapeString(roleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (avalaraVersion != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(avalaraVersion));
        }

        if (xCorrelationId != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(xCorrelationId));
        }

        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", localVarApiClient.parameterToString(ifNoneMatch));
        }

        final String[] localVarAccepts = {
            "application/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRoleValidateBeforeCall(String roleId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling getRole(Async)");
        }
        

        okhttp3.Call localVarCall = getRoleCall(roleId, avalaraVersion, xCorrelationId, ifNoneMatch, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a role.
     * Retrieves a role based on its ID.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifNoneMatch Only return the resource if the ETag is different from the ETag passed in. (optional)
     * @return Role
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public Role getRole(String roleId, String avalaraVersion, String xCorrelationId, String ifNoneMatch) throws ApiException {
        ApiResponse<Role> localVarResp = getRoleWithHttpInfo(roleId, avalaraVersion, xCorrelationId, ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * Retrieve a role.
     * Retrieves a role based on its ID.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifNoneMatch Only return the resource if the ETag is different from the ETag passed in. (optional)
     * @return ApiResponse&lt;Role&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<Role> getRoleWithHttpInfo(String roleId, String avalaraVersion, String xCorrelationId, String ifNoneMatch) throws ApiException {
        okhttp3.Call localVarCall = getRoleValidateBeforeCall(roleId, avalaraVersion, xCorrelationId, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<Role>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a role. (asynchronously)
     * Retrieves a role based on its ID.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifNoneMatch Only return the resource if the ETag is different from the ETag passed in. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getRoleAsync(String roleId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback<Role> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRoleValidateBeforeCall(roleId, avalaraVersion, xCorrelationId, ifNoneMatch, _callback);
        Type localVarReturnType = new TypeToken<Role>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listRoles
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listRolesCall(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if ($filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$filter", $filter));
        }

        if ($top != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$top", $top));
        }

        if ($skip != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$skip", $skip));
        }

        if ($orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$orderBy", $orderBy));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (countOnly != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countOnly", countOnly));
        }

        if (avalaraVersion != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(avalaraVersion));
        }

        if (xCorrelationId != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(xCorrelationId));
        }

        final String[] localVarAccepts = {
            "application/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listRolesValidateBeforeCall(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listRolesCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Get all roles which the user has access to.
     * Retrieve a list of all roles the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * type * permissions
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return RoleList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public RoleList listRoles(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<RoleList> localVarResp = listRolesWithHttpInfo($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Get all roles which the user has access to.
     * Retrieve a list of all roles the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * type * permissions
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;RoleList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<RoleList> listRolesWithHttpInfo(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listRolesValidateBeforeCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<RoleList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all roles which the user has access to. (asynchronously)
     * Retrieve a list of all roles the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * type * permissions
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listRolesAsync(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<RoleList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listRolesValidateBeforeCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<RoleList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchRole
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call patchRoleCall(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles/{role-id}"
            .replaceAll("\\{" + "role-id" + "\\}", localVarApiClient.escapeString(roleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (avalaraVersion != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(avalaraVersion));
        }

        if (xCorrelationId != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(xCorrelationId));
        }

        if (ifMatch != null) {
            localVarHeaderParams.put("If-Match", localVarApiClient.parameterToString(ifMatch));
        }

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchRoleValidateBeforeCall(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling patchRole(Async)");
        }
        

        okhttp3.Call localVarCall = patchRoleCall(roleId, avalaraVersion, xCorrelationId, ifMatch, _callback);
        return localVarCall;

    }

    /**
     * Update the fields present in the message body on the role.
     * Update only the fields passed into the patch operation.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public void patchRole(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch) throws ApiException {
        patchRoleWithHttpInfo(roleId, avalaraVersion, xCorrelationId, ifMatch);
    }

    /**
     * Update the fields present in the message body on the role.
     * Update only the fields passed into the patch operation.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> patchRoleWithHttpInfo(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch) throws ApiException {
        okhttp3.Call localVarCall = patchRoleValidateBeforeCall(roleId, avalaraVersion, xCorrelationId, ifMatch, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update the fields present in the message body on the role. (asynchronously)
     * Update only the fields passed into the patch operation.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call patchRoleAsync(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchRoleValidateBeforeCall(roleId, avalaraVersion, xCorrelationId, ifMatch, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for replaceRole
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param role  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call replaceRoleCall(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, Role role, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = role;

        // create path and map variables
        String localVarPath = "/roles/{role-id}"
            .replaceAll("\\{" + "role-id" + "\\}", localVarApiClient.escapeString(roleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (avalaraVersion != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(avalaraVersion));
        }

        if (xCorrelationId != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(xCorrelationId));
        }

        if (ifMatch != null) {
            localVarHeaderParams.put("If-Match", localVarApiClient.parameterToString(ifMatch));
        }

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceRoleValidateBeforeCall(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, Role role, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling replaceRole(Async)");
        }
        

        okhttp3.Call localVarCall = replaceRoleCall(roleId, avalaraVersion, xCorrelationId, ifMatch, role, _callback);
        return localVarCall;

    }

    /**
     * Update all fields on a role.
     * Replaces the specified role with the role in the body.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param role  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public void replaceRole(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, Role role) throws ApiException {
        replaceRoleWithHttpInfo(roleId, avalaraVersion, xCorrelationId, ifMatch, role);
    }

    /**
     * Update all fields on a role.
     * Replaces the specified role with the role in the body.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param role  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> replaceRoleWithHttpInfo(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, Role role) throws ApiException {
        okhttp3.Call localVarCall = replaceRoleValidateBeforeCall(roleId, avalaraVersion, xCorrelationId, ifMatch, role, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update all fields on a role. (asynchronously)
     * Replaces the specified role with the role in the body.
     * @param roleId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param role  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  * ETag - Identifier for the updated version of this resource. <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * X-Correlation-Id - Correlation ID to pass into the method. Returned in any response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call replaceRoleAsync(String roleId, String avalaraVersion, String xCorrelationId, String ifMatch, Role role, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceRoleValidateBeforeCall(roleId, avalaraVersion, xCorrelationId, ifMatch, role, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

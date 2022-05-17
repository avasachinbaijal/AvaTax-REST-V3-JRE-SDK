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

package Avalara.SDK.api.IAMDS;

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
import java.util.*;


import Avalara.SDK.model.IAMDS.Grant;
import Avalara.SDK.model.IAMDS.GrantList;
import Avalara.SDK.model.IAMDS.VersionError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrantApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GrantApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
        SetConfiguration(apiClient);
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
     * Build call for createGrant
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param grant  (optional)
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
    public okhttp3.Call createGrantCall(String avalaraVersion, String xCorrelationId, Grant grant, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "iam TestScope TestScope1";

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = grant;

        // create path and map variables
        String localVarPath = "/grants";

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
        String[] localVarAuthNames = new String[] { "OAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createGrantValidateBeforeCall(String avalaraVersion, String xCorrelationId, Grant grant, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createGrantCall(avalaraVersion, xCorrelationId, grant, _callback);
        return localVarCall;

    }

    /**
     * Create a grant.
     * The response contains the same object as posted and fills in the newly assigned grant ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param grant  (optional)
     * @return Grant
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
    public Grant createGrant(String avalaraVersion, String xCorrelationId, Grant grant) throws ApiException {
        ApiResponse<Grant> localVarResp = createGrantWithHttpInfo(avalaraVersion, xCorrelationId, grant);
        return localVarResp.getData();
    }

    /**
     * Create a grant.
     * The response contains the same object as posted and fills in the newly assigned grant ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param grant  (optional)
     * @return ApiResponse&lt;Grant&gt;
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
    public ApiResponse<Grant> createGrantWithHttpInfo(String avalaraVersion, String xCorrelationId, Grant grant) throws ApiException {
        okhttp3.Call localVarCall = createGrantValidateBeforeCall(avalaraVersion, xCorrelationId, grant, null);
        Type localVarReturnType = new TypeToken<Grant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a grant. (asynchronously)
     * The response contains the same object as posted and fills in the newly assigned grant ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param grant  (optional)
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
    public okhttp3.Call createGrantAsync(String avalaraVersion, String xCorrelationId, Grant grant, final ApiCallback<Grant> _callback) throws ApiException {

        okhttp3.Call localVarCall = createGrantValidateBeforeCall(avalaraVersion, xCorrelationId, grant, _callback);
        Type localVarReturnType = new TypeToken<Grant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteGrant
     * @param grantId  (required)
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
    public okhttp3.Call deleteGrantCall(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "iam TestScope TestScope1";

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
        String localVarPath = "/grants/{grant-id}"
            .replaceAll("\\{" + "grant-id" + "\\}", localVarApiClient.escapeString(grantId.toString()));

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
        String[] localVarAuthNames = new String[] { "OAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteGrantValidateBeforeCall(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'grantId' is set
        if (grantId == null) {
            throw new ApiException("Missing the required parameter 'grantId' when calling deleteGrant(Async)");
        }
        

        okhttp3.Call localVarCall = deleteGrantCall(grantId, avalaraVersion, xCorrelationId, ifMatch, _callback);
        return localVarCall;

    }

    /**
     * Delete a grant.
     * Deletes the specified grant.
     * @param grantId  (required)
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
    public void deleteGrant(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch) throws ApiException {
        deleteGrantWithHttpInfo(grantId, avalaraVersion, xCorrelationId, ifMatch);
    }

    /**
     * Delete a grant.
     * Deletes the specified grant.
     * @param grantId  (required)
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
    public ApiResponse<Void> deleteGrantWithHttpInfo(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch) throws ApiException {
        okhttp3.Call localVarCall = deleteGrantValidateBeforeCall(grantId, avalaraVersion, xCorrelationId, ifMatch, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a grant. (asynchronously)
     * Deletes the specified grant.
     * @param grantId  (required)
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
    public okhttp3.Call deleteGrantAsync(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteGrantValidateBeforeCall(grantId, avalaraVersion, xCorrelationId, ifMatch, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGrant
     * @param grantId  (required)
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
    public okhttp3.Call getGrantCall(String grantId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "iam TestScope TestScope1";

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
        String localVarPath = "/grants/{grant-id}"
            .replaceAll("\\{" + "grant-id" + "\\}", localVarApiClient.escapeString(grantId.toString()));

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
        String[] localVarAuthNames = new String[] { "OAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGrantValidateBeforeCall(String grantId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'grantId' is set
        if (grantId == null) {
            throw new ApiException("Missing the required parameter 'grantId' when calling getGrant(Async)");
        }
        

        okhttp3.Call localVarCall = getGrantCall(grantId, avalaraVersion, xCorrelationId, ifNoneMatch, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a grant.
     * Retrieves a grant based on its ID.
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifNoneMatch Only return the resource if the ETag is different from the ETag passed in. (optional)
     * @return Grant
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
    public Grant getGrant(String grantId, String avalaraVersion, String xCorrelationId, String ifNoneMatch) throws ApiException {
        ApiResponse<Grant> localVarResp = getGrantWithHttpInfo(grantId, avalaraVersion, xCorrelationId, ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * Retrieve a grant.
     * Retrieves a grant based on its ID.
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifNoneMatch Only return the resource if the ETag is different from the ETag passed in. (optional)
     * @return ApiResponse&lt;Grant&gt;
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
    public ApiResponse<Grant> getGrantWithHttpInfo(String grantId, String avalaraVersion, String xCorrelationId, String ifNoneMatch) throws ApiException {
        okhttp3.Call localVarCall = getGrantValidateBeforeCall(grantId, avalaraVersion, xCorrelationId, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<Grant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a grant. (asynchronously)
     * Retrieves a grant based on its ID.
     * @param grantId  (required)
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
    public okhttp3.Call getGrantAsync(String grantId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback<Grant> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGrantValidateBeforeCall(grantId, avalaraVersion, xCorrelationId, ifNoneMatch, _callback);
        Type localVarReturnType = new TypeToken<Grant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listGrants
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
    public okhttp3.Call listGrantsCall(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "iam TestScope TestScope1";

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
        String localVarPath = "/grants";

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
        String[] localVarAuthNames = new String[] { "OAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listGrantsValidateBeforeCall(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listGrantsCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Retrieve all grants the current user has access to.
     * Retrieve a list of all grants the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * type * role/identifier
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return GrantList
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
    public GrantList listGrants(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<GrantList> localVarResp = listGrantsWithHttpInfo($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Retrieve all grants the current user has access to.
     * Retrieve a list of all grants the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * type * role/identifier
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;GrantList&gt;
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
    public ApiResponse<GrantList> listGrantsWithHttpInfo(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listGrantsValidateBeforeCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<GrantList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve all grants the current user has access to. (asynchronously)
     * Retrieve a list of all grants the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * type * role/identifier
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
    public okhttp3.Call listGrantsAsync(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<GrantList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listGrantsValidateBeforeCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<GrantList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchGrant
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param grant  (optional)
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
    public okhttp3.Call patchGrantCall(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "iam TestScope TestScope1";

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = grant;

        // create path and map variables
        String localVarPath = "/grants/{grant-id}"
            .replaceAll("\\{" + "grant-id" + "\\}", localVarApiClient.escapeString(grantId.toString()));

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
        String[] localVarAuthNames = new String[] { "OAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchGrantValidateBeforeCall(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'grantId' is set
        if (grantId == null) {
            throw new ApiException("Missing the required parameter 'grantId' when calling patchGrant(Async)");
        }
        

        okhttp3.Call localVarCall = patchGrantCall(grantId, avalaraVersion, xCorrelationId, ifMatch, grant, _callback);
        return localVarCall;

    }

    /**
     * Update only the fields within the body on the grant.
     * Updates only the fields passed in the body.
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param grant  (optional)
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
    public void patchGrant(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant) throws ApiException {
        patchGrantWithHttpInfo(grantId, avalaraVersion, xCorrelationId, ifMatch, grant);
    }

    /**
     * Update only the fields within the body on the grant.
     * Updates only the fields passed in the body.
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param grant  (optional)
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
    public ApiResponse<Void> patchGrantWithHttpInfo(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant) throws ApiException {
        okhttp3.Call localVarCall = patchGrantValidateBeforeCall(grantId, avalaraVersion, xCorrelationId, ifMatch, grant, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update only the fields within the body on the grant. (asynchronously)
     * Updates only the fields passed in the body.
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param grant  (optional)
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
    public okhttp3.Call patchGrantAsync(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchGrantValidateBeforeCall(grantId, avalaraVersion, xCorrelationId, ifMatch, grant, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for replaceGrant
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param grant  (optional)
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
    public okhttp3.Call replaceGrantCall(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "iam TestScope TestScope1";

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = grant;

        // create path and map variables
        String localVarPath = "/grants/{grant-id}"
            .replaceAll("\\{" + "grant-id" + "\\}", localVarApiClient.escapeString(grantId.toString()));

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
        String[] localVarAuthNames = new String[] { "OAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceGrantValidateBeforeCall(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'grantId' is set
        if (grantId == null) {
            throw new ApiException("Missing the required parameter 'grantId' when calling replaceGrant(Async)");
        }
        

        okhttp3.Call localVarCall = replaceGrantCall(grantId, avalaraVersion, xCorrelationId, ifMatch, grant, _callback);
        return localVarCall;

    }

    /**
     * Update all fields on a grant.
     * Replaces the specified grant with the grant in the body.
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param grant  (optional)
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
    public void replaceGrant(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant) throws ApiException {
        replaceGrantWithHttpInfo(grantId, avalaraVersion, xCorrelationId, ifMatch, grant);
    }

    /**
     * Update all fields on a grant.
     * Replaces the specified grant with the grant in the body.
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param grant  (optional)
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
    public ApiResponse<Void> replaceGrantWithHttpInfo(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant) throws ApiException {
        okhttp3.Call localVarCall = replaceGrantValidateBeforeCall(grantId, avalaraVersion, xCorrelationId, ifMatch, grant, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update all fields on a grant. (asynchronously)
     * Replaces the specified grant with the grant in the body.
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param grant  (optional)
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
    public okhttp3.Call replaceGrantAsync(String grantId, String avalaraVersion, String xCorrelationId, String ifMatch, Grant grant, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceGrantValidateBeforeCall(grantId, avalaraVersion, xCorrelationId, ifMatch, grant, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("2.4.33");
    }
}


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


import Avalara.SDK.model.IAMDS.Feature;
import Avalara.SDK.model.IAMDS.FeatureList;
import Avalara.SDK.model.IAMDS.GrantList;
import Avalara.SDK.model.IAMDS.VersionError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeatureApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FeatureApi(ApiClient apiClient) {
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
     * Build call for createFeature
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param feature  (optional)
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
    public okhttp3.Call createFeatureCall(String avalaraVersion, String xCorrelationId, Feature feature, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = feature;

        // create path and map variables
        String localVarPath = "/features";

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
    private okhttp3.Call createFeatureValidateBeforeCall(String avalaraVersion, String xCorrelationId, Feature feature, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createFeatureCall(avalaraVersion, xCorrelationId, feature, _callback);
        return localVarCall;

    }

    /**
     * Create a feature.
     * The response contains the same object as posted and fills in the newly assigned feature ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param feature  (optional)
     * @return Feature
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
    public Feature createFeature(String avalaraVersion, String xCorrelationId, Feature feature) throws ApiException {
        ApiResponse<Feature> localVarResp = createFeatureWithHttpInfo(avalaraVersion, xCorrelationId, feature);
        return localVarResp.getData();
    }

    /**
     * Create a feature.
     * The response contains the same object as posted and fills in the newly assigned feature ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param feature  (optional)
     * @return ApiResponse&lt;Feature&gt;
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
    public ApiResponse<Feature> createFeatureWithHttpInfo(String avalaraVersion, String xCorrelationId, Feature feature) throws ApiException {
        okhttp3.Call localVarCall = createFeatureValidateBeforeCall(avalaraVersion, xCorrelationId, feature, null);
        Type localVarReturnType = new TypeToken<Feature>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a feature. (asynchronously)
     * The response contains the same object as posted and fills in the newly assigned feature ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param feature  (optional)
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
    public okhttp3.Call createFeatureAsync(String avalaraVersion, String xCorrelationId, Feature feature, final ApiCallback<Feature> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFeatureValidateBeforeCall(avalaraVersion, xCorrelationId, feature, _callback);
        Type localVarReturnType = new TypeToken<Feature>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteFeature
     * @param featureId  (required)
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
    public okhttp3.Call deleteFeatureCall(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/features/{feature-id}"
            .replaceAll("\\{" + "feature-id" + "\\}", localVarApiClient.escapeString(featureId.toString()));

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
    private okhttp3.Call deleteFeatureValidateBeforeCall(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'featureId' is set
        if (featureId == null) {
            throw new ApiException("Missing the required parameter 'featureId' when calling deleteFeature(Async)");
        }
        

        okhttp3.Call localVarCall = deleteFeatureCall(featureId, avalaraVersion, xCorrelationId, ifMatch, _callback);
        return localVarCall;

    }

    /**
     * Delete a feature.
     * Deletes the feature by ID.
     * @param featureId  (required)
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
    public void deleteFeature(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch) throws ApiException {
        deleteFeatureWithHttpInfo(featureId, avalaraVersion, xCorrelationId, ifMatch);
    }

    /**
     * Delete a feature.
     * Deletes the feature by ID.
     * @param featureId  (required)
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
    public ApiResponse<Void> deleteFeatureWithHttpInfo(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch) throws ApiException {
        okhttp3.Call localVarCall = deleteFeatureValidateBeforeCall(featureId, avalaraVersion, xCorrelationId, ifMatch, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a feature. (asynchronously)
     * Deletes the feature by ID.
     * @param featureId  (required)
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
    public okhttp3.Call deleteFeatureAsync(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteFeatureValidateBeforeCall(featureId, avalaraVersion, xCorrelationId, ifMatch, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFeature
     * @param featureId  (required)
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
    public okhttp3.Call getFeatureCall(String featureId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/features/{feature-id}"
            .replaceAll("\\{" + "feature-id" + "\\}", localVarApiClient.escapeString(featureId.toString()));

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
    private okhttp3.Call getFeatureValidateBeforeCall(String featureId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'featureId' is set
        if (featureId == null) {
            throw new ApiException("Missing the required parameter 'featureId' when calling getFeature(Async)");
        }
        

        okhttp3.Call localVarCall = getFeatureCall(featureId, avalaraVersion, xCorrelationId, ifNoneMatch, _callback);
        return localVarCall;

    }

    /**
     * Get a feature.
     * Retrieves the specified feature.
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifNoneMatch Only return the resource if the ETag is different from the ETag passed in. (optional)
     * @return Feature
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
    public Feature getFeature(String featureId, String avalaraVersion, String xCorrelationId, String ifNoneMatch) throws ApiException {
        ApiResponse<Feature> localVarResp = getFeatureWithHttpInfo(featureId, avalaraVersion, xCorrelationId, ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * Get a feature.
     * Retrieves the specified feature.
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifNoneMatch Only return the resource if the ETag is different from the ETag passed in. (optional)
     * @return ApiResponse&lt;Feature&gt;
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
    public ApiResponse<Feature> getFeatureWithHttpInfo(String featureId, String avalaraVersion, String xCorrelationId, String ifNoneMatch) throws ApiException {
        okhttp3.Call localVarCall = getFeatureValidateBeforeCall(featureId, avalaraVersion, xCorrelationId, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<Feature>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a feature. (asynchronously)
     * Retrieves the specified feature.
     * @param featureId  (required)
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
    public okhttp3.Call getFeatureAsync(String featureId, String avalaraVersion, String xCorrelationId, String ifNoneMatch, final ApiCallback<Feature> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFeatureValidateBeforeCall(featureId, avalaraVersion, xCorrelationId, ifNoneMatch, _callback);
        Type localVarReturnType = new TypeToken<Feature>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listFeatureGrants
     * @param featureId  (required)
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
    public okhttp3.Call listFeatureGrantsCall(String featureId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/features/{feature-id}/grants"
            .replaceAll("\\{" + "feature-id" + "\\}", localVarApiClient.escapeString(featureId.toString()));

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
    private okhttp3.Call listFeatureGrantsValidateBeforeCall(String featureId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'featureId' is set
        if (featureId == null) {
            throw new ApiException("Missing the required parameter 'featureId' when calling listFeatureGrants(Async)");
        }
        

        okhttp3.Call localVarCall = listFeatureGrantsCall(featureId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * List all grants on a feature.
     * Retrieve a list of all grants a feature belongs to which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * role/identifier
     * @param featureId  (required)
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
    public GrantList listFeatureGrants(String featureId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<GrantList> localVarResp = listFeatureGrantsWithHttpInfo(featureId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * List all grants on a feature.
     * Retrieve a list of all grants a feature belongs to which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * role/identifier
     * @param featureId  (required)
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
    public ApiResponse<GrantList> listFeatureGrantsWithHttpInfo(String featureId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listFeatureGrantsValidateBeforeCall(featureId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<GrantList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all grants on a feature. (asynchronously)
     * Retrieve a list of all grants a feature belongs to which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * role/identifier
     * @param featureId  (required)
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
    public okhttp3.Call listFeatureGrantsAsync(String featureId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<GrantList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFeatureGrantsValidateBeforeCall(featureId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<GrantList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listFeatures
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
    public okhttp3.Call listFeaturesCall(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/features";

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
    private okhttp3.Call listFeaturesValidateBeforeCall(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listFeaturesCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Get all features which the user has access to.
     * Retrieve a list of all features the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * grants/identifier
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return FeatureList
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
    public FeatureList listFeatures(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<FeatureList> localVarResp = listFeaturesWithHttpInfo($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Get all features which the user has access to.
     * Retrieve a list of all features the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * grants/identifier
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;FeatureList&gt;
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
    public ApiResponse<FeatureList> listFeaturesWithHttpInfo(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listFeaturesValidateBeforeCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<FeatureList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all features which the user has access to. (asynchronously)
     * Retrieve a list of all features the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.  Filterable properties:  * displayName * system/identifier * grants/identifier
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
    public okhttp3.Call listFeaturesAsync(String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<FeatureList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFeaturesValidateBeforeCall($filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<FeatureList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchFeature
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param feature  (optional)
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
    public okhttp3.Call patchFeatureCall(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = feature;

        // create path and map variables
        String localVarPath = "/features/{feature-id}"
            .replaceAll("\\{" + "feature-id" + "\\}", localVarApiClient.escapeString(featureId.toString()));

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
    private okhttp3.Call patchFeatureValidateBeforeCall(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'featureId' is set
        if (featureId == null) {
            throw new ApiException("Missing the required parameter 'featureId' when calling patchFeature(Async)");
        }
        

        okhttp3.Call localVarCall = patchFeatureCall(featureId, avalaraVersion, xCorrelationId, ifMatch, feature, _callback);
        return localVarCall;

    }

    /**
     * Update the fields within the body on the feature.
     * Updates only the fields passed in for the specified feature.
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param feature  (optional)
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
    public void patchFeature(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature) throws ApiException {
        patchFeatureWithHttpInfo(featureId, avalaraVersion, xCorrelationId, ifMatch, feature);
    }

    /**
     * Update the fields within the body on the feature.
     * Updates only the fields passed in for the specified feature.
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param feature  (optional)
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
    public ApiResponse<Void> patchFeatureWithHttpInfo(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature) throws ApiException {
        okhttp3.Call localVarCall = patchFeatureValidateBeforeCall(featureId, avalaraVersion, xCorrelationId, ifMatch, feature, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update the fields within the body on the feature. (asynchronously)
     * Updates only the fields passed in for the specified feature.
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param feature  (optional)
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
    public okhttp3.Call patchFeatureAsync(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchFeatureValidateBeforeCall(featureId, avalaraVersion, xCorrelationId, ifMatch, feature, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for replaceFeature
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param feature  (optional)
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
    public okhttp3.Call replaceFeatureCall(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = feature;

        // create path and map variables
        String localVarPath = "/features/{feature-id}"
            .replaceAll("\\{" + "feature-id" + "\\}", localVarApiClient.escapeString(featureId.toString()));

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
    private okhttp3.Call replaceFeatureValidateBeforeCall(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'featureId' is set
        if (featureId == null) {
            throw new ApiException("Missing the required parameter 'featureId' when calling replaceFeature(Async)");
        }
        

        okhttp3.Call localVarCall = replaceFeatureCall(featureId, avalaraVersion, xCorrelationId, ifMatch, feature, _callback);
        return localVarCall;

    }

    /**
     * Update all fields on a feature.
     * Replaces the specified feature with the feature in the body.
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param feature  (optional)
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
    public void replaceFeature(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature) throws ApiException {
        replaceFeatureWithHttpInfo(featureId, avalaraVersion, xCorrelationId, ifMatch, feature);
    }

    /**
     * Update all fields on a feature.
     * Replaces the specified feature with the feature in the body.
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param feature  (optional)
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
    public ApiResponse<Void> replaceFeatureWithHttpInfo(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature) throws ApiException {
        okhttp3.Call localVarCall = replaceFeatureValidateBeforeCall(featureId, avalaraVersion, xCorrelationId, ifMatch, feature, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update all fields on a feature. (asynchronously)
     * Replaces the specified feature with the feature in the body.
     * @param featureId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param ifMatch Only execute the operation if the ETag for the current version of the resource matches the ETag in this header. (optional)
     * @param feature  (optional)
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
    public okhttp3.Call replaceFeatureAsync(String featureId, String avalaraVersion, String xCorrelationId, String ifMatch, Feature feature, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceFeatureValidateBeforeCall(featureId, avalaraVersion, xCorrelationId, ifMatch, feature, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("2.4.34");
    }
}


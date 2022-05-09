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
 * @version    2.4.32
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


import Avalara.SDK.model.Foundation.Account;
import Avalara.SDK.model.Foundation.AccountList;
import Avalara.SDK.model.Foundation.DeviceList;
import Avalara.SDK.model.Foundation.EntitlementList;
import Avalara.SDK.model.Foundation.GrantList;
import Avalara.SDK.model.Foundation.GroupList;
import Avalara.SDK.model.Foundation.UserList;
import Avalara.SDK.model.Foundation.VersionError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    
    private final String requiredScopes = "iam test2";
    

    public AccountApi(ApiClient apiClient) {
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
     * Build call for addDeviceToAccount
     * @param accountId  (required)
     * @param deviceId  (required)
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
    public okhttp3.Call addDeviceToAccountCall(String accountId, String deviceId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/devices/{device-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "device-id" + "\\}", localVarApiClient.escapeString(deviceId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addDeviceToAccountValidateBeforeCall(String accountId, String deviceId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling addDeviceToAccount(Async)");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling addDeviceToAccount(Async)");
        }
        

        okhttp3.Call localVarCall = addDeviceToAccountCall(accountId, deviceId, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Add a device to an account.
     * Adds a device to an account.
     * @param accountId  (required)
     * @param deviceId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
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
    public void addDeviceToAccount(String accountId, String deviceId, String avalaraVersion, String xCorrelationId) throws ApiException {
        addDeviceToAccountWithHttpInfo(accountId, deviceId, avalaraVersion, xCorrelationId);
    }

    /**
     * Add a device to an account.
     * Adds a device to an account.
     * @param accountId  (required)
     * @param deviceId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> addDeviceToAccountWithHttpInfo(String accountId, String deviceId, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = addDeviceToAccountValidateBeforeCall(accountId, deviceId, avalaraVersion, xCorrelationId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add a device to an account. (asynchronously)
     * Adds a device to an account.
     * @param accountId  (required)
     * @param deviceId  (required)
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
    public okhttp3.Call addDeviceToAccountAsync(String accountId, String deviceId, String avalaraVersion, String xCorrelationId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addDeviceToAccountValidateBeforeCall(accountId, deviceId, avalaraVersion, xCorrelationId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for addGrantToAccountUser
     * @param accountId  (required)
     * @param userId  (required)
     * @param grantId  (required)
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
    public okhttp3.Call addGrantToAccountUserCall(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/users/{user-id}/grants/{grant-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "user-id" + "\\}", localVarApiClient.escapeString(userId.toString()))
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addGrantToAccountUserValidateBeforeCall(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling addGrantToAccountUser(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling addGrantToAccountUser(Async)");
        }
        
        // verify the required parameter 'grantId' is set
        if (grantId == null) {
            throw new ApiException("Missing the required parameter 'grantId' when calling addGrantToAccountUser(Async)");
        }
        

        okhttp3.Call localVarCall = addGrantToAccountUserCall(accountId, userId, grantId, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Add a grant to a user within an account.
     * Adds a grant to a user within an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
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
    public void addGrantToAccountUser(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId) throws ApiException {
        addGrantToAccountUserWithHttpInfo(accountId, userId, grantId, avalaraVersion, xCorrelationId);
    }

    /**
     * Add a grant to a user within an account.
     * Adds a grant to a user within an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> addGrantToAccountUserWithHttpInfo(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = addGrantToAccountUserValidateBeforeCall(accountId, userId, grantId, avalaraVersion, xCorrelationId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add a grant to a user within an account. (asynchronously)
     * Adds a grant to a user within an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param grantId  (required)
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
    public okhttp3.Call addGrantToAccountUserAsync(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addGrantToAccountUserValidateBeforeCall(accountId, userId, grantId, avalaraVersion, xCorrelationId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for addUserToAccount
     * @param accountId  (required)
     * @param userId  (required)
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
    public okhttp3.Call addUserToAccountCall(String accountId, String userId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/users/{user-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "user-id" + "\\}", localVarApiClient.escapeString(userId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addUserToAccountValidateBeforeCall(String accountId, String userId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling addUserToAccount(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling addUserToAccount(Async)");
        }
        

        okhttp3.Call localVarCall = addUserToAccountCall(accountId, userId, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Add a user to an account.
     * Adds a user to an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
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
    public void addUserToAccount(String accountId, String userId, String avalaraVersion, String xCorrelationId) throws ApiException {
        addUserToAccountWithHttpInfo(accountId, userId, avalaraVersion, xCorrelationId);
    }

    /**
     * Add a user to an account.
     * Adds a user to an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> addUserToAccountWithHttpInfo(String accountId, String userId, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = addUserToAccountValidateBeforeCall(accountId, userId, avalaraVersion, xCorrelationId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add a user to an account. (asynchronously)
     * Adds a user to an account.
     * @param accountId  (required)
     * @param userId  (required)
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
    public okhttp3.Call addUserToAccountAsync(String accountId, String userId, String avalaraVersion, String xCorrelationId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addUserToAccountValidateBeforeCall(accountId, userId, avalaraVersion, xCorrelationId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for createAccount
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
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
    public okhttp3.Call createAccountCall(String avalaraVersion, String xCorrelationId, Account account, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = account;

        // create path and map variables
        String localVarPath = "/accounts";

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
    private okhttp3.Call createAccountValidateBeforeCall(String avalaraVersion, String xCorrelationId, Account account, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createAccountCall(avalaraVersion, xCorrelationId, account, _callback);
        return localVarCall;

    }

    /**
     * Add an account to the list of accounts.
     * On a post, the account ID will not be known since it is assigned by the system. The response contains the account, including ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
     * @return Account
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
    public Account createAccount(String avalaraVersion, String xCorrelationId, Account account) throws ApiException {
        ApiResponse<Account> localVarResp = createAccountWithHttpInfo(avalaraVersion, xCorrelationId, account);
        return localVarResp.getData();
    }

    /**
     * Add an account to the list of accounts.
     * On a post, the account ID will not be known since it is assigned by the system. The response contains the account, including ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
     * @return ApiResponse&lt;Account&gt;
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
    public ApiResponse<Account> createAccountWithHttpInfo(String avalaraVersion, String xCorrelationId, Account account) throws ApiException {
        okhttp3.Call localVarCall = createAccountValidateBeforeCall(avalaraVersion, xCorrelationId, account, null);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add an account to the list of accounts. (asynchronously)
     * On a post, the account ID will not be known since it is assigned by the system. The response contains the account, including ID.
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
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
    public okhttp3.Call createAccountAsync(String avalaraVersion, String xCorrelationId, Account account, final ApiCallback<Account> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAccountValidateBeforeCall(avalaraVersion, xCorrelationId, account, _callback);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAccount
     * @param accountId  (required)
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
    public okhttp3.Call deleteAccountCall(String accountId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call deleteAccountValidateBeforeCall(String accountId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deleteAccount(Async)");
        }
        

        okhttp3.Call localVarCall = deleteAccountCall(accountId, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Delete an account.
     * Deletes the specified account.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
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
    public void deleteAccount(String accountId, String avalaraVersion, String xCorrelationId) throws ApiException {
        deleteAccountWithHttpInfo(accountId, avalaraVersion, xCorrelationId);
    }

    /**
     * Delete an account.
     * Deletes the specified account.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> deleteAccountWithHttpInfo(String accountId, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = deleteAccountValidateBeforeCall(accountId, avalaraVersion, xCorrelationId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete an account. (asynchronously)
     * Deletes the specified account.
     * @param accountId  (required)
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
    public okhttp3.Call deleteAccountAsync(String accountId, String avalaraVersion, String xCorrelationId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAccountValidateBeforeCall(accountId, avalaraVersion, xCorrelationId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAccount
     * @param accountId  (required)
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
    public okhttp3.Call getAccountCall(String accountId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccountValidateBeforeCall(String accountId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccount(Async)");
        }
        

        okhttp3.Call localVarCall = getAccountCall(accountId, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * GET an account by ID.
     * Retrieves the specified account.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return Account
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
    public Account getAccount(String accountId, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<Account> localVarResp = getAccountWithHttpInfo(accountId, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * GET an account by ID.
     * Retrieves the specified account.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;Account&gt;
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
    public ApiResponse<Account> getAccountWithHttpInfo(String accountId, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = getAccountValidateBeforeCall(accountId, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GET an account by ID. (asynchronously)
     * Retrieves the specified account.
     * @param accountId  (required)
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
    public okhttp3.Call getAccountAsync(String accountId, String avalaraVersion, String xCorrelationId, final ApiCallback<Account> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccountValidateBeforeCall(accountId, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAccountDevices
     * @param accountId  (required)
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
    public okhttp3.Call listAccountDevicesCall(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/devices"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call listAccountDevicesValidateBeforeCall(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountDevices(Async)");
        }
        

        okhttp3.Call localVarCall = listAccountDevicesCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Retrieve all devices within an account.
     * Retrieve a list of all devices within an account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return DeviceList
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
    public DeviceList listAccountDevices(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<DeviceList> localVarResp = listAccountDevicesWithHttpInfo(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Retrieve all devices within an account.
     * Retrieve a list of all devices within an account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;DeviceList&gt;
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
    public ApiResponse<DeviceList> listAccountDevicesWithHttpInfo(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listAccountDevicesValidateBeforeCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<DeviceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve all devices within an account. (asynchronously)
     * Retrieve a list of all devices within an account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
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
    public okhttp3.Call listAccountDevicesAsync(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<DeviceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAccountDevicesValidateBeforeCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<DeviceList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAccountEntitlements
     * @param accountId  (required)
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
    public okhttp3.Call listAccountEntitlementsCall(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/entitlements"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call listAccountEntitlementsValidateBeforeCall(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountEntitlements(Async)");
        }
        

        okhttp3.Call localVarCall = listAccountEntitlementsCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Retrieve all entitlements within an account.
     * Retrieve a list of all entitlements on the account. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return EntitlementList
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
    public EntitlementList listAccountEntitlements(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<EntitlementList> localVarResp = listAccountEntitlementsWithHttpInfo(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Retrieve all entitlements within an account.
     * Retrieve a list of all entitlements on the account. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;EntitlementList&gt;
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
    public ApiResponse<EntitlementList> listAccountEntitlementsWithHttpInfo(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listAccountEntitlementsValidateBeforeCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<EntitlementList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve all entitlements within an account. (asynchronously)
     * Retrieve a list of all entitlements on the account. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
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
    public okhttp3.Call listAccountEntitlementsAsync(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<EntitlementList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAccountEntitlementsValidateBeforeCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<EntitlementList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAccountGroups
     * @param accountId  (required)
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
    public okhttp3.Call listAccountGroupsCall(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/groups"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call listAccountGroupsValidateBeforeCall(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountGroups(Async)");
        }
        

        okhttp3.Call localVarCall = listAccountGroupsCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Retrieve all groups within an account.
     * Retrieve a list of all groups on the account. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return GroupList
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
    public GroupList listAccountGroups(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<GroupList> localVarResp = listAccountGroupsWithHttpInfo(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Retrieve all groups within an account.
     * Retrieve a list of all groups on the account. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;GroupList&gt;
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
    public ApiResponse<GroupList> listAccountGroupsWithHttpInfo(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listAccountGroupsValidateBeforeCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<GroupList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve all groups within an account. (asynchronously)
     * Retrieve a list of all groups on the account. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
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
    public okhttp3.Call listAccountGroupsAsync(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<GroupList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAccountGroupsValidateBeforeCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<GroupList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAccountUserGrants
     * @param accountId  (required)
     * @param userId  (required)
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
    public okhttp3.Call listAccountUserGrantsCall(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/users/{user-id}/grants"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "user-id" + "\\}", localVarApiClient.escapeString(userId.toString()));

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
    private okhttp3.Call listAccountUserGrantsValidateBeforeCall(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountUserGrants(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling listAccountUserGrants(Async)");
        }
        

        okhttp3.Call localVarCall = listAccountUserGrantsCall(accountId, userId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Add a grant to a user within an account.
     * Retrieve a list of all grants a user belongs to within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param userId  (required)
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
    public GrantList listAccountUserGrants(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<GrantList> localVarResp = listAccountUserGrantsWithHttpInfo(accountId, userId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Add a grant to a user within an account.
     * Retrieve a list of all grants a user belongs to within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param userId  (required)
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
    public ApiResponse<GrantList> listAccountUserGrantsWithHttpInfo(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listAccountUserGrantsValidateBeforeCall(accountId, userId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<GrantList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add a grant to a user within an account. (asynchronously)
     * Retrieve a list of all grants a user belongs to within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param userId  (required)
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
    public okhttp3.Call listAccountUserGrantsAsync(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<GrantList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAccountUserGrantsValidateBeforeCall(accountId, userId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<GrantList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAccountUserGroups
     * @param accountId  (required)
     * @param userId  (required)
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
    public okhttp3.Call listAccountUserGroupsCall(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/users/{user-id}/groups"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "user-id" + "\\}", localVarApiClient.escapeString(userId.toString()));

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
    private okhttp3.Call listAccountUserGroupsValidateBeforeCall(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountUserGroups(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling listAccountUserGroups(Async)");
        }
        

        okhttp3.Call localVarCall = listAccountUserGroupsCall(accountId, userId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * List the groups a user belongs to within a specific account.
     * Retrieve a list of all groups a user belongs to within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param userId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return GroupList
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
    public GroupList listAccountUserGroups(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<GroupList> localVarResp = listAccountUserGroupsWithHttpInfo(accountId, userId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * List the groups a user belongs to within a specific account.
     * Retrieve a list of all groups a user belongs to within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param userId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;GroupList&gt;
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
    public ApiResponse<GroupList> listAccountUserGroupsWithHttpInfo(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listAccountUserGroupsValidateBeforeCall(accountId, userId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<GroupList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List the groups a user belongs to within a specific account. (asynchronously)
     * Retrieve a list of all groups a user belongs to within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param userId  (required)
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
    public okhttp3.Call listAccountUserGroupsAsync(String accountId, String userId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<GroupList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAccountUserGroupsValidateBeforeCall(accountId, userId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<GroupList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAccountUsers
     * @param accountId  (required)
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
    public okhttp3.Call listAccountUsersCall(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/users"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call listAccountUsersValidateBeforeCall(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountUsers(Async)");
        }
        

        okhttp3.Call localVarCall = listAccountUsersCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Retrieve all users within an account.
     * Retrieve a list of all users within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return UserList
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
    public UserList listAccountUsers(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<UserList> localVarResp = listAccountUsersWithHttpInfo(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Retrieve all users within an account.
     * Retrieve a list of all users within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;UserList&gt;
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
    public ApiResponse<UserList> listAccountUsersWithHttpInfo(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listAccountUsersValidateBeforeCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<UserList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve all users within an account. (asynchronously)
     * Retrieve a list of all users within the account which the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param accountId  (required)
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
    public okhttp3.Call listAccountUsersAsync(String accountId, String $filter, String $top, String $skip, String $orderBy, Boolean count, Boolean countOnly, String avalaraVersion, String xCorrelationId, final ApiCallback<UserList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAccountUsersValidateBeforeCall(accountId, $filter, $top, $skip, $orderBy, count, countOnly, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<UserList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAccounts
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
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
    public okhttp3.Call listAccountsCall(String $filter, String $top, String $skip, Boolean count, Boolean countOnly, String $orderBy, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts";

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

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (countOnly != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countOnly", countOnly));
        }

        if ($orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$orderBy", $orderBy));
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
    private okhttp3.Call listAccountsValidateBeforeCall(String $filter, String $top, String $skip, Boolean count, Boolean countOnly, String $orderBy, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listAccountsCall($filter, $top, $skip, count, countOnly, $orderBy, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Get a list of all accounts.
     * Retrieve a list of all accounts the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return AccountList
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
    public AccountList listAccounts(String $filter, String $top, String $skip, Boolean count, Boolean countOnly, String $orderBy, String avalaraVersion, String xCorrelationId) throws ApiException {
        ApiResponse<AccountList> localVarResp = listAccountsWithHttpInfo($filter, $top, $skip, count, countOnly, $orderBy, avalaraVersion, xCorrelationId);
        return localVarResp.getData();
    }

    /**
     * Get a list of all accounts.
     * Retrieve a list of all accounts the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;AccountList&gt;
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
    public ApiResponse<AccountList> listAccountsWithHttpInfo(String $filter, String $top, String $skip, Boolean count, Boolean countOnly, String $orderBy, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = listAccountsValidateBeforeCall($filter, $top, $skip, count, countOnly, $orderBy, avalaraVersion, xCorrelationId, null);
        Type localVarReturnType = new TypeToken<AccountList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of all accounts. (asynchronously)
     * Retrieve a list of all accounts the authenticated user has access to. This list is paged, returning no more than 1000 items at a time.
     * @param $filter A filter statement to identify specific records to retrieve. (optional)
     * @param $top If nonzero, return no more than this number of results.  Used with &#x60;$skip&#x60; to provide pagination for large datasets.  Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)
     * @param $skip If nonzero, skip this number of results before returning data.  Used with &#x60;$top&#x60; to provide pagination for large datasets. (optional)
     * @param count If set to &#39;true&#39;, requests the count of items as part of the response. Default: &#39;false&#39;. If the value cannot be (optional)
     * @param countOnly If set to &#39;true&#39;, requests the count of items as part of the response. No values are returned. Default: &#39;false&#39;. (optional)
     * @param $orderBy A comma separated list of sort statements in the format &#x60;(fieldname) [ASC|DESC]&#x60;, for example &#x60;id ASC&#x60;. (optional)
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
    public okhttp3.Call listAccountsAsync(String $filter, String $top, String $skip, Boolean count, Boolean countOnly, String $orderBy, String avalaraVersion, String xCorrelationId, final ApiCallback<AccountList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAccountsValidateBeforeCall($filter, $top, $skip, count, countOnly, $orderBy, avalaraVersion, xCorrelationId, _callback);
        Type localVarReturnType = new TypeToken<AccountList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchAccount
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
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
    public okhttp3.Call patchAccountCall(String accountId, String avalaraVersion, String xCorrelationId, Account account, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = account;

        // create path and map variables
        String localVarPath = "/accounts/{account-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchAccountValidateBeforeCall(String accountId, String avalaraVersion, String xCorrelationId, Account account, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling patchAccount(Async)");
        }
        

        okhttp3.Call localVarCall = patchAccountCall(accountId, avalaraVersion, xCorrelationId, account, _callback);
        return localVarCall;

    }

    /**
     * Update specific fields in an account.
     * Updates the fields on an account which should change.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
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
    public void patchAccount(String accountId, String avalaraVersion, String xCorrelationId, Account account) throws ApiException {
        patchAccountWithHttpInfo(accountId, avalaraVersion, xCorrelationId, account);
    }

    /**
     * Update specific fields in an account.
     * Updates the fields on an account which should change.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> patchAccountWithHttpInfo(String accountId, String avalaraVersion, String xCorrelationId, Account account) throws ApiException {
        okhttp3.Call localVarCall = patchAccountValidateBeforeCall(accountId, avalaraVersion, xCorrelationId, account, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update specific fields in an account. (asynchronously)
     * Updates the fields on an account which should change.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
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
    public okhttp3.Call patchAccountAsync(String accountId, String avalaraVersion, String xCorrelationId, Account account, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchAccountValidateBeforeCall(accountId, avalaraVersion, xCorrelationId, account, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeDeviceFromAccount
     * @param accountId  (required)
     * @param deviceId  (required)
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
    public okhttp3.Call removeDeviceFromAccountCall(String accountId, String deviceId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/devices/{device-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "device-id" + "\\}", localVarApiClient.escapeString(deviceId.toString()));

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
    private okhttp3.Call removeDeviceFromAccountValidateBeforeCall(String accountId, String deviceId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling removeDeviceFromAccount(Async)");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling removeDeviceFromAccount(Async)");
        }
        

        okhttp3.Call localVarCall = removeDeviceFromAccountCall(accountId, deviceId, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Remove a device from an account.
     * Removes a device from an account.
     * @param accountId  (required)
     * @param deviceId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
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
    public void removeDeviceFromAccount(String accountId, String deviceId, String avalaraVersion, String xCorrelationId) throws ApiException {
        removeDeviceFromAccountWithHttpInfo(accountId, deviceId, avalaraVersion, xCorrelationId);
    }

    /**
     * Remove a device from an account.
     * Removes a device from an account.
     * @param accountId  (required)
     * @param deviceId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> removeDeviceFromAccountWithHttpInfo(String accountId, String deviceId, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = removeDeviceFromAccountValidateBeforeCall(accountId, deviceId, avalaraVersion, xCorrelationId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove a device from an account. (asynchronously)
     * Removes a device from an account.
     * @param accountId  (required)
     * @param deviceId  (required)
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
    public okhttp3.Call removeDeviceFromAccountAsync(String accountId, String deviceId, String avalaraVersion, String xCorrelationId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeDeviceFromAccountValidateBeforeCall(accountId, deviceId, avalaraVersion, xCorrelationId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeGrantFromAccountUser
     * @param accountId  (required)
     * @param userId  (required)
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeGrantFromAccountUserCall(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/users/{user-id}/grants/{grant-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "user-id" + "\\}", localVarApiClient.escapeString(userId.toString()))
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

        final String[] localVarAccepts = {
            
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
    private okhttp3.Call removeGrantFromAccountUserValidateBeforeCall(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling removeGrantFromAccountUser(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling removeGrantFromAccountUser(Async)");
        }
        
        // verify the required parameter 'grantId' is set
        if (grantId == null) {
            throw new ApiException("Missing the required parameter 'grantId' when calling removeGrantFromAccountUser(Async)");
        }
        

        okhttp3.Call localVarCall = removeGrantFromAccountUserCall(accountId, userId, grantId, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Remove a grant from a user within an account.
     * Removes a grant from a user on an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void removeGrantFromAccountUser(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId) throws ApiException {
        removeGrantFromAccountUserWithHttpInfo(accountId, userId, grantId, avalaraVersion, xCorrelationId);
    }

    /**
     * Remove a grant from a user within an account.
     * Removes a grant from a user on an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> removeGrantFromAccountUserWithHttpInfo(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = removeGrantFromAccountUserValidateBeforeCall(accountId, userId, grantId, avalaraVersion, xCorrelationId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove a grant from a user within an account. (asynchronously)
     * Removes a grant from a user on an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param grantId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeGrantFromAccountUserAsync(String accountId, String userId, String grantId, String avalaraVersion, String xCorrelationId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeGrantFromAccountUserValidateBeforeCall(accountId, userId, grantId, avalaraVersion, xCorrelationId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeUserFromAccount
     * @param accountId  (required)
     * @param userId  (required)
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
    public okhttp3.Call removeUserFromAccountCall(String accountId, String userId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account-id}/users/{user-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "user-id" + "\\}", localVarApiClient.escapeString(userId.toString()));

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
    private okhttp3.Call removeUserFromAccountValidateBeforeCall(String accountId, String userId, String avalaraVersion, String xCorrelationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling removeUserFromAccount(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling removeUserFromAccount(Async)");
        }
        

        okhttp3.Call localVarCall = removeUserFromAccountCall(accountId, userId, avalaraVersion, xCorrelationId, _callback);
        return localVarCall;

    }

    /**
     * Remove a user from an account.
     * Removes a user from an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
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
    public void removeUserFromAccount(String accountId, String userId, String avalaraVersion, String xCorrelationId) throws ApiException {
        removeUserFromAccountWithHttpInfo(accountId, userId, avalaraVersion, xCorrelationId);
    }

    /**
     * Remove a user from an account.
     * Removes a user from an account.
     * @param accountId  (required)
     * @param userId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> removeUserFromAccountWithHttpInfo(String accountId, String userId, String avalaraVersion, String xCorrelationId) throws ApiException {
        okhttp3.Call localVarCall = removeUserFromAccountValidateBeforeCall(accountId, userId, avalaraVersion, xCorrelationId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove a user from an account. (asynchronously)
     * Removes a user from an account.
     * @param accountId  (required)
     * @param userId  (required)
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
    public okhttp3.Call removeUserFromAccountAsync(String accountId, String userId, String avalaraVersion, String xCorrelationId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeUserFromAccountValidateBeforeCall(accountId, userId, avalaraVersion, xCorrelationId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for replaceAccount
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
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
    public okhttp3.Call replaceAccountCall(String accountId, String avalaraVersion, String xCorrelationId, Account account, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = account;

        // create path and map variables
        String localVarPath = "/accounts/{account-id}"
            .replaceAll("\\{" + "account-id" + "\\}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call replaceAccountValidateBeforeCall(String accountId, String avalaraVersion, String xCorrelationId, Account account, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceAccount(Async)");
        }
        

        okhttp3.Call localVarCall = replaceAccountCall(accountId, avalaraVersion, xCorrelationId, account, _callback);
        return localVarCall;

    }

    /**
     * Update an account by ID.
     * Updates the account with the data in the request body.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
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
    public void replaceAccount(String accountId, String avalaraVersion, String xCorrelationId, Account account) throws ApiException {
        replaceAccountWithHttpInfo(accountId, avalaraVersion, xCorrelationId, account);
    }

    /**
     * Update an account by ID.
     * Updates the account with the data in the request body.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> replaceAccountWithHttpInfo(String accountId, String avalaraVersion, String xCorrelationId, Account account) throws ApiException {
        okhttp3.Call localVarCall = replaceAccountValidateBeforeCall(accountId, avalaraVersion, xCorrelationId, account, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update an account by ID. (asynchronously)
     * Updates the account with the data in the request body.
     * @param accountId  (required)
     * @param avalaraVersion States the version of the API to use. (optional)
     * @param xCorrelationId Correlation ID to pass into the method. Returned in any response. (optional)
     * @param account  (optional)
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
    public okhttp3.Call replaceAccountAsync(String accountId, String avalaraVersion, String xCorrelationId, Account account, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceAccountValidateBeforeCall(accountId, avalaraVersion, xCorrelationId, account, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

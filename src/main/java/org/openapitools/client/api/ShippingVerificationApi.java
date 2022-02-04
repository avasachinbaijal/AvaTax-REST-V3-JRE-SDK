/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara Shipping Verification only
 *
 * API for evaluating transactions against direct-to-consumer Beverage Alcohol shipping regulations.  This API is currently in beta. 
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    2.4.15
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package org.openapitools.client.api;

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


import org.openapitools.client.model.ErrorDetails;
import org.openapitools.client.model.ShippingVerifyResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShippingVerificationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ShippingVerificationApi(ApiClient apiClient) {
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
     * Build call for deregisterShipment
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deregisterShipmentCall(String companyCode, String transactionCode, String documentType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/companies/{companyCode}/transactions/{transactionCode}/shipment/registration"
            .replaceAll("\\{" + "companyCode" + "\\}", localVarApiClient.escapeString(companyCode.toString()))
            .replaceAll("\\{" + "transactionCode" + "\\}", localVarApiClient.escapeString(transactionCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (documentType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentType", documentType));
        }

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "BasicAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deregisterShipmentValidateBeforeCall(String companyCode, String transactionCode, String documentType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyCode' is set
        if (companyCode == null) {
            throw new ApiException("Missing the required parameter 'companyCode' when calling deregisterShipment(Async)");
        }
        
        // verify the required parameter 'transactionCode' is set
        if (transactionCode == null) {
            throw new ApiException("Missing the required parameter 'transactionCode' when calling deregisterShipment(Async)");
        }
        

        okhttp3.Call localVarCall = deregisterShipmentCall(companyCode, transactionCode, documentType, _callback);
        return localVarCall;

    }

    /**
     * Removes the transaction from consideration when evaluating regulations that span multiple transactions.
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public void deregisterShipment(String companyCode, String transactionCode, String documentType) throws ApiException {
        deregisterShipmentWithHttpInfo(companyCode, transactionCode, documentType);
    }

    /**
     * Removes the transaction from consideration when evaluating regulations that span multiple transactions.
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deregisterShipmentWithHttpInfo(String companyCode, String transactionCode, String documentType) throws ApiException {
        okhttp3.Call localVarCall = deregisterShipmentValidateBeforeCall(companyCode, transactionCode, documentType, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Removes the transaction from consideration when evaluating regulations that span multiple transactions. (asynchronously)
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deregisterShipmentAsync(String companyCode, String transactionCode, String documentType, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deregisterShipmentValidateBeforeCall(companyCode, transactionCode, documentType, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for registerShipment
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerShipmentCall(String companyCode, String transactionCode, String documentType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/companies/{companyCode}/transactions/{transactionCode}/shipment/registration"
            .replaceAll("\\{" + "companyCode" + "\\}", localVarApiClient.escapeString(companyCode.toString()))
            .replaceAll("\\{" + "transactionCode" + "\\}", localVarApiClient.escapeString(transactionCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (documentType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentType", documentType));
        }

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "BasicAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registerShipmentValidateBeforeCall(String companyCode, String transactionCode, String documentType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyCode' is set
        if (companyCode == null) {
            throw new ApiException("Missing the required parameter 'companyCode' when calling registerShipment(Async)");
        }
        
        // verify the required parameter 'transactionCode' is set
        if (transactionCode == null) {
            throw new ApiException("Missing the required parameter 'transactionCode' when calling registerShipment(Async)");
        }
        

        okhttp3.Call localVarCall = registerShipmentCall(companyCode, transactionCode, documentType, _callback);
        return localVarCall;

    }

    /**
     * Registers the transaction so that it may be included when evaluating regulations that span multiple transactions.
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public void registerShipment(String companyCode, String transactionCode, String documentType) throws ApiException {
        registerShipmentWithHttpInfo(companyCode, transactionCode, documentType);
    }

    /**
     * Registers the transaction so that it may be included when evaluating regulations that span multiple transactions.
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> registerShipmentWithHttpInfo(String companyCode, String transactionCode, String documentType) throws ApiException {
        okhttp3.Call localVarCall = registerShipmentValidateBeforeCall(companyCode, transactionCode, documentType, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Registers the transaction so that it may be included when evaluating regulations that span multiple transactions. (asynchronously)
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerShipmentAsync(String companyCode, String transactionCode, String documentType, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = registerShipmentValidateBeforeCall(companyCode, transactionCode, documentType, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for registerShipmentIfCompliant
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A ShippingVerifyResult object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerShipmentIfCompliantCall(String companyCode, String transactionCode, String documentType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/companies/{companyCode}/transactions/{transactionCode}/shipment/registerIfCompliant"
            .replaceAll("\\{" + "companyCode" + "\\}", localVarApiClient.escapeString(companyCode.toString()))
            .replaceAll("\\{" + "transactionCode" + "\\}", localVarApiClient.escapeString(transactionCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (documentType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentType", documentType));
        }

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "BasicAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registerShipmentIfCompliantValidateBeforeCall(String companyCode, String transactionCode, String documentType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyCode' is set
        if (companyCode == null) {
            throw new ApiException("Missing the required parameter 'companyCode' when calling registerShipmentIfCompliant(Async)");
        }
        
        // verify the required parameter 'transactionCode' is set
        if (transactionCode == null) {
            throw new ApiException("Missing the required parameter 'transactionCode' when calling registerShipmentIfCompliant(Async)");
        }
        

        okhttp3.Call localVarCall = registerShipmentIfCompliantCall(companyCode, transactionCode, documentType, _callback);
        return localVarCall;

    }

    /**
     * Evaluates a transaction against a set of direct-to-consumer shipping regulations and, if compliant, registers the transaction so that it may be included when evaluating regulations that span multiple transactions.
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @return ShippingVerifyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A ShippingVerifyResult object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public ShippingVerifyResult registerShipmentIfCompliant(String companyCode, String transactionCode, String documentType) throws ApiException {
        ApiResponse<ShippingVerifyResult> localVarResp = registerShipmentIfCompliantWithHttpInfo(companyCode, transactionCode, documentType);
        return localVarResp.getData();
    }

    /**
     * Evaluates a transaction against a set of direct-to-consumer shipping regulations and, if compliant, registers the transaction so that it may be included when evaluating regulations that span multiple transactions.
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @return ApiResponse&lt;ShippingVerifyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A ShippingVerifyResult object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ShippingVerifyResult> registerShipmentIfCompliantWithHttpInfo(String companyCode, String transactionCode, String documentType) throws ApiException {
        okhttp3.Call localVarCall = registerShipmentIfCompliantValidateBeforeCall(companyCode, transactionCode, documentType, null);
        Type localVarReturnType = new TypeToken<ShippingVerifyResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Evaluates a transaction against a set of direct-to-consumer shipping regulations and, if compliant, registers the transaction so that it may be included when evaluating regulations that span multiple transactions. (asynchronously)
     * 
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A ShippingVerifyResult object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerShipmentIfCompliantAsync(String companyCode, String transactionCode, String documentType, final ApiCallback<ShippingVerifyResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = registerShipmentIfCompliantValidateBeforeCall(companyCode, transactionCode, documentType, _callback);
        Type localVarReturnType = new TypeToken<ShippingVerifyResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for verifyShipment
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A ShippingVerifyResult object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call verifyShipmentCall(String companyCode, String transactionCode, String documentType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/companies/{companyCode}/transactions/{transactionCode}/shipment/verify"
            .replaceAll("\\{" + "companyCode" + "\\}", localVarApiClient.escapeString(companyCode.toString()))
            .replaceAll("\\{" + "transactionCode" + "\\}", localVarApiClient.escapeString(transactionCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (documentType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentType", documentType));
        }

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "BasicAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call verifyShipmentValidateBeforeCall(String companyCode, String transactionCode, String documentType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyCode' is set
        if (companyCode == null) {
            throw new ApiException("Missing the required parameter 'companyCode' when calling verifyShipment(Async)");
        }
        
        // verify the required parameter 'transactionCode' is set
        if (transactionCode == null) {
            throw new ApiException("Missing the required parameter 'transactionCode' when calling verifyShipment(Async)");
        }
        

        okhttp3.Call localVarCall = verifyShipmentCall(companyCode, transactionCode, documentType, _callback);
        return localVarCall;

    }

    /**
     * Evaluates a transaction against a set of direct-to-consumer shipping regulations.
     * The transaction and its lines must meet the following criteria in order to be evaluated: * The transaction must be recorded. Using a type of *SalesInvoice* is recommended. * A parameter with the name *AlcoholRouteType* must be specified and the value must be one of the following: &#39;*DTC*&#39;, &#39;*Retailer DTC*&#39; * A parameter with the name *RecipientName* must be specified and the value must be the name of the recipient. * Each alcohol line must include a *ContainerSize* parameter that describes the volume of a single container. Use the *unit* field to specify one of the following units: &#39;*Litre*&#39;, &#39;*Millilitre*&#39;, &#39;*gallon (US fluid)*&#39;, &#39;*quart (US fluid)*&#39;, &#39;*ounce (fluid US customary)*&#39; * Each alcohol line must include a *PackSize* parameter that describes the number of containers in a pack. Specify *Count* in the *unit* field.  Optionally, the transaction and its lines may use the following parameters: * The *ShipDate* parameter may be used if the date of shipment is different than the date of the transaction. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *RecipientDOB* parameter may be used to evaluate age restrictions. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *PurchaserDOB* parameter may be used to evaluate age restrictions. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *SalesLocation* parameter may be used to describe whether the sale was made *OnSite* or *OffSite*. *OffSite* is the default value. * The *AlcoholContent* parameter may be used to describe the alcohol percentage by volume of the item. Specify *Percentage* in the *unit* field.  **Security Policies** This API depends on all of the following active subscriptions: *AvaAlcohol, AutoAddress, AvaTaxPro*
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @return ShippingVerifyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A ShippingVerifyResult object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public ShippingVerifyResult verifyShipment(String companyCode, String transactionCode, String documentType) throws ApiException {
        ApiResponse<ShippingVerifyResult> localVarResp = verifyShipmentWithHttpInfo(companyCode, transactionCode, documentType);
        return localVarResp.getData();
    }

    /**
     * Evaluates a transaction against a set of direct-to-consumer shipping regulations.
     * The transaction and its lines must meet the following criteria in order to be evaluated: * The transaction must be recorded. Using a type of *SalesInvoice* is recommended. * A parameter with the name *AlcoholRouteType* must be specified and the value must be one of the following: &#39;*DTC*&#39;, &#39;*Retailer DTC*&#39; * A parameter with the name *RecipientName* must be specified and the value must be the name of the recipient. * Each alcohol line must include a *ContainerSize* parameter that describes the volume of a single container. Use the *unit* field to specify one of the following units: &#39;*Litre*&#39;, &#39;*Millilitre*&#39;, &#39;*gallon (US fluid)*&#39;, &#39;*quart (US fluid)*&#39;, &#39;*ounce (fluid US customary)*&#39; * Each alcohol line must include a *PackSize* parameter that describes the number of containers in a pack. Specify *Count* in the *unit* field.  Optionally, the transaction and its lines may use the following parameters: * The *ShipDate* parameter may be used if the date of shipment is different than the date of the transaction. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *RecipientDOB* parameter may be used to evaluate age restrictions. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *PurchaserDOB* parameter may be used to evaluate age restrictions. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *SalesLocation* parameter may be used to describe whether the sale was made *OnSite* or *OffSite*. *OffSite* is the default value. * The *AlcoholContent* parameter may be used to describe the alcohol percentage by volume of the item. Specify *Percentage* in the *unit* field.  **Security Policies** This API depends on all of the following active subscriptions: *AvaAlcohol, AutoAddress, AvaTaxPro*
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @return ApiResponse&lt;ShippingVerifyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A ShippingVerifyResult object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ShippingVerifyResult> verifyShipmentWithHttpInfo(String companyCode, String transactionCode, String documentType) throws ApiException {
        okhttp3.Call localVarCall = verifyShipmentValidateBeforeCall(companyCode, transactionCode, documentType, null);
        Type localVarReturnType = new TypeToken<ShippingVerifyResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Evaluates a transaction against a set of direct-to-consumer shipping regulations. (asynchronously)
     * The transaction and its lines must meet the following criteria in order to be evaluated: * The transaction must be recorded. Using a type of *SalesInvoice* is recommended. * A parameter with the name *AlcoholRouteType* must be specified and the value must be one of the following: &#39;*DTC*&#39;, &#39;*Retailer DTC*&#39; * A parameter with the name *RecipientName* must be specified and the value must be the name of the recipient. * Each alcohol line must include a *ContainerSize* parameter that describes the volume of a single container. Use the *unit* field to specify one of the following units: &#39;*Litre*&#39;, &#39;*Millilitre*&#39;, &#39;*gallon (US fluid)*&#39;, &#39;*quart (US fluid)*&#39;, &#39;*ounce (fluid US customary)*&#39; * Each alcohol line must include a *PackSize* parameter that describes the number of containers in a pack. Specify *Count* in the *unit* field.  Optionally, the transaction and its lines may use the following parameters: * The *ShipDate* parameter may be used if the date of shipment is different than the date of the transaction. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *RecipientDOB* parameter may be used to evaluate age restrictions. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *PurchaserDOB* parameter may be used to evaluate age restrictions. The value should be ISO-8601 compliant (e.g. 2020-07-21). * The *SalesLocation* parameter may be used to describe whether the sale was made *OnSite* or *OffSite*. *OffSite* is the default value. * The *AlcoholContent* parameter may be used to describe the alcohol percentage by volume of the item. Specify *Percentage* in the *unit* field.  **Security Policies** This API depends on all of the following active subscriptions: *AvaAlcohol, AutoAddress, AvaTaxPro*
     * @param companyCode The company code of the company that recorded the transaction (required)
     * @param transactionCode The transaction code to retrieve (required)
     * @param documentType (Optional): The document type of the transaction to operate on. If omitted, defaults to \&quot;SalesInvoice\&quot; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A ShippingVerifyResult object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Invalid Transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call verifyShipmentAsync(String companyCode, String transactionCode, String documentType, final ApiCallback<ShippingVerifyResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyShipmentValidateBeforeCall(companyCode, transactionCode, documentType, _callback);
        Type localVarReturnType = new TypeToken<ShippingVerifyResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

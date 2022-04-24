# AgeVerificationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyAge**](AgeVerificationApi.md#verifyAge) | **POST** /api/v2/ageverification/verify | Determines whether an individual meets or exceeds the minimum legal drinking age.



## verifyAge

> AgeVerifyResult verifyAge(ageVerifyRequest, simulatedFailureCode)

Determines whether an individual meets or exceeds the minimum legal drinking age.

The request must meet the following criteria in order to be evaluated: * *firstName*, *lastName*, and *address* are required fields. * One of the following sets of attributes are required for the *address*:   * *line1, city, region*   * *line1, postalCode*  Optionally, the transaction and its lines may use the following parameters: * A *DOB* (Date of Birth) field. The value should be ISO-8601 compliant (e.g. 2020-07-21). * Beyond the required *address* fields above, a *country* field is permitted   * The valid values for this attribute are [*US, USA*]  **Security Policies** This API depends on the active subscription *AgeVerification*

### Example

```java
// Import classes:

import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.models.*;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
        // Configure HTTP basic authorization
        configuration.setUsername("YOUR USERNAME");
        configuration.setPassword("YOUR PASSWORD");
        // Configure OAuth2 access token for authorization
        configuration.setAccessToken("YOUR ACCESS TOKEN");

        ApiClient apiClient = new ApiClient(configuration);

        AgeVerificationApi apiInstance = new AgeVerificationApi(apiClient);
        AgeVerifyRequest ageVerifyRequest = new AgeVerifyRequest(); // AgeVerifyRequest | Information about the individual whose age is being verified.
        AgeVerifyFailureCode simulatedFailureCode = AgeVerifyFailureCode.fromValue("not_found"); // AgeVerifyFailureCode | (Optional) The failure code included in the simulated response of the endpoint. Note that this endpoint is only available in Sandbox for testing purposes.
        try {
            AgeVerifyResult result = apiInstance.verifyAge(ageVerifyRequest, simulatedFailureCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgeVerificationApi#verifyAge");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ageVerifyRequest** | [**AgeVerifyRequest**](AgeVerifyRequest.md)| Information about the individual whose age is being verified. |
 **simulatedFailureCode** | [**AgeVerifyFailureCode**](.md)| (Optional) The failure code included in the simulated response of the endpoint. Note that this endpoint is only available in Sandbox for testing purposes. | [optional] [enum: not_found, dob_unverifiable, under_age, suspected_fraud, deceased, unknown_error]

### Return type

[**AgeVerifyResult**](AgeVerifyResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An AgeVerificationResult object. |  -  |
| **400** | Invalid Request Model |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


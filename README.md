# Avalara.SDK

Avalara Shipping Verification only

- API version: 3.1.0

API for evaluating transactions against direct-to-consumer Beverage Alcohol shipping regulations.

This API is currently in beta.



## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>Avalara.SDK</groupId>
  <artifactId>Avalara.SDK</artifactId>
  <version>2.4.29</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'Avalara.SDK' jar has been published to maven central.
    mavenLocal()       // Needed if the 'Avalara.SDK' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "Avalara.SDK:Avalara.SDK:2.4.29"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/Avalara.SDK-2.4.29.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import Avalara.SDK.*;
import Avalara.SDK.model.*;

public class AgeVerificationApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgeVerificationApi* | [**verifyAge**](docs/AgeVerificationApi.md#verifyAge) | **POST** /api/v2/ageverification/verify | Determines whether an individual meets or exceeds the minimum legal drinking age.
*ShippingVerificationApi* | [**deregisterShipment**](docs/ShippingVerificationApi.md#deregisterShipment) | **DELETE** /api/v2/companies/{companyCode}/transactions/{transactionCode}/shipment/registration | Removes the transaction from consideration when evaluating regulations that span multiple transactions.
*ShippingVerificationApi* | [**registerShipment**](docs/ShippingVerificationApi.md#registerShipment) | **PUT** /api/v2/companies/{companyCode}/transactions/{transactionCode}/shipment/registration | Registers the transaction so that it may be included when evaluating regulations that span multiple transactions.
*ShippingVerificationApi* | [**registerShipmentIfCompliant**](docs/ShippingVerificationApi.md#registerShipmentIfCompliant) | **PUT** /api/v2/companies/{companyCode}/transactions/{transactionCode}/shipment/registerIfCompliant | Evaluates a transaction against a set of direct-to-consumer shipping regulations and, if compliant, registers the transaction so that it may be included when evaluating regulations that span multiple transactions.
*ShippingVerificationApi* | [**verifyShipment**](docs/ShippingVerificationApi.md#verifyShipment) | **GET** /api/v2/companies/{companyCode}/transactions/{transactionCode}/shipment/verify | Evaluates a transaction against a set of direct-to-consumer shipping regulations.


## Documentation for Models

 - [AgeVerifyFailureCode](docs/AgeVerifyFailureCode.md)
 - [AgeVerifyRequest](docs/AgeVerifyRequest.md)
 - [AgeVerifyRequestAddress](docs/AgeVerifyRequestAddress.md)
 - [AgeVerifyResult](docs/AgeVerifyResult.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [ErrorDetailsError](docs/ErrorDetailsError.md)
 - [ErrorDetailsErrorDetails](docs/ErrorDetailsErrorDetails.md)
 - [ShippingVerifyResult](docs/ShippingVerifyResult.md)
 - [ShippingVerifyResultLines](docs/ShippingVerifyResultLines.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth


- **Type**: HTTP basic authentication

### Bearer


- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



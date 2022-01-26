package org.openapitools.client.integration;

import Avalara.SDK.ApiClient;
import Avalara.SDK.AvaTaxEnvironment;
import Avalara.SDK.Configuration;
import org.openapitools.client.api.AgeVerificationApi;
import org.openapitools.client.api.ShippingVerificationApi;
import org.openapitools.client.model.AgeVerifyRequest;
import org.openapitools.client.model.AgeVerifyRequestAddress;
import org.openapitools.client.model.AgeVerifyResult;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Test {
    public static void main(String[] args ){
        System.out.println("Test start");

        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        configuration.setUsername("demo.compliance-verification");
        configuration.setPassword("sxgv7KK4HX*B7vY@");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
        ApiClient client = new ApiClient(configuration);
        ShippingVerificationApi api = new ShippingVerificationApi(client);
        AgeVerificationApi verificationApi = new AgeVerificationApi(client);

        try {
            api.deregisterShipment("DEFAULT","063e1af4-11d3-4489-b8ba-ae1149758df4",null);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            AgeVerifyRequest request = new AgeVerifyRequest();
            request.firstName("Test");
            request.lastName("Person");
            AgeVerifyRequestAddress address = new AgeVerifyRequestAddress();
            address.line1("255 S King St");
            address.postalCode("98109");
            request.address(address);
            request.setDOB("1970-01-01");
            AgeVerifyResult result = verificationApi.verifyAge(request, null);
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("completed");
    }
}

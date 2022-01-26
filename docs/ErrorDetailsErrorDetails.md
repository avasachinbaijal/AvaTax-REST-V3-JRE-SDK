

# ErrorDetailsErrorDetails

Message Details Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Name of the error or message. |  [optional]
**message** | **String** | Concise summary of the message, suitable for display in the caption of an alert box. |  [optional]
**number** | **Integer** | Unique ID number referring to this error or message. |  [optional]
**description** | **String** | A more detailed description of the problem referenced by this error message, suitable for display in the contents area of an alert box. |  [optional]
**faultCode** | **String** | Indicates the SOAP Fault code, if this was related to an error that corresponded to AvaTax SOAP v1 behavior. |  [optional]
**helpLink** | **String** | URL to help for this message |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | Severity of the message |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
AUTHENTICATIONEXCEPTION | &quot;AuthenticationException&quot;
SUBSCRIPTIONREQUIRED | &quot;SubscriptionRequired&quot;
UNHANDLEDEXCEPTION | &quot;UnhandledException&quot;
INVALIDADDRESS | &quot;InvalidAddress&quot;
ENTITYNOTFOUNDERROR | &quot;EntityNotFoundError&quot;



## Enum: SeverityEnum

Name | Value
---- | -----
ERROR | &quot;Error&quot;




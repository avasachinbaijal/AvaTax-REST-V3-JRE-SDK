

# ErrorDetailsError

An object holding details about the error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Name of the error or message. |  [optional]
**message** | **String** | Concise summary of the message, suitable for display in the caption of an alert box. |  [optional]
**details** | [**ErrorDetailsErrorDetails**](ErrorDetailsErrorDetails.md) |  |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
AUTHENTICATIONEXCEPTION | &quot;AuthenticationException&quot;
SUBSCRIPTIONREQUIRED | &quot;SubscriptionRequired&quot;
SERVERCONFIGURATION | &quot;ServerConfiguration&quot;
INVALIDADDRESS | &quot;InvalidAddress&quot;
ENTITYNOTFOUNDERROR | &quot;EntityNotFoundError&quot;




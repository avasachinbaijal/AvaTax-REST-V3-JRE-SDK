

# ShippingVerifyResultLines


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultCode** | [**ResultCodeEnum**](#ResultCodeEnum) | Describes whether the line is compliant or not. In cases where a determination could not be made, resultCode will provide the reason why. |  [optional]
**lineNumber** | **String** | The lineNumber of the line evaluated. |  [optional]
**message** | **String** | A short description of the result of the checks made against this line. |  [optional]
**successMessages** | **String** | A detailed description of the result of each of the passed checks made against this line. |  [optional]
**failureMessages** | **String** | A detailed description of the result of each of the failed checks made against this line. |  [optional]
**failureCodes** | [**List&lt;FailureCodesEnum&gt;**](#List&lt;FailureCodesEnum&gt;) | An enumeration of all the failure codes received for this line. |  [optional]



## Enum: ResultCodeEnum

Name | Value
---- | -----
COMPLIANT | &quot;Compliant&quot;
NOTCOMPLIANT | &quot;NotCompliant&quot;
UNSUPPORTEDTAXCODE | &quot;UnsupportedTaxCode&quot;
UNSUPPORTEDADDRESS | &quot;UnsupportedAddress&quot;
INVALIDLINE | &quot;InvalidLine&quot;



## Enum: List&lt;FailureCodesEnum&gt;

Name | Value
---- | -----
BELOWLEGALDRINKINGAGE | &quot;BelowLegalDrinkingAge&quot;
SHIPPINGPROHIBITEDTOADDRESS | &quot;ShippingProhibitedToAddress&quot;
MISSINGREQUIREDLICENSE | &quot;MissingRequiredLicense&quot;
VOLUMELIMITEXCEEDED | &quot;VolumeLimitExceeded&quot;
INVALIDFIELDVALUE | &quot;InvalidFieldValue&quot;
MISSINGREQUIREDFIELD | &quot;MissingRequiredField&quot;
INVALIDFIELDTYPE | &quot;InvalidFieldType&quot;
INVALIDFORMAT | &quot;InvalidFormat&quot;
INVALIDDATE | &quot;InvalidDate&quot;




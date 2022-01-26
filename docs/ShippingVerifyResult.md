

# ShippingVerifyResult

The Response of the /shippingverify endpoint. Describes the result of checking all applicable shipping rules against each line in the transaction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compliant** | **Boolean** | Whether every line in the transaction is compliant. |  [optional]
**message** | **String** | A short description of the result of the compliance check. |  [optional]
**successMessages** | **String** | A detailed description of the result of each of the passed checks made against this transaction, separated by line. |  [optional]
**failureMessages** | **String** | A detailed description of the result of each of the failed checks made against this transaction, separated by line. |  [optional]
**failureCodes** | [**List&lt;FailureCodesEnum&gt;**](#List&lt;FailureCodesEnum&gt;) | An enumeration of all the failure codes received across all lines. |  [optional]
**warningCodes** | [**List&lt;WarningCodesEnum&gt;**](#List&lt;WarningCodesEnum&gt;) | An enumeration of all the warning codes received across all lines that a determination could not be made for. |  [optional]
**lines** | [**List&lt;ShippingVerifyResultLines&gt;**](ShippingVerifyResultLines.md) | Describes the results of the checks made for each line in the transaction. |  [optional]



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



## Enum: List&lt;WarningCodesEnum&gt;

Name | Value
---- | -----
UNSUPPORTEDTAXCODE | &quot;UnsupportedTaxCode&quot;
UNSUPPORTEDADDRESS | &quot;UnsupportedAddress&quot;




# Aspose.CAD for Cloud Java SDK
[Aspose.CAD for Cloud](https://products.aspose.cloud/cad/cloud) is a true REST API that enables you to perform a wide range of drawing processing operations including manipulation and conversion in the cloud, with zero initial costs. Our Cloud SDKs are wrappers around REST API in various programming languages, allowing you to process CAD drawings in language of your choice quickly and easily, gaining all benefits of strong types and IDE highlights. 

This repository contains Aspose.CAD for Cloud Java SDK source code. This SDK allows you to work with Aspose.CAD for Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.

To use this SDK, you will need App SID and App Key which can be looked up at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/apps) (free registration in Aspose Cloud is required for this).

# Example
```java
// optional parameters are base URL, API version, authentication type and debug mode
// default base URL is https://api.aspose.cloud
// default API version is v1.1
// default authentication type is OAuth2.0
// default debug mode is false
CadApi cadApi = new CadApi("yourAppKey", "yourAppSID");

// this GET request converts image files
// nullable parameters are output file path, input file folder and Aspose storage name (if you have more than one storage and want to use non-default one) 
// if output file path is not set, resulting image is returned in a stream; otherwise, it's saved at the specified path in the storage and null is returned
GetImageSaveAsRequest getSaveRequest = new GetImageSaveAsRequest("inputImage.jpg", "png", "ResultFolder/resultImage.png", "InputFolder", null);

// returns ApiResponse with null response data value, saves result to storage
cadApi.getImageSaveAs(getSaveRequest);

GetImageSaveAsRequest getStreamRequest = new GetImageSaveAsRequest("inputImage.jpg", "png", null, "InputFolder", null);

// returns ApiResponse with resulting image bytes
ApiResponse apiResponse = cadApi.getImageSaveAs(getStreamRequest);

// process resulting bytes
byte[] responseData = apiResponse.getResponseData();

// another option is to use POST request and send image in a stream, if it's not present in your storage

InputStream inputStream = null;
byte[] inputBytes = null;
try
{
	File inputFile = new File("D:\\test\\localInputImage.jpg");
	inputBytes = new byte[(int) inputFile.length()];
	inputStream = new FileInputStream(inputFile);
	inputStream.read(inputBytes);
}
finally
{
	if (inputStream != null)
	{
		inputStream.close();
	}
}

PostImageSaveAsRequest postSaveRequest = new PostImageSaveAsRequest(inputBytes, "png", "ResultFolder/resultImage.png", null);
	
// returns ApiResponse with null response data value, saves result to storage
cadApi.postImageSaveAs(postSaveRequest);

PostImageSaveAsRequest postStreamRequest = new PostImageSaveAsRequest(inputBytes, "png", null, null);
	
// returns ApiResponse with resulting image bytes
apiResponse = cadApi.postImageSaveAs(postStreamRequest);

// process resulting bytes
responseData = apiResponse.getResponseData();

// another requests typically follow the same principles
```

# Licensing
All Aspose.CAD for Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

# Resources
+ [**Web API reference**](https://apireference.aspose.cloud/cad/)
+ [**Website**](https://www.aspose.cloud)
+ [**Product Home**](https://products.aspose.cloud/cad/cloud)
+ [**Documentation**](https://docs.aspose.cloud/display/cadcloud/Home)
+ [**Free Support Forum**](https://forum.aspose.cloud/c/cad)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.cad/)
+ [**Blog**](https://blog.aspose.cloud/category/aspose-products/aspose.cad-cloud/)
# Aspose.CAD Cloud Java SDK
[Aspose.CAD Cloud](https://products.aspose.cloud/CAD/cloud) is a true REST API that enables you to perform a wide range of drawing processing operations including manipulation and conversion in the cloud, with zero initial costs. Our Cloud SDKs are wrappers around REST API in various programming languages, allowing you to process images in language of your choice quickly and easily, gaining all benefits of strong types and IDE highlights. 

This repository contains Aspose.CAD Cloud Java SDK source code. This SDK allows you to work with Aspose.CAD Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.

To use this SDK, you will need App SID and App Key which can be looked up at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/apps) (free registration in Aspose Cloud is required for this).

The solution is updated using [code generator](https://github.com/aspose-CAD-cloud/aspose-CAD-cloud-codegen).

# Example
```java
// optional parameters are base URL, API version, authentication type and debug mode
// default base URL is https://api.aspose.cloud/
// default API version is v1
// default authentication type is OAuth2.0
// default debug mode is false
class MyApiWrapper
{
    void MyApiCall()
    {
        CadApi cadApi = new CadApi("yourAppKey", "yourAppSID");
        
        // this GET request converts drawing files
        // nullable parameters are input file folder, Aspose storage name (if you have more than one storage and want to use non-default one), rasterization options and output file path 
        // if output file path is not set, resulting image is returned in a stream; otherwise, it's saved at the specified path in the storage and null is returned
        GetDrawingSaveAsRequest getSaveRequest = new GetDrawingSaveAsRequest("inputDrawing.dxf", "png", "InputFolder", null, null, "ResultFolder/resultDrawing.png");
        
        // returns ApiResponse with null response data value, saves result to storage
        CADApi.getDrawingSaveAs(getSaveRequest);
        
        GetDrawingSaveAsRequest getStreamRequest = new GetDrawingSaveAsRequest("inputDrawing.dwg", "png", "InputFolder", null, null, null);
        
        // returns ApiResponse with resulting image bytes
        ApiResponse apiResponse = CADApi.getDrawingSaveAs(getStreamRequest);
        
        // process resulting bytes
        byte[] responseData = apiResponse.getResponseData();
        
        // another option is to use POST request and send image in a stream, if it's not present in your storage
        
        InputStream inputStream = null;
        byte[] inputBytes = null;
        try
        {
        	File inputFile = new File("D:\\test\\localInputDrawing.dwg");
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
        
        PostDrawingSaveAsRequest postSaveRequest = new PostDrawingSaveAsRequest(inputBytes, "png", null, "ResultFolder/resultDrawing.png", null);
        	
        // returns ApiResponse with null response data value, saves result to storage
        CADApi.postDrawingSaveAs(postSaveRequest);
        
        PostDrawingSaveAsRequest postStreamRequest = new PostDrawingSaveAsRequest(inputBytes, "png", null, null, null);
        	
        // returns ApiResponse with resulting image bytes
        apiResponse = CADApi.postDrawingSaveAs(postStreamRequest);
        
        // process resulting bytes
        responseData = apiResponse.getResponseData();
    }
}

// another requests typically follow the same principles
```

# Tests 
Tests from this repo are intended for internal usage only.

# Licensing
All Aspose.CAD Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

## Contact Us
Your feedback is very important to us. Please feel free to contact via
+ [**Free Support Forum**](https://forum.aspose.cloud/c/cad)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)

# Resources
+ [**Web API reference**](https://apireference.aspose.cloud/cad/)
+ [**Website**](https://www.aspose.cloud/)
+ [**Product Home**](https://products.aspose.cloud/cad)
+ [**Documentation**](https://docs.aspose.cloud/cad/)
+ [**Blog**](https://blog.aspose.cloud/category/cad/)

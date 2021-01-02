# Aspose.CAD Cloud Java SDK
[Aspose.CAD Cloud](https://products.aspose.cloud/cad) is a true [REST API](https://apireference.aspose.cloud/cad/) that enables you to perform a wide range of CAD and BIM drawings processing operations including manipulation, export and conversion in a cloud, with zero initial costs.

This repository contains Aspose.CAD Cloud SDK for Java source code. This SDK allows you to perform a wide range of CAD drawing processing operations based on Aspose.CAD Cloud API with all benefits of strong types and IDE highlights.

# Key Features

* Supports the latest versions of AutoCAD DWG, DXF, DWF, DWFX, DWT, STL, IGS, DGN, OBJ and CF2 files
* Convert CAD drawings to high quality PDF
* Convert CAD drawing to high quality raster images
* Convert CAD drawing to high quality vector files like SVG and WMF
* Modify and convert CAD drawing to DXF
* Select and modify specific entities
* Select and convert specific layouts
* Select and convert specific layers
* Track the file conversion process

Look at [API Reference](https://apireference.aspose.cloud/cad/) for full API specification.

For the complete list of use-cases, please refer to the [format support document](https://docs.aspose.cloud/cad/supported-file-formats/) to see what you can achieve!

Detalied official documentation can be found at the [following link](https://docs.aspose.cloud/cad/).

## Getting Started

1. **Sign Up**. Before you begin, you need to sign up for an account on our [Dashboard](https://dashboard.aspose.cloud/) and retrieve your [credentials](https://dashboard.aspose.cloud/#/apps).
2. **Minimum requirements**. This SDK requires [Java 1.6 or later](https://java.com/download/).
3. **Add Aspose.CAD Cloud Java SDK to your project**. 

Add Aspose CAD Cloud repository to your pom.xml.
```xml
<profiles>
    <profile>
        <repositories>
            <repository>
                <id>asposeJavaAPI</id>
                <name>Aspose Java API</name>
                <url>https://repository.aspose.cloud/repo/</url>
                <snapshots>
                    <enabled>false</enabled>
                </snapshots>
                <releases>
                    <enabled>true</enabled>
                </releases>
            </repository>
        </repositories>
        <id>repositoryProfile</id>
        <activation>
            <activeByDefault>true</activeByDefault>
        </activation>
    </profile>
</profiles>
```

Add Aspose.CAD Cloud Java SDK as a dependency.
```xml
<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-cad-cloud</artifactId>
        <version>20.11</version>
    </dependency>
</dependencies>
```

## How to use the SDK?

The complete source code is available in this repository folder. You can either directly use it in your project via source code or get [Maven distribution](https://repository.aspose.cloud/repo/com/aspose/aspose-cad-cloud/) (recommended). For more details, please visit our [documentation website](https://docs.aspose.cloud/cad/available-sdks/).

#### Aspose.CAD Cloud-hosted service VS on-premise deployment
You can choose either to use Aspose.CAD Cloud-hosted drawings processing service (the standard way) or the Docker image from Docker Hub deployed on-premise to serve the requests - https://hub.docker.com/r/aspose/cad-cloud.
The details about key differences and deployment process is described on the dedicated Docker Hub page.

### Prerequisites

To use Aspose CAD for Cloud .NET SDK you need to register an account with [Aspose Cloud](https://www.aspose.cloud/) and lookup/create App Key and SID at [Cloud Dashboard](https://dashboard.aspose.cloud/#/apps). There is free quota available. For more details, see [Aspose Cloud Pricing](https://purchase.aspose.cloud/pricing).

The solution is updated using [code generator](https://github.com/aspose-CAD-cloud/aspose-CAD-cloud-codegen).

# Example
```java
// optional parameters are base URL, API version and debug mode
// default base URL is https://api.aspose.cloud/
// default API version is v3.0
// default debug mode is false
// authentication type is OAuth2.0 (bearer JWT token)
class MyApiWrapper
{
    void MyApiCall()
    {
        CadApi cadApi = new CadApi("yourAppKey", "yourAppSID");
        
        // this GET request converts drawing files
        // nullable parameters are input file folder, Aspose storage name (if you have more than one storage and want to use non-default one), rasterization options and output file path 
        // if output file path is not set, resulting image is returned in a stream; otherwise, it's saved at the specified path in the storage and null is returned
        GetDrawingSaveAsRequest getSaveRequest = new GetDrawingSaveAsRequest("inputDrawing.dxf", "png", "InputFolder", "ResultFolder/resultDrawing.png", "Storage Name");
        
        // returns empty response data value, saves result to storage
        CADApi.getDrawingSaveAs(getSaveRequest);
        
        GetDrawingSaveAsRequest getStreamRequest = new GetDrawingSaveAsRequest("inputDrawing.dwg", "png", "InputFolder", null, null);
        
        // returns resulting image bytes
        byte[] apiResponse = CADApi.getDrawingSaveAs(getStreamRequest);
    
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
        
        PostDrawingSaveAsRequest postSaveRequest = new PostDrawingSaveAsRequest(inputBytes, "png", "ResultFolder/resultDrawing.png", "My Storage");
        	
        // returns empty response data value, saves result to storage
        CADApi.postDrawingSaveAs(postSaveRequest);
        
        PostDrawingSaveAsRequest postStreamRequest = new PostDrawingSaveAsRequest(inputBytes, "png", null, "My Storage");
        	
        // returns resulting image bytes
        byte[] bytesResponse = CADApi.postDrawingSaveAs(postStreamRequest);
    }
}

// other requests typically follow the same principles
```

# Tests 
Tests from this repo are intended for internal usage only.

# Licensing
All Aspose.CAD Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

# Other languages
We generate our SDKs in different languages so you may check if yours is available in our [repository](https://github.com/aspose-cad-cloud). If you don't find your language in the list, feel free to request it from us, or use raw REST API requests as you can find it [here](https://products.aspose.cloud/cad/curl).

# Contact Us
Your feedback is very important to us. Please feel free to contact via
+ [**Free Support Forum**](https://forum.aspose.cloud/c/cad)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)

# Resources
+ [**Web API reference**](https://apireference.aspose.cloud/cad/)
+ [**Website**](https://www.aspose.cloud/)
+ [**Product Home**](https://products.aspose.cloud/cad)
+ [**Documentation**](https://docs.aspose.cloud/cad/)
+ [**Blog**](https://blog.aspose.cloud/category/cad/)

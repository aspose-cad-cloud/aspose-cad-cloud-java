![](https://img.shields.io/badge/api-v3.0-lightgrey)  [![GitHub license](https://img.shields.io/github/license/aspose-cad-cloud/aspose-cad-cloud-dotnet)](https://github.com/aspose-cad-cloud/aspose-cad-cloud-dotnet/blob/master/LICENSE) ![GitHub last commit](https://img.shields.io/github/last-commit/Aspose-cad-Cloud/aspose-cad-cloud-dotnet)
# AutoCAD File Processing Java Cloud REST API
[Aspose.CAD Cloud](https://products.aspose.cloud/cad) is a true [REST API](https://apireference.aspose.cloud/cad/) that enables you to perform a wide range of CAD and BIM drawings processing operations including manipulation, export and conversion in a cloud, with zero initial costs.

This repository contains [Aspose.CAD Cloud Java SDK](https://products.aspose.cloud/cad/java) source code which is written in Java. This SDK allows you to work with Aspose.CAD Cloud REST APIs in your .NET applications quickly and easily, with zero initial cost and gain all benefits of strong types and IDE highlights.

## CAD Processing Features
- Export CAD drawings to other file formats.
- Get image properties of a CAD drawing.
- Change the scale of an AutoCAD sketch.
- Flip and rotate a CAD image.
- Upload or download CAD drawings to the cloud storage.
- Copy, move, delete CAD files from the cloud storage.

## Read & Write CAD Formats
DXF (R12/2007/2010)

## Save CAD As
*Fixed Layout*: PDF (as a vector and as a raster)
*Images*: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, WMF

## Read CAD Formats
DWG (13, 14, 2000, 2004), DWG (2010, 2013, 2014), DWG (2015, 2017, 2018), DWT (13, 14, 2000, 2004), DWT (2010, 2013, 2014), DWT (2015, 2017, 2018), DWF, DGN v7, IGES (IGS), PLT, Industry Foundation Classes (IFC), STereoLithography (STL)

Look at [API Reference](https://apireference.aspose.cloud/cad/) for full API specification.

For the complete list of use-cases, please refer to the [format support document](https://docs.aspose.cloud/cad/supported-file-formats/) to see what you can achieve!

Detailed official documentation can be found at the [following link](https://docs.aspose.cloud/cad/).

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

To use Aspose CAD for Cloud Java SDK you need to register an account with [Aspose Cloud](https://www.aspose.cloud/) and lookup/create App Key and SID at [Cloud Dashboard](https://dashboard.aspose.cloud/#/apps). There is free quota available. For more details, see [Aspose Cloud Pricing](https://purchase.aspose.cloud/pricing).

The solution is updated using [code generator](https://github.com/aspose-CAD-cloud/aspose-CAD-cloud-codegen).

## Convert Drawing to PDF in Java

```java
	// Get your ClientId and ClientSecret from https://dashboard.aspose.cloud (free registration required).

	CadApi cadApi = new CadApi("MY_CLIENT_SECRET", "MY_CLIENT_ID");

	GetDrawingSaveAsRequest getSaveRequest = new GetDrawingSaveAsRequest("sample.dxf", "pdf", "InputFolder", "output.pdf", "Storage Name");

	cadApi.getDrawingSaveAs(getSaveRequest);
```

# Tests
Tests from this repo are intended for internal usage only.

# Licensing
All Aspose.CAD Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

# Other languages
We generate our SDKs in different languages so you may check if yours is available in our [repository](https://github.com/aspose-cad-cloud). If you don't find your language in the list, feel free to request it from us, or use raw REST API requests as you can find it [here](https://products.aspose.cloud/cad/curl).

## Aspose.CAD Cloud SDKs in Popular Languages

| .NET | Java | PHP | Python | Ruby | Node.js |
|---|---|---|---|---|---|
| [GitHub](https://github.com/aspose-cad-cloud/aspose-cad-cloud-dotnet) | [GitHub](https://github.com/aspose-cad-cloud/aspose-cad-cloud-java) | [GitHub](https://github.com/aspose-cad-cloud/aspose-cad-cloud-php) | [GitHub](https://github.com/aspose-cad-cloud/aspose-cad-cloud-python) | [GitHub](https://github.com/aspose-cad-cloud/aspose-cad-cloud-ruby)  | [GitHub](https://github.com/aspose-cad-cloud/aspose-cad-cloud-nodejs) |
| [NuGet](https://www.nuget.org/packages/Aspose.cad-Cloud/) | [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-cad-cloud) | [Composer](https://packagist.org/packages/aspose/aspose-cad-cloud) | [PIP](https://pypi.org/project/aspose.cad-cloud/) | [GEM](https://rubygems.org/gems/aspose_cad_cloud)  | [NPM](https://www.npmjs.com/package/@asposecloud/aspose-cad-cloud) |

[Product Page](https://products.aspose.cloud/cad/java) | [Documentation](https://docs.aspose.cloud/display/cadcloud/Home) | [API Reference](https://apireference.aspose.cloud/cad/) | [Code Samples](https://github.com/aspose-cad-cloud/aspose-cad-cloud-java) | [Blog](https://blog.aspose.cloud/category/cad/) | [Free Support](https://forum.aspose.cloud/c/cad) | [Free Trial](https://dashboard.aspose.cloud/#/apps)|

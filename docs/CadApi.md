# com.aspose.cad.cloud.api.CadApi

<a name="copyFile"></a>
## **copyFile**
> void copyFile(CopyFileRequest request)

Copy file

### **CopyFileRequest** Parameters
```java
CopyFileRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="copyFolder"></a>
## **copyFolder**
> void copyFolder(CopyFolderRequest request)

Copy folder

### **CopyFolderRequest** Parameters
```java
CopyFolderRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createFolder"></a>
## **createFolder**
> void createFolder(CreateFolderRequest request)

Create the folder

### **CreateFolderRequest** Parameters
```java
CreateFolderRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteFile"></a>
## **deleteFile**
> void deleteFile(DeleteFileRequest request)

Delete file

### **DeleteFileRequest** Parameters
```java
DeleteFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteFolder"></a>
## **deleteFolder**
> void deleteFolder(DeleteFolderRequest request)

Delete folder

### **DeleteFolderRequest** Parameters
```java
DeleteFolderRequest(
    String path, 
    String storageName, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="downloadFile"></a>
## **downloadFile**
> byte[] downloadFile(DownloadFileRequest request)

Download file

### **DownloadFileRequest** Parameters
```java
DownloadFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getDiscUsage"></a>
## **getDiscUsage**
> [DiscUsage](DiscUsage.md) getDiscUsage(GetDiscUsageRequest request)

Get disc usage

### **GetDiscUsageRequest** Parameters
```java
GetDiscUsageRequest(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getDrawingProperties"></a>
## **getDrawingProperties**
> [CadResponse](CadResponse.md) getDrawingProperties(GetDrawingPropertiesRequest request)

Retrieves info about an existing drawing.             

### **GetDrawingPropertiesRequest** Parameters
```java
GetDrawingPropertiesRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **folder** | **String**| Folder with a drawing to get properties for. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

[**CadResponse**](CadResponse.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getDrawingResize"></a>
## **getDrawingResize**
> byte[] getDrawingResize(GetDrawingResizeRequest request)

Resize an existing drawing.

### **GetDrawingResizeRequest** Parameters
```java
GetDrawingResizeRequest(
    String name, 
    String outputFormat, 
    Integer newWidth, 
    Integer newHeight, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of a drawing. |
 **outputFormat** | **String**| Resulting file format. |
 **newWidth** | **Integer**| New width. |
 **newHeight** | **Integer**| New height. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getDrawingRotateFlip"></a>
## **getDrawingRotateFlip**
> byte[] getDrawingRotateFlip(GetDrawingRotateFlipRequest request)

Rotate/flip an existing drawing.

### **GetDrawingRotateFlipRequest** Parameters
```java
GetDrawingRotateFlipRequest(
    String name, 
    String outputFormat, 
    String rotateFlipType, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of a drawing. |
 **outputFormat** | **String**| Resulting file format. |
 **rotateFlipType** | **String**| Rotate/flip operation to apply. Possible values: RotateNoneFlipNone, Rotate90FlipNone, Rotate180FlipNone, Rotate270FlipNone, RotateNoneFlipX, Rotate90FlipX, Rotate180FlipX, Rotate270FlipX, RotateNoneFlipY, Rotate90FlipY, Rotate180FlipY, Rotate270FlipY, RotateNoneFlipXY, Rotate90FlipXY, Rotate180FlipXY, Rotate270FlipXY | [enum: RotateNoneFlipNone, Rotate90FlipNone, Rotate180FlipNone, Rotate270FlipNone, RotateNoneFlipX, Rotate90FlipX, Rotate180FlipX, Rotate270FlipX, RotateNoneFlipY, Rotate90FlipY, Rotate180FlipY, Rotate270FlipY, RotateNoneFlipXY, Rotate90FlipXY, Rotate180FlipXY, Rotate270FlipXY]
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getDrawingSaveAs"></a>
## **getDrawingSaveAs**
> byte[] getDrawingSaveAs(GetDrawingSaveAsRequest request)

Export an existing drawing to another format.

### **GetDrawingSaveAsRequest** Parameters
```java
GetDrawingSaveAsRequest(
    String name, 
    String outputFormat, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **outputFormat** | **String**| Resulting file format. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getFileVersions"></a>
## **getFileVersions**
> [FileVersions](FileVersions.md) getFileVersions(GetFileVersionsRequest request)

Get file versions

### **GetFileVersionsRequest** Parameters
```java
GetFileVersionsRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getFilesList"></a>
## **getFilesList**
> [FilesList](FilesList.md) getFilesList(GetFilesListRequest request)

Get all files and folders within a folder

### **GetFilesListRequest** Parameters
```java
GetFilesListRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="moveFile"></a>
## **moveFile**
> void moveFile(MoveFileRequest request)

Move file

### **MoveFileRequest** Parameters
```java
MoveFileRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="moveFolder"></a>
## **moveFolder**
> void moveFolder(MoveFolderRequest request)

Move folder

### **MoveFolderRequest** Parameters
```java
MoveFolderRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="objectExists"></a>
## **objectExists**
> [ObjectExist](ObjectExist.md) objectExists(ObjectExistsRequest request)

Check if file or folder exists

### **ObjectExistsRequest** Parameters
```java
ObjectExistsRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingBmp"></a>
## **postDrawingBmp**
> byte[] postDrawingBmp(PostDrawingBmpRequest request)

Export an existing drawing to BMP format with export settings specified.

### **PostDrawingBmpRequest** Parameters
```java
PostDrawingBmpRequest(
    String name, 
    BmpOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**BmpOptionsDTO**](BmpOptionsDTO.md)| Export BMP options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingGif"></a>
## **postDrawingGif**
> byte[] postDrawingGif(PostDrawingGifRequest request)

Export an existing drawing into GIF format with export settings specified.

### **PostDrawingGifRequest** Parameters
```java
PostDrawingGifRequest(
    String name, 
    GifOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**GifOptionsDTO**](GifOptionsDTO.md)| Export GIF options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingJpeg"></a>
## **postDrawingJpeg**
> byte[] postDrawingJpeg(PostDrawingJpegRequest request)

Export an existing drawing into JPEG format with export settings specified.

### **PostDrawingJpegRequest** Parameters
```java
PostDrawingJpegRequest(
    String name, 
    JpegOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**JpegOptionsDTO**](JpegOptionsDTO.md)| Export JPEG options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingJpeg2000"></a>
## **postDrawingJpeg2000**
> byte[] postDrawingJpeg2000(PostDrawingJpeg2000Request request)

Export an existing drawing into JPEG2000 format with export settings specified.

### **PostDrawingJpeg2000Request** Parameters
```java
PostDrawingJpeg2000Request(
    String name, 
    Jpeg2000OptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**Jpeg2000OptionsDTO**](Jpeg2000OptionsDTO.md)| Export JPEG2000 options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingPdf"></a>
## **postDrawingPdf**
> byte[] postDrawingPdf(PostDrawingPdfRequest request)

Export an existing drawing to PDF format with export settings specified.

### **PostDrawingPdfRequest** Parameters
```java
PostDrawingPdfRequest(
    String name, 
    PdfOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**PdfOptionsDTO**](PdfOptionsDTO.md)| Export PDF options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingPng"></a>
## **postDrawingPng**
> byte[] postDrawingPng(PostDrawingPngRequest request)

Export an existing drawing into PNG format with export settings specified.

### **PostDrawingPngRequest** Parameters
```java
PostDrawingPngRequest(
    String name, 
    PngOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**PngOptionsDTO**](PngOptionsDTO.md)| Export PNG options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingProperties"></a>
## **postDrawingProperties**
> [CadResponse](CadResponse.md) postDrawingProperties(PostDrawingPropertiesRequest request)

Retrieves info about drawing which is passed as a zero-indexed multipart/form-data content or as raw body stream.

### **PostDrawingPropertiesRequest** Parameters
```java
PostDrawingPropertiesRequest(
    byte[] drawingData)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |

### Return type

[**CadResponse**](CadResponse.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingPsd"></a>
## **postDrawingPsd**
> byte[] postDrawingPsd(PostDrawingPsdRequest request)

Export an existing drawing into PSD format with export settings specified.

### **PostDrawingPsdRequest** Parameters
```java
PostDrawingPsdRequest(
    String name, 
    PsdOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**PsdOptionsDTO**](PsdOptionsDTO.md)| Export PSD options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingResize"></a>
## **postDrawingResize**
> byte[] postDrawingResize(PostDrawingResizeRequest request)

Resize a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream.

### **PostDrawingResizeRequest** Parameters
```java
PostDrawingResizeRequest(
    byte[] drawingData, 
    String outputFormat, 
    Integer newWidth, 
    Integer newHeight, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outputFormat** | **String**| Resulting file format. |
 **newWidth** | **Integer**| New width. |
 **newHeight** | **Integer**| New height. |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingRotateFlip"></a>
## **postDrawingRotateFlip**
> byte[] postDrawingRotateFlip(PostDrawingRotateFlipRequest request)

Rotate/flip a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream.

### **PostDrawingRotateFlipRequest** Parameters
```java
PostDrawingRotateFlipRequest(
    byte[] drawingData, 
    String outputFormat, 
    String rotateFlipType, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outputFormat** | **String**| Resulting file format. |
 **rotateFlipType** | **String**| Rotate/flip operation to apply. Possible values: RotateNoneFlipNone, Rotate90FlipNone, Rotate180FlipNone, Rotate270FlipNone, RotateNoneFlipX, Rotate90FlipX, Rotate180FlipX, Rotate270FlipX, RotateNoneFlipY, Rotate90FlipY, Rotate180FlipY, Rotate270FlipY, RotateNoneFlipXY, Rotate90FlipXY, Rotate180FlipXY, Rotate270FlipXY | [enum: RotateNoneFlipNone, Rotate90FlipNone, Rotate180FlipNone, Rotate270FlipNone, RotateNoneFlipX, Rotate90FlipX, Rotate180FlipX, Rotate270FlipX, RotateNoneFlipY, Rotate90FlipY, Rotate180FlipY, Rotate270FlipY, RotateNoneFlipXY, Rotate90FlipXY, Rotate180FlipXY, Rotate270FlipXY]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingSaveAs"></a>
## **postDrawingSaveAs**
> byte[] postDrawingSaveAs(PostDrawingSaveAsRequest request)

Export existing drawing to another format. Drawing data is passed as zero-indexed multipart/form-data content or as raw body stream.             

### **PostDrawingSaveAsRequest** Parameters
```java
PostDrawingSaveAsRequest(
    byte[] drawingData, 
    String outputFormat, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outputFormat** | **String**| Resulting file format. |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingSvg"></a>
## **postDrawingSvg**
> byte[] postDrawingSvg(PostDrawingSvgRequest request)

Export an existing drawing to SVG format with export settings specified.

### **PostDrawingSvgRequest** Parameters
```java
PostDrawingSvgRequest(
    String name, 
    SvgOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**SvgOptionsDTO**](SvgOptionsDTO.md)| Export SVG options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingTiff"></a>
## **postDrawingTiff**
> byte[] postDrawingTiff(PostDrawingTiffRequest request)

Export an existing drawing into TIFF format with export settings specified.

### **PostDrawingTiffRequest** Parameters
```java
PostDrawingTiffRequest(
    String name, 
    TiffOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**TiffOptionsDTO**](TiffOptionsDTO.md)| Export TIFF options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingWmf"></a>
## **postDrawingWmf**
> byte[] postDrawingWmf(PostDrawingWmfRequest request)

Export an existing drawing to WMF format with export settings specified.

### **PostDrawingWmfRequest** Parameters
```java
PostDrawingWmfRequest(
    String name, 
    WmfOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**WmfOptionsDTO**](WmfOptionsDTO.md)| Export WMF options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingBmp"></a>
## **putDrawingBmp**
> byte[] putDrawingBmp(PutDrawingBmpRequest request)

Export drawing to BMP format. Drawing data is passed as zero-indexed multipart/form-data as well as export BMP options serialized as JSON. Order of drawing data and BMP options could vary.

### **PutDrawingBmpRequest** Parameters
```java
PutDrawingBmpRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/BmpOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingGif"></a>
## **putDrawingGif**
> byte[] putDrawingGif(PutDrawingGifRequest request)

Export drawing to GIF format. Drawing data is passed as zero-indexed multipart/form-data as well as export GIF options serialized as JSON. Order of drawing data and GIF options could vary.

### **PutDrawingGifRequest** Parameters
```java
PutDrawingGifRequest(
    byte[] drawingData, 
    String exportOptions, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/GifOptionsDTO model definition. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingJpeg"></a>
## **putDrawingJpeg**
> byte[] putDrawingJpeg(PutDrawingJpegRequest request)

Export drawing to JPEG format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG options serialized as JSON. Order of drawing data and JPEG options could vary.

### **PutDrawingJpegRequest** Parameters
```java
PutDrawingJpegRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/JpegOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingJpeg2000"></a>
## **putDrawingJpeg2000**
> byte[] putDrawingJpeg2000(PutDrawingJpeg2000Request request)

Export drawing to JPEG2000 format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG2000 options serialized as JSON. Order of drawing data and JPEG2000 options could vary.

### **PutDrawingJpeg2000Request** Parameters
```java
PutDrawingJpeg2000Request(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/Jpeg2000OptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingPdf"></a>
## **putDrawingPdf**
> byte[] putDrawingPdf(PutDrawingPdfRequest request)

Export drawing to PDF format. Drawing data is passed as zero-indexed multipart/form-data as well as export PDF options serialized as JSON. Order of drawing data and PDF options could vary.

### **PutDrawingPdfRequest** Parameters
```java
PutDrawingPdfRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/PdfOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingPng"></a>
## **putDrawingPng**
> byte[] putDrawingPng(PutDrawingPngRequest request)

Export drawing to PNG format. Drawing data is passed as zero-indexed multipart/form-data as well as export PNG options serialized as JSON. Order of drawing data and PNG options could vary.

### **PutDrawingPngRequest** Parameters
```java
PutDrawingPngRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/PngOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingPsd"></a>
## **putDrawingPsd**
> byte[] putDrawingPsd(PutDrawingPsdRequest request)

Export drawing to PSD format. Drawing data is passed as zero-indexed multipart/form-data as well as export PSD options serialized as JSON. Order of drawing data and PSD options could vary.

### **PutDrawingPsdRequest** Parameters
```java
PutDrawingPsdRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/PsdOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingSvg"></a>
## **putDrawingSvg**
> byte[] putDrawingSvg(PutDrawingSvgRequest request)

Export drawing to SVG format. Drawing data is passed as zero-indexed multipart/form-data as well as export SVG options serialized as JSON. Order of drawing data and SVG options could vary.

### **PutDrawingSvgRequest** Parameters
```java
PutDrawingSvgRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/SvgOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingTiff"></a>
## **putDrawingTiff**
> byte[] putDrawingTiff(PutDrawingTiffRequest request)

Export drawing to TIFF format. Drawing data is passed as zero-indexed multipart/form-data as well as export TIFF options serialized as JSON. Order of drawing data and TIFF options could vary.

### **PutDrawingTiffRequest** Parameters
```java
PutDrawingTiffRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/TiffOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingWmf"></a>
## **putDrawingWmf**
> byte[] putDrawingWmf(PutDrawingWmfRequest request)

Export drawing to WMF format. Drawing data is passed as zero-indexed multipart/form-data as well as export WMF options serialized as JSON. Order of drawing data and WMF options could vary.

### **PutDrawingWmfRequest** Parameters
```java
PutDrawingWmfRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/WmfOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="storageExists"></a>
## **storageExists**
> [StorageExist](StorageExist.md) storageExists(StorageExistsRequest request)

Check if storage exists

### **StorageExistsRequest** Parameters
```java
StorageExistsRequest(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="uploadFile"></a>
## **uploadFile**
> [FilesUploadResult](FilesUploadResult.md) uploadFile(UploadFileRequest request)

Upload file

### **UploadFileRequest** Parameters
```java
UploadFileRequest(
    String path, 
    byte[] file, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **byte[]**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)


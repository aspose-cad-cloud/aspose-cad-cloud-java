# com.aspose.cad.cloud.api.CadApi

<a name="convert"></a>
## **convert**
> byte[] convert(ConvertRequest request)

Convert CAD drawing to DXF, DWG, DGN, DWF, DWFX, DRC, IFC, STL, STP, STEP, CGM, GLB, GLTF, DWT, IGES, PLT, CF2, OBJ, HPGL, IGS, PCL, FBX, PDF, SVG format.

### **ConvertRequest** Parameters
```java
ConvertRequest(
    String outputFormat, 
    byte[] drawing, 
    String outputTypeExt)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outputFormat** | **String**| Output DXF, DWG, DGN, DWF, DWFX, DRC, IFC, STL, STP, STEP, CGM, GLB, GLTF, DWT, IGES, PLT, CF2, OBJ, HPGL, IGS, PCL, FBX, PDF, SVG, PNG, BMP, DIB, TIFF, TIF, JPEG, GIF, PSD, JPG, JPE, JIF, JFIF, PSD, WEBP, DCM, DICOM, JP2, J2K, JPF, JPM, JPG2, J2C, JPC, JPX, MJ2 , DJVU file format. |
 **drawing** | **byte[]**| Form-data file | [optional]
 **outputTypeExt** | **String**| For output pdf format: PDF_15, PDFa_1a OR PDFa_1b. Null for another format | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

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

<a name="editMetadata"></a>
## **editMetadata**
> byte[] editMetadata(EditMetadataRequest request)

Get Metadata info

### **EditMetadataRequest** Parameters
```java
EditMetadataRequest(
    byte[] drawing)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawing** | **byte[]**|  | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="extractMetadata"></a>
## **extractMetadata**
> byte[] extractMetadata(ExtractMetadataRequest request)

Extract Metadata from CAD drawing to txt, xml or json file.

### **ExtractMetadataRequest** Parameters
```java
ExtractMetadataRequest(
    String outputFormat, 
    byte[] drawing)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outputFormat** | **String**| Output TXT, XML or JSON file format. |
 **drawing** | **byte[]**| Form-data file | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="extractText"></a>
## **extractText**
> byte[] extractText(ExtractTextRequest request)

Extract Text from CAD drawing to txt file

### **ExtractTextRequest** Parameters
```java
ExtractTextRequest(
    byte[] drawing)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawing** | **byte[]**|  | [optional]

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

<a name="paperToCad"></a>
## **paperToCad**
> byte[] paperToCad(PaperToCadRequest request)

Convert bitmap image to DXF, DWG, DGN, DWF, DWFX, DRC, IFC, STL, STP, STEP, CGM, GLB, GLTF, DWT, IGES, PLT, CF2, OBJ, HPGL, IGS, PCL, FBX, SVG format.

### **PaperToCadRequest** Parameters
```java
PaperToCadRequest(
    String outputFormat, 
    byte[] drawing)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outputFormat** | **String**| Output DXF, DWG, DGN, DWF, DWFX, DRC, IFC, STL, STP, STEP, CGM, GLB, GLTF, DWT, IGES, PLT, CF2, OBJ, HPGL, IGS, PCL, FBX, SVG file format. |
 **drawing** | **byte[]**| Form-data file | [optional]

### Return type

**byte[]**

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

<a name="postDrawingCgm"></a>
## **postDrawingCgm**
> byte[] postDrawingCgm(PostDrawingCgmRequest request)

Export an existing drawing to CGM format with export settings specified.

### **PostDrawingCgmRequest** Parameters
```java
PostDrawingCgmRequest(
    String name, 
    CgmOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**CgmOptionsDTO**](CgmOptionsDTO.md)| Export CGM options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingDXF"></a>
## **postDrawingDXF**
> byte[] postDrawingDXF(PostDrawingDXFRequest request)

Export an existing drawing to DXF format with export settings specified.

### **PostDrawingDXFRequest** Parameters
```java
PostDrawingDXFRequest(
    String name, 
    DxfOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**DxfOptionsDTO**](DxfOptionsDTO.md)| Export DXF options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingDicom"></a>
## **postDrawingDicom**
> byte[] postDrawingDicom(PostDrawingDicomRequest request)

Export an existing drawing to Dicom format with export settings specified.

### **PostDrawingDicomRequest** Parameters
```java
PostDrawingDicomRequest(
    String name, 
    DicomOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**DicomOptionsDTO**](DicomOptionsDTO.md)| Export Dicom options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingDraco"></a>
## **postDrawingDraco**
> byte[] postDrawingDraco(PostDrawingDracoRequest request)

Export an existing drawing to Draco format with export settings specified.

### **PostDrawingDracoRequest** Parameters
```java
PostDrawingDracoRequest(
    String name, 
    DracoOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**DracoOptionsDTO**](DracoOptionsDTO.md)| Export Draco options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingDwf"></a>
## **postDrawingDwf**
> byte[] postDrawingDwf(PostDrawingDwfRequest request)

Export an existing drawing to Dwf format with export settings specified.

### **PostDrawingDwfRequest** Parameters
```java
PostDrawingDwfRequest(
    String name, 
    DwfOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**DwfOptionsDTO**](DwfOptionsDTO.md)| Export Dwf options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingFbx"></a>
## **postDrawingFbx**
> byte[] postDrawingFbx(PostDrawingFbxRequest request)

Export an existing drawing to Fbx format with export settings specified.

### **PostDrawingFbxRequest** Parameters
```java
PostDrawingFbxRequest(
    String name, 
    FbxOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**FbxOptionsDTO**](FbxOptionsDTO.md)| Export Fbx options passed as a JSON on a request body. |
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

<a name="postDrawingGlb"></a>
## **postDrawingGlb**
> byte[] postDrawingGlb(PostDrawingGlbRequest request)

Export an existing drawing to GLB format with export settings specified.

### **PostDrawingGlbRequest** Parameters
```java
PostDrawingGlbRequest(
    String name, 
    GlbOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**GlbOptionsDTO**](GlbOptionsDTO.md)| Export GLB options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingGltf"></a>
## **postDrawingGltf**
> byte[] postDrawingGltf(PostDrawingGltfRequest request)

Export an existing drawing to GLTF format with export settings specified.

### **PostDrawingGltfRequest** Parameters
```java
PostDrawingGltfRequest(
    String name, 
    GltfOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**GltfOptionsDTO**](GltfOptionsDTO.md)| Export GLTF options passed as a JSON on a request body. |
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

<a name="postDrawingObj"></a>
## **postDrawingObj**
> byte[] postDrawingObj(PostDrawingObjRequest request)

Export an existing drawing to Obj format with export settings specified.

### **PostDrawingObjRequest** Parameters
```java
PostDrawingObjRequest(
    String name, 
    ObjOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**ObjOptionsDTO**](ObjOptionsDTO.md)| Export Obj options passed as a JSON on a request body. |
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

<a name="postDrawingSTP"></a>
## **postDrawingSTP**
> byte[] postDrawingSTP(PostDrawingSTPRequest request)

Export an existing drawing to STP format with export settings specified.

### **PostDrawingSTPRequest** Parameters
```java
PostDrawingSTPRequest(
    String name, 
    StpOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**StpOptionsDTO**](StpOptionsDTO.md)| Export STP options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
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

<a name="postDrawingThreeDS"></a>
## **postDrawingThreeDS**
> byte[] postDrawingThreeDS(PostDrawingThreeDSRequest request)

Export an existing drawing to 3ds format with export settings specified.

### **PostDrawingThreeDSRequest** Parameters
```java
PostDrawingThreeDSRequest(
    String name, 
    ThreeDSOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**ThreeDSOptionsDTO**](ThreeDSOptionsDTO.md)| Export 3ds options passed as a JSON on a request body. |
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

<a name="postDrawingU3d"></a>
## **postDrawingU3d**
> byte[] postDrawingU3d(PostDrawingU3dRequest request)

Export an existing drawing to U3d format with export settings specified.

### **PostDrawingU3dRequest** Parameters
```java
PostDrawingU3dRequest(
    String name, 
    U3dOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**U3dOptionsDTO**](U3dOptionsDTO.md)| Export U3d options passed as a JSON on a request body. |
 **folder** | **String**| Folder with a drawing to process. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="postDrawingWebp"></a>
## **postDrawingWebp**
> byte[] postDrawingWebp(PostDrawingWebpRequest request)

Export an existing drawing to Webp format with export settings specified.

### **PostDrawingWebpRequest** Parameters
```java
PostDrawingWebpRequest(
    String name, 
    WebpOptionsDTO options, 
    String folder, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an input drawing on a storage. |
 **options** | [**WebpOptionsDTO**](WebpOptionsDTO.md)| Export Webp options passed as a JSON on a request body. |
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

<a name="putDrawingCgm"></a>
## **putDrawingCgm**
> byte[] putDrawingCgm(PutDrawingCgmRequest request)

Export drawing to CGM format. Drawing data is passed as zero-indexed multipart/form-data as well as export CGM options serialized as JSON. Order of drawing data and CGM options could vary.

### **PutDrawingCgmRequest** Parameters
```java
PutDrawingCgmRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/CgmOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingDXF"></a>
## **putDrawingDXF**
> byte[] putDrawingDXF(PutDrawingDXFRequest request)

Export drawing to DXF format. Drawing data is passed as zero-indexed multipart/form-data as well as export DXF options serialized as JSON. Order of drawing data and DXF options could vary.

### **PutDrawingDXFRequest** Parameters
```java
PutDrawingDXFRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/DxfOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingDicom"></a>
## **putDrawingDicom**
> byte[] putDrawingDicom(PutDrawingDicomRequest request)

Export drawing to Dicom format. Drawing data is passed as zero-indexed multipart/form-data as well as export Dicom options serialized as JSON. Order of drawing data and Dicom options could vary.

### **PutDrawingDicomRequest** Parameters
```java
PutDrawingDicomRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/DicomOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingDraco"></a>
## **putDrawingDraco**
> byte[] putDrawingDraco(PutDrawingDracoRequest request)

Export drawing to Draco format. Drawing data is passed as zero-indexed multipart/form-data as well as export Draco options serialized as JSON. Order of drawing data and Draco options could vary.

### **PutDrawingDracoRequest** Parameters
```java
PutDrawingDracoRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/DracoOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingDwf"></a>
## **putDrawingDwf**
> byte[] putDrawingDwf(PutDrawingDwfRequest request)

Export drawing to Dwf format. Drawing data is passed as zero-indexed multipart/form-data as well as export Dwf options serialized as JSON. Order of drawing data and Dwf options could vary.

### **PutDrawingDwfRequest** Parameters
```java
PutDrawingDwfRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/DwfOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingFbx"></a>
## **putDrawingFbx**
> byte[] putDrawingFbx(PutDrawingFbxRequest request)

Export drawing to Fbx format. Drawing data is passed as zero-indexed multipart/form-data as well as export Fbx options serialized as JSON. Order of drawing data and Fbx options could vary.

### **PutDrawingFbxRequest** Parameters
```java
PutDrawingFbxRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/FbxOptionsDTO model definition. | [optional]
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

<a name="putDrawingGlb"></a>
## **putDrawingGlb**
> byte[] putDrawingGlb(PutDrawingGlbRequest request)

Export drawing to GLB format. Drawing data is passed as zero-indexed multipart/form-data as well as export GLB options serialized as JSON. Order of drawing data and GLB options could vary.

### **PutDrawingGlbRequest** Parameters
```java
PutDrawingGlbRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/GlbOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingGltf"></a>
## **putDrawingGltf**
> byte[] putDrawingGltf(PutDrawingGltfRequest request)

Export drawing to GLTF format. Drawing data is passed as zero-indexed multipart/form-data as well as export GLTF options serialized as JSON. Order of drawing data and GLTF options could vary.

### **PutDrawingGltfRequest** Parameters
```java
PutDrawingGltfRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/GltfOptionsDTO model definition. | [optional]
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

<a name="putDrawingObj"></a>
## **putDrawingObj**
> byte[] putDrawingObj(PutDrawingObjRequest request)

Export drawing to Obj format. Drawing data is passed as zero-indexed multipart/form-data as well as export Obj options serialized as JSON. Order of drawing data and Obj options could vary.

### **PutDrawingObjRequest** Parameters
```java
PutDrawingObjRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/ObjOptionsDTO model definition. | [optional]
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

<a name="putDrawingSTP"></a>
## **putDrawingSTP**
> byte[] putDrawingSTP(PutDrawingSTPRequest request)

Export drawing to Stp format. Drawing data is passed as zero-indexed multipart/form-data as well as export Stp options serialized as JSON. Order of drawing data and Stp options could vary.

### **PutDrawingSTPRequest** Parameters
```java
PutDrawingSTPRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/StpOptionsDTO model definition. | [optional]
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

<a name="putDrawingThreeDS"></a>
## **putDrawingThreeDS**
> byte[] putDrawingThreeDS(PutDrawingThreeDSRequest request)

Export drawing to 3ds format. Drawing data is passed as zero-indexed multipart/form-data as well as export 3ds options serialized as JSON. Order of drawing data and 3ds options could vary.

### **PutDrawingThreeDSRequest** Parameters
```java
PutDrawingThreeDSRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/ThreeDSOptionsDTO model definition. | [optional]
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

<a name="putDrawingU3d"></a>
## **putDrawingU3d**
> byte[] putDrawingU3d(PutDrawingU3dRequest request)

Export drawing to U3d format. Drawing data is passed as zero-indexed multipart/form-data as well as export U3d options serialized as JSON. Order of drawing data and U3d options could vary.

### **PutDrawingU3dRequest** Parameters
```java
PutDrawingU3dRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/U3dOptionsDTO model definition. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="putDrawingWebp"></a>
## **putDrawingWebp**
> byte[] putDrawingWebp(PutDrawingWebpRequest request)

Export drawing to Webp format. Drawing data is passed as zero-indexed multipart/form-data as well as export Webp options serialized as JSON. Order of drawing data and Webp options could vary.

### **PutDrawingWebpRequest** Parameters
```java
PutDrawingWebpRequest(
    byte[] drawingData, 
    String outPath, 
    String exportOptions, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawingData** | **byte[]**| Input drawing |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed file). | [optional]
 **exportOptions** | **String**| JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/WebpOptionsDTO model definition. | [optional]
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

<a name="putEditMetadata"></a>
## **putEditMetadata**
> byte[] putEditMetadata(PutEditMetadataRequest request)

Save Metadata

### **PutEditMetadataRequest** Parameters
```java
PutEditMetadataRequest(
    byte[] drawing, 
    String metadataComponent)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drawing** | **byte[]**|  | [optional]
 **metadataComponent** | **String**|  | [optional]

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

<a name="viewer"></a>
## **viewer**
> byte[] viewer(ViewerRequest request)

Return file for viewer

### **ViewerRequest** Parameters
```java
ViewerRequest(
    String outputFormat, 
    byte[] drawing)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outputFormat** | **String**|  |
 **drawing** | **byte[]**|  | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="watermark"></a>
## **watermark**
> byte[] watermark(WatermarkRequest request)

Add watermark to drawing

### **WatermarkRequest** Parameters
```java
WatermarkRequest(
    String outputFormat, 
    byte[] drawing, 
    String watermarkRgb, 
    String outputTypeExt)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outputFormat** | **String**|  |
 **drawing** | **byte[]**|  | [optional]
 **watermarkRgb** | **String**|  | [optional]
 **outputTypeExt** | **String**|  | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)


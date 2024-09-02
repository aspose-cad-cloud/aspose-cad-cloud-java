/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CadApi.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
* 
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
* 
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.cad.cloud.api;

import com.aspose.cad.cloud.model.*;
import com.aspose.cad.cloud.invoker.*;
import com.aspose.cad.cloud.invoker.internal.*;
import com.aspose.cad.cloud.invoker.internal.requesthandlers.*;
import com.aspose.cad.cloud.model.requests.*;

import java.io.File;
import java.util.HashMap;

/**
 * Aspose.CAD Cloud API
 */
public class CadApi 
{
    /**
     * Current SDK version
     */
    public static final String Version = "24.5.2";

    /**
     * The configuration
     */
    public Configuration Configuration;
    
    /**
     * The API invoker
     */
    private ApiInvoker apiInvoker;
       
    /**
     * Initializes a new instance of the CadApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public CadApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initCadApi(config);
    }

    /**
     * Initializes a new instance of the CadApi class for Aspose Cloud-hosted service usage.
     * @param clientSecret The Client Secret.
     * @param clientId The Client ID.
     */
    public CadApi(String clientSecret, String clientId)
    {
        Configuration config = new Configuration();
        config.ClientSecret = clientSecret;
        config.ClientId = clientId;
        this.initCadApi(config);
    }
    
    /**
     * Initializes a new instance of the CadApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debugMode If debug mode is enabled.
     * @throws Exception 
     */
    public CadApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initCadApi(config);
    }

    /**
     * Initializes a new instance of the CadApi class for Aspose Cloud-hosted service usage.
     * @param clientSecret The Client Secret.
     * @param clientId The Client ID.
     * @param baseUrl The base URL.
     */
    public CadApi(String clientSecret, String clientId, String baseUrl)
    {
        Configuration config = new Configuration();
        config.ClientSecret = clientSecret;
        config.ClientId = clientId;
        config.setApiBaseUrl(baseUrl);
        this.initCadApi(config);
    }

    /**
     * Initializes a new instance of the CadApi class for Aspose Cloud-hosted service usage.
     * @param clientSecret The Client Secret.
     * @param clientId The Client ID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public CadApi(String clientSecret, String clientId, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.ClientSecret = clientSecret;
        config.ClientId = clientId;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initCadApi(config);
    }

    /**
     * Initializes a new instance of the CadApi class for Aspose Cloud-hosted service usage.
     * @param clientSecret The Client Secret.
     * @param clientId The Client ID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public CadApi(String clientSecret, String clientId, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
        Configuration config = new Configuration();
        config.ClientSecret = clientSecret;
        config.ClientId = clientId;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debug);
        this.initCadApi(config);
    }
    
    /**
     * Initializes a new instance of the CadApi class.
     * @param configuration Configuration settings.
     */
    private void initCadApi(Configuration configuration)
    {
        this.Configuration = configuration;
        int handlersCount = configuration.OnPremise ? 2 : 3;
        IRequestHandler[] requestHandlers = new IRequestHandler[handlersCount];
        requestHandlers[--handlersCount] = new ApiExceptionRequestHandler();
        requestHandlers[--handlersCount] = new DebugLogRequestHandler(this.Configuration);
        if (!configuration.OnPremise)
        {
            requestHandlers[--handlersCount] = new AuthRequestHandler(this.Configuration);
        }
        
        this.apiInvoker = new ApiInvoker(requestHandlers, this.Configuration);
    }
    
    /**
     * Convert CAD drawing to DXF, DWG, DGN, DRC, DWF, DWFX, IFC, STL, STP, STEP, CGM, GLB, GLTF, DWT, IGES, PLT, CF2, OBJ, HPGL, IGS, PCL, FBX, PDF, SVG format.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] convert(ConvertRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling convert");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling convert");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/Convert";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputTypeExt", request.outputTypeExt);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Copy file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void copyFile(CopyFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFile");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/file/copy/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Copy folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void copyFolder(CopyFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFolder");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/folder/copy/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Create the folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createFolder(CreateFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling createFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteFile(DeleteFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteFolder(DeleteFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.recursive);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Download file
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] downloadFile(DownloadFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling downloadFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Get Metadata info
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] editMetadata(EditMetadataRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling editMetadata");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/EditMetadata";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Extract Metadata from CAD drawing to txt, xml or json file.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] extractMetadata(ExtractMetadataRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling extractMetadata");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling extractMetadata");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/ExtractMetadata";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Extract Text from CAD drawing to txt file
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] extractText(ExtractTextRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling extractText");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/ExtractText";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Get disc usage
     * 
     * @param request Holds parameters for this request invocation.
     * @return DiscUsage
     * @throws Exception 
     */
    public DiscUsage getDiscUsage(GetDiscUsageRequest request) throws Exception 
    {
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/disc";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), DiscUsage.class);
    }
  
    /**
     * Retrieves info about an existing drawing.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return CadResponse
     * @throws Exception 
     */
    public CadResponse getDrawingProperties(GetDrawingPropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getDrawingProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), CadResponse.class);
    }
  
    /**
     * Resize an existing drawing.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getDrawingResize(GetDrawingResizeRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getDrawingResize");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling getDrawingResize");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling getDrawingResize");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling getDrawingResize");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/resize";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Rotate/flip an existing drawing.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getDrawingRotateFlip(GetDrawingRotateFlipRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getDrawingRotateFlip");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling getDrawingRotateFlip");
      }
       // verify the required parameter 'request.rotateFlipType' is set
      if (request.rotateFlipType== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipType' when calling getDrawingRotateFlip");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/rotateflip";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rotateFlipType", request.rotateFlipType);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to another format.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getDrawingSaveAs(GetDrawingSaveAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getDrawingSaveAs");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling getDrawingSaveAs");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/saveAs/{outputFormat}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "outputFormat", request.outputFormat);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Get file versions
     * 
     * @param request Holds parameters for this request invocation.
     * @return FileVersions
     * @throws Exception 
     */
    public FileVersions getFileVersions(GetFileVersionsRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFileVersions");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/version/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), FileVersions.class);
    }
  
    /**
     * Get all files and folders within a folder
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesList
     * @throws Exception 
     */
    public FilesList getFilesList(GetFilesListRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFilesList");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), FilesList.class);
    }
  
    /**
     * Move file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void moveFile(MoveFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFile");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/file/move/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Move folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void moveFolder(MoveFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFolder");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/folder/move/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Check if file or folder exists
     * 
     * @param request Holds parameters for this request invocation.
     * @return ObjectExist
     * @throws Exception 
     */
    public ObjectExist objectExists(ObjectExistsRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling objectExists");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/exist/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), ObjectExist.class);
    }
  
    /**
     * Convert bitmap image to DXF, DWG, DGN, DWF, DWFX, DRC, IFC, STL, STP, STEP, CGM, GLB, GLTF, DWT, IGES, PLT, CF2, OBJ, HPGL, IGS, PCL, FBX, SVG format.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] paperToCad(PaperToCadRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling paperToCad");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling paperToCad");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/paper-to-cad";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to BMP format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingBmp(PostDrawingBmpRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingBmp");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingBmp");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/bmp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to CGM format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingCgm(PostDrawingCgmRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingCgm");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingCgm");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/cgm";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to DXF format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingDXF(PostDrawingDXFRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingDXF");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingDXF");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/dxf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to Dicom format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingDicom(PostDrawingDicomRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingDicom");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingDicom");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/dicom";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to Draco format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingDraco(PostDrawingDracoRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingDraco");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingDraco");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/drc";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to Dwf format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingDwf(PostDrawingDwfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingDwf");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingDwf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/dwf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to Fbx format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingFbx(PostDrawingFbxRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingFbx");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingFbx");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/fbx";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing into GIF format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingGif(PostDrawingGifRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingGif");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingGif");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/gif";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to GLB format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingGlb(PostDrawingGlbRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingGlb");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingGlb");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/glb";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to GLTF format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingGltf(PostDrawingGltfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingGltf");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingGltf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/gltf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing into JPEG format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingJpeg(PostDrawingJpegRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingJpeg");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingJpeg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/jpeg";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing into JPEG2000 format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingJpeg2000(PostDrawingJpeg2000Request request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingJpeg2000");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingJpeg2000");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/jpeg2000";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to Obj format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingObj(PostDrawingObjRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingObj");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingObj");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/obj";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to PDF format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingPdf(PostDrawingPdfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingPdf");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingPdf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/pdf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing into PNG format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingPng(PostDrawingPngRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingPng");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingPng");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/png";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Retrieves info about drawing which is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return CadResponse
     * @throws Exception 
     */
    public CadResponse postDrawingProperties(PostDrawingPropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling postDrawingProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), CadResponse.class);
    }
  
    /**
     * Export an existing drawing into PSD format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingPsd(PostDrawingPsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingPsd");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingPsd");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/psd";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Resize a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingResize(PostDrawingResizeRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling postDrawingResize");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling postDrawingResize");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling postDrawingResize");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling postDrawingResize");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/resize";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Rotate/flip a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingRotateFlip(PostDrawingRotateFlipRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling postDrawingRotateFlip");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling postDrawingRotateFlip");
      }
       // verify the required parameter 'request.rotateFlipType' is set
      if (request.rotateFlipType== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipType' when calling postDrawingRotateFlip");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/rotateflip";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rotateFlipType", request.rotateFlipType);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to STP format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingSTP(PostDrawingSTPRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingSTP");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingSTP");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/stp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export existing drawing to another format. Drawing data is passed as zero-indexed multipart/form-data content or as raw body stream.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingSaveAs(PostDrawingSaveAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling postDrawingSaveAs");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling postDrawingSaveAs");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/saveAs/{outputFormat}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "outputFormat", request.outputFormat);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to SVG format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingSvg(PostDrawingSvgRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingSvg");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingSvg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/svg";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to 3ds format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingThreeDS(PostDrawingThreeDSRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingThreeDS");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingThreeDS");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/3ds";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing into TIFF format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingTiff(PostDrawingTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingTiff");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingTiff");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/tiff";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to U3d format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingU3d(PostDrawingU3dRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingU3d");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingU3d");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/u3d";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to Webp format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingWebp(PostDrawingWebpRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingWebp");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingWebp");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/webp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export an existing drawing to WMF format with export settings specified.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postDrawingWmf(PostDrawingWmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postDrawingWmf");
      }
       // verify the required parameter 'request.options' is set
      if (request.options== null) {
        throw new ApiException(400, "Missing the required parameter 'request.options' when calling postDrawingWmf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/{name}/wmf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      String postBody = SerializationHelper.serialize(request.options);
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to BMP format. Drawing data is passed as zero-indexed multipart/form-data as well as export BMP options serialized as JSON. Order of drawing data and BMP options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingBmp(PutDrawingBmpRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingBmp");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/bmp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to CGM format. Drawing data is passed as zero-indexed multipart/form-data as well as export CGM options serialized as JSON. Order of drawing data and CGM options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingCgm(PutDrawingCgmRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingCgm");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/cgm";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to DXF format. Drawing data is passed as zero-indexed multipart/form-data as well as export DXF options serialized as JSON. Order of drawing data and DXF options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingDXF(PutDrawingDXFRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingDXF");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/dxf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to Dicom format. Drawing data is passed as zero-indexed multipart/form-data as well as export Dicom options serialized as JSON. Order of drawing data and Dicom options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingDicom(PutDrawingDicomRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingDicom");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/dicom";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to Draco format. Drawing data is passed as zero-indexed multipart/form-data as well as export Draco options serialized as JSON. Order of drawing data and Draco options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingDraco(PutDrawingDracoRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingDraco");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/drc";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to Dwf format. Drawing data is passed as zero-indexed multipart/form-data as well as export Dwf options serialized as JSON. Order of drawing data and Dwf options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingDwf(PutDrawingDwfRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingDwf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/dwf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to Fbx format. Drawing data is passed as zero-indexed multipart/form-data as well as export Fbx options serialized as JSON. Order of drawing data and Fbx options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingFbx(PutDrawingFbxRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingFbx");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/fbx";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to GIF format. Drawing data is passed as zero-indexed multipart/form-data as well as export GIF options serialized as JSON. Order of drawing data and GIF options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingGif(PutDrawingGifRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingGif");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/gif";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to GLB format. Drawing data is passed as zero-indexed multipart/form-data as well as export GLB options serialized as JSON. Order of drawing data and GLB options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingGlb(PutDrawingGlbRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingGlb");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/glb";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to GLTF format. Drawing data is passed as zero-indexed multipart/form-data as well as export GLTF options serialized as JSON. Order of drawing data and GLTF options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingGltf(PutDrawingGltfRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingGltf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/gltf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to JPEG format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG options serialized as JSON. Order of drawing data and JPEG options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingJpeg(PutDrawingJpegRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingJpeg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/jpeg";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to JPEG2000 format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG2000 options serialized as JSON. Order of drawing data and JPEG2000 options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingJpeg2000(PutDrawingJpeg2000Request request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingJpeg2000");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/jpeg2000";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to Obj format. Drawing data is passed as zero-indexed multipart/form-data as well as export Obj options serialized as JSON. Order of drawing data and Obj options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingObj(PutDrawingObjRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingObj");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/obj";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to PDF format. Drawing data is passed as zero-indexed multipart/form-data as well as export PDF options serialized as JSON. Order of drawing data and PDF options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingPdf(PutDrawingPdfRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingPdf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/pdf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to PNG format. Drawing data is passed as zero-indexed multipart/form-data as well as export PNG options serialized as JSON. Order of drawing data and PNG options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingPng(PutDrawingPngRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingPng");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/png";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to PSD format. Drawing data is passed as zero-indexed multipart/form-data as well as export PSD options serialized as JSON. Order of drawing data and PSD options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingPsd(PutDrawingPsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingPsd");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/psd";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to Stp format. Drawing data is passed as zero-indexed multipart/form-data as well as export Stp options serialized as JSON. Order of drawing data and Stp options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingSTP(PutDrawingSTPRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingSTP");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/stp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to SVG format. Drawing data is passed as zero-indexed multipart/form-data as well as export SVG options serialized as JSON. Order of drawing data and SVG options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingSvg(PutDrawingSvgRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingSvg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/svg";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to 3ds format. Drawing data is passed as zero-indexed multipart/form-data as well as export 3ds options serialized as JSON. Order of drawing data and 3ds options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingThreeDS(PutDrawingThreeDSRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingThreeDS");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/3ds";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to TIFF format. Drawing data is passed as zero-indexed multipart/form-data as well as export TIFF options serialized as JSON. Order of drawing data and TIFF options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingTiff(PutDrawingTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingTiff");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/tiff";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to U3d format. Drawing data is passed as zero-indexed multipart/form-data as well as export U3d options serialized as JSON. Order of drawing data and U3d options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingU3d(PutDrawingU3dRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingU3d");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/u3d";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to Webp format. Drawing data is passed as zero-indexed multipart/form-data as well as export Webp options serialized as JSON. Order of drawing data and Webp options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingWebp(PutDrawingWebpRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingWebp");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/webp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export drawing to WMF format. Drawing data is passed as zero-indexed multipart/form-data as well as export WMF options serialized as JSON. Order of drawing data and WMF options could vary.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putDrawingWmf(PutDrawingWmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putDrawingWmf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/wmf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.exportOptions != null) 
      {
          formParams.put("exportOptions", request.exportOptions);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Save Metadata
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] putEditMetadata(PutEditMetadataRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling putEditMetadata");
      }
       // verify the required parameter 'request.metadataComponent' is set
      if (request.metadataComponent== null) {
        throw new ApiException(400, "Missing the required parameter 'request.metadataComponent' when calling putEditMetadata");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/EditMetadata";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.metadataComponent != null) 
      {
          formParams.put("metadataComponent", request.metadataComponent);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Check if storage exists
     * 
     * @param request Holds parameters for this request invocation.
     * @return StorageExist
     * @throws Exception 
     */
    public StorageExist storageExists(StorageExistsRequest request) throws Exception 
    {
       // verify the required parameter 'request.storageName' is set
      if (request.storageName== null) {
        throw new ApiException(400, "Missing the required parameter 'request.storageName' when calling storageExists");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/{storageName}/exist";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "storageName", request.storageName);
      
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), StorageExist.class);
    }
  
    /**
     * Upload file
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesUploadResult
     * @throws Exception 
     */
    public FilesUploadResult uploadFile(UploadFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling uploadFile");
      }
       // verify the required parameter 'request.file' is set
      if (request.File== null) {
        throw new ApiException(400, "Missing the required parameter 'request.file' when calling uploadFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            if (request.File != null) 
      {
          formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), FilesUploadResult.class);
    }
  
    /**
     * Return file for viewer
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] viewer(ViewerRequest request) throws Exception 
    {
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling viewer");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/Viewer";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      
            if (request.drawing != null) 
      {
          formParams.put("drawing", this.apiInvoker.toFileInfo(request.drawing, "drawing"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Add watermark to drawing
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] watermark(WatermarkRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling watermark");
      }
       // verify the required parameter 'request.outputFormat' is set
      if (request.outputFormat== null) {
        throw new ApiException(400, "Missing the required parameter 'request.outputFormat' when calling watermark");
      }
       // verify the required parameter 'request.watermark' is set
      if (request.watermark== null) {
        throw new ApiException(400, "Missing the required parameter 'request.watermark' when calling watermark");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/cad/Watermark";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputFormat", request.outputFormat);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outputTypeExt", request.outputTypeExt);
      
            if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }if (request.watermark != null) 
      {
          formParams.put("watermark", request.watermark);
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
}

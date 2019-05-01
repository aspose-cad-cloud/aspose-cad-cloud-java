/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CadApi.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
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
package com.aspose.cad.cloud.sdk.api;

import com.aspose.cad.cloud.sdk.model.*;
import com.aspose.cad.cloud.sdk.invoker.*;
import com.aspose.cad.cloud.sdk.invoker.internal.*;
import com.aspose.cad.cloud.sdk.model.*;
import com.aspose.cad.cloud.sdk.invoker.internal.requesthandlers.*;;
import com.aspose.cad.cloud.sdk.model.requests.*;
import com.aspose.cad.cloud.sdk.stablemodel.*;
import java.io.File;

import java.util.HashMap;

/**
 * Aspose.CAD for Cloud API
 */
public class CadApi 
{
	/**
	 * Current SDK version
	 */
	public static final String Version = "17.11";

	/**
	 * The API invoker
	 */
    private ApiInvoker apiInvoker;

    /**
     * The configuration
     */
    private Configuration configuration;

    /**
     * Initializes a new instance of the CadApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public CadApi(String appKey, String appSid)
    {
		Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
	    this.initCadApi(config);
    }

    /**
     * Initializes a new instance of the CadApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public CadApi(String appKey, String appSid, String baseUrl)
    {
	    Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
		config.setApiBaseUrl(baseUrl);
		this.initCadApi(config);
    }

    /**
     * Initializes a new instance of the CadApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public CadApi(String appKey, String appSid, String baseUrl, String apiVersion)
    {
	    Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
		config.setApiBaseUrl(baseUrl);
		config.setApiVersion(apiVersion);
		this.initCadApi(config);
    }

    /**
     * Initializes a new instance of the CadApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public CadApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug)
    {
	    Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
		config.setApiBaseUrl(baseUrl);
		config.setApiVersion(apiVersion);
		config.setDebugMode(debug);
		this.initCadApi(config);
    }
    
    /**
     * Initializes a new instance of the CadApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param authType Authentication type.
     * @param debug If debug mode is enabled.
     */
    public CadApi(String appKey, String appSid, String baseUrl, String apiVersion, AuthType authType, Boolean debug)
    {
	    Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
		config.setApiBaseUrl(baseUrl);
		config.setApiVersion(apiVersion);
		config.setDebugMode(debug);
		config.AuthType = authType;
		this.initCadApi(config);
    }

    /**
     * Initializes a new instance of the CadApi class.
     * @param configuration Configuration settings.
     */
    private void initCadApi(Configuration configuration)
    {
        this.configuration = configuration;
		IRequestHandler[] requestHandlers = new IRequestHandler[4];
		requestHandlers[0] = new OAuthRequestHandler(this.configuration);
        requestHandlers[1] = new DebugLogRequestHandler(this.configuration);
        requestHandlers[2] = new ApiExceptionRequestHandler();
        requestHandlers[3] = new AuthWithSignatureRequestHandler(this.configuration);
        this.apiInvoker = new ApiInvoker(requestHandlers);
    }
	
    /**
     * Change scale of an existing image
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getChangeImageScale(GetChangeImageScaleRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getChangeImageScale");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getChangeImageScale");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling getChangeImageScale");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling getChangeImageScale");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/cad/{name}/resize";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  
	  
	  
	
	  try 
      {                               
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
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(CadResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), CadResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;
      }
    }
	
    /**
     * Get properties of an image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagePropertiesResponse
     * @throws Exception 
     */
    public ApiResponse getImageProperties(GetImagePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageProperties");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/cad/{name}/properties";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
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
		
	      ApiResponse finalResponse; 
		  if (ImagePropertiesResponse.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (ImagePropertiesResponse.class.getName().equals(CadResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), CadResponse.class));
		  }
		  else if (ImagePropertiesResponse.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;
      }
    }
	
    /**
     * Rotate and flip existing image
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageRotateFlip(GetImageRotateFlipRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageRotateFlip");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageRotateFlip");
      }
       // verify the required parameter 'request.method' is set
      if (request.method == null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling getImageRotateFlip");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/cad/{name}/rotateflip";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  
	  
	  
	
	  try 
      {                               
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
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(CadResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), CadResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;
      }
    }
	
    /**
     * Export existing image to another format
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageSaveAs(GetImageSaveAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageSaveAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageSaveAs");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/cad/{name}/saveAs";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rasterOptions", request.rasterOptions);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  
	  
	  
	
	  try 
      {                               
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
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(CadResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), CadResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;
      }
    }
	
    /**
     * Change scale of an image from body
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postChangeImageScale(PostChangeImageScaleRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling postChangeImageScale");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postChangeImageScale");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling postChangeImageScale");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling postChangeImageScale");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/cad/resize";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
	
	  try 
      {                               
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
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(CadResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), CadResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;
      }
    }
	
    /**
     * Rotate and flip existing image and get it from response.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageRotateFlip(PostImageRotateFlipRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling postImageRotateFlip");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageRotateFlip");
      }
       // verify the required parameter 'request.method' is set
      if (request.method == null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling postImageRotateFlip");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/cad/rotateflip";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  
	  
	  if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
	
	  try 
      {                               
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
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(CadResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), CadResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;
      }
    }
	
    /**
     * Export existing image to another format. Image is passed as request body.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageSaveAs(PostImageSaveAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.drawingData' is set
      if (request.drawingData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.drawingData' when calling postImageSaveAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageSaveAs");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/cad/saveAs";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rasterOptions", request.rasterOptions);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.drawingData != null) 
      {
          formParams.put("drawingData", this.apiInvoker.toFileInfo(request.drawingData, "drawingData"));
      }
	
	  try 
      {                               
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
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(CadResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), CadResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;
      }
    }
	
}


/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Cad for Cloud
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
 * --------------------------------------------------------------------------------
 */

package com.aspose.cad.cloud.api;

import com.aspose.cad.cloud.*;
import com.aspose.cad.cloud.model.*;
import com.aspose.cad.cloud.model.requests.*;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.File;
import java.lang.reflect.Type;
import java.util.*;


public class CadApi {
    private Integer NotAuth = 401;
    private Integer BadRequest = 400;
    private ApiClient apiClient;

    public CadApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CadApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getChangeImageScale
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getChangeImageScaleCall(GetChangeImageScaleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cad/{name}/resize"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "newWidth", request.getNewWidth());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "newHeight", request.getNewHeight());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getOutPath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChangeImageScaleValidateBeforeCall(GetChangeImageScaleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getChangeImageScale");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling getChangeImageScale");
        }
        
        // verify the required parameter 'NewWidth' is set
        if (request.getNewWidth() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NewWidth' when calling getChangeImageScale");
        }
        
        // verify the required parameter 'NewHeight' is set
        if (request.getNewHeight() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NewHeight' when calling getChangeImageScale");
        }
        

        com.squareup.okhttp.Call call = getChangeImageScaleCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Change scale of an existing image
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getChangeImageScale(GetChangeImageScaleRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getChangeImageScaleWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getChangeImageScaleWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Change scale of an existing image
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getChangeImageScaleWithHttpInfo(GetChangeImageScaleRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getChangeImageScaleValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Change scale of an existing image (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChangeImageScaleAsync(GetChangeImageScaleRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getChangeImageScaleValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImageProperties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getImagePropertiesCall(GetImagePropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cad/{name}/properties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImagePropertiesValidateBeforeCall(GetImagePropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getImageProperties");
        }
        

        com.squareup.okhttp.Call call = getImagePropertiesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get properties of an image.
     * 
     * @return ImagePropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePropertiesResponse getImageProperties(GetImagePropertiesRequest request) throws ApiException {
        try {
            ApiResponse<ImagePropertiesResponse> resp = getImagePropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ImagePropertiesResponse> resp = getImagePropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get properties of an image.
     * 
     * @return ApiResponse&lt;ImagePropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ImagePropertiesResponse> getImagePropertiesWithHttpInfo(GetImagePropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getImagePropertiesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePropertiesResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get properties of an image. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImagePropertiesAsync(GetImagePropertiesRequest request, final ApiCallback<ImagePropertiesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImagePropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagePropertiesResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImageRotateFlip
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getImageRotateFlipCall(GetImageRotateFlipRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cad/{name}/rotateflip"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "method", request.getMethod());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getOutPath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImageRotateFlipValidateBeforeCall(GetImageRotateFlipRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getImageRotateFlip");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling getImageRotateFlip");
        }
        
        // verify the required parameter 'Method' is set
        if (request.getMethod() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Method' when calling getImageRotateFlip");
        }
        

        com.squareup.okhttp.Call call = getImageRotateFlipCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rotate and flip existing image
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getImageRotateFlip(GetImageRotateFlipRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getImageRotateFlipWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getImageRotateFlipWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Rotate and flip existing image
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getImageRotateFlipWithHttpInfo(GetImageRotateFlipRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getImageRotateFlipValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rotate and flip existing image (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImageRotateFlipAsync(GetImageRotateFlipRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImageRotateFlipValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImageSaveAs
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getImageSaveAsCall(GetImageSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cad/{name}/saveAs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "rasterOptions", request.getRasterOptions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getOutPath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImageSaveAsValidateBeforeCall(GetImageSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getImageSaveAs");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling getImageSaveAs");
        }
        

        com.squareup.okhttp.Call call = getImageSaveAsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export existing drawing to another format
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getImageSaveAs(GetImageSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getImageSaveAsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getImageSaveAsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export existing drawing to another format
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getImageSaveAsWithHttpInfo(GetImageSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getImageSaveAsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export existing drawing to another format (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImageSaveAsAsync(GetImageSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImageSaveAsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postChangeImageScale
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postChangeImageScaleCall(PostChangeImageScaleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cad/resize";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "newWidth", request.getNewWidth());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "newHeight", request.getNewHeight());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getOutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getDrawingData() != null)
          localVarFormParams.put("DrawingData", request.getDrawingData());

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postChangeImageScaleValidateBeforeCall(PostChangeImageScaleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'DrawingData' is set
        if (request.getDrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'DrawingData' when calling postChangeImageScale");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling postChangeImageScale");
        }
        
        // verify the required parameter 'NewWidth' is set
        if (request.getNewWidth() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NewWidth' when calling postChangeImageScale");
        }
        
        // verify the required parameter 'NewHeight' is set
        if (request.getNewHeight() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NewHeight' when calling postChangeImageScale");
        }
        

        com.squareup.okhttp.Call call = postChangeImageScaleCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Change scale of an image from body
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postChangeImageScale(PostChangeImageScaleRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postChangeImageScaleWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postChangeImageScaleWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Change scale of an image from body
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postChangeImageScaleWithHttpInfo(PostChangeImageScaleRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postChangeImageScaleValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Change scale of an image from body (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postChangeImageScaleAsync(PostChangeImageScaleRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postChangeImageScaleValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postImageRotateFlip
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postImageRotateFlipCall(PostImageRotateFlipRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cad/rotateflip";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "method", request.getMethod());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getOutPath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getDrawingData() != null)
          localVarFormParams.put("DrawingData", request.getDrawingData());

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postImageRotateFlipValidateBeforeCall(PostImageRotateFlipRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'DrawingData' is set
        if (request.getDrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'DrawingData' when calling postImageRotateFlip");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling postImageRotateFlip");
        }
        
        // verify the required parameter 'Method' is set
        if (request.getMethod() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Method' when calling postImageRotateFlip");
        }
        

        com.squareup.okhttp.Call call = postImageRotateFlipCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rotate and flip existing image and get it from response.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postImageRotateFlip(PostImageRotateFlipRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postImageRotateFlipWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postImageRotateFlipWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Rotate and flip existing image and get it from response.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postImageRotateFlipWithHttpInfo(PostImageRotateFlipRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postImageRotateFlipValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rotate and flip existing image and get it from response. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postImageRotateFlipAsync(PostImageRotateFlipRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postImageRotateFlipValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postImageSaveAs
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postImageSaveAsCall(PostImageSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cad/saveAs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "rasterOptions", request.getRasterOptions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getOutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getDrawingData() != null)
          localVarFormParams.put("DrawingData", request.getDrawingData());

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postImageSaveAsValidateBeforeCall(PostImageSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'DrawingData' is set
        if (request.getDrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'DrawingData' when calling postImageSaveAs");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling postImageSaveAs");
        }
        

        com.squareup.okhttp.Call call = postImageSaveAsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export existing image to another format. Image is passed as request body.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postImageSaveAs(PostImageSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postImageSaveAsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postImageSaveAsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export existing image to another format. Image is passed as request body.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postImageSaveAsWithHttpInfo(PostImageSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postImageSaveAsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export existing image to another format. Image is passed as request body. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postImageSaveAsAsync(PostImageSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postImageSaveAsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

      /**
     * Build call for putCreate
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putCreateCall(String path, File file, String versionId, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/storage/file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("path", path));
        if (versionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("versionId", versionId));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };

        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };

        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putCreateValidateBeforeCall(String path, File file, String versionId, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putCreate(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling putCreate(Async)");
        }
        

        com.squareup.okhttp.Call call = putCreateCall(path, file, versionId, storage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upload a specific file 
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse putCreate(String path, File file, String versionId, String storage) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = putCreateWithHttpInfo(path, file, versionId, storage);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.refreshToken();
                ApiResponse<AsposeResponse> resp = putCreateWithHttpInfo(path, file, versionId, storage);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Upload a specific file 
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> putCreateWithHttpInfo(String path, File file, String versionId, String storage) throws ApiException {
        com.squareup.okhttp.Call call = putCreateValidateBeforeCall(path, file, versionId, storage, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload a specific file  (asynchronously)
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCreateAsync(String path, File file, String versionId, String storage, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putCreateValidateBeforeCall(path, file, versionId, storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    private String addParameterToQuery(List<Pair> queryParams, String path, String paramName, Object paramValue) {
        if (path.contains("{" + paramName + "}")) {
            if (paramValue == null || paramValue.equals("")) {
                return path.replace("{" + paramName + "}", "");
            } 
            else {
                return path.replace("{" + paramName + "}", paramValue.toString());
            }
        }

        queryParams.addAll(apiClient.parameterToPair(paramName, paramValue));
        return path;
    }
}

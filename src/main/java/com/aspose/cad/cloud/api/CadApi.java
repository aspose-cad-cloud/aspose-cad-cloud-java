/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.CAD Cloud
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
     * Build call for copyFile
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call copyFileCall(CopyFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/file/copy/{srcPath}"
            .replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(request.getsrcPath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destPath", request.getdestPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "srcStorageName", request.getsrcStorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destStorageName", request.getdestStorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "versionId", request.getversionId());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call copyFileValidateBeforeCall(CopyFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'srcPath' is set
        if (request.getsrcPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'srcPath' when calling copyFile");
        }
        
        // verify the required parameter 'destPath' is set
        if (request.getdestPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'destPath' when calling copyFile");
        }
        

        com.squareup.okhttp.Call call = copyFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Copy file
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void copyFile(CopyFileRequest request) throws ApiException {
        try {
            copyFileWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                copyFileWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Copy file
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> copyFileWithHttpInfo(CopyFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = copyFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy file (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call copyFileAsync(CopyFileRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = copyFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for copyFolder
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call copyFolderCall(CopyFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/folder/copy/{srcPath}"
            .replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(request.getsrcPath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destPath", request.getdestPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "srcStorageName", request.getsrcStorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destStorageName", request.getdestStorageName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call copyFolderValidateBeforeCall(CopyFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'srcPath' is set
        if (request.getsrcPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'srcPath' when calling copyFolder");
        }
        
        // verify the required parameter 'destPath' is set
        if (request.getdestPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'destPath' when calling copyFolder");
        }
        

        com.squareup.okhttp.Call call = copyFolderCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Copy folder
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void copyFolder(CopyFolderRequest request) throws ApiException {
        try {
            copyFolderWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                copyFolderWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Copy folder
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> copyFolderWithHttpInfo(CopyFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = copyFolderValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy folder (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call copyFolderAsync(CopyFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = copyFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for createFolder
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call createFolderCall(CreateFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/folder/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(request.getpath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createFolderValidateBeforeCall(CreateFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (request.getpath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'path' when calling createFolder");
        }
        

        com.squareup.okhttp.Call call = createFolderCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create the folder
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createFolder(CreateFolderRequest request) throws ApiException {
        try {
            createFolderWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                createFolderWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Create the folder
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> createFolderWithHttpInfo(CreateFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = createFolderValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create the folder (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFolderAsync(CreateFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteFile
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteFileCall(DeleteFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/file/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(request.getpath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "versionId", request.getversionId());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFileValidateBeforeCall(DeleteFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (request.getpath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'path' when calling deleteFile");
        }
        

        com.squareup.okhttp.Call call = deleteFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete file
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFile(DeleteFileRequest request) throws ApiException {
        try {
            deleteFileWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                deleteFileWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Delete file
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> deleteFileWithHttpInfo(DeleteFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete file (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFileAsync(DeleteFileRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteFolder
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteFolderCall(DeleteFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/folder/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(request.getpath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "recursive", request.getrecursive());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFolderValidateBeforeCall(DeleteFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (request.getpath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'path' when calling deleteFolder");
        }
        

        com.squareup.okhttp.Call call = deleteFolderCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete folder
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFolder(DeleteFolderRequest request) throws ApiException {
        try {
            deleteFolderWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                deleteFolderWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Delete folder
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> deleteFolderWithHttpInfo(DeleteFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFolderValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete folder (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFolderAsync(DeleteFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for downloadFile
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call downloadFileCall(DownloadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/file/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(request.getpath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "versionId", request.getversionId());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call downloadFileValidateBeforeCall(DownloadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (request.getpath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'path' when calling downloadFile");
        }
        

        com.squareup.okhttp.Call call = downloadFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download file
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File downloadFile(DownloadFileRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = downloadFileWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = downloadFileWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Download file
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> downloadFileWithHttpInfo(DownloadFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = downloadFileValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download file (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadFileAsync(DownloadFileRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = downloadFileValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDiscUsage
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDiscUsageCall(GetDiscUsageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/disc";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDiscUsageValidateBeforeCall(GetDiscUsageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getDiscUsageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get disc usage
     * 
     * @return DiscUsage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DiscUsage getDiscUsage(GetDiscUsageRequest request) throws ApiException {
        try {
            ApiResponse<DiscUsage> resp = getDiscUsageWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DiscUsage> resp = getDiscUsageWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get disc usage
     * 
     * @return ApiResponse&lt;DiscUsage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DiscUsage> getDiscUsageWithHttpInfo(GetDiscUsageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDiscUsageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DiscUsage>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get disc usage (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDiscUsageAsync(GetDiscUsageRequest request, final ApiCallback<DiscUsage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDiscUsageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DiscUsage>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDrawingProperties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDrawingPropertiesCall(GetDrawingPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/properties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDrawingPropertiesValidateBeforeCall(GetDrawingPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling getDrawingProperties");
        }
        

        com.squareup.okhttp.Call call = getDrawingPropertiesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves info about an existing drawing.             
     * 
     * @return CadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CadResponse getDrawingProperties(GetDrawingPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<CadResponse> resp = getDrawingPropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<CadResponse> resp = getDrawingPropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Retrieves info about an existing drawing.             
     * 
     * @return ApiResponse&lt;CadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<CadResponse> getDrawingPropertiesWithHttpInfo(GetDrawingPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDrawingPropertiesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<CadResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves info about an existing drawing.              (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDrawingPropertiesAsync(GetDrawingPropertiesRequest request, final ApiCallback<CadResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDrawingPropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CadResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDrawingResize
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDrawingResizeCall(GetDrawingResizeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/resize"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outputFormat", request.getoutputFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "newWidth", request.getnewWidth());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "newHeight", request.getnewHeight());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDrawingResizeValidateBeforeCall(GetDrawingResizeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling getDrawingResize");
        }
        
        // verify the required parameter 'outputFormat' is set
        if (request.getoutputFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'outputFormat' when calling getDrawingResize");
        }
        
        // verify the required parameter 'newWidth' is set
        if (request.getnewWidth() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'newWidth' when calling getDrawingResize");
        }
        
        // verify the required parameter 'newHeight' is set
        if (request.getnewHeight() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'newHeight' when calling getDrawingResize");
        }
        

        com.squareup.okhttp.Call call = getDrawingResizeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resize an existing drawing.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDrawingResize(GetDrawingResizeRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getDrawingResizeWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getDrawingResizeWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Resize an existing drawing.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getDrawingResizeWithHttpInfo(GetDrawingResizeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDrawingResizeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resize an existing drawing. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDrawingResizeAsync(GetDrawingResizeRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDrawingResizeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDrawingRotateFlip
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDrawingRotateFlipCall(GetDrawingRotateFlipRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/rotateflip"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outputFormat", request.getoutputFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "rotateFlipType", request.getrotateFlipType());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDrawingRotateFlipValidateBeforeCall(GetDrawingRotateFlipRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling getDrawingRotateFlip");
        }
        
        // verify the required parameter 'outputFormat' is set
        if (request.getoutputFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'outputFormat' when calling getDrawingRotateFlip");
        }
        
        // verify the required parameter 'rotateFlipType' is set
        if (request.getrotateFlipType() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'rotateFlipType' when calling getDrawingRotateFlip");
        }
        

        com.squareup.okhttp.Call call = getDrawingRotateFlipCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rotate/flip an existing drawing.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDrawingRotateFlip(GetDrawingRotateFlipRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getDrawingRotateFlipWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getDrawingRotateFlipWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Rotate/flip an existing drawing.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getDrawingRotateFlipWithHttpInfo(GetDrawingRotateFlipRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDrawingRotateFlipValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rotate/flip an existing drawing. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDrawingRotateFlipAsync(GetDrawingRotateFlipRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDrawingRotateFlipValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDrawingSaveAs
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDrawingSaveAsCall(GetDrawingSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/saveAs/{outputFormat}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()))
            .replaceAll("\\{" + "outputFormat" + "\\}", apiClient.escapeString(request.getoutputFormat().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDrawingSaveAsValidateBeforeCall(GetDrawingSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling getDrawingSaveAs");
        }
        
        // verify the required parameter 'outputFormat' is set
        if (request.getoutputFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'outputFormat' when calling getDrawingSaveAs");
        }
        

        com.squareup.okhttp.Call call = getDrawingSaveAsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing to another format.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDrawingSaveAs(GetDrawingSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getDrawingSaveAsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getDrawingSaveAsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing to another format.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getDrawingSaveAsWithHttpInfo(GetDrawingSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDrawingSaveAsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing to another format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDrawingSaveAsAsync(GetDrawingSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDrawingSaveAsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFileVersions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getFileVersionsCall(GetFileVersionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/version/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(request.getpath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFileVersionsValidateBeforeCall(GetFileVersionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (request.getpath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'path' when calling getFileVersions");
        }
        

        com.squareup.okhttp.Call call = getFileVersionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get file versions
     * 
     * @return FileVersions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileVersions getFileVersions(GetFileVersionsRequest request) throws ApiException {
        try {
            ApiResponse<FileVersions> resp = getFileVersionsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FileVersions> resp = getFileVersionsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get file versions
     * 
     * @return ApiResponse&lt;FileVersions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FileVersions> getFileVersionsWithHttpInfo(GetFileVersionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFileVersionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FileVersions>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get file versions (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFileVersionsAsync(GetFileVersionsRequest request, final ApiCallback<FileVersions> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFileVersionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileVersions>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFilesList
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getFilesListCall(GetFilesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/folder/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(request.getpath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFilesListValidateBeforeCall(GetFilesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (request.getpath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'path' when calling getFilesList");
        }
        

        com.squareup.okhttp.Call call = getFilesListCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all files and folders within a folder
     * 
     * @return FilesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesList getFilesList(GetFilesListRequest request) throws ApiException {
        try {
            ApiResponse<FilesList> resp = getFilesListWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FilesList> resp = getFilesListWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get all files and folders within a folder
     * 
     * @return ApiResponse&lt;FilesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FilesList> getFilesListWithHttpInfo(GetFilesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFilesListValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FilesList>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all files and folders within a folder (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilesListAsync(GetFilesListRequest request, final ApiCallback<FilesList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFilesListValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesList>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for moveFile
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call moveFileCall(MoveFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/file/move/{srcPath}"
            .replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(request.getsrcPath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destPath", request.getdestPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "srcStorageName", request.getsrcStorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destStorageName", request.getdestStorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "versionId", request.getversionId());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call moveFileValidateBeforeCall(MoveFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'srcPath' is set
        if (request.getsrcPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'srcPath' when calling moveFile");
        }
        
        // verify the required parameter 'destPath' is set
        if (request.getdestPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'destPath' when calling moveFile");
        }
        

        com.squareup.okhttp.Call call = moveFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Move file
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void moveFile(MoveFileRequest request) throws ApiException {
        try {
            moveFileWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                moveFileWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Move file
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> moveFileWithHttpInfo(MoveFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = moveFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move file (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call moveFileAsync(MoveFileRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = moveFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for moveFolder
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call moveFolderCall(MoveFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/folder/move/{srcPath}"
            .replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(request.getsrcPath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destPath", request.getdestPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "srcStorageName", request.getsrcStorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destStorageName", request.getdestStorageName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call moveFolderValidateBeforeCall(MoveFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'srcPath' is set
        if (request.getsrcPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'srcPath' when calling moveFolder");
        }
        
        // verify the required parameter 'destPath' is set
        if (request.getdestPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'destPath' when calling moveFolder");
        }
        

        com.squareup.okhttp.Call call = moveFolderCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Move folder
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void moveFolder(MoveFolderRequest request) throws ApiException {
        try {
            moveFolderWithHttpInfo(request);
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                moveFolderWithHttpInfo(request);
            }
            throw ex;
        }
    }

    /**
     * Move folder
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> moveFolderWithHttpInfo(MoveFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = moveFolderValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move folder (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call moveFolderAsync(MoveFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = moveFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for objectExists
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call objectExistsCall(ObjectExistsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/exist/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(request.getpath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "versionId", request.getversionId());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call objectExistsValidateBeforeCall(ObjectExistsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (request.getpath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'path' when calling objectExists");
        }
        

        com.squareup.okhttp.Call call = objectExistsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Check if file or folder exists
     * 
     * @return ObjectExist
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ObjectExist objectExists(ObjectExistsRequest request) throws ApiException {
        try {
            ApiResponse<ObjectExist> resp = objectExistsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ObjectExist> resp = objectExistsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Check if file or folder exists
     * 
     * @return ApiResponse&lt;ObjectExist&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ObjectExist> objectExistsWithHttpInfo(ObjectExistsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = objectExistsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ObjectExist>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check if file or folder exists (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call objectExistsAsync(ObjectExistsRequest request, final ApiCallback<ObjectExist> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = objectExistsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ObjectExist>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingBmp
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingBmpCall(PostDrawingBmpRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/bmp"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingBmpValidateBeforeCall(PostDrawingBmpRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingBmp");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingBmp");
        }
        

        com.squareup.okhttp.Call call = postDrawingBmpCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing to BMP format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingBmp(PostDrawingBmpRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingBmpWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingBmpWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing to BMP format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingBmpWithHttpInfo(PostDrawingBmpRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingBmpValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing to BMP format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingBmpAsync(PostDrawingBmpRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingBmpValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingGif
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingGifCall(PostDrawingGifRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/gif"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingGifValidateBeforeCall(PostDrawingGifRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingGif");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingGif");
        }
        

        com.squareup.okhttp.Call call = postDrawingGifCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing into GIF format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingGif(PostDrawingGifRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingGifWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingGifWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing into GIF format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingGifWithHttpInfo(PostDrawingGifRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingGifValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing into GIF format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingGifAsync(PostDrawingGifRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingGifValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingJpeg
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingJpegCall(PostDrawingJpegRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/jpeg"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingJpegValidateBeforeCall(PostDrawingJpegRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingJpeg");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingJpeg");
        }
        

        com.squareup.okhttp.Call call = postDrawingJpegCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing into JPEG format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingJpeg(PostDrawingJpegRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingJpegWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingJpegWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing into JPEG format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingJpegWithHttpInfo(PostDrawingJpegRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingJpegValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing into JPEG format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingJpegAsync(PostDrawingJpegRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingJpegValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingJpeg2000
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingJpeg2000Call(PostDrawingJpeg2000Request request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/jpeg2000"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingJpeg2000ValidateBeforeCall(PostDrawingJpeg2000Request request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingJpeg2000");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingJpeg2000");
        }
        

        com.squareup.okhttp.Call call = postDrawingJpeg2000Call(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing into JPEG2000 format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingJpeg2000(PostDrawingJpeg2000Request request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingJpeg2000WithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingJpeg2000WithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing into JPEG2000 format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingJpeg2000WithHttpInfo(PostDrawingJpeg2000Request request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingJpeg2000ValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing into JPEG2000 format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingJpeg2000Async(PostDrawingJpeg2000Request request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingJpeg2000ValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingPdf
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingPdfCall(PostDrawingPdfRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/pdf"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingPdfValidateBeforeCall(PostDrawingPdfRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingPdf");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingPdf");
        }
        

        com.squareup.okhttp.Call call = postDrawingPdfCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing to PDF format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingPdf(PostDrawingPdfRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingPdfWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingPdfWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing to PDF format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingPdfWithHttpInfo(PostDrawingPdfRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingPdfValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing to PDF format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingPdfAsync(PostDrawingPdfRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingPdfValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingPng
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingPngCall(PostDrawingPngRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/png"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingPngValidateBeforeCall(PostDrawingPngRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingPng");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingPng");
        }
        

        com.squareup.okhttp.Call call = postDrawingPngCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing into PNG format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingPng(PostDrawingPngRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingPngWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingPngWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing into PNG format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingPngWithHttpInfo(PostDrawingPngRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingPngValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing into PNG format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingPngAsync(PostDrawingPngRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingPngValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingProperties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingPropertiesCall(PostDrawingPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/properties";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingPropertiesValidateBeforeCall(PostDrawingPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling postDrawingProperties");
        }
        

        com.squareup.okhttp.Call call = postDrawingPropertiesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves info about drawing which is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @return CadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CadResponse postDrawingProperties(PostDrawingPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<CadResponse> resp = postDrawingPropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<CadResponse> resp = postDrawingPropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Retrieves info about drawing which is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @return ApiResponse&lt;CadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<CadResponse> postDrawingPropertiesWithHttpInfo(PostDrawingPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingPropertiesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<CadResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves info about drawing which is passed as a zero-indexed multipart/form-data content or as raw body stream. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingPropertiesAsync(PostDrawingPropertiesRequest request, final ApiCallback<CadResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingPropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CadResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingPsd
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingPsdCall(PostDrawingPsdRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/psd"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingPsdValidateBeforeCall(PostDrawingPsdRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingPsd");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingPsd");
        }
        

        com.squareup.okhttp.Call call = postDrawingPsdCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing into PSD format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingPsd(PostDrawingPsdRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingPsdWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingPsdWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing into PSD format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingPsdWithHttpInfo(PostDrawingPsdRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingPsdValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing into PSD format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingPsdAsync(PostDrawingPsdRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingPsdValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingResize
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingResizeCall(PostDrawingResizeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/resize";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outputFormat", request.getoutputFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "newWidth", request.getnewWidth());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "newHeight", request.getnewHeight());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/octet-stream", "multipart/form-data"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingResizeValidateBeforeCall(PostDrawingResizeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling postDrawingResize");
        }
        
        // verify the required parameter 'outputFormat' is set
        if (request.getoutputFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'outputFormat' when calling postDrawingResize");
        }
        
        // verify the required parameter 'newWidth' is set
        if (request.getnewWidth() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'newWidth' when calling postDrawingResize");
        }
        
        // verify the required parameter 'newHeight' is set
        if (request.getnewHeight() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'newHeight' when calling postDrawingResize");
        }
        

        com.squareup.okhttp.Call call = postDrawingResizeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resize a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingResize(PostDrawingResizeRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingResizeWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingResizeWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Resize a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingResizeWithHttpInfo(PostDrawingResizeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingResizeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resize a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingResizeAsync(PostDrawingResizeRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingResizeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingRotateFlip
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingRotateFlipCall(PostDrawingRotateFlipRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/rotateflip";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outputFormat", request.getoutputFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "rotateFlipType", request.getrotateFlipType());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/octet-stream", "multipart/form-data"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingRotateFlipValidateBeforeCall(PostDrawingRotateFlipRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling postDrawingRotateFlip");
        }
        
        // verify the required parameter 'outputFormat' is set
        if (request.getoutputFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'outputFormat' when calling postDrawingRotateFlip");
        }
        
        // verify the required parameter 'rotateFlipType' is set
        if (request.getrotateFlipType() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'rotateFlipType' when calling postDrawingRotateFlip");
        }
        

        com.squareup.okhttp.Call call = postDrawingRotateFlipCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rotate/flip a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingRotateFlip(PostDrawingRotateFlipRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingRotateFlipWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingRotateFlipWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Rotate/flip a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingRotateFlipWithHttpInfo(PostDrawingRotateFlipRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingRotateFlipValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rotate/flip a drawing. Drawing data is passed as a zero-indexed multipart/form-data content or as raw body stream. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingRotateFlipAsync(PostDrawingRotateFlipRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingRotateFlipValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingSaveAs
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingSaveAsCall(PostDrawingSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/saveAs/{outputFormat}"
            .replaceAll("\\{" + "outputFormat" + "\\}", apiClient.escapeString(request.getoutputFormat().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/octet-stream", "multipart/form-data"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingSaveAsValidateBeforeCall(PostDrawingSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling postDrawingSaveAs");
        }
        
        // verify the required parameter 'outputFormat' is set
        if (request.getoutputFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'outputFormat' when calling postDrawingSaveAs");
        }
        

        com.squareup.okhttp.Call call = postDrawingSaveAsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export existing drawing to another format. Drawing data is passed as zero-indexed multipart/form-data content or as raw body stream.             
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingSaveAs(PostDrawingSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingSaveAsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingSaveAsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export existing drawing to another format. Drawing data is passed as zero-indexed multipart/form-data content or as raw body stream.             
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingSaveAsWithHttpInfo(PostDrawingSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingSaveAsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export existing drawing to another format. Drawing data is passed as zero-indexed multipart/form-data content or as raw body stream.              (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingSaveAsAsync(PostDrawingSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingSaveAsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingSvg
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingSvgCall(PostDrawingSvgRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/svg"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingSvgValidateBeforeCall(PostDrawingSvgRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingSvg");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingSvg");
        }
        

        com.squareup.okhttp.Call call = postDrawingSvgCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing to SVG format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingSvg(PostDrawingSvgRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingSvgWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingSvgWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing to SVG format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingSvgWithHttpInfo(PostDrawingSvgRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingSvgValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing to SVG format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingSvgAsync(PostDrawingSvgRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingSvgValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingTiff
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingTiffCall(PostDrawingTiffRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/tiff"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingTiffValidateBeforeCall(PostDrawingTiffRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingTiff");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingTiff");
        }
        

        com.squareup.okhttp.Call call = postDrawingTiffCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing into TIFF format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingTiff(PostDrawingTiffRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingTiffWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingTiffWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing into TIFF format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingTiffWithHttpInfo(PostDrawingTiffRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingTiffValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing into TIFF format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingTiffAsync(PostDrawingTiffRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingTiffValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingWmf
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingWmfCall(PostDrawingWmfRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/v3.0/cad/{name}/wmf"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getname().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getfolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingWmfValidateBeforeCall(PostDrawingWmfRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getname() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'name' when calling postDrawingWmf");
        }
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'options' when calling postDrawingWmf");
        }
        

        com.squareup.okhttp.Call call = postDrawingWmfCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export an existing drawing to WMF format with export settings specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postDrawingWmf(PostDrawingWmfRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postDrawingWmfWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postDrawingWmfWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export an existing drawing to WMF format with export settings specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postDrawingWmfWithHttpInfo(PostDrawingWmfRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingWmfValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export an existing drawing to WMF format with export settings specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingWmfAsync(PostDrawingWmfRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDrawingWmfValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingBmp
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingBmpCall(PutDrawingBmpRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/bmp";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/octet-stream", "multipart/form-data"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingBmpValidateBeforeCall(PutDrawingBmpRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingBmp");
        }
        

        com.squareup.okhttp.Call call = putDrawingBmpCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to BMP format. Drawing data is passed as zero-indexed multipart/form-data as well as export BMP options serialized as JSON. Order of drawing data and BMP options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingBmp(PutDrawingBmpRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingBmpWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingBmpWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to BMP format. Drawing data is passed as zero-indexed multipart/form-data as well as export BMP options serialized as JSON. Order of drawing data and BMP options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingBmpWithHttpInfo(PutDrawingBmpRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingBmpValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to BMP format. Drawing data is passed as zero-indexed multipart/form-data as well as export BMP options serialized as JSON. Order of drawing data and BMP options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingBmpAsync(PutDrawingBmpRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingBmpValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingGif
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingGifCall(PutDrawingGifRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/gif";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingGifValidateBeforeCall(PutDrawingGifRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingGif");
        }
        

        com.squareup.okhttp.Call call = putDrawingGifCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to GIF format. Drawing data is passed as zero-indexed multipart/form-data as well as export GIF options serialized as JSON. Order of drawing data and GIF options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingGif(PutDrawingGifRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingGifWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingGifWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to GIF format. Drawing data is passed as zero-indexed multipart/form-data as well as export GIF options serialized as JSON. Order of drawing data and GIF options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingGifWithHttpInfo(PutDrawingGifRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingGifValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to GIF format. Drawing data is passed as zero-indexed multipart/form-data as well as export GIF options serialized as JSON. Order of drawing data and GIF options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingGifAsync(PutDrawingGifRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingGifValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingJpeg
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingJpegCall(PutDrawingJpegRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/jpeg";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingJpegValidateBeforeCall(PutDrawingJpegRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingJpeg");
        }
        

        com.squareup.okhttp.Call call = putDrawingJpegCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to JPEG format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG options serialized as JSON. Order of drawing data and JPEG options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingJpeg(PutDrawingJpegRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingJpegWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingJpegWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to JPEG format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG options serialized as JSON. Order of drawing data and JPEG options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingJpegWithHttpInfo(PutDrawingJpegRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingJpegValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to JPEG format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG options serialized as JSON. Order of drawing data and JPEG options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingJpegAsync(PutDrawingJpegRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingJpegValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingJpeg2000
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingJpeg2000Call(PutDrawingJpeg2000Request request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/jpeg2000";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingJpeg2000ValidateBeforeCall(PutDrawingJpeg2000Request request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingJpeg2000");
        }
        

        com.squareup.okhttp.Call call = putDrawingJpeg2000Call(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to JPEG2000 format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG2000 options serialized as JSON. Order of drawing data and JPEG2000 options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingJpeg2000(PutDrawingJpeg2000Request request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingJpeg2000WithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingJpeg2000WithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to JPEG2000 format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG2000 options serialized as JSON. Order of drawing data and JPEG2000 options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingJpeg2000WithHttpInfo(PutDrawingJpeg2000Request request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingJpeg2000ValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to JPEG2000 format. Drawing data is passed as zero-indexed multipart/form-data as well as export JPEG2000 options serialized as JSON. Order of drawing data and JPEG2000 options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingJpeg2000Async(PutDrawingJpeg2000Request request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingJpeg2000ValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingPdf
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingPdfCall(PutDrawingPdfRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/pdf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingPdfValidateBeforeCall(PutDrawingPdfRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingPdf");
        }
        

        com.squareup.okhttp.Call call = putDrawingPdfCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to PDF format. Drawing data is passed as zero-indexed multipart/form-data as well as export PDF options serialized as JSON. Order of drawing data and PDF options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingPdf(PutDrawingPdfRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingPdfWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingPdfWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to PDF format. Drawing data is passed as zero-indexed multipart/form-data as well as export PDF options serialized as JSON. Order of drawing data and PDF options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingPdfWithHttpInfo(PutDrawingPdfRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingPdfValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to PDF format. Drawing data is passed as zero-indexed multipart/form-data as well as export PDF options serialized as JSON. Order of drawing data and PDF options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingPdfAsync(PutDrawingPdfRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingPdfValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingPng
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingPngCall(PutDrawingPngRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/png";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingPngValidateBeforeCall(PutDrawingPngRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingPng");
        }
        

        com.squareup.okhttp.Call call = putDrawingPngCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to PNG format. Drawing data is passed as zero-indexed multipart/form-data as well as export PNG options serialized as JSON. Order of drawing data and PNG options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingPng(PutDrawingPngRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingPngWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingPngWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to PNG format. Drawing data is passed as zero-indexed multipart/form-data as well as export PNG options serialized as JSON. Order of drawing data and PNG options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingPngWithHttpInfo(PutDrawingPngRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingPngValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to PNG format. Drawing data is passed as zero-indexed multipart/form-data as well as export PNG options serialized as JSON. Order of drawing data and PNG options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingPngAsync(PutDrawingPngRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingPngValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingPsd
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingPsdCall(PutDrawingPsdRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/psd";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingPsdValidateBeforeCall(PutDrawingPsdRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingPsd");
        }
        

        com.squareup.okhttp.Call call = putDrawingPsdCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to PSD format. Drawing data is passed as zero-indexed multipart/form-data as well as export PSD options serialized as JSON. Order of drawing data and PSD options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingPsd(PutDrawingPsdRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingPsdWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingPsdWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to PSD format. Drawing data is passed as zero-indexed multipart/form-data as well as export PSD options serialized as JSON. Order of drawing data and PSD options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingPsdWithHttpInfo(PutDrawingPsdRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingPsdValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to PSD format. Drawing data is passed as zero-indexed multipart/form-data as well as export PSD options serialized as JSON. Order of drawing data and PSD options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingPsdAsync(PutDrawingPsdRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingPsdValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingSvg
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingSvgCall(PutDrawingSvgRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/svg";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingSvgValidateBeforeCall(PutDrawingSvgRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingSvg");
        }
        

        com.squareup.okhttp.Call call = putDrawingSvgCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to SVG format. Drawing data is passed as zero-indexed multipart/form-data as well as export SVG options serialized as JSON. Order of drawing data and SVG options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingSvg(PutDrawingSvgRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingSvgWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingSvgWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to SVG format. Drawing data is passed as zero-indexed multipart/form-data as well as export SVG options serialized as JSON. Order of drawing data and SVG options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingSvgWithHttpInfo(PutDrawingSvgRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingSvgValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to SVG format. Drawing data is passed as zero-indexed multipart/form-data as well as export SVG options serialized as JSON. Order of drawing data and SVG options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingSvgAsync(PutDrawingSvgRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingSvgValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingTiff
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingTiffCall(PutDrawingTiffRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/tiff";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingTiffValidateBeforeCall(PutDrawingTiffRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingTiff");
        }
        

        com.squareup.okhttp.Call call = putDrawingTiffCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to TIFF format. Drawing data is passed as zero-indexed multipart/form-data as well as export TIFF options serialized as JSON. Order of drawing data and TIFF options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingTiff(PutDrawingTiffRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingTiffWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingTiffWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to TIFF format. Drawing data is passed as zero-indexed multipart/form-data as well as export TIFF options serialized as JSON. Order of drawing data and TIFF options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingTiffWithHttpInfo(PutDrawingTiffRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingTiffValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to TIFF format. Drawing data is passed as zero-indexed multipart/form-data as well as export TIFF options serialized as JSON. Order of drawing data and TIFF options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingTiffAsync(PutDrawingTiffRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingTiffValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingWmf
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingWmfCall(PutDrawingWmfRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/wmf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getoutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getstorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getdrawingData() != null)
          localVarFormParams.put("drawingData", request.getdrawingData());
if (request.getexportOptions() != null)
          localVarFormParams.put("exportOptions", request.getexportOptions());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/octet-stream"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingWmfValidateBeforeCall(PutDrawingWmfRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drawingData' is set
        if (request.getdrawingData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'drawingData' when calling putDrawingWmf");
        }
        

        com.squareup.okhttp.Call call = putDrawingWmfCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export drawing to WMF format. Drawing data is passed as zero-indexed multipart/form-data as well as export WMF options serialized as JSON. Order of drawing data and WMF options could vary.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putDrawingWmf(PutDrawingWmfRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putDrawingWmfWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putDrawingWmfWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export drawing to WMF format. Drawing data is passed as zero-indexed multipart/form-data as well as export WMF options serialized as JSON. Order of drawing data and WMF options could vary.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putDrawingWmfWithHttpInfo(PutDrawingWmfRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingWmfValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export drawing to WMF format. Drawing data is passed as zero-indexed multipart/form-data as well as export WMF options serialized as JSON. Order of drawing data and WMF options could vary. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingWmfAsync(PutDrawingWmfRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDrawingWmfValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for storageExists
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call storageExistsCall(StorageExistsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/{storageName}/exist"
            .replaceAll("\\{" + "storageName" + "\\}", apiClient.escapeString(request.getstorageName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call storageExistsValidateBeforeCall(StorageExistsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageName' is set
        if (request.getstorageName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'storageName' when calling storageExists");
        }
        

        com.squareup.okhttp.Call call = storageExistsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Check if storage exists
     * 
     * @return StorageExist
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StorageExist storageExists(StorageExistsRequest request) throws ApiException {
        try {
            ApiResponse<StorageExist> resp = storageExistsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<StorageExist> resp = storageExistsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Check if storage exists
     * 
     * @return ApiResponse&lt;StorageExist&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<StorageExist> storageExistsWithHttpInfo(StorageExistsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = storageExistsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<StorageExist>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check if storage exists (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call storageExistsAsync(StorageExistsRequest request, final ApiCallback<StorageExist> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = storageExistsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StorageExist>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for uploadFile
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call uploadFileCall(UploadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3.0/cad/storage/file/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(request.getpath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storageName", request.getstorageName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getFile() != null)
          localVarFormParams.put("File", request.getFile());

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		if (localVarFormParams.size() > 0) {
            localVarContentType = "multipart/form-data";
        }
		
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadFileValidateBeforeCall(UploadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (request.getpath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'path' when calling uploadFile");
        }
        
        // verify the required parameter 'File' is set
        if (request.getFile() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'File' when calling uploadFile");
        }
        

        com.squareup.okhttp.Call call = uploadFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upload file
     * 
     * @return FilesUploadResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesUploadResult uploadFile(UploadFileRequest request) throws ApiException {
        try {
            ApiResponse<FilesUploadResult> resp = uploadFileWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FilesUploadResult> resp = uploadFileWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Upload file
     * 
     * @return ApiResponse&lt;FilesUploadResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FilesUploadResult> uploadFileWithHttpInfo(UploadFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FilesUploadResult>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload file (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadFileAsync(UploadFileRequest request, final ApiCallback<FilesUploadResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesUploadResult>() { }.getType();
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
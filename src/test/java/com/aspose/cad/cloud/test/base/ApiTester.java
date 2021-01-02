/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ApiTester.java">
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
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.cad.cloud.test.base;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

import com.aspose.cad.cloud.invoker.ApiResponse;
import com.aspose.cad.cloud.invoker.JSON;
import com.aspose.cad.cloud.invoker.internal.SerializationHelper;
import com.aspose.cad.cloud.invoker.internal.StreamHelper;
import com.aspose.cad.cloud.model.*;
import com.aspose.cad.cloud.model.requests.*;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

/**
 * API tester base class.
 */
public abstract class ApiTester
{
	/**
	 * The server access file
	 */
    private final String ServerAccessFile = "serverAccess.json";

    /**
     * The application key
     */
    private final String AppKey = "xxx";

    /**
     * The application SID
     */
    private final String AppSid = "xxx";

    /**
     * The base URL
     */
    private final String BaseUrl = "http://api.aspose.cloud/";
    
    /**
     * The local test folder
     */
    protected final String LocalTestFolder = "TestData/";

    /**
     * The cloud storage test folder
     */
    protected final String CloudTestFolder = "CloudTestJava";

    /**
     * The cloud storage references folder
     */
    protected final String CloudReferencesFolder = "CloudTestJavaReferences";

    /**
     * The default cloud storage
     */
    protected String DefaultStorage = "First Storage";

    /**
     * The size difference division
     */
    protected final long SizeDiffDivision = 20;

    /**
     * Input test files info
     */
    protected List<StorageFile> InputTestFiles;

    /**
     * Aspose.cad API
     */
    protected com.aspose.cad.cloud.api.CadApi CadApi;

    /**
     * The basic export formats
     */
    protected final String[] BasicExportFormats = new String[]
    {
            "jpg",
            "bmp",
            "psd",
            "tiff",
            "gif",
            "png",
            "j2k",
            "wmf",
            "pdf",
            "svg"
    };

    /**
     * Gets or sets a value indicating whether resulting images should be removed from cloud storage.
     */
    public Boolean RemoveResult = false;

    /**
     * Gets or sets a value indicating whether to automatic recover reference (i.e. if resulting images of failed tests are considered as new valid references).
     * Please, change this value ONLY if you clearly understand the consequences, or it may lead to replacement of the images you need, so they will be lost.
     */
    public Boolean AutoRecoverReference = true;

    /**
     *  Forces test data to upload to cloud
     */
    protected final boolean ForceTestDataUpload = true;

    /**
     * Ensures test data is uploaded only once
     */
    protected static boolean IsTestDataUploaded = false;

    private static List<StorageFile> _testFiles;

    /**
     * Creates the API instances using default access parameters.
     * @throws Exception 
     */
    protected void createApiInstances() throws Exception
    {
        this.createApiInstances(AppKey, AppSid, BaseUrl, "v3.0", true);
    }
    
    /**
     * Creates the API instances using given access parameters.
     * @param appKey The application key.
     * @param appSid The application SID.
     * @param baseUrl The base URL.
     * @param apiVersion The API version.
     * @param debug If set to true, debug.
     * @throws Exception 
     */
    protected void createApiInstances(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
            if (appKey.equals(AppKey) || appSid.equals(AppSid) || baseUrl == null || baseUrl.equals(""))
            {
            	File serverAccessFile = Paths.get(LocalTestFolder, ServerAccessFile).toFile();
                if (serverAccessFile.exists() && serverAccessFile.length() > 0)
                {
                	String serverCredentials = FileUtils.readFileToString(serverAccessFile);
                	ServerAccessData accessData = JSON.deserialize(serverCredentials, ServerAccessData.class);
                    appKey = accessData.AppKey;
                    appSid = accessData.AppSid;
                    baseUrl = accessData.BaseURL;

                    if (accessData.Storage != null && !accessData.Storage.isEmpty())
                    {
                        DefaultStorage = accessData.Storage;
                    }
                }
                else
                {
                    throw new Exception("Please, specify valid access data (AppKey, AppSid, Base URL)");
                }
            }

            if (baseUrl.endsWith("/"))
            {
                baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
            }

            String baseUrlHttp = baseUrl;
            if (baseUrlHttp.startsWith("http:"))
            {
                baseUrlHttp = baseUrlHttp.replace("http:", "https:");
            }

            //baseUrlHttp = "http://api-qa.aspose.cloud";

            CadApi = new com.aspose.cad.cloud.api.CadApi(appKey, appSid, baseUrl, apiVersion, debug);

            //CadApi.getInvoker().addDefaultHeader("Content-Length", "0");
            InputTestFiles = fetchInputTestFilesInfo();
    }

    /**
     * Tests the typical GET request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    protected void testGetRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Method requestInvoker, Method propertiesTester) throws NoSuchMethodException, Exception
    {
        this.testGetRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName,
        		requestInvoker, propertiesTester, CloudTestFolder, DefaultStorage);
    }
    
    /**
     * Tests the typical GET request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception 
     */
    protected void testGetRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Method requestInvoker, Method propertiesTester, String folder, String storage) throws NoSuchMethodException, Exception
    {
		final Boolean finalSaveResultToStorage = saveResultToStorage;
		final String finalFolder = folder;
		final String finalResultFileName = resultFileName;
		final String finalInputFileName = inputFileName;
		final Method finalRequestInvoker = requestInvoker;
		final Method obtainMethod = ApiTester.class.getDeclaredMethod("obtainGetResponseLength", String.class, String.class, Method.class);
		obtainMethod.setAccessible(true);
		final Object thisReference = this;
		
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName,
            new Callable<Long>() 
            {
            	public Long call() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
            	{
            		String outPath = finalSaveResultToStorage ? String.format("%s/%s", finalFolder, finalResultFileName) : null;
            		Object result = obtainMethod.invoke(thisReference, finalInputFileName, outPath, finalRequestInvoker);
            		return (Long)result;
                }
            }, 
            propertiesTester, folder, storage);
    }

    /**
     * Tests the typical POST request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    protected void testPostRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, String localSubfolder, Method requestInvoker, Method propertiesTester) throws NoSuchMethodException, Exception
    {
        this.testPostRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName,
        		requestInvoker, propertiesTester, CloudTestFolder, DefaultStorage);
    }
    
    /**
     * Tests the typical POST request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception 
     * @throws NoSuchMethodException 
     */
    protected void testPostRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Method requestInvoker, Method propertiesTester, String folder, String storage) throws NoSuchMethodException, Exception
    {
    	final Boolean finalSaveResultToStorage = saveResultToStorage;
		final String finalFolder = folder;
		final String finalResultFileName = resultFileName;
		final String finalInputFileName = inputFileName;
		final Method finalRequestInvoker = requestInvoker;
		final String finalStorage = storage;
		final Method obtainMethod = ApiTester.class.getDeclaredMethod("obtainPostResponseLength", String.class, String.class, String.class, 
				Method.class);
		obtainMethod.setAccessible(true);
		final Object thisReference = this;
		
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName,
            new Callable<Long>() 
            {
            	public Long call() throws Exception
            	{
            		String outPath = finalSaveResultToStorage ? String.format("%s/%s", finalFolder, finalResultFileName) : null;
            		return (Long)obtainMethod.invoke(thisReference, finalFolder + "/" + finalInputFileName, outPath, finalStorage, finalRequestInvoker);
                }
            }, 
            propertiesTester, folder, storage);
        }

    /**
     * Checks the size difference.
     * @param size1 The size 1.
     * @param size2 The size 2.
     * @throws Exception 
     */
    protected boolean checkSizeDiff(long size1, long size2) throws Exception
    {
        return this.checkSizeDiff(size1, size2, SizeDiffDivision);
    }
    
    /**
     * Checks the size difference.
     * @param size1 The size 1.
     * @param size2 The size 2.
     * @param diffDivision The difference division.
     */
    protected boolean checkSizeDiff(long size1, long size2, long diffDivision)
    {
        long avg = (size1 + size2) / 2;
        long diffVal = avg / diffDivision;
        System.out.println(String.format("Expected size: %s. Actual: %s", size1, size2));
        return Math.abs(size1 - size2) <= diffVal;
    }

    /**
     * Checks if input file exists.
     * @param inputFileName Name of the input file.
     * @return
     */
    protected Boolean checkInputFileExists(String inputFileName)
    {
        for (StorageFile StorageFileInfo : InputTestFiles)
        {
            if (StorageFileInfo.getName().equals(inputFileName))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets the storage file information.
     * @param folder The folder which contains a file.
     * @param fileName Name of the file.
     * @param storage The storage.
     * @return The storage file information.
     * @throws Exception 
     */
    protected StorageFile getStorageFileInfo(String folder, String fileName,
        String storage) throws Exception
    {
        FilesList fileListResponse = CadApi.getFilesList(new GetFilesListRequest(folder, storage));
        //Assert.assertEquals((int)fileListResponse.getCode(), 200);
        //InputStream stream = fileListResponse.getInputStream();
        //byte[] stringBytes = StreamHelper.readAsBytes(stream);
        //stream.close();
        
        //String responseString = new String(stringBytes);
        //FilesList references = SerializationHelper.deserialize(responseString, FilesList.class);
        for (StorageFile StorageFileInfo : fileListResponse.getValue())
        {
            if (StorageFileInfo.getName().equals(fileName))
            {
                return StorageFileInfo;
            }
        }

        return null;
    }

    /**
     * Fetches the input test files info.
     * @return The input test files info.
     * @throws Exception 
     */
    private List<StorageFile> fetchInputTestFilesInfo() throws Exception
    {
        if (!IsTestDataUploaded) {
            ObjectExistsRequest req = new ObjectExistsRequest(CloudTestFolder, DefaultStorage, null);
            ObjectExist resp = CadApi.objectExists(req);
            if (!resp.isExists()) {
                CadApi.createFolder(new CreateFolderRequest(CloudTestFolder, DefaultStorage));
            }

            if (!CadApi.objectExists(new ObjectExistsRequest(CloudReferencesFolder, DefaultStorage, null)).isExists()) {
                CadApi.createFolder(new CreateFolderRequest(CloudReferencesFolder, DefaultStorage));
            }


            File localTestDataDir = Paths.get(LocalTestFolder).toFile();

            if (!localTestDataDir.exists()) {
                localTestDataDir.mkdir();
            }

            for (File file : localTestDataDir.listFiles()) {
                if (file.isDirectory() || file.getName().toLowerCase().endsWith(".json")) {
                    continue;
                }

                if (ForceTestDataUpload || !CadApi.objectExists(new ObjectExistsRequest(CloudTestFolder + "/" + file.getName(), DefaultStorage, null)).isExists()) {
                    CadApi.uploadFile(new UploadFileRequest(CloudTestFolder + "/" + file.getName(), FileUtils.readFileToByteArray(file), DefaultStorage));
                }
            }

            FilesList FilesList = CadApi.getFilesList(new GetFilesListRequest(CloudTestFolder, DefaultStorage));
            //Assert.assertEquals((int)FilesList.getCode(), 200);
            //InputStream stream = FilesList.getInputStream();
            //byte[] stringBytes = StreamHelper.readAsBytes(stream);
            //stream.close();

            //String responseString = new String(stringBytes);
            //FilesList filesList = SerializationHelper.deserialize(responseString, FilesList.class);
            _testFiles = FilesList.getValue();
            IsTestDataUploaded = true;
        }

        return _testFiles;
    }

    /**
     * Obtains the length of the typical GET request response. Used indirectly by method reference.
     * @param inputFileName Name of the input file.
     * @param outPath The request invoker.
     * @param requestInvoker The output path to save the result.
     * @return Typical GET request response.
     * @throws Exception 
     */
    private long obtainGetResponseLength(String inputFileName, String outPath, Method requestInvoker) throws Exception
    {
    	//byte[] result = null;
    	Object responseObject = requestInvoker.invoke(this, inputFileName, outPath);

    	Assert.assertNotNull(responseObject);
    	byte[] response = (byte[])responseObject;

    	return response.length;

    	//if (outPath == null || outPath.equals(""))
        //{
        //    Assert.assertNotNull(result);
        //    return result.length;
        //}

        //return 0;
    }

    /**
     * Obtains the length of the typical POST request response. Used indirectly by method reference.
     * @param inputPath The input path.
     * @param outPath The output path to save the result.
     * @param storage The storage.
     * @param requestInvoker The request invoker.
     * @return Typical POST request response.
     * @throws Exception 
     */
    private long obtainPostResponseLength(String inputPath, String outPath, String storage, Method requestInvoker) throws Exception
    {
        byte[] inputDownloadResponse = CadApi.downloadFile(new DownloadFileRequest(inputPath, storage, null));
        byte[] responseObject = (byte[])requestInvoker.invoke(this, inputDownloadResponse, outPath);
        return responseObject.length;
    }

    /**
     * Tests the typical request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param invokeRequestFunc The invoke request function that returns response length.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    private void testRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, String referenceSubfolder, Callable<Long> invokeRequestFunc, Method propertiesTester) throws Exception
    {
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName, 
        		invokeRequestFunc, propertiesTester, CloudTestFolder, DefaultStorage);
    }
    
    /**
     * Tests the typical request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param invokeRequestFunc The invoke request function that returns response length.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception 
     */
    private void testRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Callable<Long> invokeRequestFunc, Method propertiesTester,
    		String folder, String storage) throws Exception
    {
        System.out.println("Test method: " + testMethodName);

        if (!checkInputFileExists(inputFileName))
        {
            throw new Exception(
            		String.format(
            		        "Input file %s doesn't exist in the specified storage folder: %s. Please, upload it first.",
            				inputFileName,
                            folder));
        }

        Boolean passed = false;
        String outPath = null;
        String referencePath = CloudReferencesFolder;

        try
        {
            System.out.println(parametersLine);
            
            if (saveResultToStorage)
            {
                outPath = folder + "/" + resultFileName;
                // remove output file from the storage (if exists)
                if (CadApi.objectExists(new ObjectExistsRequest(outPath, storage, null)).isExists())
                {
                    CadApi.deleteFile(new DeleteFileRequest(outPath, storage, null));
                }
            }

            StorageFile referenceInfo = getStorageFileInfo(referencePath, resultFileName, storage);
            if (referenceInfo == null && !AutoRecoverReference)
            {
                throw new Exception(
                        String.format("Reference result file %s doesn't exist in the specified storage folder: %s. Please, upload it first.",
                                resultFileName, referencePath));
            }

            long referenceLength = referenceInfo == null ? 0 : referenceInfo.getSize();
            long responseLength = invokeRequestFunc.call();
            
            if (saveResultToStorage)
            {
                StorageFile resultInfo = getStorageFileInfo(folder, resultFileName, storage);
                if (resultInfo == null)
                {
                    throw new Exception(
                        String.format("Result file %s doesn't exist in the specified storage folder: %s. Result isn't present in the storage by an unknown reason.", 
                        		resultFileName, folder));
                }

                responseLength = resultInfo.getSize();

                //CadResponse resultProperties =
                //    CadApi.getImageProperties(new GetDrawingPropertiesRequest(resultFileName, folder, storage)).getCadResponse();
                //Assert.assertNotNull(resultProperties);
                //CadResponse originalProperties =
                //    CadApi.getImageProperties(new GetDrawingPropertiesRequest(inputFileName, folder, storage)).getCadResponse();
                //Assert.assertNotNull(originalProperties);

                //if (propertiesTester != null)
                //{
                //	propertiesTester.invoke(this, originalProperties, resultProperties);
                //}
            }

            // check resulting image from response stream
            passed = this.checkSizeDiff(referenceLength, responseLength);
        }
        catch (java.lang.reflect.InvocationTargetException ite)
        {
            System.out.println(ite.getCause().getMessage());
            throw (Exception)ite.getCause();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            throw ex;
        }
        finally
        {
            if (saveResultToStorage && !passed && this.AutoRecoverReference 
                && CadApi.objectExists(new ObjectExistsRequest(outPath, storage, null)).isExists())
            {
                byte[] download = CadApi.downloadFile(new DownloadFileRequest(outPath, storage, null));

                FilesUploadResult moveStorageFile = CadApi.uploadFile(new UploadFileRequest(referencePath + "/" + resultFileName, download, storage));
                Assert.assertEquals(moveStorageFile.getErrors() == null || moveStorageFile.getErrors().size() == 0, true);
            }
            else if (saveResultToStorage 
                        && this.RemoveResult && CadApi.objectExists(new ObjectExistsRequest(outPath, storage, null)).isExists())
            {
                CadApi.deleteFile(new DeleteFileRequest(outPath, storage, null));
            }

            System.out.println("Test passed: " + passed);
            //Assert.assertEquals(true, passed);
        }
    }
}
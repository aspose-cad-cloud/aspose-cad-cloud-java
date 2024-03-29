/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ResizeApiTests.java">
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
package com.aspose.cad.cloud.test.api;

import com.aspose.cad.cloud.model.CadResponse;
import com.aspose.cad.cloud.model.StorageFile;
import com.aspose.cad.cloud.model.requests.*;
import com.aspose.cad.cloud.*;
import com.aspose.cad.cloud.test.base.ApiTester;
import com.aspose.cad.cloud.test.base.StorageFileInfo;

import junitparams.*;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for testing crop-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class ResizeApiTests extends ApiTester {

	private GetDrawingResizeRequest getImageResizeRequest;
	private PostDrawingResizeRequest postImageResizeRequest;
	
	@Before
    public void setUp() throws Exception {
	    this.createApiInstances();
    }

    /**
     * Test operation: Resize an existing image.
     * 
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({
			".dwg, true,"
	})
    public void getImageResizeTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        String name = null;
        Integer newWidth = 100;
        Integer newHeight = 150;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = null;
		
		ArrayList<String> formatsToExport = new ArrayList<String>();
		Collections.addAll(formatsToExport, this.BasicExportFormats);
		for (String additionalExportFormat : additionalExportFormats)
        {
            if (additionalExportFormat != null && !additionalExportFormat.trim().equals("") && !formatsToExport.contains(additionalExportFormat))
            {
                formatsToExport.add(additionalExportFormat);
            }
        }
		
		for (StorageFile inputFile : InputTestFiles)
		{
			if (inputFile.getName().endsWith(formatExtension))
            {
                name = inputFile.getName();
            }
            else
            {
                continue;
            }
			
			for (String format : formatsToExport)
            {
				getImageResizeRequest = new GetDrawingResizeRequest(name, format, newWidth, newHeight, folder, outPath, storage);
				outName = name + "_resize." + format;
				
				Method propertiesTester = ResizeApiTests.class.getDeclaredMethod("getImageResizePropertiesTester", CadResponse.class, CadResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = ResizeApiTests.class.getDeclaredMethod("getImageResizeGetRequestInvoker", String.class, String.class);
				requestInvoker.setAccessible(true);
			    this.testGetRequest(
		            "getImageResizeTest; save result to storage: " + saveResultToStorage,
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s; New width: %s; New height: %s",
		            		name, format, newWidth, newHeight),
		            name,
		            outName,
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);

				break;
            }
		}
    }
    
    /**
     * Test operation: Resize an image. Image is passed in a request stream.
     * 
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({
			".dwg, true,"
	})
    public void putImageResizeTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
    	byte[] imageData = null;
    	File imageFile = null;
		String name = null;
		Integer newWidth = 100;
        Integer newHeight = 150;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = null;
		
		ArrayList<String> formatsToExport = new ArrayList<String>();
		Collections.addAll(formatsToExport, this.BasicExportFormats);
		for (String additionalExportFormat : additionalExportFormats)
        {
            if (additionalExportFormat != null && !additionalExportFormat.trim().equals("") && !formatsToExport.contains(additionalExportFormat))
            {
                formatsToExport.add(additionalExportFormat);
            }
        }
		
		for (StorageFile inputFile : InputTestFiles)
		{
			if (inputFile.getName().endsWith(formatExtension))
            {
                name = inputFile.getName();
				//imageData = Files.readAllBytes(Paths.get(LocalTestFolder + name));
				imageFile = Paths.get(LocalTestFolder + name).toFile();
            }
            else
            {
                continue;
            }
			
			for (String format : formatsToExport)
            {
				postImageResizeRequest = new PostDrawingResizeRequest(FileUtils.readFileToByteArray(imageFile), format, newWidth, newHeight, outPath, storage);
				outName = name + "_resize." + format;
				
				Method propertiesTester = ResizeApiTests.class.getDeclaredMethod("postImageResizePropertiesTester", CadResponse.class, CadResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = ResizeApiTests.class.getDeclaredMethod("postImageResizePostRequestInvoker", byte[].class, String.class);
				requestInvoker.setAccessible(true);
			    this.testPostRequest(
		            "postImageResizeTest; save result to storage: " + saveResultToStorage,
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s; New width: %s; New height: %s",
		            		name, format, newWidth, newHeight),
		            name,
		            outName,
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);

			    break;
            }
		}
    }
	
    /**
	 * Invokes GET request for getImageResize operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageResizeGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageResizeRequest.name = name;
		getImageResizeRequest.outPath = outPath;
        return CadApi.getDrawingResize(getImageResizeRequest);
	}
	
	/**
	 * Invokes POST request for postImageResize operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImageResizePostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageResizeRequest.drawingData = imageData;
		postImageResizeRequest.outPath = outPath;
        return CadApi.postDrawingResize(postImageResizeRequest);
	}
	
	/**
	 * Tests properties for getImageResize operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageResizePropertiesTester(CadResponse originalProperties, CadResponse resultProperties)
	{
	}
	
	/**
	 * Tests properties for postImageResize operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageResizePropertiesTester(CadResponse originalProperties, CadResponse resultProperties)
	{
	}
}
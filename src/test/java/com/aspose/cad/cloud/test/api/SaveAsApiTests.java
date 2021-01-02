/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SaveAsApiTests.java">
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
import com.aspose.cad.cloud.invoker.ApiResponse;
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
public class SaveAsApiTests extends ApiTester {

	private GetDrawingSaveAsRequest getImageSaveAsRequest;
	private PostDrawingSaveAsRequest postImageSaveAsRequest;
	
	@Before
    public void setUp() throws Exception { 
	    this.createApiInstances();
    }

    /**
     * Test operation: SaveAs an existing image.
     * 
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    @Parameters({
			".dwg, false,",
			".dwg, true,",
			".dxf, true,",
			".dxf, false,",
			".dgn, true,",
			".dgn, false,",
			".stl, true,",
			".stl, false,",
			".ifc, true,",
			".ifc, false,",
			".dwf, true,",
			".dwf, false,",
			".cf2, true,",
			".cf2, false,",
			".dwt, true,",
			".dwt, false,"
	})
    public void getImageSaveAsTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        String name = null;
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
                outName = name + "." + format;
				getImageSaveAsRequest = new GetDrawingSaveAsRequest(name, format, folder, outName, storage);
				
				Method propertiesTester = SaveAsApiTests.class.getDeclaredMethod("getImageSaveAsPropertiesTester", CadResponse.class, CadResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = SaveAsApiTests.class.getDeclaredMethod("getImageSaveAsGetRequestInvoker", String.class, String.class);
				requestInvoker.setAccessible(true);
			    this.testGetRequest(
		            "getImageSaveAsTest; save result to storage: " + saveResultToStorage, 
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s", name, format),
		            name,
		            outName,
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
    
    /**
     * Test operation: SaveAs an image. Image is passed in a request stream.
     * 
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({
			".dwg, true,",
            //".dwg, false,",
			".dxf, true,",
			//".dxf, false,",
			".dgn, true,",
			//".dgn, false,",
			".stl, true,",
			//".stl, false,",
			".ifc, true,",
			//".ifc, false,",
			".dwf, true,",
			//".dwf, false,"
	})
    public void postImageSaveAsTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
    	byte[] imageData = null;
    	File imageFile = null;
		String name = null;
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
                imageFile = Paths.get(LocalTestFolder + name).toFile();
                //imageData = Files.readAllBytes(Paths.get(LocalTestFolder + name));
            }
            else
            {
                continue;
            }
			
			for (String format : formatsToExport)
            {
				postImageSaveAsRequest = new PostDrawingSaveAsRequest(FileUtils.readFileToByteArray(imageFile), format, outPath, storage);
				outName = name + "." + format;
				
				Method propertiesTester = SaveAsApiTests.class.getDeclaredMethod("postImageSaveAsPropertiesTester", CadResponse.class, CadResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = SaveAsApiTests.class.getDeclaredMethod("postImageSaveAsPostRequestInvoker", byte[].class, String.class);
				requestInvoker.setAccessible(true);
			    this.testPostRequest(
		            "postImageSaveAsTest; save result to storage: " + saveResultToStorage,  
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s",
		            		name, format),
		            name,
		            outName,
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
	
    /**
	 * Invokes GET request for getImageSaveAs operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageSaveAsGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageSaveAsRequest.name = name;
		getImageSaveAsRequest.outPath = outPath;
        return CadApi.getDrawingSaveAs(getImageSaveAsRequest);
	}
	
	/**
	 * Invokes POST request for postImageSaveAs operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImageSaveAsPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageSaveAsRequest.drawingData = imageData;
		postImageSaveAsRequest.outPath = outPath;
        return CadApi.postDrawingSaveAs(postImageSaveAsRequest);
	}
	
	/**
	 * Tests properties for getImageSaveAs operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageSaveAsPropertiesTester(CadResponse originalProperties, CadResponse resultProperties)
	{
	}
	
	/**
	 * Tests properties for postImageSaveAs operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageSaveAsPropertiesTester(CadResponse originalProperties, CadResponse resultProperties)
	{
	}
}
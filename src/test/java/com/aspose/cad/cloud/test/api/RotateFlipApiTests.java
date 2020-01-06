/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="RotateFlipApiTests.java">
*   Copyright (c) 2018 Aspose.cad for Cloud
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

import com.aspose.cad.cloud.invoker.ApiResponse;
import com.aspose.cad.cloud.model.CadResponse;
import com.aspose.cad.cloud.model.requests.*;
import com.aspose.cad.cloud.*;
import com.aspose.cad.cloud.test.base.ApiTester;
import com.aspose.cad.cloud.test.base.StorageFileInfo;

import com.aspose.storage.model.FileResponse;
import junitparams.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;

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
public class RotateFlipApiTests extends ApiTester {

	private GetDrawingRotateFlipRequest getImageRotateFlipRequest;
	private PostDrawingRotateFlipRequest postImageRotateFlipRequest;

    private String[] _rotateFlipMethods = new String[]
    {
        "Rotate180FlipNone", "Rotate180FlipX", "Rotate180FlipXY", "Rotate180FlipY", "Rotate270FlipNone", "Rotate270FlipX",
                "Rotate270FlipXY", "Rotate270FlipY", "Rotate90FlipNone", "Rotate90FlipX", "Rotate90FlipXY", "Rotate90FlipY",
                "RotateNoneFlipNone", "RotateNoneFlipX", "RotateNoneFlipXY", "RotateNoneFlipY"
    };
	
	@Before
    public void setUp() throws Exception { 
	    this.createApiInstances();
    }

    /**
     * Test operation: RotateFlip an existing image.
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
    public void getImageRotateFlipTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
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
		
		for (FileResponse inputFile : InputTestFiles)
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
                for (String method : _rotateFlipMethods)
                {
                    getImageRotateFlipRequest = new GetDrawingRotateFlipRequest(name, format, method, folder, storage, outPath);
                    outName = name + "_" + method + "." + format;

                    Method propertiesTester = RotateFlipApiTests.class.getDeclaredMethod("getImageRotateFlipPropertiesTester", CadResponse.class, CadResponse.class);
                    propertiesTester.setAccessible(true);
                    Method requestInvoker = RotateFlipApiTests.class.getDeclaredMethod("getImageRotateFlipGetRequestInvoker", String.class, String.class);
                    requestInvoker.setAccessible(true);
                    this.testGetRequest(
                            "getImageRotateFlipTest; save result to storage: " + saveResultToStorage,
                            saveResultToStorage,
                            String.format("Input image: %s; Output format: %s; Method: %s",
                                    name, format, method),
                            name,
                            outName,
                            requestInvoker,
                            propertiesTester,
                            folder,
                            storage);
                }

                break;
            }
		}
    }
    
    /**
     * Test operation: RotateFlip an image. Image is passed in a request stream.
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
    public void postImageRotateFlipTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
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
		
		for (FileResponse inputFile : InputTestFiles)
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
                for (String method : _rotateFlipMethods)
                {
                    outName = name + "_" + method + "." + format;
                    postImageRotateFlipRequest = new PostDrawingRotateFlipRequest(imageFile, format, method, outPath, null);

                    Method propertiesTester = RotateFlipApiTests.class.getDeclaredMethod("postImageRotateFlipPropertiesTester", CadResponse.class, CadResponse.class);
                    propertiesTester.setAccessible(true);
                    Method requestInvoker = RotateFlipApiTests.class.getDeclaredMethod("postImageRotateFlipPostRequestInvoker", File.class, String.class);
                    requestInvoker.setAccessible(true);
                    this.testPostRequest(
                            "postImageRotateFlipTest; save result to storage: " + saveResultToStorage,
                            saveResultToStorage,
                            String.format("Input image: %s; Output format: %s; Method: %s",
                                    name, format, method),
                            name,
                            outName,
                            requestInvoker,
                            propertiesTester,
                            folder,
                            storage);
                }

			    break;
            }
		}
    }

    /**
	 * Invokes GET request for getImageRotateFlip operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception
	 */
	private File getImageRotateFlipGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageRotateFlipRequest.setname(name);
		getImageRotateFlipRequest.setoutPath(outPath);
        return CadApi.getDrawingRotateFlip(getImageRotateFlipRequest);
	}

	/**
	 * Invokes POST request for postImageRotateFlip operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception
	 */
	private File postImageRotateFlipPostRequestInvoker(File imageData, String outPath) throws Exception
	{
	    postImageRotateFlipRequest.setdrawingData(imageData);
		postImageRotateFlipRequest.setoutPath(outPath);
        return CadApi.postDrawingRotateFlip(postImageRotateFlipRequest);
	}
	
	/**
	 * Tests properties for getImageRotateFlip operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageRotateFlipPropertiesTester(CadResponse originalProperties, CadResponse resultProperties)
	{
	}
	
	/**
	 * Tests properties for postImageRotateFlip operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageRotateFlipPropertiesTester(CadResponse originalProperties, CadResponse resultProperties)
	{
	}
}
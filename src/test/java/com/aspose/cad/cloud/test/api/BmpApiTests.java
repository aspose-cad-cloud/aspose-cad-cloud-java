/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BmpApiTests.java">
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

import com.aspose.cad.cloud.model.*;
import com.aspose.cad.cloud.invoker.ApiResponse;
import com.aspose.cad.cloud.model.requests.*;
import com.aspose.cad.cloud.*;
import com.aspose.cad.cloud.test.base.ApiTester;
import com.aspose.cad.cloud.test.base.StorageFileInfo;

import com.fasterxml.jackson.databind.ObjectMapper;
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
public class BmpApiTests extends ApiTester {
    private PutDrawingBmpRequest putDrawingBmpRequest;
    private PostDrawingBmpRequest postDrawingBmpRequest;

    @Before
    public void setUp() throws Exception {
        this.createApiInstances();
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
            ".dwg, false,"
    })
    public void postDrawingBmpRequest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
        String outName = null;
        String format = "bmp";

        BmpOptionsDTO bmpOptionsDTO = new BmpOptionsDTO();

        bmpOptionsDTO.setBitsPerPixel(32);
        bmpOptionsDTO.setCompression(BmpOptionsDTO.CompressionEnum.RGB);
        bmpOptionsDTO.setRotation(DrawingOptionsBaseDTO.RotationEnum.ROTATENONEFLIPNONE);

        CadRasterizationOptionsDTO cadRasterizationOptionsDTO = new CadRasterizationOptionsDTO();

        cadRasterizationOptionsDTO.setPageHeight(200.0);
        cadRasterizationOptionsDTO.setPageWidth(300.0);

        cadRasterizationOptionsDTO.setZoom(1.0);
        cadRasterizationOptionsDTO.setBorderX(0.0);
        cadRasterizationOptionsDTO.setBorderY(0.0);

        cadRasterizationOptionsDTO.setDrawType(CadRasterizationOptionsDTO.DrawTypeEnum.USEDRAWCOLOR);
        cadRasterizationOptionsDTO.setUnitType(VectorRasterizationOptionsDTO.UnitTypeEnum.UNITLESS);

        ColorDTO color = new ColorDTO();
        color.setR(0);
        color.setG(0);
        color.setB(0);
        cadRasterizationOptionsDTO.setDrawColor(color);

        cadRasterizationOptionsDTO.setNoScaling(false);

        cadRasterizationOptionsDTO.setBackgroundColor(color);

        cadRasterizationOptionsDTO.contentAsBitmap(true);
        cadRasterizationOptionsDTO.setAutomaticLayoutsScaling(true);


        bmpOptionsDTO.setVectorRasterizationOptions(cadRasterizationOptionsDTO);
        bmpOptionsDTO.getVectorRasterizationOptions().setBackgroundColor(new ColorDTO().R(255).B(240).G(255));

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
            postDrawingBmpRequest = new PostDrawingBmpRequest(name, bmpOptionsDTO, CloudTestDataFolder, outPath, storage);
            outName = name + "_post_bmp." + format;

            Method propertiesTester = BmpApiTests.class.getDeclaredMethod("bmpPropertiesTester", CadResponse.class, CadResponse.class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = BmpApiTests.class.getDeclaredMethod("postDrawingBmpRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testPostRequest(
                    "postBmpTest; save result to storage: " + saveResultToStorage,
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
            ".dwg, false,"
    })
    public void putDrawingBmpRequest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
        String outName = null;
        String format = "bmp";

        BmpOptionsDTO bmpOptionsDTO = new BmpOptionsDTO();

        bmpOptionsDTO.setBitsPerPixel(32);
        bmpOptionsDTO.setCompression(BmpOptionsDTO.CompressionEnum.RGB);
        bmpOptionsDTO.setRotation(DrawingOptionsBaseDTO.RotationEnum.ROTATENONEFLIPNONE);

        CadRasterizationOptionsDTO cadRasterizationOptionsDTO = new CadRasterizationOptionsDTO();

        cadRasterizationOptionsDTO.setPageHeight(200.0);
        cadRasterizationOptionsDTO.setPageWidth(300.0);

        cadRasterizationOptionsDTO.setZoom(1.0);
        cadRasterizationOptionsDTO.setBorderX(0.0);
        cadRasterizationOptionsDTO.setBorderY(0.0);

        cadRasterizationOptionsDTO.setDrawType(CadRasterizationOptionsDTO.DrawTypeEnum.USEDRAWCOLOR);
        cadRasterizationOptionsDTO.setUnitType(VectorRasterizationOptionsDTO.UnitTypeEnum.UNITLESS);

        ColorDTO color = new ColorDTO();
        color.setR(0);
        color.setG(0);
        color.setB(0);
        cadRasterizationOptionsDTO.setDrawColor(color);

        cadRasterizationOptionsDTO.setNoScaling(false);

        cadRasterizationOptionsDTO.setBackgroundColor(color);

        cadRasterizationOptionsDTO.contentAsBitmap(true);
        cadRasterizationOptionsDTO.setAutomaticLayoutsScaling(true);


        bmpOptionsDTO.setVectorRasterizationOptions(cadRasterizationOptionsDTO);
        bmpOptionsDTO.getVectorRasterizationOptions().setBackgroundColor(new ColorDTO().R(255).B(240).G(255));

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
                imageData = FileUtils.readFileToByteArray(imageFile);
            }
            else
            {
                continue;
            }

            ObjectMapper mapper = new ObjectMapper();
            String bmpOptionsJson = mapper.writeValueAsString(bmpOptionsDTO);

            putDrawingBmpRequest = new PutDrawingBmpRequest(imageData, outPath, bmpOptionsJson, storage);

            outName = name + "_put_bmp." + format;

            Method propertiesTester = BmpApiTests.class.getDeclaredMethod("bmpPropertiesTester", CadResponse.class, CadResponse.class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = BmpApiTests.class.getDeclaredMethod("putBmpRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testPutRequest(
                    "putBmpTest; save result to storage: " + saveResultToStorage,
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

    /**
     * Invokes GET request for getImageSaveAs operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     */
    private byte[] postDrawingBmpRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        postDrawingBmpRequest.outPath = outPath;
        return CadApi.postDrawingBmp(postDrawingBmpRequest);
    }

    /**
     * Invokes POST request for postImageSaveAs operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     */
    private byte[] putBmpRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        putDrawingBmpRequest.drawingData = imageData;
        putDrawingBmpRequest.outPath = outPath;
        return CadApi.putDrawingBmp(putDrawingBmpRequest);
    }

    /**
     * Tests properties for postBmpProperties operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     */
    private void bmpPropertiesTester(CadResponse originalProperties, CadResponse resultProperties)
    {
    }
}

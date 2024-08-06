/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LiveApiTests.java">
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
import com.aspose.cad.cloud.model.WatermarkRGB;
import com.aspose.cad.cloud.model.requests.*;
import com.aspose.cad.cloud.test.base.ApiTester;

import junitparams.*;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class for testing crop-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class LiveApiTests extends ApiTester {

    private ConvertRequest convertRequest;
    private WatermarkRequest watermarkRequest;
    private PaperToCadRequest paperToCadRequest;
    private ExtractTextRequest extractTextRequest;
    private ExtractMetadataRequest extractMetadataRequest;
    private EditMetadataRequest editMetadataRequest;
    private PutEditMetadataRequest putEditMetadataRequest;

    @Before
    public void setUp() throws Exception {
        this.createApiInstances();
    }
    /**
     * Test operation: PaperToCad an image. Image is passed in a request stream.
     *
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    @Parameters({
            ".png, false,"
    })
    public void paperToCadRequest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String outName = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
        String format = "dxf";

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
            try
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

                paperToCadRequest = new PaperToCadRequest(imageData, format);
                outName = name + "_paper_to_cad." + format;

                Method propertiesTester = LiveApiTests.class.getDeclaredMethod("propertiesTester", CadResponse.class, CadResponse.class);
                propertiesTester.setAccessible(true);

                Method requestInvoker = LiveApiTests.class.getDeclaredMethod("paperToCadRequestTesterInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);

                this.testPostRequest(
                        "paperToCadTest; save result to storage: " + saveResultToStorage,
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
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     * Test operation: Convert an image. Image is passed in a request stream.
     *
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    @Parameters({
            ".dwg, false,"
    })
    public void convertRequest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String outName = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
        String format = "png";

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
            try
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

                convertRequest = new ConvertRequest(imageData, format, null);
                outName = name + "_convert." + format;

                Method propertiesTester = LiveApiTests.class.getDeclaredMethod("propertiesTester", CadResponse.class, CadResponse.class);
                propertiesTester.setAccessible(true);

                Method requestInvoker = LiveApiTests.class.getDeclaredMethod("convertRequestTesterInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);

                this.testPostRequest(
                        "convertTest; save result to storage: " + saveResultToStorage,
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
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
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
            ".dwg, false,"
    })
    public void watermarkRequest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
        String outName = null;
        String format = "png";

        WatermarkRGB watermarkRGB = new WatermarkRGB();
        watermarkRGB.setR(0);
        watermarkRGB.setG(0);
        watermarkRGB.setB(255);
        watermarkRGB.setText("watermark");

        ObjectMapper mapper = new ObjectMapper();
        String watermarkJson = mapper.writeValueAsString(watermarkRGB);

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
            try
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

                watermarkRequest = new WatermarkRequest(imageData, format, watermarkJson, null);
                outName = name + "_watermark." + format;

                Method propertiesTester = LiveApiTests.class.getDeclaredMethod("propertiesTester", CadResponse.class, CadResponse.class);
                propertiesTester.setAccessible(true);

                Method requestInvoker = LiveApiTests.class.getDeclaredMethod("watermarkRequestTesterInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);

                this.testPostRequest(
                        "watermarkTest; save result to storage: " + saveResultToStorage,
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
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     * Test operation: ExtractText an image. Image is passed in a request stream.
     *
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    @Parameters({
            ".dxf, false,"
    })
    public void extractTextRequest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String outName = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
        String format = "txt";

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
            try
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

                extractTextRequest = new ExtractTextRequest(imageData);
                outName = name + "_extract_text." + format;

                Method propertiesTester = LiveApiTests.class.getDeclaredMethod("propertiesTester", CadResponse.class, CadResponse.class);
                propertiesTester.setAccessible(true);

                Method requestInvoker = LiveApiTests.class.getDeclaredMethod("extractTextRequestTesterInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);

                this.testPostRequest(
                        "extractTextTest; save result to storage: " + saveResultToStorage,
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
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     * Test operation: ExtractMetadata an image. Image is passed in a request stream.
     *
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    @Parameters({
            ".dxf, false,"
    })
    public void extractMetadataRequest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String outName = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;

        ArrayList<String> formatsToExport = new ArrayList<String>();
        Collections.addAll(formatsToExport, this.BasicExportMetadataFormats);
        for (String additionalExportFormat : additionalExportFormats)
        {
            if (additionalExportFormat != null && !additionalExportFormat.trim().equals("") && !formatsToExport.contains(additionalExportFormat))
            {
                formatsToExport.add(additionalExportFormat);
            }
        }

        for (StorageFile inputFile : InputTestFiles) {
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
                imageFile = Paths.get(LocalTestFolder + name).toFile();
                imageData = FileUtils.readFileToByteArray(imageFile);
            } else {
                continue;
            }

            for (String format : formatsToExport) {
                try
                {
                    extractMetadataRequest = new ExtractMetadataRequest(imageData, format);
                    outName = name + "_extract_metadata." + format;

                    Method propertiesTester = LiveApiTests.class.getDeclaredMethod("propertiesTester", CadResponse.class, CadResponse.class);
                    propertiesTester.setAccessible(true);

                    Method requestInvoker = LiveApiTests.class.getDeclaredMethod("extractMetadataRequestTesterInvoker", byte[].class, String.class);
                    requestInvoker.setAccessible(true);

                    this.testPostRequest(
                            "extractMetadataTest; save result to storage: " + saveResultToStorage,
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
                catch (Exception exception)
                {
                    System.out.println(exception.getMessage());
                }
            }
        }
    }

    /**
     * Test operation: EditMetadata an image. Image is passed in a request stream.
     *
     * @param fileName File name to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    @Parameters({
            "910609.dxf, false,"
    })
    public void editMetadataRequest(String fileName, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String outName = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
        String format = "json";

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
            try
            {
                if (inputFile.getName().equals(fileName))
                {
                    name = inputFile.getName();
                    imageFile = Paths.get(LocalTestFolder + name).toFile();
                    imageData = FileUtils.readFileToByteArray(imageFile);
                }
                else
                {
                    continue;
                }

                editMetadataRequest = new EditMetadataRequest(imageData);
                outName = name + "_edit_metadata." + format;

                Method propertiesTester = LiveApiTests.class.getDeclaredMethod("propertiesTester", CadResponse.class, CadResponse.class);
                propertiesTester.setAccessible(true);

                Method requestInvoker = LiveApiTests.class.getDeclaredMethod("editMetadataRequestTesterInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);

                this.testPostRequest(
                        "editMetadataTest; save result to storage: " + saveResultToStorage,
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
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     * Test operation: PutEditMetadata an image. Image is passed in a request stream.
     *
     * @param fileName File name to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    @Parameters({
            "910609.dxf, false,"
    })
    public void putEditMetadataRequest(String fileName, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        byte[] imageData = null;
        File imageFile = null;
        String name = null;
        String outName = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
        String format = "dxf";
        String dxf_metadata = "{\"Name\":\"DxfImage\",\"Level\":0,\"Components\":[{\"Name\":\"SummaryInfoWrapper\",\"Level\":0,\"Components\":[{\"Name\":\"Title\",\"Value\":\"TestValue\",\"Type\":\"String\",\"Level\":0,\"Components\":[]},{\"Name\":\"Subject\",\"Type\":\"String\",\"Level\":0,\"Components\":[]},{\"Name\":\"Author\",\"Type\":\"String\",\"Level\":0,\"Components\":[]},{\"Name\":\"Keywords\",\"Type\":\"String\",\"Level\":0,\"Components\":[]},{\"Name\":\"Comments\",\"Type\":\"String\",\"Level\":0,\"Components\":[]},{\"Name\":\"LastSavedBy\",\"Type\":\"String\",\"Level\":0,\"Components\":[]},{\"Name\":\"RevisionNumber\",\"Type\":\"String\",\"Level\":0,\"Components\":[]},{\"Name\":\"HyperlinkBase\",\"Type\":\"String\",\"Level\":0,\"Components\":[]},{\"Name\":\"EditingTime\",\"Value\":\"01:59:54.7930000\",\"Type\":\"TimeSpan\",\"Level\":0,\"Components\":[]},{\"Name\":\"CreateDateTime\",\"Value\":\"1888-04-12T07:59:59\",\"Type\":\"DateTime\",\"Level\":0,\"Components\":[]},{\"Name\":\"ModifiedDateTime\",\"Value\":\"1998-03-26T10:23:29\",\"Type\":\"DateTime\",\"Level\":0,\"Components\":[]},{\"Name\":\"CreateDateTimeUtc\",\"Type\":\"DateTime\",\"Level\":0,\"Components\":[]},{\"Name\":\"ModifiedDateTimeUtc\",\"Type\":\"DateTime\",\"Level\":0,\"Components\":[]}]}]}";

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
            try
            {
                if (inputFile.getName().equals(fileName))
                {
                    name = inputFile.getName();
                    imageFile = Paths.get(LocalTestFolder + name).toFile();
                    imageData = FileUtils.readFileToByteArray(imageFile);
                }
                else
                {
                    continue;
                }


                putEditMetadataRequest = new PutEditMetadataRequest(imageData, dxf_metadata);
                outName = name + "_put_edit_metadata." + format;

                Method propertiesTester = LiveApiTests.class.getDeclaredMethod("propertiesTester", CadResponse.class, CadResponse.class);
                propertiesTester.setAccessible(true);

                Method requestInvoker = LiveApiTests.class.getDeclaredMethod("putEditMetadataRequestTesterInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);

                this.testPostRequest(
                        "putEditMetadataTest; save result to storage: " + saveResultToStorage,
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
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     * Invokes POST request for convert operation. Used indirectly by method reference.
     * @param imageData Image file data
     * @param outputFormat Output format
     * @return API response
     */
    private byte[] convertRequestTesterInvoker(byte[] imageData, String outputFormat) throws Exception
    {
        convertRequest.drawingData = imageData;
        return CadApi.convert(convertRequest);
    }

    /**
     * Invokes POST request for paper to cad operation. Used indirectly by method reference.
     * @param imageData Image file data
     * @param outputFormat Output format
     * @return API response
     */
    private byte[] paperToCadRequestTesterInvoker(byte[] imageData, String outputFormat) throws Exception
    {
        paperToCadRequest.drawingData = imageData;
        return CadApi.paperToCad(paperToCadRequest);
    }

    /**
     * Invokes POST request for watermark operation. Used indirectly by method reference.
     * @param imageData Image file data
     * @param outputFormat Output format
     * @return API response
     */
    private byte[] watermarkRequestTesterInvoker(byte[] imageData, String outputFormat) throws Exception
    {
        watermarkRequest.drawingData = imageData;
        return CadApi.watermark(watermarkRequest);
    }

    /**
     * Invokes POST request for extract text operation. Used indirectly by method reference.
     * @param imageData Image file data
     * @param outputFormat Output format
     * @return API response
     */
    private byte[] extractTextRequestTesterInvoker(byte[] imageData, String outputFormat) throws Exception
    {
        extractTextRequest.drawingData = imageData;
        return CadApi.extractText(extractTextRequest);
    }

    /**
     * Invokes POST request for extract metadata operation. Used indirectly by method reference.
     * @param imageData Image file data
     * @param outputFormat Output format
     * @return API response
     */
    private byte[] extractMetadataRequestTesterInvoker(byte[] imageData, String outputFormat) throws Exception
    {
        extractMetadataRequest.drawingData = imageData;
        return CadApi.extractMetadata(extractMetadataRequest);
    }

    /**
     * Invokes POST request for get edited metadata operation. Used indirectly by method reference.
     * @param imageData Image file data
     * @param outputFormat Output format
     * @return API response
     */
    private byte[] editMetadataRequestTesterInvoker(byte[] imageData, String outputFormat) throws Exception
    {
        editMetadataRequest.drawingData = imageData;
        return CadApi.editMetadata(editMetadataRequest);
    }

    /**
     * Invokes PUT request for save edited metadata operation. Used indirectly by method reference.
     * @param imageData Image file data
     * @param outputFormat Output format
     * @return API response
     */
    private byte[] putEditMetadataRequestTesterInvoker(byte[] imageData, String outputFormat) throws Exception
    {
        putEditMetadataRequest.drawingData = imageData;
        return CadApi.putEditMetadata(putEditMetadataRequest);
    }

    /**
     * Tests properties for postImageSaveAs operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     */
    private void propertiesTester(CadResponse originalProperties, CadResponse resultProperties)
    {
    }
}


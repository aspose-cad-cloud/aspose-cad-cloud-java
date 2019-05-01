/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetImageSaveAsRequest.java">
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
 * --------------------------------------------------------------------------------------
 */
package com.aspose.cad.cloud.model.requests;
import com.aspose.cad.cloud.model.*;
import java.io.File;

/*
 * Request model for getImageSaveAs operation.
 */
public class GetImageSaveAsRequest {
    /*
     * Filename of drawing.
     */
    private String Name;

    /*
     * Output file format. Valid Formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
     */
    private String Format;

    /*
     * Original drawing folder.
     */
    private String Folder;

    /*
     * File storage, which has to be used.
     */
    private String Storage;

    /*
     * The raster options as Base64 string.
     */
    private String RasterOptions;

    /*
     * Path to updated file, if this is empty, response contains streamed image.
     */
    private String OutPath;
    
    /*
     * Initializes a new instance of the getImageSaveAsRequest class.
     *  
     * @param String name Filename of drawing.
     * @param String format Output file format. Valid Formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
     * @param String folder Original drawing folder.
     * @param String storage File storage, which has to be used.
     * @param String rasterOptions The raster options as Base64 string.
     * @param String outPath Path to updated file, if this is empty, response contains streamed image.
     */
    public GetImageSaveAsRequest(String name,  String format,  String folder,  String storage,  String rasterOptions,  String outPath) {
        Name = name;
        Format = format;
        Folder = folder;
        Storage = storage;
        RasterOptions = rasterOptions;
        OutPath = outPath;
    }

    /*
     *  Gets Filename of drawing.
     */
    public String getName() {
        return Name;
    }

    /*
     * Sets Filename of drawing.
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     *  Gets Output file format. Valid Formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
     */
    public String getFormat() {
        return Format;
    }

    /*
     * Sets Output file format. Valid Formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
     */
    public void setFormat(String value) {
        Format = value;
    }

    /*
     *  Gets Original drawing folder.
     */
    public String getFolder() {
        return Folder;
    }

    /*
     * Sets Original drawing folder.
     */
    public void setFolder(String value) {
        Folder = value;
    }

    /*
     *  Gets File storage, which has to be used.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets File storage, which has to be used.
     */
    public void setStorage(String value) {
        Storage = value;
    }

    /*
     *  Gets The raster options as Base64 string.
     */
    public String getRasterOptions() {
        return RasterOptions;
    }

    /*
     * Sets The raster options as Base64 string.
     */
    public void setRasterOptions(String value) {
        RasterOptions = value;
    }

    /*
     *  Gets Path to updated file, if this is empty, response contains streamed image.
     */
    public String getOutPath() {
        return OutPath;
    }

    /*
     * Sets Path to updated file, if this is empty, response contains streamed image.
     */
    public void setOutPath(String value) {
        OutPath = value;
    }
}

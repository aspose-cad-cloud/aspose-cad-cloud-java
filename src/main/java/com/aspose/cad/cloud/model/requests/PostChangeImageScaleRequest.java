/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostChangeImageScaleRequest.java">
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
 * Request model for postChangeImageScale operation.
 */
public class PostChangeImageScaleRequest {
    /*
     * Input drawing
     */
    private File DrawingData;

    /*
     * Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
     */
    private String Format;

    /*
     * New width of the scaled image.
     */
    private Integer NewWidth;

    /*
     * New height of the scaled image.
     */
    private Integer NewHeight;

    /*
     * Path to updated file, if this is empty, response contains streamed image. 
     */
    private String OutPath;

    /*
     * Your Aspose Cloud Storage name.
     */
    private String Storage;
    
    /*
     * Initializes a new instance of the postChangeImageScaleRequest class.
     *  
     * @param File drawingData Input drawing
     * @param String format Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
     * @param Integer newWidth New width of the scaled image.
     * @param Integer newHeight New height of the scaled image.
     * @param String outPath Path to updated file, if this is empty, response contains streamed image. 
     * @param String storage Your Aspose Cloud Storage name.
     */
    public PostChangeImageScaleRequest(File drawingData,  String format,  Integer newWidth,  Integer newHeight,  String outPath,  String storage) {
        DrawingData = drawingData;
        Format = format;
        NewWidth = newWidth;
        NewHeight = newHeight;
        OutPath = outPath;
        Storage = storage;
    }

    /*
     *  Gets Input drawing
     */
    public File getDrawingData() {
        return DrawingData;
    }

    /*
     * Sets Input drawing
     */
    public void setDrawingData(File value) {
        DrawingData = value;
    }

    /*
     *  Gets Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
     */
    public String getFormat() {
        return Format;
    }

    /*
     * Sets Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
     */
    public void setFormat(String value) {
        Format = value;
    }

    /*
     *  Gets New width of the scaled image.
     */
    public Integer getNewWidth() {
        return NewWidth;
    }

    /*
     * Sets New width of the scaled image.
     */
    public void setNewWidth(Integer value) {
        NewWidth = value;
    }

    /*
     *  Gets New height of the scaled image.
     */
    public Integer getNewHeight() {
        return NewHeight;
    }

    /*
     * Sets New height of the scaled image.
     */
    public void setNewHeight(Integer value) {
        NewHeight = value;
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

    /*
     *  Gets Your Aspose Cloud Storage name.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets Your Aspose Cloud Storage name.
     */
    public void setStorage(String value) {
        Storage = value;
    }
}

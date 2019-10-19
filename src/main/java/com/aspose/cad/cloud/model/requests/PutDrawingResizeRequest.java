/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutDrawingResizeRequest.java">
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
import java.util.*;

/*
 * Request model for putDrawingResize operation.
 */
public class PutDrawingResizeRequest {
    /*
     * Input drawing
     */
    private File drawingData;

    /*
     * Resulting image format.
     */
    private String outputFormat;

    /*
     * New width.
     */
    private Integer newWidth;

    /*
     * New height.
     */
    private Integer newHeight;

    /*
     * Path to updated file (if this is empty, response contains streamed image).
     */
    private String outPath;

    /*
     * Your Aspose Cloud Storage name.
     */
    private String storage;
    
    /*
     * Initializes a new instance of the putDrawingResizeRequest class.
     *  
     * @param File drawingData Input drawing
     * @param String outputFormat Resulting image format.
     * @param Integer newWidth New width.
     * @param Integer newHeight New height.
     * @param String outPath Path to updated file (if this is empty, response contains streamed image).
     * @param String storage Your Aspose Cloud Storage name.
     */
    public PutDrawingResizeRequest(File drawingData,  String outputFormat,  Integer newWidth,  Integer newHeight,  String outPath,  String storage) {
        drawingData = drawingData;
        outputFormat = outputFormat;
        newWidth = newWidth;
        newHeight = newHeight;
        outPath = outPath;
        storage = storage;
    }

    /*
     *  Gets Input drawing
     */
    public File getdrawingData() {
        return drawingData;
    }

    /*
     * Sets Input drawing
     */
    public void setdrawingData(File value) {
        drawingData = value;
    }

    /*
     *  Gets Resulting image format.
     */
    public String getoutputFormat() {
        return outputFormat;
    }

    /*
     * Sets Resulting image format.
     */
    public void setoutputFormat(String value) {
        outputFormat = value;
    }

    /*
     *  Gets New width.
     */
    public Integer getnewWidth() {
        return newWidth;
    }

    /*
     * Sets New width.
     */
    public void setnewWidth(Integer value) {
        newWidth = value;
    }

    /*
     *  Gets New height.
     */
    public Integer getnewHeight() {
        return newHeight;
    }

    /*
     * Sets New height.
     */
    public void setnewHeight(Integer value) {
        newHeight = value;
    }

    /*
     *  Gets Path to updated file (if this is empty, response contains streamed image).
     */
    public String getoutPath() {
        return outPath;
    }

    /*
     * Sets Path to updated file (if this is empty, response contains streamed image).
     */
    public void setoutPath(String value) {
        outPath = value;
    }

    /*
     *  Gets Your Aspose Cloud Storage name.
     */
    public String getstorage() {
        return storage;
    }

    /*
     * Sets Your Aspose Cloud Storage name.
     */
    public void setstorage(String value) {
        storage = value;
    }
}

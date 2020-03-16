
/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostDrawingSaveAsRequest.java">
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
 * --------------------------------------------------------------------------------------
 */
package com.aspose.cad.cloud.model.requests;
import com.aspose.cad.cloud.model.*;
import java.io.File;
import java.util.*;

/*
 * Request model for postDrawingSaveAs operation.
 */
public class PostDrawingSaveAsRequest {
    /*
     * Input drawing
     */
    private File drawingData;

    /*
     * Resulting file format.
     */
    private String outputFormat;

    /*
     * Path to updated file (if this is empty, response contains streamed file).
     */
    private String outPath;

    /*
     * Your Aspose Cloud Storage name.
     */
    private String storage;
    
    /*
     * Initializes a new instance of the postDrawingSaveAsRequest class.
     *  
     * @param File drawingData Input drawing
     * @param String outputFormat Resulting file format.
     * @param String outPath Path to updated file (if this is empty, response contains streamed file).
     * @param String storage Your Aspose Cloud Storage name.
     */
    public PostDrawingSaveAsRequest(File drawingData,  String outputFormat,  String outPath,  String storage) {
        this.drawingData = drawingData;
        this.outputFormat = outputFormat;
        this.outPath = outPath;
        this.storage = storage;
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
     *  Gets Resulting file format.
     */
    public String getoutputFormat() {
        return outputFormat;
    }

    /*
     * Sets Resulting file format.
     */
    public void setoutputFormat(String value) {
        outputFormat = value;
    }

    /*
     *  Gets Path to updated file (if this is empty, response contains streamed file).
     */
    public String getoutPath() {
        return outPath;
    }

    /*
     * Sets Path to updated file (if this is empty, response contains streamed file).
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
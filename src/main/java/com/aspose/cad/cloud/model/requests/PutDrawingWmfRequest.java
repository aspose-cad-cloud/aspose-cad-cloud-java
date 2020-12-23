
/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutDrawingWmfRequest.java">
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
 * Request model for putDrawingWmf operation.
 */
public class PutDrawingWmfRequest {
    /*
     * Input drawing
     */
    private File drawingData;

    /*
     * Path to updated file (if this is empty, response contains streamed file).
     */
    private String outPath;

    /*
     * JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/WmfOptionsDTO model definition.
     */
    private String exportOptions;

    /*
     * Your Aspose Cloud Storage name.
     */
    private String storage;
    
    /*
     * Initializes a new instance of the putDrawingWmfRequest class.
     *  
     * @param File drawingData Input drawing
     * @param String outPath Path to updated file (if this is empty, response contains streamed file).
     * @param String exportOptions JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/WmfOptionsDTO model definition.
     * @param String storage Your Aspose Cloud Storage name.
     */
    public PutDrawingWmfRequest(File drawingData,  String outPath,  String exportOptions,  String storage) {
        this.drawingData = drawingData;
        this.outPath = outPath;
        this.exportOptions = exportOptions;
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
     *  Gets JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/WmfOptionsDTO model definition.
     */
    public String getexportOptions() {
        return exportOptions;
    }

    /*
     * Sets JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/WmfOptionsDTO model definition.
     */
    public void setexportOptions(String value) {
        exportOptions = value;
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
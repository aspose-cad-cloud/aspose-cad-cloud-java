
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostDrawingWmfRequest.java">
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
 * Request model for postDrawingWmf operation.
 */
public class PostDrawingWmfRequest {
    /*
     * Filename of an input drawing on a storage.
     */
    private String name;

    /*
     * Export WMF options passed as a JSON on a request body.
     */
    private WmfOptionsDTO options;

    /*
     * Folder with a drawing to process.
     */
    private String folder;

    /*
     * Path to updated file (if this is empty, response contains streamed file).
     */
    private String outPath;

    /*
     * Your Aspose Cloud Storage name.
     */
    private String storage;
    
    /*
     * Initializes a new instance of the postDrawingWmfRequest class.
     *  
     * @param String name Filename of an input drawing on a storage.
     * @param WmfOptionsDTO options Export WMF options passed as a JSON on a request body.
     * @param String folder Folder with a drawing to process.
     * @param String outPath Path to updated file (if this is empty, response contains streamed file).
     * @param String storage Your Aspose Cloud Storage name.
     */
    public PostDrawingWmfRequest(String name,  WmfOptionsDTO options,  String folder,  String outPath,  String storage) {
        this.name = name;
        this.options = options;
        this.folder = folder;
        this.outPath = outPath;
        this.storage = storage;
    }

    /*
     *  Gets Filename of an input drawing on a storage.
     */
    public String getname() {
        return name;
    }

    /*
     * Sets Filename of an input drawing on a storage.
     */
    public void setname(String value) {
        name = value;
    }

    /*
     *  Gets Export WMF options passed as a JSON on a request body.
     */
    public WmfOptionsDTO getoptions() {
        return options;
    }

    /*
     * Sets Export WMF options passed as a JSON on a request body.
     */
    public void setoptions(WmfOptionsDTO value) {
        options = value;
    }

    /*
     *  Gets Folder with a drawing to process.
     */
    public String getfolder() {
        return folder;
    }

    /*
     * Sets Folder with a drawing to process.
     */
    public void setfolder(String value) {
        folder = value;
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
/*
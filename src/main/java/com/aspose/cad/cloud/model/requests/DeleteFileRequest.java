
/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DeleteFileRequest.java">
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
 * Request model for deleteFile operation.
 */
public class DeleteFileRequest {
    /*
     * File path e.g. '/folder/file.ext'
     */
    private String path;

    /*
     * Storage name
     */
    private String storageName;

    /*
     * File version ID to delete
     */
    private String versionId;
    
    /*
     * Initializes a new instance of the deleteFileRequest class.
     *  
     * @param String path File path e.g. '/folder/file.ext'
     * @param String storageName Storage name
     * @param String versionId File version ID to delete
     */
    public DeleteFileRequest(String path,  String storageName,  String versionId) {
        this.path = path;
        this.storageName = storageName;
        this.versionId = versionId;
    }

    /*
     *  Gets File path e.g. '/folder/file.ext'
     */
    public String getpath() {
        return path;
    }

    /*
     * Sets File path e.g. '/folder/file.ext'
     */
    public void setpath(String value) {
        path = value;
    }

    /*
     *  Gets Storage name
     */
    public String getstorageName() {
        return storageName;
    }

    /*
     * Sets Storage name
     */
    public void setstorageName(String value) {
        storageName = value;
    }

    /*
     *  Gets File version ID to delete
     */
    public String getversionId() {
        return versionId;
    }

    /*
     * Sets File version ID to delete
     */
    public void setversionId(String value) {
        versionId = value;
    }
}
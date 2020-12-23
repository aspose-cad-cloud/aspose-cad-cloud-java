
/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DeleteFolderRequest.java">
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
 * Request model for deleteFolder operation.
 */
public class DeleteFolderRequest {
    /*
     * Folder path e.g. '/folder'
     */
    private String path;

    /*
     * Storage name
     */
    private String storageName;

    /*
     * Enable to delete folders, subfolders and files
     */
    private Boolean recursive;
    
    /*
     * Initializes a new instance of the deleteFolderRequest class.
     *  
     * @param String path Folder path e.g. '/folder'
     * @param String storageName Storage name
     * @param Boolean recursive Enable to delete folders, subfolders and files
     */
    public DeleteFolderRequest(String path,  String storageName,  Boolean recursive) {
        this.path = path;
        this.storageName = storageName;
        this.recursive = recursive;
    }

    /*
     *  Gets Folder path e.g. '/folder'
     */
    public String getpath() {
        return path;
    }

    /*
     * Sets Folder path e.g. '/folder'
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
     *  Gets Enable to delete folders, subfolders and files
     */
    public Boolean getrecursive() {
        return recursive;
    }

    /*
     * Sets Enable to delete folders, subfolders and files
     */
    public void setrecursive(Boolean value) {
        recursive = value;
    }
}
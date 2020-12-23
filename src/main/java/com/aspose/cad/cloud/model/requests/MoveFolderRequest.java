
/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MoveFolderRequest.java">
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
 * Request model for moveFolder operation.
 */
public class MoveFolderRequest {
    /*
     * Folder path to move e.g. '/folder'
     */
    private String srcPath;

    /*
     * Destination folder path to move to e.g '/dst'
     */
    private String destPath;

    /*
     * Source storage name
     */
    private String srcStorageName;

    /*
     * Destination storage name
     */
    private String destStorageName;
    
    /*
     * Initializes a new instance of the moveFolderRequest class.
     *  
     * @param String srcPath Folder path to move e.g. '/folder'
     * @param String destPath Destination folder path to move to e.g '/dst'
     * @param String srcStorageName Source storage name
     * @param String destStorageName Destination storage name
     */
    public MoveFolderRequest(String srcPath,  String destPath,  String srcStorageName,  String destStorageName) {
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
    }

    /*
     *  Gets Folder path to move e.g. '/folder'
     */
    public String getsrcPath() {
        return srcPath;
    }

    /*
     * Sets Folder path to move e.g. '/folder'
     */
    public void setsrcPath(String value) {
        srcPath = value;
    }

    /*
     *  Gets Destination folder path to move to e.g '/dst'
     */
    public String getdestPath() {
        return destPath;
    }

    /*
     * Sets Destination folder path to move to e.g '/dst'
     */
    public void setdestPath(String value) {
        destPath = value;
    }

    /*
     *  Gets Source storage name
     */
    public String getsrcStorageName() {
        return srcStorageName;
    }

    /*
     * Sets Source storage name
     */
    public void setsrcStorageName(String value) {
        srcStorageName = value;
    }

    /*
     *  Gets Destination storage name
     */
    public String getdestStorageName() {
        return destStorageName;
    }

    /*
     * Sets Destination storage name
     */
    public void setdestStorageName(String value) {
        destStorageName = value;
    }
}
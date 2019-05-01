/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetImagePropertiesRequest.java">
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
 * Request model for getImageProperties operation.
 */
public class GetImagePropertiesRequest {
    /*
     * The image name.
     */
    private String Name;

    /*
     * Original drawing folder.
     */
    private String Folder;

    /*
     * File storage, which has to be used.
     */
    private String Storage;
    
    /*
     * Initializes a new instance of the getImagePropertiesRequest class.
     *  
     * @param String name The image name.
     * @param String folder Original drawing folder.
     * @param String storage File storage, which has to be used.
     */
    public GetImagePropertiesRequest(String name,  String folder,  String storage) {
        Name = name;
        Folder = folder;
        Storage = storage;
    }

    /*
     *  Gets The image name.
     */
    public String getName() {
        return Name;
    }

    /*
     * Sets The image name.
     */
    public void setName(String value) {
        Name = value;
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
}

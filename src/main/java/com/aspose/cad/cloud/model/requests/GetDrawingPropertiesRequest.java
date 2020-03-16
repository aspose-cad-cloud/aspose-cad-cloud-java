
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDrawingPropertiesRequest.java">
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
 * Request model for getDrawingProperties operation.
 */
public class GetDrawingPropertiesRequest {
    /*
     * Filename of an input drawing on a storage.
     */
    private String name;

    /*
     * Folder with a drawing to get properties for.
     */
    private String folder;

    /*
     * Your Aspose Cloud Storage name.
     */
    private String storage;
    
    /*
     * Initializes a new instance of the getDrawingPropertiesRequest class.
     *  
     * @param String name Filename of an input drawing on a storage.
     * @param String folder Folder with a drawing to get properties for.
     * @param String storage Your Aspose Cloud Storage name.
     */
    public GetDrawingPropertiesRequest(String name,  String folder,  String storage) {
        this.name = name;
        this.folder = folder;
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
     *  Gets Folder with a drawing to get properties for.
     */
    public String getfolder() {
        return folder;
    }

    /*
     * Sets Folder with a drawing to get properties for.
     */
    public void setfolder(String value) {
        folder = value;
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
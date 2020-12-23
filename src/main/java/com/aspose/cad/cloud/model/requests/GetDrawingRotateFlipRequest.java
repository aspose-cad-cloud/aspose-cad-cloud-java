
/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDrawingRotateFlipRequest.java">
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
 * Request model for getDrawingRotateFlip operation.
 */
public class GetDrawingRotateFlipRequest {
    /*
     * Filename of a drawing.
     */
    private String name;

    /*
     * Resulting file format.
     */
    private String outputFormat;

    /*
     * Rotate/flip operation to apply. Possible values: RotateNoneFlipNone, Rotate90FlipNone, Rotate180FlipNone, Rotate270FlipNone, RotateNoneFlipX, Rotate90FlipX, Rotate180FlipX, Rotate270FlipX, RotateNoneFlipY, Rotate90FlipY, Rotate180FlipY, Rotate270FlipY, RotateNoneFlipXY, Rotate90FlipXY, Rotate180FlipXY, Rotate270FlipXY
     */
    private String rotateFlipType;

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
     * Initializes a new instance of the getDrawingRotateFlipRequest class.
     *  
     * @param String name Filename of a drawing.
     * @param String outputFormat Resulting file format.
     * @param String rotateFlipType Rotate/flip operation to apply. Possible values: RotateNoneFlipNone, Rotate90FlipNone, Rotate180FlipNone, Rotate270FlipNone, RotateNoneFlipX, Rotate90FlipX, Rotate180FlipX, Rotate270FlipX, RotateNoneFlipY, Rotate90FlipY, Rotate180FlipY, Rotate270FlipY, RotateNoneFlipXY, Rotate90FlipXY, Rotate180FlipXY, Rotate270FlipXY
     * @param String folder Folder with a drawing to process.
     * @param String outPath Path to updated file (if this is empty, response contains streamed file).
     * @param String storage Your Aspose Cloud Storage name.
     */
    public GetDrawingRotateFlipRequest(String name,  String outputFormat,  String rotateFlipType,  String folder,  String outPath,  String storage) {
        this.name = name;
        this.outputFormat = outputFormat;
        this.rotateFlipType = rotateFlipType;
        this.folder = folder;
        this.outPath = outPath;
        this.storage = storage;
    }

    /*
     *  Gets Filename of a drawing.
     */
    public String getname() {
        return name;
    }

    /*
     * Sets Filename of a drawing.
     */
    public void setname(String value) {
        name = value;
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
     *  Gets Rotate/flip operation to apply. Possible values: RotateNoneFlipNone, Rotate90FlipNone, Rotate180FlipNone, Rotate270FlipNone, RotateNoneFlipX, Rotate90FlipX, Rotate180FlipX, Rotate270FlipX, RotateNoneFlipY, Rotate90FlipY, Rotate180FlipY, Rotate270FlipY, RotateNoneFlipXY, Rotate90FlipXY, Rotate180FlipXY, Rotate270FlipXY
     */
    public String getrotateFlipType() {
        return rotateFlipType;
    }

    /*
     * Sets Rotate/flip operation to apply. Possible values: RotateNoneFlipNone, Rotate90FlipNone, Rotate180FlipNone, Rotate270FlipNone, RotateNoneFlipX, Rotate90FlipX, Rotate180FlipX, Rotate270FlipX, RotateNoneFlipY, Rotate90FlipY, Rotate180FlipY, Rotate270FlipY, RotateNoneFlipXY, Rotate90FlipXY, Rotate180FlipXY, Rotate270FlipXY
     */
    public void setrotateFlipType(String value) {
        rotateFlipType = value;
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
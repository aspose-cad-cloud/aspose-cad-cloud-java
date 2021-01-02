/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PutDrawingPdfRequest.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
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
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.cad.cloud.model.requests;

import com.aspose.cad.cloud.model.*;

/**
* Class that holds parameters for PutDrawingPdf request invocation.
**/   
public class PutDrawingPdfRequest
{
    /**
    * Initializes a new instance of the PutDrawingPdfRequest class.   
    * @param drawingData Input drawing
    * @param outPath Path to updated file (if this is empty, response contains streamed file).
    * @param exportOptions JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/PdfOptionsDTO model definition.
    * @param storage Your Aspose Cloud Storage name.
    **/
    public PutDrawingPdfRequest(byte[] drawingData, String outPath, String exportOptions, String storage)             
    {
        this.drawingData = drawingData;
        this.outPath = outPath;
        this.exportOptions = exportOptions;
        this.storage = storage;
    }
        
    /**
    * Input drawing
    **/
    public byte[] drawingData;

    /**
    * Path to updated file (if this is empty, response contains streamed file).
    **/
    public String outPath;

    /**
    * JSON-serialized export options passed as zero-indexed multipart/form-data. Follow #/definitions/PdfOptionsDTO model definition.
    **/
    public String exportOptions;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}

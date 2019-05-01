

/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostChangeImageScaleRequest.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
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

package com.aspose.cad.cloud.sdk.model.requests;

/**
* Class that holds parameters for postChangeImageScale request invocation.
**/   
public class PostChangeImageScaleRequest
{
	/**
	* Initializes a new instance of the PostChangeImageScaleRequest class.   
    * @param drawingData Input drawing
    * @param format Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
    * @param newWidth New width of the scaled image.
    * @param newHeight New height of the scaled image.
    * @param outPath Path to updated file, if this is empty, response contains streamed image. 
    * @param storage Your Aspose Cloud Storage name.
	**/
    public PostChangeImageScaleRequest(byte[] drawingData, String format, Integer newWidth, Integer newHeight, String outPath, String storage)             
    {
        this.drawingData = drawingData;
        this.format = format;
        this.newWidth = newWidth;
        this.newHeight = newHeight;
        this.outPath = outPath;
        this.storage = storage;
    }
		
    /**
    * Input drawing
    **/
    public byte[] drawingData;

    /**
    * Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
    **/
    public String format;

    /**
    * New width of the scaled image.
    **/
    public Integer newWidth;

    /**
    * New height of the scaled image.
    **/
    public Integer newHeight;

    /**
    * Path to updated file, if this is empty, response contains streamed image. 
    **/
    public String outPath;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}

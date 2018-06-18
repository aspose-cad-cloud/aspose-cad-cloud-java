}
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostImageRotateFlipRequest.java">
*   Copyright (c) 2018 Aspose.Imaging for Cloud
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
* Class that holds parameters for postImageRotateFlip request invocation.
**/   
public class PostImageRotateFlipRequest
{
	/**
	* Initializes a new instance of the PostImageRotateFlipRequest class.   
    * @param drawingData Input drawing
    * @param format Output file format. Valid Formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
    * @param method Rotate and flip method. Valid methods: Rotate180FlipNone,  Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY.
    * @param outPath Path to updated file, if this is empty, response contains streamed image.
	**/
    public PostImageRotateFlipRequest(byte[] drawingData, String format, String method, String outPath)             
    {
        this.drawingData = drawingData;
        this.format = format;
        this.method = method;
        this.outPath = outPath;
    }
		
    /**
    * Input drawing
    **/
    public byte[] drawingData;

    /**
    * Output file format. Valid Formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
    **/
    public String format;

    /**
    * Rotate and flip method. Valid methods: Rotate180FlipNone,  Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY.
    **/
    public String method;

    /**
    * Path to updated file, if this is empty, response contains streamed image.
    **/
    public String outPath;
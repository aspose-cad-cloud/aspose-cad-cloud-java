

/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImageRotateFlipRequest.java">
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
* Class that holds parameters for getImageRotateFlip request invocation.
**/   
public class GetImageRotateFlipRequest
{
	/**
	* Initializes a new instance of the GetImageRotateFlipRequest class.   
    * @param name Filename of image.
    * @param format Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
    * @param method Rotate and flip method. Valid methods: Rotate180FlipNone,  Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY.
    * @param folder Original drawing folder.
    * @param storage File storage, which has to be used.
    * @param outPath Path to updated file, if this is empty, response contains streamed image.
	**/
    public GetImageRotateFlipRequest(String name, String format, String method, String folder, String storage, String outPath)             
    {
        this.name = name;
        this.format = format;
        this.method = method;
        this.folder = folder;
        this.storage = storage;
        this.outPath = outPath;
    }
		
    /**
    * Filename of image.
    **/
    public String name;

    /**
    * Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
    **/
    public String format;

    /**
    * Rotate and flip method. Valid methods: Rotate180FlipNone,  Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY.
    **/
    public String method;

    /**
    * Original drawing folder.
    **/
    public String folder;

    /**
    * File storage, which has to be used.
    **/
    public String storage;

    /**
    * Path to updated file, if this is empty, response contains streamed image.
    **/
    public String outPath;
}

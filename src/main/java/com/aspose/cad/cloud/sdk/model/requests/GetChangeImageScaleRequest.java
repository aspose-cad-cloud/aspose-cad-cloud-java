/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetChangeImageScaleRequest.java">
*   Copyright (c) 2018 Aspose.CAD for Cloud
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
* Class that holds parameters for getChangeImageScale request invocation.
**/   
public class GetChangeImageScaleRequest
{
	/**
	* Initializes a new instance of the GetChangeImageScaleRequest class.   
    * @param name The image name.
    * @param format Output file format. Valid formats: BMP, PNG, JPG, JPEG, JPEG2000, TIF, TIFF, PSD, GIF, PDF, WMF.
    * @param newWidth New width of the scaled image.
    * @param newHeight New height of the scaled image.
    * @param folder Original drawing folder.
    * @param storage File storage, which has to be used.
    * @param outPath Path to updated file, if this is empty, response contains streamed image. 
	**/
    public GetChangeImageScaleRequest(String name, String format, Integer newWidth, Integer newHeight, String folder, String storage, String outPath)             
    {
        this.name = name;
        this.format = format;
        this.newWidth = newWidth;
        this.newHeight = newHeight;
        this.folder = folder;
        this.storage = storage;
        this.outPath = outPath;
    }
		
    /**
    * The image name.
    **/
    public String name;

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
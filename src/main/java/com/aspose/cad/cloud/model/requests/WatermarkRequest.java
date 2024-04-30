/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="WatermarkRequest.java">
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
* Class that holds parameters for Watermark request invocation.
**/   
public class WatermarkRequest
{
    /**
    * Initializes a new instance of the WatermarkRequest class.   
    * @param outputFormat 
    * @param drawing 
    * @param watermarkRgb 
    * @param outputTypeExt 
    **/
    public WatermarkRequest(String outputFormat, byte[] drawing, String watermarkRgb, String outputTypeExt)             
    {
        this.outputFormat = outputFormat;
        this.drawing = drawing;
        this.watermarkRgb = watermarkRgb;
        this.outputTypeExt = outputTypeExt;
    }
        
    /**
    * Gets or sets outputFormat
    **/
    public String outputFormat;

    /**
    * Gets or sets drawing
    **/
    public byte[] drawing;

    /**
    * Gets or sets watermarkRgb
    **/
    public String watermarkRgb;

    /**
    * Gets or sets outputTypeExt
    **/
    public String outputTypeExt;
}



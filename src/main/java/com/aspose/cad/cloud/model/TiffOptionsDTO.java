/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TiffOptionsDTO.java">
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


package com.aspose.cad.cloud.model;

import java.io.IOException;
import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.*;
import com.google.gson.stream.*;
import com.google.gson.annotations.*;

/**
 * Export options for TIFF format
 */
public class TiffOptionsDTO extends DrawingOptionsBaseDTO {
  @JsonProperty("byteOrder")
  private Object byteOrder = null;

  @JsonProperty("compression")
  private Object compression = null;

  @JsonProperty("expectedFormat")
  private Object expectedFormat = null;

  @JsonProperty("bitsPerSample")
  private List<Integer> bitsPerSample = null;

  @JsonProperty("photometric")
  private Object photometric = null;

  public TiffOptionsDTO byteOrder(Object byteOrder) {
    this.byteOrder = byteOrder;
    return this;
  }

  /**
   * Bytes order (little/big-endian notation)
   * @return byteOrder
  **/
  public Object getByteOrder() {
    return byteOrder;
  }  

  public void setByteOrder(Object byteOrder) {
    this.byteOrder = byteOrder;
  }

  public TiffOptionsDTO compression(Object compression) {
    this.compression = compression;
    return this;
  }

  /**
   * Compression level
   * @return compression
  **/
  public Object getCompression() {
    return compression;
  }  

  public void setCompression(Object compression) {
    this.compression = compression;
  }

  public TiffOptionsDTO expectedFormat(Object expectedFormat) {
    this.expectedFormat = expectedFormat;
    return this;
  }

  /**
   * Expected TIFF sub-format
   * @return expectedFormat
  **/
  public Object getExpectedFormat() {
    return expectedFormat;
  }  

  public void setExpectedFormat(Object expectedFormat) {
    this.expectedFormat = expectedFormat;
  }

  public TiffOptionsDTO bitsPerSample(List<Integer> bitsPerSample) {
    this.bitsPerSample = bitsPerSample;
    return this;
  }

  public TiffOptionsDTO addBitsPerSampleItem(Integer bitsPerSampleItem) {
    if (this.bitsPerSample == null) {
      this.bitsPerSample = new ArrayList<Integer>();
    }
    this.bitsPerSample.add(bitsPerSampleItem);
    return this;
  }

  /**
   * Bits per pixel
   * @return bitsPerSample
  **/
  public List<Integer> getBitsPerSample() {
    return bitsPerSample;
  }  

  public void setBitsPerSample(List<Integer> bitsPerSample) {
    this.bitsPerSample = bitsPerSample;
  }

  public TiffOptionsDTO photometric(Object photometric) {
    this.photometric = photometric;
    return this;
  }

  /**
   * Photometric options
   * @return photometric
  **/
  public Object getPhotometric() {
    return photometric;
  }  

  public void setPhotometric(Object photometric) {
    this.photometric = photometric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    TiffOptionsDTO tiffOptionsDTO = (TiffOptionsDTO) o;
    return ObjectUtils.equals(this.byteOrder, tiffOptionsDTO.byteOrder) &&
    ObjectUtils.equals(this.compression, tiffOptionsDTO.compression) &&
    ObjectUtils.equals(this.expectedFormat, tiffOptionsDTO.expectedFormat) &&
    ObjectUtils.equals(this.bitsPerSample, tiffOptionsDTO.bitsPerSample) &&
    ObjectUtils.equals(this.photometric, tiffOptionsDTO.photometric) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(byteOrder, compression, expectedFormat, bitsPerSample, photometric, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    byteOrder: ").append(toIndentedString(byteOrder)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    expectedFormat: ").append(toIndentedString(expectedFormat)).append("\n");
    sb.append("    bitsPerSample: ").append(toIndentedString(bitsPerSample)).append("\n");
    sb.append("    photometric: ").append(toIndentedString(photometric)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


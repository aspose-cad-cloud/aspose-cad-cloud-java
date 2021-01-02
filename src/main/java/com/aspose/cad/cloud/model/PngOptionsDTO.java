/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PngOptionsDTO.java">
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
 * Export options for PNG format
 */
public class PngOptionsDTO extends DrawingOptionsBaseDTO {
  @JsonProperty("colorType")
  private Object colorType = null;

  @JsonProperty("progressive")
  private Boolean progressive = null;

  @JsonProperty("filterType")
  private Object filterType = null;

  @JsonProperty("compressionLevel")
  private Integer compressionLevel = null;

  @JsonProperty("bitDepth")
  private Integer bitDepth = null;

  public PngOptionsDTO colorType(Object colorType) {
    this.colorType = colorType;
    return this;
  }

  /**
   * Color type
   * @return colorType
  **/
  public Object getColorType() {
    return colorType;
  }  

  public void setColorType(Object colorType) {
    this.colorType = colorType;
  }

  public PngOptionsDTO progressive(Boolean progressive) {
    this.progressive = progressive;
    return this;
  }

  /**
   * Determines whether &#39;progressive&#39; method is used
   * @return progressive
  **/
  public Boolean isProgressive() {
    return progressive;
  }  

  public void setProgressive(Boolean progressive) {
    this.progressive = progressive;
  }

  public PngOptionsDTO filterType(Object filterType) {
    this.filterType = filterType;
    return this;
  }

  /**
   * Filter type
   * @return filterType
  **/
  public Object getFilterType() {
    return filterType;
  }  

  public void setFilterType(Object filterType) {
    this.filterType = filterType;
  }

  public PngOptionsDTO compressionLevel(Integer compressionLevel) {
    this.compressionLevel = compressionLevel;
    return this;
  }

  /**
   * Compression level
   * @return compressionLevel
  **/
  public Integer getCompressionLevel() {
    return compressionLevel;
  }  

  public void setCompressionLevel(Integer compressionLevel) {
    this.compressionLevel = compressionLevel;
  }

  public PngOptionsDTO bitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
    return this;
  }

  /**
   * Bits depth
   * @return bitDepth
  **/
  public Integer getBitDepth() {
    return bitDepth;
  }  

  public void setBitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    PngOptionsDTO pngOptionsDTO = (PngOptionsDTO) o;
    return ObjectUtils.equals(this.colorType, pngOptionsDTO.colorType) &&
    ObjectUtils.equals(this.progressive, pngOptionsDTO.progressive) &&
    ObjectUtils.equals(this.filterType, pngOptionsDTO.filterType) &&
    ObjectUtils.equals(this.compressionLevel, pngOptionsDTO.compressionLevel) &&
    ObjectUtils.equals(this.bitDepth, pngOptionsDTO.bitDepth) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(colorType, progressive, filterType, compressionLevel, bitDepth, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PngOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    colorType: ").append(toIndentedString(colorType)).append("\n");
    sb.append("    progressive: ").append(toIndentedString(progressive)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    compressionLevel: ").append(toIndentedString(compressionLevel)).append("\n");
    sb.append("    bitDepth: ").append(toIndentedString(bitDepth)).append("\n");
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


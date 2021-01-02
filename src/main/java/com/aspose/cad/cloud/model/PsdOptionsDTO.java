/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PsdOptionsDTO.java">
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
 * Export options for PSD format
 */
public class PsdOptionsDTO extends DrawingOptionsBaseDTO {
  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("compressionMethod")
  private Object compressionMethod = null;

  @JsonProperty("colorMode")
  private Object colorMode = null;

  @JsonProperty("channelBitsCount")
  private Integer channelBitsCount = null;

  @JsonProperty("channelsCount")
  private Integer channelsCount = null;

  public PsdOptionsDTO version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * PSD format version
   * @return version
  **/
  public Integer getVersion() {
    return version;
  }  

  public void setVersion(Integer version) {
    this.version = version;
  }

  public PsdOptionsDTO compressionMethod(Object compressionMethod) {
    this.compressionMethod = compressionMethod;
    return this;
  }

  /**
   * Compression method
   * @return compressionMethod
  **/
  public Object getCompressionMethod() {
    return compressionMethod;
  }  

  public void setCompressionMethod(Object compressionMethod) {
    this.compressionMethod = compressionMethod;
  }

  public PsdOptionsDTO colorMode(Object colorMode) {
    this.colorMode = colorMode;
    return this;
  }

  /**
   * Color mode
   * @return colorMode
  **/
  public Object getColorMode() {
    return colorMode;
  }  

  public void setColorMode(Object colorMode) {
    this.colorMode = colorMode;
  }

  public PsdOptionsDTO channelBitsCount(Integer channelBitsCount) {
    this.channelBitsCount = channelBitsCount;
    return this;
  }

  /**
   * Bits count per channel
   * @return channelBitsCount
  **/
  public Integer getChannelBitsCount() {
    return channelBitsCount;
  }  

  public void setChannelBitsCount(Integer channelBitsCount) {
    this.channelBitsCount = channelBitsCount;
  }

  public PsdOptionsDTO channelsCount(Integer channelsCount) {
    this.channelsCount = channelsCount;
    return this;
  }

  /**
   * Channels count
   * @return channelsCount
  **/
  public Integer getChannelsCount() {
    return channelsCount;
  }  

  public void setChannelsCount(Integer channelsCount) {
    this.channelsCount = channelsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    PsdOptionsDTO psdOptionsDTO = (PsdOptionsDTO) o;
    return ObjectUtils.equals(this.version, psdOptionsDTO.version) &&
    ObjectUtils.equals(this.compressionMethod, psdOptionsDTO.compressionMethod) &&
    ObjectUtils.equals(this.colorMode, psdOptionsDTO.colorMode) &&
    ObjectUtils.equals(this.channelBitsCount, psdOptionsDTO.channelBitsCount) &&
    ObjectUtils.equals(this.channelsCount, psdOptionsDTO.channelsCount) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(version, compressionMethod, colorMode, channelBitsCount, channelsCount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PsdOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    compressionMethod: ").append(toIndentedString(compressionMethod)).append("\n");
    sb.append("    colorMode: ").append(toIndentedString(colorMode)).append("\n");
    sb.append("    channelBitsCount: ").append(toIndentedString(channelBitsCount)).append("\n");
    sb.append("    channelsCount: ").append(toIndentedString(channelsCount)).append("\n");
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


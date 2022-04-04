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

  /**
   * Compression method
   */
  @JsonAdapter(CompressionMethodEnum.Adapter.class)
  public enum CompressionMethodEnum {
    RAW("Raw"),
    
    RLE("RLE"),
    
    ZIPWITHOUTPREDICTION("ZipWithoutPrediction"),
    
    ZIPWITHPREDICTION("ZipWithPrediction");

    private String value;

    CompressionMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompressionMethodEnum fromValue(String text) {
      for (CompressionMethodEnum b : CompressionMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompressionMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompressionMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompressionMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompressionMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("compressionMethod")
  private CompressionMethodEnum compressionMethod = null;

  /**
   * Color mode
   */
  @JsonAdapter(ColorModeEnum.Adapter.class)
  public enum ColorModeEnum {
    BITMAP("Bitmap"),
    
    GRAYSCALE("Grayscale"),
    
    INDEXED("Indexed"),
    
    RGB("Rgb"),
    
    CMYK("Cmyk"),
    
    MULTICHANNEL("Multichannel"),
    
    DUOTONE("Duotone"),
    
    LAB("Lab");

    private String value;

    ColorModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorModeEnum fromValue(String text) {
      for (ColorModeEnum b : ColorModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColorModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("colorMode")
  private ColorModeEnum colorMode = null;

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

  public PsdOptionsDTO compressionMethod(CompressionMethodEnum compressionMethod) {
    this.compressionMethod = compressionMethod;
    return this;
  }

  /**
   * Compression method
   * @return compressionMethod
  **/
  public CompressionMethodEnum getCompressionMethod() {
    return compressionMethod;
  }  

  public void setCompressionMethod(CompressionMethodEnum compressionMethod) {
    this.compressionMethod = compressionMethod;
  }

  public PsdOptionsDTO colorMode(ColorModeEnum colorMode) {
    this.colorMode = colorMode;
    return this;
  }

  /**
   * Color mode
   * @return colorMode
  **/
  public ColorModeEnum getColorMode() {
    return colorMode;
  }  

  public void setColorMode(ColorModeEnum colorMode) {
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


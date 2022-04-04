/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="BmpOptionsDTO.java">
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
 * Export options for BMP format
 */
public class BmpOptionsDTO extends DrawingOptionsBaseDTO {
  @JsonProperty("bitsPerPixel")
  private Integer bitsPerPixel = null;

  /**
   * Compression type
   */
  @JsonAdapter(CompressionEnum.Adapter.class)
  public enum CompressionEnum {
    RGB("Rgb"),
    
    RLE8("Rle8"),
    
    RLE4("Rle4"),
    
    BITFIELDS("Bitfields"),
    
    JPEG("Jpeg"),
    
    PNG("Png"),
    
    ALPHABITFIELDS("AlphaBitfields"),
    
    DXT1("Dxt1");

    private String value;

    CompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompressionEnum fromValue(String text) {
      for (CompressionEnum b : CompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("compression")
  private CompressionEnum compression = null;

  public BmpOptionsDTO bitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
    return this;
  }

  /**
   * Bits per pixel
   * @return bitsPerPixel
  **/
  public Integer getBitsPerPixel() {
    return bitsPerPixel;
  }  

  public void setBitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
  }

  public BmpOptionsDTO compression(CompressionEnum compression) {
    this.compression = compression;
    return this;
  }

  /**
   * Compression type
   * @return compression
  **/
  public CompressionEnum getCompression() {
    return compression;
  }  

  public void setCompression(CompressionEnum compression) {
    this.compression = compression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    BmpOptionsDTO bmpOptionsDTO = (BmpOptionsDTO) o;
    return ObjectUtils.equals(this.bitsPerPixel, bmpOptionsDTO.bitsPerPixel) &&
    ObjectUtils.equals(this.compression, bmpOptionsDTO.compression) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(bitsPerPixel, compression, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BmpOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bitsPerPixel: ").append(toIndentedString(bitsPerPixel)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
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


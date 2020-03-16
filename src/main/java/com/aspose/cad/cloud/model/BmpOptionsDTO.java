/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.CAD Cloud
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
 * --------------------------------------------------------------------------------
 */

package com.aspose.cad.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.cad.cloud.model.CadRasterizationOptionsDTO;
import com.aspose.cad.cloud.model.DrawingOptionsBaseDTO;
import com.aspose.cad.cloud.model.ResolutionSetting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Export options for BMP format
 */
@ApiModel(description = "Export options for BMP format")

public class BmpOptionsDTO extends DrawingOptionsBaseDTO {
  @SerializedName("BitsPerPixel")
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
    
    ALPHABITFIELDS("AlphaBitfields");

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

  @SerializedName("Compression")
  private CompressionEnum compression = null;

  public BmpOptionsDTO bitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
    return this;
  }

   /**
   * Bits per pixel
   * @return bitsPerPixel
  **/
  @ApiModelProperty(required = true, value = "Bits per pixel")
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
  @ApiModelProperty(required = true, value = "Compression type")
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
    return Objects.equals(this.bitsPerPixel, bmpOptionsDTO.bitsPerPixel) &&
        Objects.equals(this.compression, bmpOptionsDTO.compression) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitsPerPixel, compression, super.hashCode());
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


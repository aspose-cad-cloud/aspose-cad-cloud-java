/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Cad for Cloud
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
 * Export options for SVG format
 */
@ApiModel(description = "Export options for SVG format")

public class SvgOptionsDTO extends DrawingOptionsBaseDTO {
  /**
   * Color type
   */
  @JsonAdapter(ColorTypeEnum.Adapter.class)
  public enum ColorTypeEnum {
    GRAYSCALE("Grayscale"),
    
    YCBCR("YCbCr"),
    
    CMYK("Cmyk"),
    
    YCCK("Ycck"),
    
    RGB("Rgb");

    private String value;

    ColorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorTypeEnum fromValue(String text) {
      for (ColorTypeEnum b : ColorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ColorType")
  private ColorTypeEnum colorType = null;

  @SerializedName("TextAsShapes")
  private Boolean textAsShapes = null;

  public SvgOptionsDTO colorType(ColorTypeEnum colorType) {
    this.colorType = colorType;
    return this;
  }

   /**
   * Color type
   * @return colorType
  **/
  @ApiModelProperty(required = true, value = "Color type")
  public ColorTypeEnum getColorType() {
    return colorType;
  }

  public void setColorType(ColorTypeEnum colorType) {
    this.colorType = colorType;
  }

  public SvgOptionsDTO textAsShapes(Boolean textAsShapes) {
    this.textAsShapes = textAsShapes;
    return this;
  }

   /**
   * Render text as shapes
   * @return textAsShapes
  **/
  @ApiModelProperty(required = true, value = "Render text as shapes")
  public Boolean isisTextAsShapes() {
    return textAsShapes;
  }

  public void setTextAsShapes(Boolean textAsShapes) {
    this.textAsShapes = textAsShapes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SvgOptionsDTO svgOptionsDTO = (SvgOptionsDTO) o;
    return Objects.equals(this.colorType, svgOptionsDTO.colorType) &&
        Objects.equals(this.textAsShapes, svgOptionsDTO.textAsShapes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorType, textAsShapes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SvgOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    colorType: ").append(toIndentedString(colorType)).append("\n");
    sb.append("    textAsShapes: ").append(toIndentedString(textAsShapes)).append("\n");
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


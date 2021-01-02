/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GraphicsOptions.java">
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
 * GraphicsOptions
 */
public class GraphicsOptions {
  /**
   * Gets or Sets textRenderingHint
   */
  @JsonAdapter(TextRenderingHintEnum.Adapter.class)
  public enum TextRenderingHintEnum {
    SYSTEMDEFAULT("SystemDefault"),
    
    SINGLEBITPERPIXELGRIDFIT("SingleBitPerPixelGridFit"),
    
    SINGLEBITPERPIXEL("SingleBitPerPixel"),
    
    ANTIALIASGRIDFIT("AntiAliasGridFit"),
    
    ANTIALIAS("AntiAlias"),
    
    CLEARTYPEGRIDFIT("ClearTypeGridFit");

    private String value;

    TextRenderingHintEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextRenderingHintEnum fromValue(String text) {
      for (TextRenderingHintEnum b : TextRenderingHintEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextRenderingHintEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextRenderingHintEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextRenderingHintEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextRenderingHintEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("textRenderingHint")
  private TextRenderingHintEnum textRenderingHint = null;

  /**
   * Gets or Sets smoothingMode
   */
  @JsonAdapter(SmoothingModeEnum.Adapter.class)
  public enum SmoothingModeEnum {
    DEFAULT("Default"),
    
    HIGHSPEED("HighSpeed"),
    
    HIGHQUALITY("HighQuality"),
    
    NONE("None"),
    
    ANTIALIAS("AntiAlias"),
    
    INVALID("Invalid");

    private String value;

    SmoothingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SmoothingModeEnum fromValue(String text) {
      for (SmoothingModeEnum b : SmoothingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SmoothingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SmoothingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SmoothingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SmoothingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("smoothingMode")
  private SmoothingModeEnum smoothingMode = null;

  /**
   * Gets or Sets interpolationMode
   */
  @JsonAdapter(InterpolationModeEnum.Adapter.class)
  public enum InterpolationModeEnum {
    DEFAULT("Default"),
    
    LOW("Low"),
    
    HIGH("High"),
    
    BILINEAR("Bilinear"),
    
    BICUBIC("Bicubic"),
    
    NEARESTNEIGHBOR("NearestNeighbor"),
    
    HIGHQUALITYBILINEAR("HighQualityBilinear"),
    
    HIGHQUALITYBICUBIC("HighQualityBicubic"),
    
    INVALID("Invalid");

    private String value;

    InterpolationModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InterpolationModeEnum fromValue(String text) {
      for (InterpolationModeEnum b : InterpolationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InterpolationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InterpolationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InterpolationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InterpolationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("interpolationMode")
  private InterpolationModeEnum interpolationMode = null;

  public GraphicsOptions textRenderingHint(TextRenderingHintEnum textRenderingHint) {
    this.textRenderingHint = textRenderingHint;
    return this;
  }

  /**
   * Get textRenderingHint
   * @return textRenderingHint
  **/
  public TextRenderingHintEnum getTextRenderingHint() {
    return textRenderingHint;
  }  

  public void setTextRenderingHint(TextRenderingHintEnum textRenderingHint) {
    this.textRenderingHint = textRenderingHint;
  }

  public GraphicsOptions smoothingMode(SmoothingModeEnum smoothingMode) {
    this.smoothingMode = smoothingMode;
    return this;
  }

  /**
   * Get smoothingMode
   * @return smoothingMode
  **/
  public SmoothingModeEnum getSmoothingMode() {
    return smoothingMode;
  }  

  public void setSmoothingMode(SmoothingModeEnum smoothingMode) {
    this.smoothingMode = smoothingMode;
  }

  public GraphicsOptions interpolationMode(InterpolationModeEnum interpolationMode) {
    this.interpolationMode = interpolationMode;
    return this;
  }

  /**
   * Get interpolationMode
   * @return interpolationMode
  **/
  public InterpolationModeEnum getInterpolationMode() {
    return interpolationMode;
  }  

  public void setInterpolationMode(InterpolationModeEnum interpolationMode) {
    this.interpolationMode = interpolationMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GraphicsOptions graphicsOptions = (GraphicsOptions) o;
    return ObjectUtils.equals(this.textRenderingHint, graphicsOptions.textRenderingHint) &&
    ObjectUtils.equals(this.smoothingMode, graphicsOptions.smoothingMode) &&
    ObjectUtils.equals(this.interpolationMode, graphicsOptions.interpolationMode);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(textRenderingHint, smoothingMode, interpolationMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicsOptions {\n");
    
    sb.append("    textRenderingHint: ").append(toIndentedString(textRenderingHint)).append("\n");
    sb.append("    smoothingMode: ").append(toIndentedString(smoothingMode)).append("\n");
    sb.append("    interpolationMode: ").append(toIndentedString(interpolationMode)).append("\n");
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


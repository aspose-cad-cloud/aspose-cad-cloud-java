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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PenOptions
 */

public class PenOptions {
  /**
   * Gets or Sets startCap
   */
  @JsonAdapter(StartCapEnum.Adapter.class)
  public enum StartCapEnum {
    FLAT("Flat"),
    
    SQUARE("Square"),
    
    ROUND("Round"),
    
    TRIANGLE("Triangle"),
    
    NOANCHOR("NoAnchor"),
    
    SQUAREANCHOR("SquareAnchor"),
    
    ROUNDANCHOR("RoundAnchor"),
    
    DIAMONDANCHOR("DiamondAnchor"),
    
    ARROWANCHOR("ArrowAnchor"),
    
    ANCHORMASK("AnchorMask"),
    
    CUSTOM("Custom");

    private String value;

    StartCapEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StartCapEnum fromValue(String text) {
      for (StartCapEnum b : StartCapEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StartCapEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StartCapEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StartCapEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StartCapEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("StartCap")
  private StartCapEnum startCap = null;

  /**
   * Gets or Sets endCap
   */
  @JsonAdapter(EndCapEnum.Adapter.class)
  public enum EndCapEnum {
    FLAT("Flat"),
    
    SQUARE("Square"),
    
    ROUND("Round"),
    
    TRIANGLE("Triangle"),
    
    NOANCHOR("NoAnchor"),
    
    SQUAREANCHOR("SquareAnchor"),
    
    ROUNDANCHOR("RoundAnchor"),
    
    DIAMONDANCHOR("DiamondAnchor"),
    
    ARROWANCHOR("ArrowAnchor"),
    
    ANCHORMASK("AnchorMask"),
    
    CUSTOM("Custom");

    private String value;

    EndCapEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EndCapEnum fromValue(String text) {
      for (EndCapEnum b : EndCapEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EndCapEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndCapEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EndCapEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EndCapEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("EndCap")
  private EndCapEnum endCap = null;

  public PenOptions startCap(StartCapEnum startCap) {
    this.startCap = startCap;
    return this;
  }

   /**
   * Get startCap
   * @return startCap
  **/
  @ApiModelProperty(required = true, value = "")
  public StartCapEnum getStartCap() {
    return startCap;
  }

  public void setStartCap(StartCapEnum startCap) {
    this.startCap = startCap;
  }

  public PenOptions endCap(EndCapEnum endCap) {
    this.endCap = endCap;
    return this;
  }

   /**
   * Get endCap
   * @return endCap
  **/
  @ApiModelProperty(required = true, value = "")
  public EndCapEnum getEndCap() {
    return endCap;
  }

  public void setEndCap(EndCapEnum endCap) {
    this.endCap = endCap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PenOptions penOptions = (PenOptions) o;
    return Objects.equals(this.startCap, penOptions.startCap) &&
        Objects.equals(this.endCap, penOptions.endCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startCap, endCap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PenOptions {\n");
    
    sb.append("    startCap: ").append(toIndentedString(startCap)).append("\n");
    sb.append("    endCap: ").append(toIndentedString(endCap)).append("\n");
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


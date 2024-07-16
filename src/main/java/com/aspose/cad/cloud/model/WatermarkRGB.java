/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="WatermarkRGB.java">
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
 * Watermark text with RGB values
 */
public class WatermarkRGB {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("R")
  private Integer R = null;

  @JsonProperty("G")
  private Integer G = null;

  @JsonProperty("B")
  private Integer B = null;

  public WatermarkRGB text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Watermark text.
   * @return text
  **/
  public String getText() {
    return text;
  }  

  public void setText(String text) {
    this.text = text;
  }

  public WatermarkRGB R(Integer R) {
    this.R = R;
    return this;
  }

  /**
   * Red light(0-255).
   * @return R
  **/
  public Integer getR() {
    return R;
  }  

  public void setR(Integer R) {
    this.R = R;
  }

  public WatermarkRGB G(Integer G) {
    this.G = G;
    return this;
  }

  /**
   * Green light(0-255).
   * @return G
  **/
  public Integer getG() {
    return G;
  }  

  public void setG(Integer G) {
    this.G = G;
  }

  public WatermarkRGB B(Integer B) {
    this.B = B;
    return this;
  }

  /**
   * Blue light(0-255).
   * @return B
  **/
  public Integer getB() {
    return B;
  }  

  public void setB(Integer B) {
    this.B = B;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    WatermarkRGB watermarkRGB = (WatermarkRGB) o;
    return ObjectUtils.equals(this.text, watermarkRGB.text) &&
    ObjectUtils.equals(this.R, watermarkRGB.R) &&
    ObjectUtils.equals(this.G, watermarkRGB.G) &&
    ObjectUtils.equals(this.B, watermarkRGB.B);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(text, R, G, B);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatermarkRGB {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    R: ").append(toIndentedString(R)).append("\n");
    sb.append("    G: ").append(toIndentedString(G)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
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


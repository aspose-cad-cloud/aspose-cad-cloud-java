/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Color.java">
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
 * Color
 */
public class Color {
  @JsonProperty("R")
  private Integer R = null;

  @JsonProperty("G")
  private Integer G = null;

  @JsonProperty("B")
  private Integer B = null;

  @JsonProperty("A")
  private Integer A = null;

  @JsonProperty("isKnownColor")
  private Boolean isKnownColor = null;

  @JsonProperty("isEmpty")
  private Boolean isEmpty = null;

  @JsonProperty("isNamedColor")
  private Boolean isNamedColor = null;

  @JsonProperty("name")
  private String name = null;

  public Color R(Integer R) {
    this.R = R;
    return this;
  }

  /**
   * Get R
   * @return R
  **/
  public Integer getR() {
    return R;
  }  

  public void setR(Integer R) {
    this.R = R;
  }

  public Color G(Integer G) {
    this.G = G;
    return this;
  }

  /**
   * Get G
   * @return G
  **/
  public Integer getG() {
    return G;
  }  

  public void setG(Integer G) {
    this.G = G;
  }

  public Color B(Integer B) {
    this.B = B;
    return this;
  }

  /**
   * Get B
   * @return B
  **/
  public Integer getB() {
    return B;
  }  

  public void setB(Integer B) {
    this.B = B;
  }

  public Color A(Integer A) {
    this.A = A;
    return this;
  }

  /**
   * Get A
   * @return A
  **/
  public Integer getA() {
    return A;
  }  

  public void setA(Integer A) {
    this.A = A;
  }

  public Color isKnownColor(Boolean isKnownColor) {
    this.isKnownColor = isKnownColor;
    return this;
  }

  /**
   * Get isKnownColor
   * @return isKnownColor
  **/
  public Boolean isIsKnownColor() {
    return isKnownColor;
  }  

  public void setIsKnownColor(Boolean isKnownColor) {
    this.isKnownColor = isKnownColor;
  }

  public Color isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

  /**
   * Get isEmpty
   * @return isEmpty
  **/
  public Boolean isIsEmpty() {
    return isEmpty;
  }  

  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  public Color isNamedColor(Boolean isNamedColor) {
    this.isNamedColor = isNamedColor;
    return this;
  }

  /**
   * Get isNamedColor
   * @return isNamedColor
  **/
  public Boolean isIsNamedColor() {
    return isNamedColor;
  }  

  public void setIsNamedColor(Boolean isNamedColor) {
    this.isNamedColor = isNamedColor;
  }

  public Color name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }  

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Color color = (Color) o;
    return ObjectUtils.equals(this.R, color.R) &&
    ObjectUtils.equals(this.G, color.G) &&
    ObjectUtils.equals(this.B, color.B) &&
    ObjectUtils.equals(this.A, color.A) &&
    ObjectUtils.equals(this.isKnownColor, color.isKnownColor) &&
    ObjectUtils.equals(this.isEmpty, color.isEmpty) &&
    ObjectUtils.equals(this.isNamedColor, color.isNamedColor) &&
    ObjectUtils.equals(this.name, color.name);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(R, G, B, A, isKnownColor, isEmpty, isNamedColor, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Color {\n");
    
    sb.append("    R: ").append(toIndentedString(R)).append("\n");
    sb.append("    G: ").append(toIndentedString(G)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
    sb.append("    A: ").append(toIndentedString(A)).append("\n");
    sb.append("    isKnownColor: ").append(toIndentedString(isKnownColor)).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
    sb.append("    isNamedColor: ").append(toIndentedString(isNamedColor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="KeySizes.java">
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
 * KeySizes
 */
public class KeySizes {
  @JsonProperty("minSize")
  private Integer minSize = null;

  @JsonProperty("maxSize")
  private Integer maxSize = null;

  @JsonProperty("skipSize")
  private Integer skipSize = null;

  public KeySizes minSize(Integer minSize) {
    this.minSize = minSize;
    return this;
  }

  /**
   * Get minSize
   * @return minSize
  **/
  public Integer getMinSize() {
    return minSize;
  }  

  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }

  public KeySizes maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

  /**
   * Get maxSize
   * @return maxSize
  **/
  public Integer getMaxSize() {
    return maxSize;
  }  

  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  public KeySizes skipSize(Integer skipSize) {
    this.skipSize = skipSize;
    return this;
  }

  /**
   * Get skipSize
   * @return skipSize
  **/
  public Integer getSkipSize() {
    return skipSize;
  }  

  public void setSkipSize(Integer skipSize) {
    this.skipSize = skipSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    KeySizes keySizes = (KeySizes) o;
    return ObjectUtils.equals(this.minSize, keySizes.minSize) &&
    ObjectUtils.equals(this.maxSize, keySizes.maxSize) &&
    ObjectUtils.equals(this.skipSize, keySizes.skipSize);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(minSize, maxSize, skipSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeySizes {\n");
    
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    skipSize: ").append(toIndentedString(skipSize)).append("\n");
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


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="RdOptimizerSettings.java">
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
 * RdOptimizerSettings
 */
public class RdOptimizerSettings {
  @JsonProperty("bppScale")
  private Integer bppScale = null;

  @JsonProperty("bppMax")
  private Double bppMax = null;

  @JsonProperty("maxQ")
  private Integer maxQ = null;

  @JsonProperty("minQ")
  private Integer minQ = null;

  @JsonProperty("maxPixelValue")
  private Integer maxPixelValue = null;

  @JsonProperty("psnrMax")
  private Integer psnrMax = null;

  @JsonProperty("discretizedBppMax")
  private Integer discretizedBppMax = null;

  public RdOptimizerSettings bppScale(Integer bppScale) {
    this.bppScale = bppScale;
    return this;
  }

  /**
   * Get bppScale
   * @return bppScale
  **/
  public Integer getBppScale() {
    return bppScale;
  }  

  public void setBppScale(Integer bppScale) {
    this.bppScale = bppScale;
  }

  public RdOptimizerSettings bppMax(Double bppMax) {
    this.bppMax = bppMax;
    return this;
  }

  /**
   * Get bppMax
   * @return bppMax
  **/
  public Double getBppMax() {
    return bppMax;
  }  

  public void setBppMax(Double bppMax) {
    this.bppMax = bppMax;
  }

  public RdOptimizerSettings maxQ(Integer maxQ) {
    this.maxQ = maxQ;
    return this;
  }

  /**
   * Get maxQ
   * @return maxQ
  **/
  public Integer getMaxQ() {
    return maxQ;
  }  

  public void setMaxQ(Integer maxQ) {
    this.maxQ = maxQ;
  }

  public RdOptimizerSettings minQ(Integer minQ) {
    this.minQ = minQ;
    return this;
  }

  /**
   * Get minQ
   * @return minQ
  **/
  public Integer getMinQ() {
    return minQ;
  }  

  public void setMinQ(Integer minQ) {
    this.minQ = minQ;
  }

  public RdOptimizerSettings maxPixelValue(Integer maxPixelValue) {
    this.maxPixelValue = maxPixelValue;
    return this;
  }

  /**
   * Get maxPixelValue
   * @return maxPixelValue
  **/
  public Integer getMaxPixelValue() {
    return maxPixelValue;
  }  

  public void setMaxPixelValue(Integer maxPixelValue) {
    this.maxPixelValue = maxPixelValue;
  }

  public RdOptimizerSettings psnrMax(Integer psnrMax) {
    this.psnrMax = psnrMax;
    return this;
  }

  /**
   * Get psnrMax
   * @return psnrMax
  **/
  public Integer getPsnrMax() {
    return psnrMax;
  }  

  public void setPsnrMax(Integer psnrMax) {
    this.psnrMax = psnrMax;
  }

  public RdOptimizerSettings discretizedBppMax(Integer discretizedBppMax) {
    this.discretizedBppMax = discretizedBppMax;
    return this;
  }

  /**
   * Get discretizedBppMax
   * @return discretizedBppMax
  **/
  public Integer getDiscretizedBppMax() {
    return discretizedBppMax;
  }  

  public void setDiscretizedBppMax(Integer discretizedBppMax) {
    this.discretizedBppMax = discretizedBppMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    RdOptimizerSettings rdOptimizerSettings = (RdOptimizerSettings) o;
    return ObjectUtils.equals(this.bppScale, rdOptimizerSettings.bppScale) &&
    ObjectUtils.equals(this.bppMax, rdOptimizerSettings.bppMax) &&
    ObjectUtils.equals(this.maxQ, rdOptimizerSettings.maxQ) &&
    ObjectUtils.equals(this.minQ, rdOptimizerSettings.minQ) &&
    ObjectUtils.equals(this.maxPixelValue, rdOptimizerSettings.maxPixelValue) &&
    ObjectUtils.equals(this.psnrMax, rdOptimizerSettings.psnrMax) &&
    ObjectUtils.equals(this.discretizedBppMax, rdOptimizerSettings.discretizedBppMax);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(bppScale, bppMax, maxQ, minQ, maxPixelValue, psnrMax, discretizedBppMax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RdOptimizerSettings {\n");
    
    sb.append("    bppScale: ").append(toIndentedString(bppScale)).append("\n");
    sb.append("    bppMax: ").append(toIndentedString(bppMax)).append("\n");
    sb.append("    maxQ: ").append(toIndentedString(maxQ)).append("\n");
    sb.append("    minQ: ").append(toIndentedString(minQ)).append("\n");
    sb.append("    maxPixelValue: ").append(toIndentedString(maxPixelValue)).append("\n");
    sb.append("    psnrMax: ").append(toIndentedString(psnrMax)).append("\n");
    sb.append("    discretizedBppMax: ").append(toIndentedString(discretizedBppMax)).append("\n");
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


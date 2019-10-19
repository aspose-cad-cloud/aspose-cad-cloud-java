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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RD optimizer settings class
 */
@ApiModel(description = "RD optimizer settings class")

public class RdOptimizerSettings {
  @SerializedName("BppScale")
  private Integer bppScale = null;

  @SerializedName("BppMax")
  private Double bppMax = null;

  @SerializedName("MaxQ")
  private Integer maxQ = null;

  @SerializedName("MinQ")
  private Integer minQ = null;

  @SerializedName("MaxPixelValue")
  private Integer maxPixelValue = null;

  @SerializedName("PsnrMax")
  private Integer psnrMax = null;

  @SerializedName("DiscretizedBppMax")
  private Integer discretizedBppMax = null;

  public RdOptimizerSettings bppScale(Integer bppScale) {
    this.bppScale = bppScale;
    return this;
  }

   /**
   * Gets or sets the BPP (bits per pixel) scale factor.
   * @return bppScale
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the BPP (bits per pixel) scale factor.")
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
   * Gets or sets the maximum R value for consideration in  in bits per pixel
   * @return bppMax
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the maximum R value for consideration in  in bits per pixel")
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
   * Gets or sets the maximum quantization value.
   * @return maxQ
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the maximum quantization value.")
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
   * Gets the minimum allowed quantization value.
   * @return minQ
  **/
  @ApiModelProperty(required = true, value = "Gets the minimum allowed quantization value.")
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
   * Gets the maximum pixel value.
   * @return maxPixelValue
  **/
  @ApiModelProperty(required = true, value = "Gets the maximum pixel value.")
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
   * Gets the PSNR maximum expected value.
   * @return psnrMax
  **/
  @ApiModelProperty(required = true, value = "Gets the PSNR maximum expected value.")
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
   * Gets the maximum R value for consideration.
   * @return discretizedBppMax
  **/
  @ApiModelProperty(required = true, value = "Gets the maximum R value for consideration.")
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
    return Objects.equals(this.bppScale, rdOptimizerSettings.bppScale) &&
        Objects.equals(this.bppMax, rdOptimizerSettings.bppMax) &&
        Objects.equals(this.maxQ, rdOptimizerSettings.maxQ) &&
        Objects.equals(this.minQ, rdOptimizerSettings.minQ) &&
        Objects.equals(this.maxPixelValue, rdOptimizerSettings.maxPixelValue) &&
        Objects.equals(this.psnrMax, rdOptimizerSettings.psnrMax) &&
        Objects.equals(this.discretizedBppMax, rdOptimizerSettings.discretizedBppMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bppScale, bppMax, maxQ, minQ, maxPixelValue, psnrMax, discretizedBppMax);
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


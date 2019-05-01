/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CadResponse.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
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
package com.aspose.cad.cloud.sdk.stablemodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.aspose.cad.cloud.sdk.stablemodel.SaaSposeResponse;

/**
 * Represents information about image.
 */
public class CadResponse extends SaaSposeResponse {
  @JsonProperty("Height")
  private Integer height = null;

  @JsonProperty("Width")
  private Integer width = null;

  @JsonProperty("BitsPerPixel")
  private Integer bitsPerPixel = null;

  @JsonProperty("HorizontalResolution")
  private Double horizontalResolution = null;

  @JsonProperty("VerticalResolution")
  private Double verticalResolution = null;

  @JsonProperty("IsCached")
  private Boolean isCached = null;

  public CadResponse height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height of image.
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public CadResponse width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the width of image.
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public CadResponse bitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
    return this;
  }

   /**
   * Gets or sets the bits per pixel for image.
   * @return bitsPerPixel
  **/
  public Integer getBitsPerPixel() {
    return bitsPerPixel;
  }

  public void setBitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
  }

   /**
   * Gets or sets the horizontal resolution of an image.
   * @return horizontalResolution
  **/
  public Double getHorizontalResolution() {
    return horizontalResolution;
  }

  public void setHorizontalResolution(Double horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public CadResponse verticalResolution(Double verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

   /**
   * Gets or sets the vertical resolution of an image.
   * @return verticalResolution
  **/
  public Double getVerticalResolution() {
    return verticalResolution;
  }

  public void setVerticalResolution(Double verticalResolution) {
    this.verticalResolution = verticalResolution;
  }

  public CadResponse isCached(Boolean isCached) {
    this.isCached = isCached;
    return this;
  }

   /**
   * Gets or sets a value indicating whether image is cached.
   * @return isCached
  **/
  public Boolean isIsCached() {
    return isCached;
  }

  public void setIsCached(Boolean isCached) {
    this.isCached = isCached;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadResponse CadResponse = (CadResponse) o;
    return Objects.equals(this.height, CadResponse.height) &&
        Objects.equals(this.width, CadResponse.width) &&
        Objects.equals(this.bitsPerPixel, CadResponse.bitsPerPixel) &&
        Objects.equals(this.horizontalResolution, CadResponse.horizontalResolution) &&
        Objects.equals(this.verticalResolution, CadResponse.verticalResolution) &&
        Objects.equals(this.isCached, CadResponse.isCached) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, bitsPerPixel, horizontalResolution, verticalResolution, isCached, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    bitsPerPixel: ").append(toIndentedString(bitsPerPixel)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
    sb.append("    isCached: ").append(toIndentedString(isCached)).append("\n");
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


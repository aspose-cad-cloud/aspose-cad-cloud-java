/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GifOptionsDTO.java">
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
 * Export options for GIF format
 */
public class GifOptionsDTO extends DrawingOptionsBaseDTO {
  @JsonProperty("doPaletteCorrection")
  private Boolean doPaletteCorrection = null;

  @JsonProperty("colorResolution")
  private Integer colorResolution = null;

  @JsonProperty("isPaletteSorted")
  private Boolean isPaletteSorted = null;

  @JsonProperty("pixelAspectRatio")
  private Integer pixelAspectRatio = null;

  @JsonProperty("backgroundColorIndex")
  private Integer backgroundColorIndex = null;

  @JsonProperty("hasTrailer")
  private Boolean hasTrailer = null;

  @JsonProperty("interlaced")
  private Boolean interlaced = null;

  public GifOptionsDTO doPaletteCorrection(Boolean doPaletteCorrection) {
    this.doPaletteCorrection = doPaletteCorrection;
    return this;
  }

  /**
   * Determines whether to do auto-correction of a palette
   * @return doPaletteCorrection
  **/
  public Boolean isDoPaletteCorrection() {
    return doPaletteCorrection;
  }  

  public void setDoPaletteCorrection(Boolean doPaletteCorrection) {
    this.doPaletteCorrection = doPaletteCorrection;
  }

  public GifOptionsDTO colorResolution(Integer colorResolution) {
    this.colorResolution = colorResolution;
    return this;
  }

  /**
   * Color resolution
   * @return colorResolution
  **/
  public Integer getColorResolution() {
    return colorResolution;
  }  

  public void setColorResolution(Integer colorResolution) {
    this.colorResolution = colorResolution;
  }

  public GifOptionsDTO isPaletteSorted(Boolean isPaletteSorted) {
    this.isPaletteSorted = isPaletteSorted;
    return this;
  }

  /**
   * Determines whether a palette is sorted
   * @return isPaletteSorted
  **/
  public Boolean isIsPaletteSorted() {
    return isPaletteSorted;
  }  

  public void setIsPaletteSorted(Boolean isPaletteSorted) {
    this.isPaletteSorted = isPaletteSorted;
  }

  public GifOptionsDTO pixelAspectRatio(Integer pixelAspectRatio) {
    this.pixelAspectRatio = pixelAspectRatio;
    return this;
  }

  /**
   * Pixel aspect ration
   * @return pixelAspectRatio
  **/
  public Integer getPixelAspectRatio() {
    return pixelAspectRatio;
  }  

  public void setPixelAspectRatio(Integer pixelAspectRatio) {
    this.pixelAspectRatio = pixelAspectRatio;
  }

  public GifOptionsDTO backgroundColorIndex(Integer backgroundColorIndex) {
    this.backgroundColorIndex = backgroundColorIndex;
    return this;
  }

  /**
   * Background color index
   * @return backgroundColorIndex
  **/
  public Integer getBackgroundColorIndex() {
    return backgroundColorIndex;
  }  

  public void setBackgroundColorIndex(Integer backgroundColorIndex) {
    this.backgroundColorIndex = backgroundColorIndex;
  }

  public GifOptionsDTO hasTrailer(Boolean hasTrailer) {
    this.hasTrailer = hasTrailer;
    return this;
  }

  /**
   * Determines whether image has to have a trailer
   * @return hasTrailer
  **/
  public Boolean isHasTrailer() {
    return hasTrailer;
  }  

  public void setHasTrailer(Boolean hasTrailer) {
    this.hasTrailer = hasTrailer;
  }

  public GifOptionsDTO interlaced(Boolean interlaced) {
    this.interlaced = interlaced;
    return this;
  }

  /**
   * Determines whether an image has to be interlaced
   * @return interlaced
  **/
  public Boolean isInterlaced() {
    return interlaced;
  }  

  public void setInterlaced(Boolean interlaced) {
    this.interlaced = interlaced;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GifOptionsDTO gifOptionsDTO = (GifOptionsDTO) o;
    return ObjectUtils.equals(this.doPaletteCorrection, gifOptionsDTO.doPaletteCorrection) &&
    ObjectUtils.equals(this.colorResolution, gifOptionsDTO.colorResolution) &&
    ObjectUtils.equals(this.isPaletteSorted, gifOptionsDTO.isPaletteSorted) &&
    ObjectUtils.equals(this.pixelAspectRatio, gifOptionsDTO.pixelAspectRatio) &&
    ObjectUtils.equals(this.backgroundColorIndex, gifOptionsDTO.backgroundColorIndex) &&
    ObjectUtils.equals(this.hasTrailer, gifOptionsDTO.hasTrailer) &&
    ObjectUtils.equals(this.interlaced, gifOptionsDTO.interlaced) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(doPaletteCorrection, colorResolution, isPaletteSorted, pixelAspectRatio, backgroundColorIndex, hasTrailer, interlaced, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GifOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    doPaletteCorrection: ").append(toIndentedString(doPaletteCorrection)).append("\n");
    sb.append("    colorResolution: ").append(toIndentedString(colorResolution)).append("\n");
    sb.append("    isPaletteSorted: ").append(toIndentedString(isPaletteSorted)).append("\n");
    sb.append("    pixelAspectRatio: ").append(toIndentedString(pixelAspectRatio)).append("\n");
    sb.append("    backgroundColorIndex: ").append(toIndentedString(backgroundColorIndex)).append("\n");
    sb.append("    hasTrailer: ").append(toIndentedString(hasTrailer)).append("\n");
    sb.append("    interlaced: ").append(toIndentedString(interlaced)).append("\n");
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


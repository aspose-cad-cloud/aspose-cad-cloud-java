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
import com.aspose.cad.cloud.model.ImageOptionsBaseDTO;
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
 * Export options for GIF format
 */
@ApiModel(description = "Export options for GIF format")

public class GifOptionsDTO extends ImageOptionsBaseDTO {
  @SerializedName("DoPaletteCorrection")
  private Boolean doPaletteCorrection = null;

  @SerializedName("ColorResolution")
  private Integer colorResolution = null;

  @SerializedName("IsPaletteSorted")
  private Boolean isPaletteSorted = null;

  @SerializedName("PixelAspectRatio")
  private Integer pixelAspectRatio = null;

  @SerializedName("BackgroundColorIndex")
  private Integer backgroundColorIndex = null;

  @SerializedName("HasTrailer")
  private Boolean hasTrailer = null;

  @SerializedName("Interlaced")
  private Boolean interlaced = null;

  public GifOptionsDTO doPaletteCorrection(Boolean doPaletteCorrection) {
    this.doPaletteCorrection = doPaletteCorrection;
    return this;
  }

   /**
   * Determines whether to do auto-correction of a palette
   * @return doPaletteCorrection
  **/
  @ApiModelProperty(required = true, value = "Determines whether to do auto-correction of a palette")
  public Boolean isisDoPaletteCorrection() {
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
  @ApiModelProperty(required = true, value = "Color resolution")
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
  @ApiModelProperty(required = true, value = "Determines whether a palette is sorted")
  public Boolean isisIsPaletteSorted() {
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
  @ApiModelProperty(required = true, value = "Pixel aspect ration")
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
  @ApiModelProperty(required = true, value = "Background color index")
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
  @ApiModelProperty(required = true, value = "Determines whether image has to have a trailer")
  public Boolean isisHasTrailer() {
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
  @ApiModelProperty(required = true, value = "Determines whether an image has to be interlaced")
  public Boolean isisInterlaced() {
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
    return Objects.equals(this.doPaletteCorrection, gifOptionsDTO.doPaletteCorrection) &&
        Objects.equals(this.colorResolution, gifOptionsDTO.colorResolution) &&
        Objects.equals(this.isPaletteSorted, gifOptionsDTO.isPaletteSorted) &&
        Objects.equals(this.pixelAspectRatio, gifOptionsDTO.pixelAspectRatio) &&
        Objects.equals(this.backgroundColorIndex, gifOptionsDTO.backgroundColorIndex) &&
        Objects.equals(this.hasTrailer, gifOptionsDTO.hasTrailer) &&
        Objects.equals(this.interlaced, gifOptionsDTO.interlaced) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doPaletteCorrection, colorResolution, isPaletteSorted, pixelAspectRatio, backgroundColorIndex, hasTrailer, interlaced, super.hashCode());
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


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
import com.aspose.cad.cloud.model.Color;
import com.aspose.cad.cloud.model.GraphicsOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Base raster export options class
 */
@ApiModel(description = "Base raster export options class")


public class VectorRasterizationOptionsDTO {
  @SerializedName("BorderX")
  private Double borderX = null;

  @SerializedName("BorderY")
  private Double borderY = null;

  @SerializedName("PageHeight")
  private Double pageHeight = null;

  @SerializedName("PageWidth")
  private Double pageWidth = null;

  @SerializedName("BackgroundColor")
  private Color backgroundColor = null;

  @SerializedName("DrawColor")
  private Color drawColor = null;

  /**
   * Gets or Sets unitType
   */
  @JsonAdapter(UnitTypeEnum.Adapter.class)
  public enum UnitTypeEnum {
    KILOMETER("Kilometer"),
    
    METER("Meter"),
    
    CENTIMENTER("Centimenter"),
    
    MILLIMETER("Millimeter"),
    
    MICROMETER("Micrometer"),
    
    NANOMETER("Nanometer"),
    
    ANGSTROM("Angstrom"),
    
    DECIMETER("Decimeter"),
    
    DECAMETER("Decameter"),
    
    HECTOMETER("Hectometer"),
    
    GIGAMETER("Gigameter"),
    
    ASTRONOMICALUNIT("AstronomicalUnit"),
    
    LIGHTYEAR("LightYear"),
    
    PARSEC("Parsec"),
    
    MILE("Mile"),
    
    YARD("Yard"),
    
    FOOT("Foot"),
    
    INCH("Inch"),
    
    MIL("Mil"),
    
    MICROINCH("MicroInch"),
    
    CUSTOM("Custom"),
    
    UNITLESS("Unitless");

    private String value;

    UnitTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitTypeEnum fromValue(String text) {
      for (UnitTypeEnum b : UnitTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UnitTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UnitTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("UnitType")
  private UnitTypeEnum unitType = null;

  @SerializedName("ContentAsBitmap")
  private Boolean contentAsBitmap = null;

  @SerializedName("GraphicsOptions")
  private GraphicsOptions graphicsOptions = null;

  public VectorRasterizationOptionsDTO borderX(Double borderX) {
    this.borderX = borderX;
    return this;
  }

   /**
   * Gets or sets the border X.
   * @return borderX
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the border X.")
  public Double getBorderX() {
    return borderX;
  }

  public void setBorderX(Double borderX) {
    this.borderX = borderX;
  }

  public VectorRasterizationOptionsDTO borderY(Double borderY) {
    this.borderY = borderY;
    return this;
  }

   /**
   * Gets or sets the border Y.
   * @return borderY
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the border Y.")
  public Double getBorderY() {
    return borderY;
  }

  public void setBorderY(Double borderY) {
    this.borderY = borderY;
  }

  public VectorRasterizationOptionsDTO pageHeight(Double pageHeight) {
    this.pageHeight = pageHeight;
    return this;
  }

   /**
   * Gets or sets the page height.
   * @return pageHeight
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the page height.")
  public Double getPageHeight() {
    return pageHeight;
  }

  public void setPageHeight(Double pageHeight) {
    this.pageHeight = pageHeight;
  }

  public VectorRasterizationOptionsDTO pageWidth(Double pageWidth) {
    this.pageWidth = pageWidth;
    return this;
  }

   /**
   * Gets or sets the page width.
   * @return pageWidth
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the page width.")
  public Double getPageWidth() {
    return pageWidth;
  }

  public void setPageWidth(Double pageWidth) {
    this.pageWidth = pageWidth;
  }

  public VectorRasterizationOptionsDTO backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets a background color.
   * @return backgroundColor
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a background color.")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public VectorRasterizationOptionsDTO drawColor(Color drawColor) {
    this.drawColor = drawColor;
    return this;
  }

   /**
   * Gets or sets a foreground color.
   * @return drawColor
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a foreground color.")
  public Color getDrawColor() {
    return drawColor;
  }

  public void setDrawColor(Color drawColor) {
    this.drawColor = drawColor;
  }

  public VectorRasterizationOptionsDTO unitType(UnitTypeEnum unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @ApiModelProperty(required = true, value = "")
  public UnitTypeEnum getUnitType() {
    return unitType;
  }

  public void setUnitType(UnitTypeEnum unitType) {
    this.unitType = unitType;
  }

  public VectorRasterizationOptionsDTO contentAsBitmap(Boolean contentAsBitmap) {
    this.contentAsBitmap = contentAsBitmap;
    return this;
  }

   /**
   * Gets or sets a value indicating whether content of a drawing is represented as image inside Pdf. Applicable only for CAD to Pdf export. Default is false.
   * @return contentAsBitmap
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether content of a drawing is represented as image inside Pdf. Applicable only for CAD to Pdf export. Default is false.")
  public Boolean isisContentAsBitmap() {
    return contentAsBitmap;
  }

  public void setContentAsBitmap(Boolean contentAsBitmap) {
    this.contentAsBitmap = contentAsBitmap;
  }

  public VectorRasterizationOptionsDTO graphicsOptions(GraphicsOptions graphicsOptions) {
    this.graphicsOptions = graphicsOptions;
    return this;
  }

   /**
   * Gets or sets options to render bitmap inside pdf (if ContentAsBitmap is set to true).
   * @return graphicsOptions
  **/
  @ApiModelProperty(value = "Gets or sets options to render bitmap inside pdf (if ContentAsBitmap is set to true).")
  public GraphicsOptions getGraphicsOptions() {
    return graphicsOptions;
  }

  public void setGraphicsOptions(GraphicsOptions graphicsOptions) {
    this.graphicsOptions = graphicsOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorRasterizationOptionsDTO vectorRasterizationOptionsDTO = (VectorRasterizationOptionsDTO) o;
    return Objects.equals(this.borderX, vectorRasterizationOptionsDTO.borderX) &&
        Objects.equals(this.borderY, vectorRasterizationOptionsDTO.borderY) &&
        Objects.equals(this.pageHeight, vectorRasterizationOptionsDTO.pageHeight) &&
        Objects.equals(this.pageWidth, vectorRasterizationOptionsDTO.pageWidth) &&
        Objects.equals(this.backgroundColor, vectorRasterizationOptionsDTO.backgroundColor) &&
        Objects.equals(this.drawColor, vectorRasterizationOptionsDTO.drawColor) &&
        Objects.equals(this.unitType, vectorRasterizationOptionsDTO.unitType) &&
        Objects.equals(this.contentAsBitmap, vectorRasterizationOptionsDTO.contentAsBitmap) &&
        Objects.equals(this.graphicsOptions, vectorRasterizationOptionsDTO.graphicsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderX, borderY, pageHeight, pageWidth, backgroundColor, drawColor, unitType, contentAsBitmap, graphicsOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorRasterizationOptionsDTO {\n");
    
    sb.append("    borderX: ").append(toIndentedString(borderX)).append("\n");
    sb.append("    borderY: ").append(toIndentedString(borderY)).append("\n");
    sb.append("    pageHeight: ").append(toIndentedString(pageHeight)).append("\n");
    sb.append("    pageWidth: ").append(toIndentedString(pageWidth)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    drawColor: ").append(toIndentedString(drawColor)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    contentAsBitmap: ").append(toIndentedString(contentAsBitmap)).append("\n");
    sb.append("    graphicsOptions: ").append(toIndentedString(graphicsOptions)).append("\n");
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


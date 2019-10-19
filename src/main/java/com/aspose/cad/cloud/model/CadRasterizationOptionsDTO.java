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
import com.aspose.cad.cloud.model.Color;
import com.aspose.cad.cloud.model.GraphicsOptions;
import com.aspose.cad.cloud.model.PenOptions;
import com.aspose.cad.cloud.model.VectorRasterizationOptionsDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Raster export options
 */
@ApiModel(description = "Raster export options")

public class CadRasterizationOptionsDTO extends VectorRasterizationOptionsDTO {
  @SerializedName("Zoom")
  private Double zoom = null;

  @SerializedName("PenOptions")
  private PenOptions penOptions = null;

  @SerializedName("AutomaticLayoutsScaling")
  private Boolean automaticLayoutsScaling = null;

  @SerializedName("Layers")
  private List<String> layers = null;

  @SerializedName("Layouts")
  private List<String> layouts = null;

  /**
   * Drawing mode
   */
  @JsonAdapter(DrawTypeEnum.Adapter.class)
  public enum DrawTypeEnum {
    USEDRAWCOLOR("UseDrawColor"),
    
    USEOBJECTCOLOR("UseObjectColor");

    private String value;

    DrawTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DrawTypeEnum fromValue(String text) {
      for (DrawTypeEnum b : DrawTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DrawTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DrawTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DrawTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DrawTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DrawType")
  private DrawTypeEnum drawType = null;

  @SerializedName("NoScaling")
  private Boolean noScaling = null;

  public CadRasterizationOptionsDTO zoom(Double zoom) {
    this.zoom = zoom;
    return this;
  }

   /**
   * Zoom factor
   * @return zoom
  **/
  @ApiModelProperty(required = true, value = "Zoom factor")
  public Double getZoom() {
    return zoom;
  }

  public void setZoom(Double zoom) {
    this.zoom = zoom;
  }

  public CadRasterizationOptionsDTO penOptions(PenOptions penOptions) {
    this.penOptions = penOptions;
    return this;
  }

   /**
   * Pen options
   * @return penOptions
  **/
  @ApiModelProperty(value = "Pen options")
  public PenOptions getPenOptions() {
    return penOptions;
  }

  public void setPenOptions(PenOptions penOptions) {
    this.penOptions = penOptions;
  }

  public CadRasterizationOptionsDTO automaticLayoutsScaling(Boolean automaticLayoutsScaling) {
    this.automaticLayoutsScaling = automaticLayoutsScaling;
    return this;
  }

   /**
   * Determines whether layout has to be scaled automatically
   * @return automaticLayoutsScaling
  **/
  @ApiModelProperty(required = true, value = "Determines whether layout has to be scaled automatically")
  public Boolean isisAutomaticLayoutsScaling() {
    return automaticLayoutsScaling;
  }

  public void setAutomaticLayoutsScaling(Boolean automaticLayoutsScaling) {
    this.automaticLayoutsScaling = automaticLayoutsScaling;
  }

  public CadRasterizationOptionsDTO layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public CadRasterizationOptionsDTO addLayersItem(String layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<String>();
    }
    this.layers.add(layersItem);
    return this;
  }

   /**
   * Layers to export
   * @return layers
  **/
  @ApiModelProperty(value = "Layers to export")
  public List<String> getLayers() {
    return layers;
  }

  public void setLayers(List<String> layers) {
    this.layers = layers;
  }

  public CadRasterizationOptionsDTO layouts(List<String> layouts) {
    this.layouts = layouts;
    return this;
  }

  public CadRasterizationOptionsDTO addLayoutsItem(String layoutsItem) {
    if (this.layouts == null) {
      this.layouts = new ArrayList<String>();
    }
    this.layouts.add(layoutsItem);
    return this;
  }

   /**
   * Layouts to export
   * @return layouts
  **/
  @ApiModelProperty(value = "Layouts to export")
  public List<String> getLayouts() {
    return layouts;
  }

  public void setLayouts(List<String> layouts) {
    this.layouts = layouts;
  }

  public CadRasterizationOptionsDTO drawType(DrawTypeEnum drawType) {
    this.drawType = drawType;
    return this;
  }

   /**
   * Drawing mode
   * @return drawType
  **/
  @ApiModelProperty(required = true, value = "Drawing mode")
  public DrawTypeEnum getDrawType() {
    return drawType;
  }

  public void setDrawType(DrawTypeEnum drawType) {
    this.drawType = drawType;
  }

  public CadRasterizationOptionsDTO noScaling(Boolean noScaling) {
    this.noScaling = noScaling;
    return this;
  }

   /**
   * Determines whether scaling has to be turned off
   * @return noScaling
  **/
  @ApiModelProperty(required = true, value = "Determines whether scaling has to be turned off")
  public Boolean isisNoScaling() {
    return noScaling;
  }

  public void setNoScaling(Boolean noScaling) {
    this.noScaling = noScaling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadRasterizationOptionsDTO cadRasterizationOptionsDTO = (CadRasterizationOptionsDTO) o;
    return Objects.equals(this.zoom, cadRasterizationOptionsDTO.zoom) &&
        Objects.equals(this.penOptions, cadRasterizationOptionsDTO.penOptions) &&
        Objects.equals(this.automaticLayoutsScaling, cadRasterizationOptionsDTO.automaticLayoutsScaling) &&
        Objects.equals(this.layers, cadRasterizationOptionsDTO.layers) &&
        Objects.equals(this.layouts, cadRasterizationOptionsDTO.layouts) &&
        Objects.equals(this.drawType, cadRasterizationOptionsDTO.drawType) &&
        Objects.equals(this.noScaling, cadRasterizationOptionsDTO.noScaling) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoom, penOptions, automaticLayoutsScaling, layers, layouts, drawType, noScaling, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadRasterizationOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
    sb.append("    penOptions: ").append(toIndentedString(penOptions)).append("\n");
    sb.append("    automaticLayoutsScaling: ").append(toIndentedString(automaticLayoutsScaling)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    layouts: ").append(toIndentedString(layouts)).append("\n");
    sb.append("    drawType: ").append(toIndentedString(drawType)).append("\n");
    sb.append("    noScaling: ").append(toIndentedString(noScaling)).append("\n");
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


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CadRasterizationOptionsDTO.java">
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
 * Raster export options
 */
public class CadRasterizationOptionsDTO extends VectorRasterizationOptionsDTO {
  @JsonProperty("zoom")
  private Double zoom = null;

  @JsonProperty("penOptions")
  private PenOptions penOptions = null;

  @JsonProperty("automaticLayoutsScaling")
  private Boolean automaticLayoutsScaling = null;

  @JsonProperty("layers")
  private List<String> layers = null;

  @JsonProperty("layouts")
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

  @JsonProperty("drawType")
  private DrawTypeEnum drawType = null;

  @JsonProperty("noScaling")
  private Boolean noScaling = null;

  public CadRasterizationOptionsDTO zoom(Double zoom) {
    this.zoom = zoom;
    return this;
  }

  /**
   * Zoom factor
   * @return zoom
  **/
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
  public Boolean isAutomaticLayoutsScaling() {
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
  public Boolean isNoScaling() {
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
    return ObjectUtils.equals(this.zoom, cadRasterizationOptionsDTO.zoom) &&
    ObjectUtils.equals(this.penOptions, cadRasterizationOptionsDTO.penOptions) &&
    ObjectUtils.equals(this.automaticLayoutsScaling, cadRasterizationOptionsDTO.automaticLayoutsScaling) &&
    ObjectUtils.equals(this.layers, cadRasterizationOptionsDTO.layers) &&
    ObjectUtils.equals(this.layouts, cadRasterizationOptionsDTO.layouts) &&
    ObjectUtils.equals(this.drawType, cadRasterizationOptionsDTO.drawType) &&
    ObjectUtils.equals(this.noScaling, cadRasterizationOptionsDTO.noScaling) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(zoom, penOptions, automaticLayoutsScaling, layers, layouts, drawType, noScaling, super.hashCode());
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


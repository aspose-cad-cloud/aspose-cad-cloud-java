/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DrawingOptionsBaseDTO.java">
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
 * Image options base class
 */
public class DrawingOptionsBaseDTO {
  /**
   * Resulting rotation operation
   */
  @JsonAdapter(RotationEnum.Adapter.class)
  public enum RotationEnum {
    ROTATENONEFLIPNONE("RotateNoneFlipNone"),
    
    ROTATE90FLIPNONE("Rotate90FlipNone"),
    
    ROTATE180FLIPNONE("Rotate180FlipNone"),
    
    ROTATE270FLIPNONE("Rotate270FlipNone"),
    
    ROTATENONEFLIPX("RotateNoneFlipX"),
    
    ROTATE90FLIPX("Rotate90FlipX"),
    
    ROTATE180FLIPX("Rotate180FlipX"),
    
    ROTATE270FLIPX("Rotate270FlipX"),
    
    ROTATENONEFLIPY("RotateNoneFlipY"),
    
    ROTATE90FLIPY("Rotate90FlipY"),
    
    ROTATE180FLIPY("Rotate180FlipY"),
    
    ROTATE270FLIPY("Rotate270FlipY"),
    
    ROTATENONEFLIPXY("RotateNoneFlipXY"),
    
    ROTATE90FLIPXY("Rotate90FlipXY"),
    
    ROTATE180FLIPXY("Rotate180FlipXY"),
    
    ROTATE270FLIPXY("Rotate270FlipXY");

    private String value;

    RotationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RotationEnum fromValue(String text) {
      for (RotationEnum b : RotationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RotationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RotationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RotationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RotationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("rotation")
  private RotationEnum rotation = null;

  @JsonProperty("layers")
  private List<String> layers = null;

  @JsonProperty("resolutionSettings")
  private ResolutionSetting resolutionSettings = null;

  @JsonProperty("vectorRasterizationOptions")
  private CadRasterizationOptionsDTO vectorRasterizationOptions = null;

  public DrawingOptionsBaseDTO rotation(RotationEnum rotation) {
    this.rotation = rotation;
    return this;
  }

  /**
   * Resulting rotation operation
   * @return rotation
  **/
  public RotationEnum getRotation() {
    return rotation;
  }  

  public void setRotation(RotationEnum rotation) {
    this.rotation = rotation;
  }

  public DrawingOptionsBaseDTO layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public DrawingOptionsBaseDTO addLayersItem(String layersItem) {
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

  public DrawingOptionsBaseDTO resolutionSettings(ResolutionSetting resolutionSettings) {
    this.resolutionSettings = resolutionSettings;
    return this;
  }

  /**
   * DPI resolution settings
   * @return resolutionSettings
  **/
  public ResolutionSetting getResolutionSettings() {
    return resolutionSettings;
  }  

  public void setResolutionSettings(ResolutionSetting resolutionSettings) {
    this.resolutionSettings = resolutionSettings;
  }

  public DrawingOptionsBaseDTO vectorRasterizationOptions(CadRasterizationOptionsDTO vectorRasterizationOptions) {
    this.vectorRasterizationOptions = vectorRasterizationOptions;
    return this;
  }

  /**
   * Raster options
   * @return vectorRasterizationOptions
  **/
  public CadRasterizationOptionsDTO getVectorRasterizationOptions() {
    return vectorRasterizationOptions;
  }  

  public void setVectorRasterizationOptions(CadRasterizationOptionsDTO vectorRasterizationOptions) {
    this.vectorRasterizationOptions = vectorRasterizationOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DrawingOptionsBaseDTO drawingOptionsBaseDTO = (DrawingOptionsBaseDTO) o;
    return ObjectUtils.equals(this.rotation, drawingOptionsBaseDTO.rotation) &&
    ObjectUtils.equals(this.layers, drawingOptionsBaseDTO.layers) &&
    ObjectUtils.equals(this.resolutionSettings, drawingOptionsBaseDTO.resolutionSettings) &&
    ObjectUtils.equals(this.vectorRasterizationOptions, drawingOptionsBaseDTO.vectorRasterizationOptions);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(rotation, layers, resolutionSettings, vectorRasterizationOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingOptionsBaseDTO {\n");
    
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    resolutionSettings: ").append(toIndentedString(resolutionSettings)).append("\n");
    sb.append("    vectorRasterizationOptions: ").append(toIndentedString(vectorRasterizationOptions)).append("\n");
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


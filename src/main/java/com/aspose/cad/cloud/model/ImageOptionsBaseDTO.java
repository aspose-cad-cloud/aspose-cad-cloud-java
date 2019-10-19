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
import com.aspose.cad.cloud.model.ResolutionSetting;
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
 * Image options base class
 */
@ApiModel(description = "Image options base class")


public class ImageOptionsBaseDTO {
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

  @SerializedName("Rotation")
  private RotationEnum rotation = null;

  @SerializedName("Layers")
  private List<String> layers = null;

  @SerializedName("ResolutionSettings")
  private ResolutionSetting resolutionSettings = null;

  @SerializedName("VectorRasterizationOptions")
  private CadRasterizationOptionsDTO vectorRasterizationOptions = null;

  public ImageOptionsBaseDTO rotation(RotationEnum rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * Resulting rotation operation
   * @return rotation
  **/
  @ApiModelProperty(required = true, value = "Resulting rotation operation")
  public RotationEnum getRotation() {
    return rotation;
  }

  public void setRotation(RotationEnum rotation) {
    this.rotation = rotation;
  }

  public ImageOptionsBaseDTO layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public ImageOptionsBaseDTO addLayersItem(String layersItem) {
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

  public ImageOptionsBaseDTO resolutionSettings(ResolutionSetting resolutionSettings) {
    this.resolutionSettings = resolutionSettings;
    return this;
  }

   /**
   * DPI resolution settings
   * @return resolutionSettings
  **/
  @ApiModelProperty(value = "DPI resolution settings")
  public ResolutionSetting getResolutionSettings() {
    return resolutionSettings;
  }

  public void setResolutionSettings(ResolutionSetting resolutionSettings) {
    this.resolutionSettings = resolutionSettings;
  }

  public ImageOptionsBaseDTO vectorRasterizationOptions(CadRasterizationOptionsDTO vectorRasterizationOptions) {
    this.vectorRasterizationOptions = vectorRasterizationOptions;
    return this;
  }

   /**
   * Raster options
   * @return vectorRasterizationOptions
  **/
  @ApiModelProperty(value = "Raster options")
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
    ImageOptionsBaseDTO imageOptionsBaseDTO = (ImageOptionsBaseDTO) o;
    return Objects.equals(this.rotation, imageOptionsBaseDTO.rotation) &&
        Objects.equals(this.layers, imageOptionsBaseDTO.layers) &&
        Objects.equals(this.resolutionSettings, imageOptionsBaseDTO.resolutionSettings) &&
        Objects.equals(this.vectorRasterizationOptions, imageOptionsBaseDTO.vectorRasterizationOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotation, layers, resolutionSettings, vectorRasterizationOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageOptionsBaseDTO {\n");
    
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


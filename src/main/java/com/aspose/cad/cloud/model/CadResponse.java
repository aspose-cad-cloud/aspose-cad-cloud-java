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
import com.aspose.cad.cloud.model.Cff2Properties;
import com.aspose.cad.cloud.model.DgnProperties;
import com.aspose.cad.cloud.model.DwfProperties;
import com.aspose.cad.cloud.model.DwgProperties;
import com.aspose.cad.cloud.model.DxfProperties;
import com.aspose.cad.cloud.model.IfcProperties;
import com.aspose.cad.cloud.model.IgsProperties;
import com.aspose.cad.cloud.model.StlProperties;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents information about a drawing.
 */
@ApiModel(description = "Represents information about a drawing.")

public class CadResponse {
  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("DwgProperties")
  private DwgProperties dwgProperties = null;

  @SerializedName("DxfProperties")
  private DxfProperties dxfProperties = null;

  @SerializedName("DwtProperties")
  private DwgProperties dwtProperties = null;

  @SerializedName("DgnProperties")
  private DgnProperties dgnProperties = null;

  @SerializedName("IfcProperties")
  private IfcProperties ifcProperties = null;

  @SerializedName("IgsProperties")
  private IgsProperties igsProperties = null;

  @SerializedName("StlProperties")
  private StlProperties stlProperties = null;

  @SerializedName("DwfProperties")
  private DwfProperties dwfProperties = null;

  @SerializedName("Cff2Properties")
  private Cff2Properties cff2Properties = null;

  public CadResponse height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height of a drawing.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the height of a drawing.")
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
   * Gets or sets the width of a drawing.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the width of a drawing.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public CadResponse dwgProperties(DwgProperties dwgProperties) {
    this.dwgProperties = dwgProperties;
    return this;
  }

   /**
   * Gets or sets the DWG properties.
   * @return dwgProperties
  **/
  @ApiModelProperty(value = "Gets or sets the DWG properties.")
  public DwgProperties getDwgProperties() {
    return dwgProperties;
  }

  public void setDwgProperties(DwgProperties dwgProperties) {
    this.dwgProperties = dwgProperties;
  }

  public CadResponse dxfProperties(DxfProperties dxfProperties) {
    this.dxfProperties = dxfProperties;
    return this;
  }

   /**
   * Gets or sets the DXF properties.
   * @return dxfProperties
  **/
  @ApiModelProperty(value = "Gets or sets the DXF properties.")
  public DxfProperties getDxfProperties() {
    return dxfProperties;
  }

  public void setDxfProperties(DxfProperties dxfProperties) {
    this.dxfProperties = dxfProperties;
  }

  public CadResponse dwtProperties(DwgProperties dwtProperties) {
    this.dwtProperties = dwtProperties;
    return this;
  }

   /**
   * Gets or sets the DWT properties.
   * @return dwtProperties
  **/
  @ApiModelProperty(value = "Gets or sets the DWT properties.")
  public DwgProperties getDwtProperties() {
    return dwtProperties;
  }

  public void setDwtProperties(DwgProperties dwtProperties) {
    this.dwtProperties = dwtProperties;
  }

  public CadResponse dgnProperties(DgnProperties dgnProperties) {
    this.dgnProperties = dgnProperties;
    return this;
  }

   /**
   * Gets or sets the DGN properties.
   * @return dgnProperties
  **/
  @ApiModelProperty(value = "Gets or sets the DGN properties.")
  public DgnProperties getDgnProperties() {
    return dgnProperties;
  }

  public void setDgnProperties(DgnProperties dgnProperties) {
    this.dgnProperties = dgnProperties;
  }

  public CadResponse ifcProperties(IfcProperties ifcProperties) {
    this.ifcProperties = ifcProperties;
    return this;
  }

   /**
   * Gets or sets the IFC properties.
   * @return ifcProperties
  **/
  @ApiModelProperty(value = "Gets or sets the IFC properties.")
  public IfcProperties getIfcProperties() {
    return ifcProperties;
  }

  public void setIfcProperties(IfcProperties ifcProperties) {
    this.ifcProperties = ifcProperties;
  }

  public CadResponse igsProperties(IgsProperties igsProperties) {
    this.igsProperties = igsProperties;
    return this;
  }

   /**
   * Gets or sets the IGS properties.
   * @return igsProperties
  **/
  @ApiModelProperty(value = "Gets or sets the IGS properties.")
  public IgsProperties getIgsProperties() {
    return igsProperties;
  }

  public void setIgsProperties(IgsProperties igsProperties) {
    this.igsProperties = igsProperties;
  }

  public CadResponse stlProperties(StlProperties stlProperties) {
    this.stlProperties = stlProperties;
    return this;
  }

   /**
   * Gets or sets the STL properties.
   * @return stlProperties
  **/
  @ApiModelProperty(value = "Gets or sets the STL properties.")
  public StlProperties getStlProperties() {
    return stlProperties;
  }

  public void setStlProperties(StlProperties stlProperties) {
    this.stlProperties = stlProperties;
  }

  public CadResponse dwfProperties(DwfProperties dwfProperties) {
    this.dwfProperties = dwfProperties;
    return this;
  }

   /**
   * Gets or sets the DWF properties.
   * @return dwfProperties
  **/
  @ApiModelProperty(value = "Gets or sets the DWF properties.")
  public DwfProperties getDwfProperties() {
    return dwfProperties;
  }

  public void setDwfProperties(DwfProperties dwfProperties) {
    this.dwfProperties = dwfProperties;
  }

  public CadResponse cff2Properties(Cff2Properties cff2Properties) {
    this.cff2Properties = cff2Properties;
    return this;
  }

   /**
   * Gets or sets the CFF2 properties.
   * @return cff2Properties
  **/
  @ApiModelProperty(value = "Gets or sets the CFF2 properties.")
  public Cff2Properties getCff2Properties() {
    return cff2Properties;
  }

  public void setCff2Properties(Cff2Properties cff2Properties) {
    this.cff2Properties = cff2Properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadResponse cadResponse = (CadResponse) o;
    return Objects.equals(this.height, cadResponse.height) &&
        Objects.equals(this.width, cadResponse.width) &&
        Objects.equals(this.dwgProperties, cadResponse.dwgProperties) &&
        Objects.equals(this.dxfProperties, cadResponse.dxfProperties) &&
        Objects.equals(this.dwtProperties, cadResponse.dwtProperties) &&
        Objects.equals(this.dgnProperties, cadResponse.dgnProperties) &&
        Objects.equals(this.ifcProperties, cadResponse.ifcProperties) &&
        Objects.equals(this.igsProperties, cadResponse.igsProperties) &&
        Objects.equals(this.stlProperties, cadResponse.stlProperties) &&
        Objects.equals(this.dwfProperties, cadResponse.dwfProperties) &&
        Objects.equals(this.cff2Properties, cadResponse.cff2Properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, dwgProperties, dxfProperties, dwtProperties, dgnProperties, ifcProperties, igsProperties, stlProperties, dwfProperties, cff2Properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadResponse {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    dwgProperties: ").append(toIndentedString(dwgProperties)).append("\n");
    sb.append("    dxfProperties: ").append(toIndentedString(dxfProperties)).append("\n");
    sb.append("    dwtProperties: ").append(toIndentedString(dwtProperties)).append("\n");
    sb.append("    dgnProperties: ").append(toIndentedString(dgnProperties)).append("\n");
    sb.append("    ifcProperties: ").append(toIndentedString(ifcProperties)).append("\n");
    sb.append("    igsProperties: ").append(toIndentedString(igsProperties)).append("\n");
    sb.append("    stlProperties: ").append(toIndentedString(stlProperties)).append("\n");
    sb.append("    dwfProperties: ").append(toIndentedString(dwfProperties)).append("\n");
    sb.append("    cff2Properties: ").append(toIndentedString(cff2Properties)).append("\n");
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


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CadResponse.java">
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
 * Represents information about a drawing.
 */
public class CadResponse {
  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("dwgProperties")
  private DwgProperties dwgProperties = null;

  @JsonProperty("dxfProperties")
  private DxfProperties dxfProperties = null;

  @JsonProperty("dwtProperties")
  private DwgProperties dwtProperties = null;

  @JsonProperty("dgnProperties")
  private DgnProperties dgnProperties = null;

  @JsonProperty("ifcProperties")
  private IfcProperties ifcProperties = null;

  @JsonProperty("igsProperties")
  private IgsProperties igsProperties = null;

  @JsonProperty("stlProperties")
  private StlProperties stlProperties = null;

  @JsonProperty("dwfProperties")
  private DwfProperties dwfProperties = null;

  @JsonProperty("cf2Properties")
  private Cf2Properties cf2Properties = null;

  @JsonProperty("fbxProperties")
  private FbxProperties fbxProperties = null;

  @JsonProperty("objProperties")
  private ObjProperties objProperties = null;

  @JsonProperty("pltProperties")
  private PltProperties pltProperties = null;

  public CadResponse height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Gets or sets the height of a drawing.
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
   * Gets or sets the width of a drawing.
   * @return width
  **/
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
  public DwfProperties getDwfProperties() {
    return dwfProperties;
  }  

  public void setDwfProperties(DwfProperties dwfProperties) {
    this.dwfProperties = dwfProperties;
  }

  public CadResponse cf2Properties(Cf2Properties cf2Properties) {
    this.cf2Properties = cf2Properties;
    return this;
  }

  /**
   * Gets or sets the Cf2 properties.
   * @return cf2Properties
  **/
  public Cf2Properties getCf2Properties() {
    return cf2Properties;
  }  

  public void setCf2Properties(Cf2Properties cf2Properties) {
    this.cf2Properties = cf2Properties;
  }

  public CadResponse fbxProperties(FbxProperties fbxProperties) {
    this.fbxProperties = fbxProperties;
    return this;
  }

  /**
   * Gets or sets the Cf2 properties.
   * @return fbxProperties
  **/
  public FbxProperties getFbxProperties() {
    return fbxProperties;
  }  

  public void setFbxProperties(FbxProperties fbxProperties) {
    this.fbxProperties = fbxProperties;
  }

  public CadResponse objProperties(ObjProperties objProperties) {
    this.objProperties = objProperties;
    return this;
  }

  /**
   * Gets or sets the FBX properties.
   * @return objProperties
  **/
  public ObjProperties getObjProperties() {
    return objProperties;
  }  

  public void setObjProperties(ObjProperties objProperties) {
    this.objProperties = objProperties;
  }

  public CadResponse pltProperties(PltProperties pltProperties) {
    this.pltProperties = pltProperties;
    return this;
  }

  /**
   * Gets or sets the Cf2 properties.
   * @return pltProperties
  **/
  public PltProperties getPltProperties() {
    return pltProperties;
  }  

  public void setPltProperties(PltProperties pltProperties) {
    this.pltProperties = pltProperties;
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
    return ObjectUtils.equals(this.height, cadResponse.height) &&
    ObjectUtils.equals(this.width, cadResponse.width) &&
    ObjectUtils.equals(this.dwgProperties, cadResponse.dwgProperties) &&
    ObjectUtils.equals(this.dxfProperties, cadResponse.dxfProperties) &&
    ObjectUtils.equals(this.dwtProperties, cadResponse.dwtProperties) &&
    ObjectUtils.equals(this.dgnProperties, cadResponse.dgnProperties) &&
    ObjectUtils.equals(this.ifcProperties, cadResponse.ifcProperties) &&
    ObjectUtils.equals(this.igsProperties, cadResponse.igsProperties) &&
    ObjectUtils.equals(this.stlProperties, cadResponse.stlProperties) &&
    ObjectUtils.equals(this.dwfProperties, cadResponse.dwfProperties) &&
    ObjectUtils.equals(this.cf2Properties, cadResponse.cf2Properties) &&
    ObjectUtils.equals(this.fbxProperties, cadResponse.fbxProperties) &&
    ObjectUtils.equals(this.objProperties, cadResponse.objProperties) &&
    ObjectUtils.equals(this.pltProperties, cadResponse.pltProperties);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(height, width, dwgProperties, dxfProperties, dwtProperties, dgnProperties, ifcProperties, igsProperties, stlProperties, dwfProperties, cf2Properties, fbxProperties, objProperties, pltProperties);
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
    sb.append("    cf2Properties: ").append(toIndentedString(cf2Properties)).append("\n");
    sb.append("    fbxProperties: ").append(toIndentedString(fbxProperties)).append("\n");
    sb.append("    objProperties: ").append(toIndentedString(objProperties)).append("\n");
    sb.append("    pltProperties: ").append(toIndentedString(pltProperties)).append("\n");
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


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
import com.aspose.cad.cloud.model.DrawingOptionsBaseDTO;
import com.aspose.cad.cloud.model.PdfDocumentInfo;
import com.aspose.cad.cloud.model.PdfDocumentOptions;
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
 * Export options for PDF format
 */
@ApiModel(description = "Export options for PDF format")

public class PdfOptionsDTO extends DrawingOptionsBaseDTO {
  @SerializedName("PdfDocumentInfo")
  private PdfDocumentInfo pdfDocumentInfo = null;

  @SerializedName("CorePdfOptions")
  private PdfDocumentOptions corePdfOptions = null;

  public PdfOptionsDTO pdfDocumentInfo(PdfDocumentInfo pdfDocumentInfo) {
    this.pdfDocumentInfo = pdfDocumentInfo;
    return this;
  }

   /**
   * Document metadata
   * @return pdfDocumentInfo
  **/
  @ApiModelProperty(value = "Document metadata")
  public PdfDocumentInfo getPdfDocumentInfo() {
    return pdfDocumentInfo;
  }

  public void setPdfDocumentInfo(PdfDocumentInfo pdfDocumentInfo) {
    this.pdfDocumentInfo = pdfDocumentInfo;
  }

  public PdfOptionsDTO corePdfOptions(PdfDocumentOptions corePdfOptions) {
    this.corePdfOptions = corePdfOptions;
    return this;
  }

   /**
   * Core PDF rendering options
   * @return corePdfOptions
  **/
  @ApiModelProperty(value = "Core PDF rendering options")
  public PdfDocumentOptions getCorePdfOptions() {
    return corePdfOptions;
  }

  public void setCorePdfOptions(PdfDocumentOptions corePdfOptions) {
    this.corePdfOptions = corePdfOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfOptionsDTO pdfOptionsDTO = (PdfOptionsDTO) o;
    return Objects.equals(this.pdfDocumentInfo, pdfOptionsDTO.pdfDocumentInfo) &&
        Objects.equals(this.corePdfOptions, pdfOptionsDTO.corePdfOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pdfDocumentInfo, corePdfOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pdfDocumentInfo: ").append(toIndentedString(pdfDocumentInfo)).append("\n");
    sb.append("    corePdfOptions: ").append(toIndentedString(corePdfOptions)).append("\n");
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


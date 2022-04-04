/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PdfDocumentOptions.java">
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
 * PdfDocumentOptions
 */
public class PdfDocumentOptions {
  /**
   * Gets or Sets compliance
   */
  @JsonAdapter(ComplianceEnum.Adapter.class)
  public enum ComplianceEnum {
    PDF15("Pdf15"),
    
    PDFA1A("PdfA1a"),
    
    PDFA1B("PdfA1b");

    private String value;

    ComplianceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComplianceEnum fromValue(String text) {
      for (ComplianceEnum b : ComplianceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComplianceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComplianceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComplianceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComplianceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("compliance")
  private ComplianceEnum compliance = null;

  @JsonProperty("digitalSignatureDetails")
  private PdfDigitalSignatureDetailsCore digitalSignatureDetails = null;

  public PdfDocumentOptions compliance(ComplianceEnum compliance) {
    this.compliance = compliance;
    return this;
  }

  /**
   * Get compliance
   * @return compliance
  **/
  public ComplianceEnum getCompliance() {
    return compliance;
  }  

  public void setCompliance(ComplianceEnum compliance) {
    this.compliance = compliance;
  }

  public PdfDocumentOptions digitalSignatureDetails(PdfDigitalSignatureDetailsCore digitalSignatureDetails) {
    this.digitalSignatureDetails = digitalSignatureDetails;
    return this;
  }

  /**
   * Get digitalSignatureDetails
   * @return digitalSignatureDetails
  **/
  public PdfDigitalSignatureDetailsCore getDigitalSignatureDetails() {
    return digitalSignatureDetails;
  }  

  public void setDigitalSignatureDetails(PdfDigitalSignatureDetailsCore digitalSignatureDetails) {
    this.digitalSignatureDetails = digitalSignatureDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    PdfDocumentOptions pdfDocumentOptions = (PdfDocumentOptions) o;
    return ObjectUtils.equals(this.compliance, pdfDocumentOptions.compliance) &&
    ObjectUtils.equals(this.digitalSignatureDetails, pdfDocumentOptions.digitalSignatureDetails);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(compliance, digitalSignatureDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDocumentOptions {\n");
    
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    digitalSignatureDetails: ").append(toIndentedString(digitalSignatureDetails)).append("\n");
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


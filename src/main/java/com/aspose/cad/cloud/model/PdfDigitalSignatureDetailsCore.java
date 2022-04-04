/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PdfDigitalSignatureDetailsCore.java">
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
 * PdfDigitalSignatureDetailsCore
 */
public class PdfDigitalSignatureDetailsCore {
  @JsonProperty("certificate")
  private X509Certificate2 certificate = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("signatureDate")
  private Date signatureDate = null;

  /**
   * Gets or Sets hashAlgorithm
   */
  @JsonAdapter(HashAlgorithmEnum.Adapter.class)
  public enum HashAlgorithmEnum {
    SHA1("Sha1"),
    
    SHA256("Sha256"),
    
    SHA384("Sha384"),
    
    SHA512("Sha512"),
    
    MD5("Md5");

    private String value;

    HashAlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HashAlgorithmEnum fromValue(String text) {
      for (HashAlgorithmEnum b : HashAlgorithmEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HashAlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HashAlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HashAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HashAlgorithmEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("hashAlgorithm")
  private HashAlgorithmEnum hashAlgorithm = null;

  public PdfDigitalSignatureDetailsCore certificate(X509Certificate2 certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
  **/
  public X509Certificate2 getCertificate() {
    return certificate;
  }  

  public void setCertificate(X509Certificate2 certificate) {
    this.certificate = certificate;
  }

  public PdfDigitalSignatureDetailsCore reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  **/
  public String getReason() {
    return reason;
  }  

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PdfDigitalSignatureDetailsCore location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  public String getLocation() {
    return location;
  }  

  public void setLocation(String location) {
    this.location = location;
  }

  public PdfDigitalSignatureDetailsCore signatureDate(Date signatureDate) {
    this.signatureDate = signatureDate;
    return this;
  }

  /**
   * Get signatureDate
   * @return signatureDate
  **/
  public Date getSignatureDate() {
    return signatureDate;
  }  

  public void setSignatureDate(Date signatureDate) {
    this.signatureDate = signatureDate;
  }

  public PdfDigitalSignatureDetailsCore hashAlgorithm(HashAlgorithmEnum hashAlgorithm) {
    this.hashAlgorithm = hashAlgorithm;
    return this;
  }

  /**
   * Get hashAlgorithm
   * @return hashAlgorithm
  **/
  public HashAlgorithmEnum getHashAlgorithm() {
    return hashAlgorithm;
  }  

  public void setHashAlgorithm(HashAlgorithmEnum hashAlgorithm) {
    this.hashAlgorithm = hashAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    PdfDigitalSignatureDetailsCore pdfDigitalSignatureDetailsCore = (PdfDigitalSignatureDetailsCore) o;
    return ObjectUtils.equals(this.certificate, pdfDigitalSignatureDetailsCore.certificate) &&
    ObjectUtils.equals(this.reason, pdfDigitalSignatureDetailsCore.reason) &&
    ObjectUtils.equals(this.location, pdfDigitalSignatureDetailsCore.location) &&
    ObjectUtils.equals(this.signatureDate, pdfDigitalSignatureDetailsCore.signatureDate) &&
    ObjectUtils.equals(this.hashAlgorithm, pdfDigitalSignatureDetailsCore.hashAlgorithm);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(certificate, reason, location, signatureDate, hashAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDigitalSignatureDetailsCore {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    signatureDate: ").append(toIndentedString(signatureDate)).append("\n");
    sb.append("    hashAlgorithm: ").append(toIndentedString(hashAlgorithm)).append("\n");
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


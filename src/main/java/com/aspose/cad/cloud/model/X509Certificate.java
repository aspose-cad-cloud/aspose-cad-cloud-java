/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="X509Certificate.java">
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
 * X509Certificate
 */
public class X509Certificate {
  @JsonProperty("handle")
  private IntPtr handle = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("subject")
  private String subject = null;

  public X509Certificate handle(IntPtr handle) {
    this.handle = handle;
    return this;
  }

  /**
   * Get handle
   * @return handle
  **/
  public IntPtr getHandle() {
    return handle;
  }  

  public void setHandle(IntPtr handle) {
    this.handle = handle;
  }

  public X509Certificate issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
  **/
  public String getIssuer() {
    return issuer;
  }  

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public X509Certificate subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }  

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    X509Certificate x509Certificate = (X509Certificate) o;
    return ObjectUtils.equals(this.handle, x509Certificate.handle) &&
    ObjectUtils.equals(this.issuer, x509Certificate.issuer) &&
    ObjectUtils.equals(this.subject, x509Certificate.subject);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(handle, issuer, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509Certificate {\n");
    
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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


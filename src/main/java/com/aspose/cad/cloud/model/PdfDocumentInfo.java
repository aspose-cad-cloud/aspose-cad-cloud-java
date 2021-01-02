/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PdfDocumentInfo.java">
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
 * PdfDocumentInfo
 */
public class PdfDocumentInfo {
  @JsonProperty("keywords")
  private String keywords = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("subject")
  private String subject = null;

  public PdfDocumentInfo keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Get keywords
   * @return keywords
  **/
  public String getKeywords() {
    return keywords;
  }  

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public PdfDocumentInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }  

  public void setTitle(String title) {
    this.title = title;
  }

  public PdfDocumentInfo author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  **/
  public String getAuthor() {
    return author;
  }  

  public void setAuthor(String author) {
    this.author = author;
  }

  public PdfDocumentInfo subject(String subject) {
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
    PdfDocumentInfo pdfDocumentInfo = (PdfDocumentInfo) o;
    return ObjectUtils.equals(this.keywords, pdfDocumentInfo.keywords) &&
    ObjectUtils.equals(this.title, pdfDocumentInfo.title) &&
    ObjectUtils.equals(this.author, pdfDocumentInfo.author) &&
    ObjectUtils.equals(this.subject, pdfDocumentInfo.subject);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(keywords, title, author, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDocumentInfo {\n");
    
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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


/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.CAD Cloud
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This class represents set of metadata for document description.
 */
@ApiModel(description = "This class represents set of metadata for document description.")

public class PdfDocumentInfo {
  @SerializedName("Keywords")
  private String keywords = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("Subject")
  private String subject = null;

  public PdfDocumentInfo keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

   /**
   * Gets or sets keywords of the document.
   * @return keywords
  **/
  @ApiModelProperty(value = "Gets or sets keywords of the document.")
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
   * Gets or sets title of the document.
   * @return title
  **/
  @ApiModelProperty(value = "Gets or sets title of the document.")
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
   * Gets or sets author of the document.
   * @return author
  **/
  @ApiModelProperty(value = "Gets or sets author of the document.")
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
   * Gets or sets subject of the document.
   * @return subject
  **/
  @ApiModelProperty(value = "Gets or sets subject of the document.")
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
    return Objects.equals(this.keywords, pdfDocumentInfo.keywords) &&
        Objects.equals(this.title, pdfDocumentInfo.title) &&
        Objects.equals(this.author, pdfDocumentInfo.author) &&
        Objects.equals(this.subject, pdfDocumentInfo.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, title, author, subject);
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


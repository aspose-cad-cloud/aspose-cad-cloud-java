/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="X509Certificate2.java">
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
 * X509Certificate2
 */
public class X509Certificate2 extends X509Certificate {
  @JsonProperty("archived")
  private Boolean archived = null;

  @JsonProperty("extensions")
  private List<Object> extensions = null;

  @JsonProperty("friendlyName")
  private String friendlyName = null;

  @JsonProperty("hasPrivateKey")
  private Boolean hasPrivateKey = null;

  @JsonProperty("privateKey")
  private AsymmetricAlgorithm privateKey = null;

  @JsonProperty("issuerName")
  private X500DistinguishedName issuerName = null;

  @JsonProperty("notAfter")
  private Date notAfter = null;

  @JsonProperty("notBefore")
  private Date notBefore = null;

  @JsonProperty("publicKey")
  private PublicKey publicKey = null;

  @JsonProperty("rawData")
  private byte[] rawData = null;

  @JsonProperty("serialNumber")
  private String serialNumber = null;

  @JsonProperty("signatureAlgorithm")
  private Oid signatureAlgorithm = null;

  @JsonProperty("subjectName")
  private X500DistinguishedName subjectName = null;

  @JsonProperty("thumbprint")
  private String thumbprint = null;

  @JsonProperty("version")
  private Integer version = null;

  public X509Certificate2 archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Get archived
   * @return archived
  **/
  public Boolean isArchived() {
    return archived;
  }  

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public X509Certificate2 extensions(List<Object> extensions) {
    this.extensions = extensions;
    return this;
  }

  public X509Certificate2 addExtensionsItem(Object extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<Object>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

  /**
   * Get extensions
   * @return extensions
  **/
  public List<Object> getExtensions() {
    return extensions;
  }  

  public void setExtensions(List<Object> extensions) {
    this.extensions = extensions;
  }

  public X509Certificate2 friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * Get friendlyName
   * @return friendlyName
  **/
  public String getFriendlyName() {
    return friendlyName;
  }  

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public X509Certificate2 hasPrivateKey(Boolean hasPrivateKey) {
    this.hasPrivateKey = hasPrivateKey;
    return this;
  }

  /**
   * Get hasPrivateKey
   * @return hasPrivateKey
  **/
  public Boolean isHasPrivateKey() {
    return hasPrivateKey;
  }  

  public void setHasPrivateKey(Boolean hasPrivateKey) {
    this.hasPrivateKey = hasPrivateKey;
  }

  public X509Certificate2 privateKey(AsymmetricAlgorithm privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * Get privateKey
   * @return privateKey
  **/
  public AsymmetricAlgorithm getPrivateKey() {
    return privateKey;
  }  

  public void setPrivateKey(AsymmetricAlgorithm privateKey) {
    this.privateKey = privateKey;
  }

  public X509Certificate2 issuerName(X500DistinguishedName issuerName) {
    this.issuerName = issuerName;
    return this;
  }

  /**
   * Get issuerName
   * @return issuerName
  **/
  public X500DistinguishedName getIssuerName() {
    return issuerName;
  }  

  public void setIssuerName(X500DistinguishedName issuerName) {
    this.issuerName = issuerName;
  }

  public X509Certificate2 notAfter(Date notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * Get notAfter
   * @return notAfter
  **/
  public Date getNotAfter() {
    return notAfter;
  }  

  public void setNotAfter(Date notAfter) {
    this.notAfter = notAfter;
  }

  public X509Certificate2 notBefore(Date notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   * @return notBefore
  **/
  public Date getNotBefore() {
    return notBefore;
  }  

  public void setNotBefore(Date notBefore) {
    this.notBefore = notBefore;
  }

  public X509Certificate2 publicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
  **/
  public PublicKey getPublicKey() {
    return publicKey;
  }  

  public void setPublicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
  }

  public X509Certificate2 rawData(byte[] rawData) {
    this.rawData = rawData;
    return this;
  }

  /**
   * Get rawData
   * @return rawData
  **/
  public byte[] getRawData() {
    return rawData;
  }  

  public void setRawData(byte[] rawData) {
    this.rawData = rawData;
  }

  public X509Certificate2 serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  **/
  public String getSerialNumber() {
    return serialNumber;
  }  

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public X509Certificate2 signatureAlgorithm(Oid signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
    return this;
  }

  /**
   * Get signatureAlgorithm
   * @return signatureAlgorithm
  **/
  public Oid getSignatureAlgorithm() {
    return signatureAlgorithm;
  }  

  public void setSignatureAlgorithm(Oid signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  public X509Certificate2 subjectName(X500DistinguishedName subjectName) {
    this.subjectName = subjectName;
    return this;
  }

  /**
   * Get subjectName
   * @return subjectName
  **/
  public X500DistinguishedName getSubjectName() {
    return subjectName;
  }  

  public void setSubjectName(X500DistinguishedName subjectName) {
    this.subjectName = subjectName;
  }

  public X509Certificate2 thumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
    return this;
  }

  /**
   * Get thumbprint
   * @return thumbprint
  **/
  public String getThumbprint() {
    return thumbprint;
  }  

  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }

  public X509Certificate2 version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  public Integer getVersion() {
    return version;
  }  

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    X509Certificate2 x509Certificate2 = (X509Certificate2) o;
    return ObjectUtils.equals(this.archived, x509Certificate2.archived) &&
    ObjectUtils.equals(this.extensions, x509Certificate2.extensions) &&
    ObjectUtils.equals(this.friendlyName, x509Certificate2.friendlyName) &&
    ObjectUtils.equals(this.hasPrivateKey, x509Certificate2.hasPrivateKey) &&
    ObjectUtils.equals(this.privateKey, x509Certificate2.privateKey) &&
    ObjectUtils.equals(this.issuerName, x509Certificate2.issuerName) &&
    ObjectUtils.equals(this.notAfter, x509Certificate2.notAfter) &&
    ObjectUtils.equals(this.notBefore, x509Certificate2.notBefore) &&
    ObjectUtils.equals(this.publicKey, x509Certificate2.publicKey) &&
    ObjectUtils.equals(this.rawData, x509Certificate2.rawData) &&
    ObjectUtils.equals(this.serialNumber, x509Certificate2.serialNumber) &&
    ObjectUtils.equals(this.signatureAlgorithm, x509Certificate2.signatureAlgorithm) &&
    ObjectUtils.equals(this.subjectName, x509Certificate2.subjectName) &&
    ObjectUtils.equals(this.thumbprint, x509Certificate2.thumbprint) &&
    ObjectUtils.equals(this.version, x509Certificate2.version) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(archived, extensions, friendlyName, hasPrivateKey, privateKey, issuerName, notAfter, notBefore, publicKey, rawData, serialNumber, signatureAlgorithm, subjectName, thumbprint, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509Certificate2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    hasPrivateKey: ").append(toIndentedString(hasPrivateKey)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AsymmetricAlgorithm.java">
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
 * AsymmetricAlgorithm
 */
public class AsymmetricAlgorithm {
  @JsonProperty("keySize")
  private Integer keySize = null;

  @JsonProperty("legalKeySizes")
  private List<KeySizes> legalKeySizes = null;

  @JsonProperty("signatureAlgorithm")
  private String signatureAlgorithm = null;

  @JsonProperty("keyExchangeAlgorithm")
  private String keyExchangeAlgorithm = null;

  public AsymmetricAlgorithm keySize(Integer keySize) {
    this.keySize = keySize;
    return this;
  }

  /**
   * Get keySize
   * @return keySize
  **/
  public Integer getKeySize() {
    return keySize;
  }  

  public void setKeySize(Integer keySize) {
    this.keySize = keySize;
  }

  public AsymmetricAlgorithm legalKeySizes(List<KeySizes> legalKeySizes) {
    this.legalKeySizes = legalKeySizes;
    return this;
  }

  public AsymmetricAlgorithm addLegalKeySizesItem(KeySizes legalKeySizesItem) {
    if (this.legalKeySizes == null) {
      this.legalKeySizes = new ArrayList<KeySizes>();
    }
    this.legalKeySizes.add(legalKeySizesItem);
    return this;
  }

  /**
   * Get legalKeySizes
   * @return legalKeySizes
  **/
  public List<KeySizes> getLegalKeySizes() {
    return legalKeySizes;
  }  

  public void setLegalKeySizes(List<KeySizes> legalKeySizes) {
    this.legalKeySizes = legalKeySizes;
  }

  public AsymmetricAlgorithm signatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
    return this;
  }

  /**
   * Get signatureAlgorithm
   * @return signatureAlgorithm
  **/
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }  

  public void setSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  public AsymmetricAlgorithm keyExchangeAlgorithm(String keyExchangeAlgorithm) {
    this.keyExchangeAlgorithm = keyExchangeAlgorithm;
    return this;
  }

  /**
   * Get keyExchangeAlgorithm
   * @return keyExchangeAlgorithm
  **/
  public String getKeyExchangeAlgorithm() {
    return keyExchangeAlgorithm;
  }  

  public void setKeyExchangeAlgorithm(String keyExchangeAlgorithm) {
    this.keyExchangeAlgorithm = keyExchangeAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AsymmetricAlgorithm asymmetricAlgorithm = (AsymmetricAlgorithm) o;
    return ObjectUtils.equals(this.keySize, asymmetricAlgorithm.keySize) &&
    ObjectUtils.equals(this.legalKeySizes, asymmetricAlgorithm.legalKeySizes) &&
    ObjectUtils.equals(this.signatureAlgorithm, asymmetricAlgorithm.signatureAlgorithm) &&
    ObjectUtils.equals(this.keyExchangeAlgorithm, asymmetricAlgorithm.keyExchangeAlgorithm);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(keySize, legalKeySizes, signatureAlgorithm, keyExchangeAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsymmetricAlgorithm {\n");
    
    sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
    sb.append("    legalKeySizes: ").append(toIndentedString(legalKeySizes)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    keyExchangeAlgorithm: ").append(toIndentedString(keyExchangeAlgorithm)).append("\n");
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


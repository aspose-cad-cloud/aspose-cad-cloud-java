/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PublicKey.java">
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
 * PublicKey
 */
public class PublicKey {
  @JsonProperty("encodedKeyValue")
  private AsnEncodedData encodedKeyValue = null;

  @JsonProperty("encodedParameters")
  private AsnEncodedData encodedParameters = null;

  @JsonProperty("key")
  private AsymmetricAlgorithm key = null;

  @JsonProperty("oid")
  private Oid oid = null;

  public PublicKey encodedKeyValue(AsnEncodedData encodedKeyValue) {
    this.encodedKeyValue = encodedKeyValue;
    return this;
  }

  /**
   * Get encodedKeyValue
   * @return encodedKeyValue
  **/
  public AsnEncodedData getEncodedKeyValue() {
    return encodedKeyValue;
  }  

  public void setEncodedKeyValue(AsnEncodedData encodedKeyValue) {
    this.encodedKeyValue = encodedKeyValue;
  }

  public PublicKey encodedParameters(AsnEncodedData encodedParameters) {
    this.encodedParameters = encodedParameters;
    return this;
  }

  /**
   * Get encodedParameters
   * @return encodedParameters
  **/
  public AsnEncodedData getEncodedParameters() {
    return encodedParameters;
  }  

  public void setEncodedParameters(AsnEncodedData encodedParameters) {
    this.encodedParameters = encodedParameters;
  }

  public PublicKey key(AsymmetricAlgorithm key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  public AsymmetricAlgorithm getKey() {
    return key;
  }  

  public void setKey(AsymmetricAlgorithm key) {
    this.key = key;
  }

  public PublicKey oid(Oid oid) {
    this.oid = oid;
    return this;
  }

  /**
   * Get oid
   * @return oid
  **/
  public Oid getOid() {
    return oid;
  }  

  public void setOid(Oid oid) {
    this.oid = oid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    PublicKey publicKey = (PublicKey) o;
    return ObjectUtils.equals(this.encodedKeyValue, publicKey.encodedKeyValue) &&
    ObjectUtils.equals(this.encodedParameters, publicKey.encodedParameters) &&
    ObjectUtils.equals(this.key, publicKey.key) &&
    ObjectUtils.equals(this.oid, publicKey.oid);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(encodedKeyValue, encodedParameters, key, oid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKey {\n");
    
    sb.append("    encodedKeyValue: ").append(toIndentedString(encodedKeyValue)).append("\n");
    sb.append("    encodedParameters: ").append(toIndentedString(encodedParameters)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
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


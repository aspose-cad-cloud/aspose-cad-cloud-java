/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="RotateFlipType.java">
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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 
 */
public enum RotateFlipType {
  
  ROTATENONEFLIPNONE("RotateNoneFlipNone"),
  
  ROTATE90FLIPNONE("Rotate90FlipNone"),
  
  ROTATE180FLIPNONE("Rotate180FlipNone"),
  
  ROTATE270FLIPNONE("Rotate270FlipNone"),
  
  ROTATENONEFLIPX("RotateNoneFlipX"),
  
  ROTATE90FLIPX("Rotate90FlipX"),
  
  ROTATE180FLIPX("Rotate180FlipX"),
  
  ROTATE270FLIPX("Rotate270FlipX"),
  
  ROTATENONEFLIPY("RotateNoneFlipY"),
  
  ROTATE90FLIPY("Rotate90FlipY"),
  
  ROTATE180FLIPY("Rotate180FlipY"),
  
  ROTATE270FLIPY("Rotate270FlipY"),
  
  ROTATENONEFLIPXY("RotateNoneFlipXY"),
  
  ROTATE90FLIPXY("Rotate90FlipXY"),
  
  ROTATE180FLIPXY("Rotate180FlipXY"),
  
  ROTATE270FLIPXY("Rotate270FlipXY");

  private String value;

  RotateFlipType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RotateFlipType fromValue(String text) {
    for (RotateFlipType b : RotateFlipType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


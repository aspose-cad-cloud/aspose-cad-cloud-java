/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Jpeg2000OptionsDTO.java">
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
 * Export options for JPEG2000 format
 */
public class Jpeg2000OptionsDTO extends DrawingOptionsBaseDTO {
  @JsonProperty("comments")
  private List<String> comments = null;

  /**
   * Gets or Sets codec
   */
  @JsonAdapter(CodecEnum.Adapter.class)
  public enum CodecEnum {
    J2K("J2K"),
    
    JP2("Jp2"),
    
    JPT("Jpt");

    private String value;

    CodecEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodecEnum fromValue(String text) {
      for (CodecEnum b : CodecEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodecEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodecEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodecEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodecEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("codec")
  private CodecEnum codec = null;

  public Jpeg2000OptionsDTO comments(List<String> comments) {
    this.comments = comments;
    return this;
  }

  public Jpeg2000OptionsDTO addCommentsItem(String commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<String>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  **/
  public List<String> getComments() {
    return comments;
  }  

  public void setComments(List<String> comments) {
    this.comments = comments;
  }

  public Jpeg2000OptionsDTO codec(CodecEnum codec) {
    this.codec = codec;
    return this;
  }

  /**
   * Get codec
   * @return codec
  **/
  public CodecEnum getCodec() {
    return codec;
  }  

  public void setCodec(CodecEnum codec) {
    this.codec = codec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Jpeg2000OptionsDTO jpeg2000OptionsDTO = (Jpeg2000OptionsDTO) o;
    return ObjectUtils.equals(this.comments, jpeg2000OptionsDTO.comments) &&
    ObjectUtils.equals(this.codec, jpeg2000OptionsDTO.codec) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(comments, codec, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jpeg2000OptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
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


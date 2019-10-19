/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Cad for Cloud
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
import com.aspose.cad.cloud.model.CadRasterizationOptionsDTO;
import com.aspose.cad.cloud.model.ImageOptionsBaseDTO;
import com.aspose.cad.cloud.model.ResolutionSetting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Export options for TIFF format
 */
@ApiModel(description = "Export options for TIFF format")

public class TiffOptionsDTO extends ImageOptionsBaseDTO {
  /**
   * Bytes order (little/big-endian notation)
   */
  @JsonAdapter(ByteOrderEnum.Adapter.class)
  public enum ByteOrderEnum {
    LITTLEENDIAN("LittleEndian"),
    
    BIGENDIAN("BigEndian");

    private String value;

    ByteOrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ByteOrderEnum fromValue(String text) {
      for (ByteOrderEnum b : ByteOrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ByteOrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ByteOrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ByteOrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ByteOrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ByteOrder")
  private ByteOrderEnum byteOrder = null;

  /**
   * Compression level
   */
  @JsonAdapter(CompressionEnum.Adapter.class)
  public enum CompressionEnum {
    NONE("None"),
    
    CCITTRLE("CcittRle"),
    
    CCITTFAX3("CcittFax3"),
    
    CCITTFAX4("CcittFax4"),
    
    LZW("Lzw"),
    
    OJPEG("Ojpeg"),
    
    JPEG("Jpeg"),
    
    ADOBEDEFLATE("AdobeDeflate"),
    
    NEXT("Next"),
    
    CCITTRLEW("CcittRleW"),
    
    PACKBITS("Packbits"),
    
    THUNDERSCAN("Thunderscan"),
    
    IT8CTPAD("It8Ctpad"),
    
    IT8LW("It8Lw"),
    
    IT8MP("It8Mp"),
    
    IT8BL("It8Bl"),
    
    PIXARFILM("PixarFilm"),
    
    PIXARLOG("PixarLog"),
    
    DEFLATE("Deflate"),
    
    DCS("Dcs"),
    
    JBIG("Jbig"),
    
    SGILOG("Sgilog"),
    
    SGILOG24("Sgilog24"),
    
    JP2000("Jp2000");

    private String value;

    CompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompressionEnum fromValue(String text) {
      for (CompressionEnum b : CompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Compression")
  private CompressionEnum compression = null;

  /**
   * Expected TIFF sub-format
   */
  @JsonAdapter(ExpectedFormatEnum.Adapter.class)
  public enum ExpectedFormatEnum {
    DEFAULT("Default"),
    
    TIFFLZWBW("TiffLzwBw"),
    
    TIFFLZWRGB("TiffLzwRgb"),
    
    TIFFLZWRGBA("TiffLzwRgba"),
    
    TIFFLZWCMYK("TiffLzwCmyk"),
    
    TIFFCCITTFAX3("TiffCcittFax3"),
    
    TIFFCCITTFAX4("TiffCcittFax4"),
    
    TIFFDEFLATEBW("TiffDeflateBw"),
    
    TIFFDEFLATERGB("TiffDeflateRgb"),
    
    TIFFDEFLATERGBA("TiffDeflateRgba"),
    
    TIFFCCITRLE("TiffCcitRle"),
    
    TIFFJPEGRGB("TiffJpegRgb"),
    
    TIFFJPEGYCBCR("TiffJpegYCbCr"),
    
    TIFFNOCOMPRESSIONBW("TiffNoCompressionBw"),
    
    TIFFNOCOMPRESSIONRGB("TiffNoCompressionRgb"),
    
    TIFFNOCOMPRESSIONRGBA("TiffNoCompressionRgba");

    private String value;

    ExpectedFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpectedFormatEnum fromValue(String text) {
      for (ExpectedFormatEnum b : ExpectedFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExpectedFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpectedFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpectedFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExpectedFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ExpectedFormat")
  private ExpectedFormatEnum expectedFormat = null;

  @SerializedName("BitsPerSample")
  private List<Integer> bitsPerSample = null;

  /**
   * Photometric options
   */
  @JsonAdapter(PhotometricEnum.Adapter.class)
  public enum PhotometricEnum {
    MINISWHITE("MinIsWhite"),
    
    MINISBLACK("MinIsBlack"),
    
    RGB("Rgb"),
    
    PALETTE("Palette"),
    
    MASK("Mask"),
    
    SEPARATED("Separated"),
    
    YCBCR("Ycbcr"),
    
    CIELAB("Cielab"),
    
    ICCLAB("Icclab"),
    
    ITULAB("Itulab"),
    
    LOGL("Logl"),
    
    LOGLUV("Logluv");

    private String value;

    PhotometricEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhotometricEnum fromValue(String text) {
      for (PhotometricEnum b : PhotometricEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PhotometricEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhotometricEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhotometricEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PhotometricEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Photometric")
  private PhotometricEnum photometric = null;

  public TiffOptionsDTO byteOrder(ByteOrderEnum byteOrder) {
    this.byteOrder = byteOrder;
    return this;
  }

   /**
   * Bytes order (little/big-endian notation)
   * @return byteOrder
  **/
  @ApiModelProperty(required = true, value = "Bytes order (little/big-endian notation)")
  public ByteOrderEnum getByteOrder() {
    return byteOrder;
  }

  public void setByteOrder(ByteOrderEnum byteOrder) {
    this.byteOrder = byteOrder;
  }

  public TiffOptionsDTO compression(CompressionEnum compression) {
    this.compression = compression;
    return this;
  }

   /**
   * Compression level
   * @return compression
  **/
  @ApiModelProperty(required = true, value = "Compression level")
  public CompressionEnum getCompression() {
    return compression;
  }

  public void setCompression(CompressionEnum compression) {
    this.compression = compression;
  }

  public TiffOptionsDTO expectedFormat(ExpectedFormatEnum expectedFormat) {
    this.expectedFormat = expectedFormat;
    return this;
  }

   /**
   * Expected TIFF sub-format
   * @return expectedFormat
  **/
  @ApiModelProperty(required = true, value = "Expected TIFF sub-format")
  public ExpectedFormatEnum getExpectedFormat() {
    return expectedFormat;
  }

  public void setExpectedFormat(ExpectedFormatEnum expectedFormat) {
    this.expectedFormat = expectedFormat;
  }

  public TiffOptionsDTO bitsPerSample(List<Integer> bitsPerSample) {
    this.bitsPerSample = bitsPerSample;
    return this;
  }

  public TiffOptionsDTO addBitsPerSampleItem(Integer bitsPerSampleItem) {
    if (this.bitsPerSample == null) {
      this.bitsPerSample = new ArrayList<Integer>();
    }
    this.bitsPerSample.add(bitsPerSampleItem);
    return this;
  }

   /**
   * Bits per pixel
   * @return bitsPerSample
  **/
  @ApiModelProperty(value = "Bits per pixel")
  public List<Integer> getBitsPerSample() {
    return bitsPerSample;
  }

  public void setBitsPerSample(List<Integer> bitsPerSample) {
    this.bitsPerSample = bitsPerSample;
  }

  public TiffOptionsDTO photometric(PhotometricEnum photometric) {
    this.photometric = photometric;
    return this;
  }

   /**
   * Photometric options
   * @return photometric
  **/
  @ApiModelProperty(required = true, value = "Photometric options")
  public PhotometricEnum getPhotometric() {
    return photometric;
  }

  public void setPhotometric(PhotometricEnum photometric) {
    this.photometric = photometric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TiffOptionsDTO tiffOptionsDTO = (TiffOptionsDTO) o;
    return Objects.equals(this.byteOrder, tiffOptionsDTO.byteOrder) &&
        Objects.equals(this.compression, tiffOptionsDTO.compression) &&
        Objects.equals(this.expectedFormat, tiffOptionsDTO.expectedFormat) &&
        Objects.equals(this.bitsPerSample, tiffOptionsDTO.bitsPerSample) &&
        Objects.equals(this.photometric, tiffOptionsDTO.photometric) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteOrder, compression, expectedFormat, bitsPerSample, photometric, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffOptionsDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    byteOrder: ").append(toIndentedString(byteOrder)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    expectedFormat: ").append(toIndentedString(expectedFormat)).append("\n");
    sb.append("    bitsPerSample: ").append(toIndentedString(bitsPerSample)).append("\n");
    sb.append("    photometric: ").append(toIndentedString(photometric)).append("\n");
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


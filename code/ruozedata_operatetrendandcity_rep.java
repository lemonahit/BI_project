// ORM class for table 'ruozedata_operatetrendandcity_rep'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Feb 20 14:20:18 CST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ruozedata_operatetrendandcity_rep extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String timeid;
  public String get_timeid() {
    return timeid;
  }
  public void set_timeid(String timeid) {
    this.timeid = timeid;
  }
  public ruozedata_operatetrendandcity_rep with_timeid(String timeid) {
    this.timeid = timeid;
    return this;
  }
  private java.math.BigDecimal sales_amount;
  public java.math.BigDecimal get_sales_amount() {
    return sales_amount;
  }
  public void set_sales_amount(java.math.BigDecimal sales_amount) {
    this.sales_amount = sales_amount;
  }
  public ruozedata_operatetrendandcity_rep with_sales_amount(java.math.BigDecimal sales_amount) {
    this.sales_amount = sales_amount;
    return this;
  }
  private java.math.BigDecimal ordernums;
  public java.math.BigDecimal get_ordernums() {
    return ordernums;
  }
  public void set_ordernums(java.math.BigDecimal ordernums) {
    this.ordernums = ordernums;
  }
  public ruozedata_operatetrendandcity_rep with_ordernums(java.math.BigDecimal ordernums) {
    this.ordernums = ordernums;
    return this;
  }
  private java.math.BigDecimal deal_products;
  public java.math.BigDecimal get_deal_products() {
    return deal_products;
  }
  public void set_deal_products(java.math.BigDecimal deal_products) {
    this.deal_products = deal_products;
  }
  public ruozedata_operatetrendandcity_rep with_deal_products(java.math.BigDecimal deal_products) {
    this.deal_products = deal_products;
    return this;
  }
  private String province_name;
  public String get_province_name() {
    return province_name;
  }
  public void set_province_name(String province_name) {
    this.province_name = province_name;
  }
  public ruozedata_operatetrendandcity_rep with_province_name(String province_name) {
    this.province_name = province_name;
    return this;
  }
  private String city_name;
  public String get_city_name() {
    return city_name;
  }
  public void set_city_name(String city_name) {
    this.city_name = city_name;
  }
  public ruozedata_operatetrendandcity_rep with_city_name(String city_name) {
    this.city_name = city_name;
    return this;
  }
  private String region_name;
  public String get_region_name() {
    return region_name;
  }
  public void set_region_name(String region_name) {
    this.region_name = region_name;
  }
  public ruozedata_operatetrendandcity_rep with_region_name(String region_name) {
    this.region_name = region_name;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ruozedata_operatetrendandcity_rep)) {
      return false;
    }
    ruozedata_operatetrendandcity_rep that = (ruozedata_operatetrendandcity_rep) o;
    boolean equal = true;
    equal = equal && (this.timeid == null ? that.timeid == null : this.timeid.equals(that.timeid));
    equal = equal && (this.sales_amount == null ? that.sales_amount == null : this.sales_amount.equals(that.sales_amount));
    equal = equal && (this.ordernums == null ? that.ordernums == null : this.ordernums.equals(that.ordernums));
    equal = equal && (this.deal_products == null ? that.deal_products == null : this.deal_products.equals(that.deal_products));
    equal = equal && (this.province_name == null ? that.province_name == null : this.province_name.equals(that.province_name));
    equal = equal && (this.city_name == null ? that.city_name == null : this.city_name.equals(that.city_name));
    equal = equal && (this.region_name == null ? that.region_name == null : this.region_name.equals(that.region_name));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ruozedata_operatetrendandcity_rep)) {
      return false;
    }
    ruozedata_operatetrendandcity_rep that = (ruozedata_operatetrendandcity_rep) o;
    boolean equal = true;
    equal = equal && (this.timeid == null ? that.timeid == null : this.timeid.equals(that.timeid));
    equal = equal && (this.sales_amount == null ? that.sales_amount == null : this.sales_amount.equals(that.sales_amount));
    equal = equal && (this.ordernums == null ? that.ordernums == null : this.ordernums.equals(that.ordernums));
    equal = equal && (this.deal_products == null ? that.deal_products == null : this.deal_products.equals(that.deal_products));
    equal = equal && (this.province_name == null ? that.province_name == null : this.province_name.equals(that.province_name));
    equal = equal && (this.city_name == null ? that.city_name == null : this.city_name.equals(that.city_name));
    equal = equal && (this.region_name == null ? that.region_name == null : this.region_name.equals(that.region_name));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.timeid = JdbcWritableBridge.readString(1, __dbResults);
    this.sales_amount = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.ordernums = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.deal_products = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.province_name = JdbcWritableBridge.readString(5, __dbResults);
    this.city_name = JdbcWritableBridge.readString(6, __dbResults);
    this.region_name = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.timeid = JdbcWritableBridge.readString(1, __dbResults);
    this.sales_amount = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.ordernums = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.deal_products = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.province_name = JdbcWritableBridge.readString(5, __dbResults);
    this.city_name = JdbcWritableBridge.readString(6, __dbResults);
    this.region_name = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(timeid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(sales_amount, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ordernums, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(deal_products, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(province_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_name, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(timeid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(sales_amount, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ordernums, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(deal_products, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(province_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region_name, 7 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.timeid = null;
    } else {
    this.timeid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sales_amount = null;
    } else {
    this.sales_amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ordernums = null;
    } else {
    this.ordernums = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.deal_products = null;
    } else {
    this.deal_products = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.province_name = null;
    } else {
    this.province_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_name = null;
    } else {
    this.city_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region_name = null;
    } else {
    this.region_name = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.timeid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, timeid);
    }
    if (null == this.sales_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.sales_amount, __dataOut);
    }
    if (null == this.ordernums) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ordernums, __dataOut);
    }
    if (null == this.deal_products) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.deal_products, __dataOut);
    }
    if (null == this.province_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_name);
    }
    if (null == this.city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_name);
    }
    if (null == this.region_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_name);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.timeid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, timeid);
    }
    if (null == this.sales_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.sales_amount, __dataOut);
    }
    if (null == this.ordernums) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ordernums, __dataOut);
    }
    if (null == this.deal_products) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.deal_products, __dataOut);
    }
    if (null == this.province_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_name);
    }
    if (null == this.city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_name);
    }
    if (null == this.region_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_name);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(timeid==null?"null":timeid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sales_amount==null?"null":sales_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ordernums==null?"null":ordernums.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deal_products==null?"null":deal_products.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_name==null?"null":province_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_name==null?"null":city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_name==null?"null":region_name, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(timeid==null?"null":timeid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sales_amount==null?"null":sales_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ordernums==null?"null":ordernums.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deal_products==null?"null":deal_products.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_name==null?"null":province_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_name==null?"null":city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_name==null?"null":region_name, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.timeid = null; } else {
      this.timeid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sales_amount = null; } else {
      this.sales_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ordernums = null; } else {
      this.ordernums = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deal_products = null; } else {
      this.deal_products = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.province_name = null; } else {
      this.province_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city_name = null; } else {
      this.city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.region_name = null; } else {
      this.region_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.timeid = null; } else {
      this.timeid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sales_amount = null; } else {
      this.sales_amount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ordernums = null; } else {
      this.ordernums = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deal_products = null; } else {
      this.deal_products = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.province_name = null; } else {
      this.province_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city_name = null; } else {
      this.city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.region_name = null; } else {
      this.region_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ruozedata_operatetrendandcity_rep o = (ruozedata_operatetrendandcity_rep) super.clone();
    return o;
  }

  public void clone0(ruozedata_operatetrendandcity_rep o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("timeid", this.timeid);
    __sqoop$field_map.put("sales_amount", this.sales_amount);
    __sqoop$field_map.put("ordernums", this.ordernums);
    __sqoop$field_map.put("deal_products", this.deal_products);
    __sqoop$field_map.put("province_name", this.province_name);
    __sqoop$field_map.put("city_name", this.city_name);
    __sqoop$field_map.put("region_name", this.region_name);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("timeid", this.timeid);
    __sqoop$field_map.put("sales_amount", this.sales_amount);
    __sqoop$field_map.put("ordernums", this.ordernums);
    __sqoop$field_map.put("deal_products", this.deal_products);
    __sqoop$field_map.put("province_name", this.province_name);
    __sqoop$field_map.put("city_name", this.city_name);
    __sqoop$field_map.put("region_name", this.region_name);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("timeid".equals(__fieldName)) {
      this.timeid = (String) __fieldVal;
    }
    else    if ("sales_amount".equals(__fieldName)) {
      this.sales_amount = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ordernums".equals(__fieldName)) {
      this.ordernums = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("deal_products".equals(__fieldName)) {
      this.deal_products = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("province_name".equals(__fieldName)) {
      this.province_name = (String) __fieldVal;
    }
    else    if ("city_name".equals(__fieldName)) {
      this.city_name = (String) __fieldVal;
    }
    else    if ("region_name".equals(__fieldName)) {
      this.region_name = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("timeid".equals(__fieldName)) {
      this.timeid = (String) __fieldVal;
      return true;
    }
    else    if ("sales_amount".equals(__fieldName)) {
      this.sales_amount = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ordernums".equals(__fieldName)) {
      this.ordernums = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("deal_products".equals(__fieldName)) {
      this.deal_products = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("province_name".equals(__fieldName)) {
      this.province_name = (String) __fieldVal;
      return true;
    }
    else    if ("city_name".equals(__fieldName)) {
      this.city_name = (String) __fieldVal;
      return true;
    }
    else    if ("region_name".equals(__fieldName)) {
      this.region_name = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

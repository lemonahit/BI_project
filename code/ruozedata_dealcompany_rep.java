// ORM class for table 'ruozedata_dealcompany_rep'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Feb 20 14:20:45 CST 2018
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

public class ruozedata_dealcompany_rep extends SqoopRecord  implements DBWritable, Writable {
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
  public ruozedata_dealcompany_rep with_timeid(String timeid) {
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
  public ruozedata_dealcompany_rep with_sales_amount(java.math.BigDecimal sales_amount) {
    this.sales_amount = sales_amount;
    return this;
  }
  private String company;
  public String get_company() {
    return company;
  }
  public void set_company(String company) {
    this.company = company;
  }
  public ruozedata_dealcompany_rep with_company(String company) {
    this.company = company;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ruozedata_dealcompany_rep)) {
      return false;
    }
    ruozedata_dealcompany_rep that = (ruozedata_dealcompany_rep) o;
    boolean equal = true;
    equal = equal && (this.timeid == null ? that.timeid == null : this.timeid.equals(that.timeid));
    equal = equal && (this.sales_amount == null ? that.sales_amount == null : this.sales_amount.equals(that.sales_amount));
    equal = equal && (this.company == null ? that.company == null : this.company.equals(that.company));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ruozedata_dealcompany_rep)) {
      return false;
    }
    ruozedata_dealcompany_rep that = (ruozedata_dealcompany_rep) o;
    boolean equal = true;
    equal = equal && (this.timeid == null ? that.timeid == null : this.timeid.equals(that.timeid));
    equal = equal && (this.sales_amount == null ? that.sales_amount == null : this.sales_amount.equals(that.sales_amount));
    equal = equal && (this.company == null ? that.company == null : this.company.equals(that.company));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.timeid = JdbcWritableBridge.readString(1, __dbResults);
    this.sales_amount = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.company = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.timeid = JdbcWritableBridge.readString(1, __dbResults);
    this.sales_amount = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.company = JdbcWritableBridge.readString(3, __dbResults);
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
    JdbcWritableBridge.writeString(company, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(timeid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(sales_amount, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(company, 3 + __off, 12, __dbStmt);
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
        this.company = null;
    } else {
    this.company = Text.readString(__dataIn);
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
    if (null == this.company) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, company);
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
    if (null == this.company) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, company);
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
    __sb.append(FieldFormatter.escapeAndEnclose(company==null?"null":company, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(company==null?"null":company, delimiters));
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
    if (__cur_str.equals("null")) { this.company = null; } else {
      this.company = __cur_str;
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
    if (__cur_str.equals("null")) { this.company = null; } else {
      this.company = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ruozedata_dealcompany_rep o = (ruozedata_dealcompany_rep) super.clone();
    return o;
  }

  public void clone0(ruozedata_dealcompany_rep o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("timeid", this.timeid);
    __sqoop$field_map.put("sales_amount", this.sales_amount);
    __sqoop$field_map.put("company", this.company);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("timeid", this.timeid);
    __sqoop$field_map.put("sales_amount", this.sales_amount);
    __sqoop$field_map.put("company", this.company);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("timeid".equals(__fieldName)) {
      this.timeid = (String) __fieldVal;
    }
    else    if ("sales_amount".equals(__fieldName)) {
      this.sales_amount = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("company".equals(__fieldName)) {
      this.company = (String) __fieldVal;
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
    else    if ("company".equals(__fieldName)) {
      this.company = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

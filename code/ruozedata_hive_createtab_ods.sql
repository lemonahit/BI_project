use ruozedata;

--==============================================================--
-- Table: ruozedata_order_ods                            --
--==============================================================--
drop table if exists ruozedata_order_ods;
create external table ruozedata_order_ods
(
   orderid              string,
   ordertime            string,
   orderBelongType      string,
   saleOrgId            string,
   orderCustomerType    string,
   customerId           string,
   customerName         string,
   paymoney             string,
   state                string,
   subOrder             string
)
row format delimited fields terminated by '\t'
lines terminated by '\n'
stored as textfile
location '/user/hive/warehouse/ruozedata.db/ruozedata_order_ods/';

--==============================================================--
-- Table: ruozedata_orderdetail_ods                         --
--==============================================================--
drop table if exists ruozedata_orderdetail_ods;
create external table ruozedata_orderdetail_ods
(
   crt_date       string,
   orderMainId    string,
   productId      string
)
row format delimited fields terminated by '\t'
lines terminated by '\n'
stored as textfile
location '/user/hive/warehouse/ruozedata.db/ruozedata_orderdetail_ods/';

--==============================================================--
-- Table: ruozedata_address_ods                        --
--==============================================================--
drop table if exists ruozedata_address_ods;
create external table ruozedata_address_ods
(
   crt_date       string,
   orderMainId    string,
   provicne_id    string,
   city_id        string,
   region_id      string,
   street_id      string
)
row format delimited fields terminated by '\t'
lines terminated by '\n'
stored as textfile
location '/user/hive/warehouse/ruozedata.db/ruozedata_address_ods/';

--==============================================================--
-- Table: ruozedata_area_ods                        --
--==============================================================--
drop table if exists ruozedata_area_ods;
create  external table ruozedata_area_ods
(
   province_code    string,
   province_name    string,
   city_code        string,
   city_name        string,
   zone_code        string,
   zone_name        string,
   street_code      string,
   street_name      string
)
row format delimited fields terminated by '\t'
lines terminated by '\n'
stored as textfile
location '/user/hive/warehouse/ruozedata.db/ruozedata_area_ods/';

--==============================================================--
-- Table: ruozedata_saleorg_ods                        --
--==============================================================--
drop table if exists ruozedata_saleorg_ods;
create external table ruozedata_saleorg_ods
(
   saleCode    string,
   saleDesc    string
)
row format delimited fields terminated by '\t'
lines terminated by '\n'
stored as textfile
location '/user/hive/warehouse/ruozedata.db/ruozedata_saleorg_ods/';

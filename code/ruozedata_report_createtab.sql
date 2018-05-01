use ruozedata;

--指标汇总宽表
--==============================================================--
-- Table: ruozedata_ordersum                        --
--==============================================================--
drop table if exists ruozedata_ordersum_bic;
create external table ruozedata_ordersum_bic (
  timeid string, 
  company_code string,
  province_id string, 
  city_id string, 
  region_id string, 
  street_id string, 
  sales_amount string, 
  pay_amount string, 
  ordernums string, 
  pay_products string, 
  deal_products string
  )
partitioned by (pt_date string)  
row format delimited fields terminated by '\t'
lines terminated by '\n'
stored as textfile
location '/user/hive/warehouse/ruozedata.db/ruozedata_ordersum_bic/';

--运营趋势/成交城市
--==============================================================--
-- Table: ruozedata_operatetrendandcity_rep                        --
--==============================================================--
drop table if exists ruozedata_operatetrendandcity_rep;
create external table ruozedata_operatetrendandcity_rep (
  timeid  string,
  sales_amount  string,
  ordernums string,
  deal_products string,
  province_name string,
  city_name  string,
  region_name string
) partitioned by (pt_date string)
row format delimited fields terminated by '\t'
lines terminated by '\n'
stored as textfile
location '/user/hive/warehouse/ruozedata.db/ruozedata_operatetrendandcity_rep/';

--
--==============================================================--
-- Table: ruozedata_dealcompany_rep                        --
--==============================================================--

drop table if exists ruozedata_dealcompany_rep;
create external table ruozedata_dealcompany_rep (
  timeid  string,
  sales_amount  string,
  company string
) partitioned by (pt_date string)
row format delimited fields terminated by '\t'
lines terminated by '\n'
stored as textfile
location '/user/hive/warehouse/ruozedata.db/ruozedata_dealcompany_rep/';
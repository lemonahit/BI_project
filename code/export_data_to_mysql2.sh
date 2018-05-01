#########################################################################
## 数据导出    
## *@Modify：若泽数据
## *@Modify Date: 2017/09/18
#########################################################################
#!/bin/bash

date=`date +%Y%m%d -d'1 days ago'`
date='20161030'
echo ${date}
dt=`date -d "0 days $date" +%F`
echo ${dt}
source /opt/data/ruozedata.properties

mysql -h${HOSTNAME} -P${PORT} -u${USERNAME} -p${PASSWORD} ${DBNAME} -e "
#报表1
delete from  ruozedata_operatetrendandcity_rep where timeid='${dt}';
#报表2
delete from  ruozedata_dealcompany_rep where timeid='${dt}';"

hive -e "
use ruozedata;
add jar /opt/cloudera/parcels/CDH-5.7.5-1.cdh5.7.5.p0.3/lib/hive/lib/hive-contrib-1.1.0-cdh5.7.5.jar;
add jar /usr/share/java/mysql-connector-java-5.1.26-bin.jar;
CREATE TEMPORARY FUNCTION dboutput AS 'org.apache.hadoop.hive.contrib.genericudf.example.GenericUDFDBOutput';

-- 报表1
select dboutput('${driver_rep}','${username_rep}','${password_rep}',
'INSERT INTO ruozedata_operatetrendandcity_rep (timeid,sales_amount,ordernums,deal_products,province_name,city_name,region_name) 
VALUES (?, ?, ?, ?, ?, ?, ?)',
timeid,sales_amount,ordernums,deal_products,province_name,city_name,region_name) from ruozedata_operatetrendandcity_rep 
where timeid='${dt}';

-- 报表2
select dboutput('${driver_rep}','${username_rep}','${password_rep}',
'INSERT INTO ruozedata_dealcompany_rep (timeid,sales_amount,company) 
VALUES (?, ?, ?)',
timeid,sales_amount,company) from ruozedata_dealcompany_rep   
where timeid='${dt}'; "

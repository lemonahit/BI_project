#########################################################################
## *@Company:     真真                             
## *@Prog Desc:   sqoop job
## *@Modify       真真
## *@Modify Date: 2017/09/10
## *@sqoop_job
#########################################################################
#!/bin/bash
date=`date +%Y%m%d -d'1 days ago'`
echo ${date}
date1="20161030"
dete2=`date -d "-0 day $date1" +%F`
echo ${dete2}

source /opt/BI_Project/ruozedata.properties

V_MYSQL_DRIVER=${mysql_driver}
V_USER=${mysql_username}
V_PASSWORD=${mysql_password}

sqoop job -delete job_ruozedata_order;
sqoop job -delete job_ruozedata_orderdetail;
sqoop job -delete job_ruozedata_address;
sqoop job -delete job_ruozedata_saleorg;
sqoop job -delete job_ruozedata_area;

sqoop job \
--create job_ruozedata_order -- import \
--connect ${V_MYSQL_DRIVER} \
--username ${V_USER} \
--password ${V_PASSWORD} \
--table ruozedata_order \
--hive-drop-import-delims \
--delete-target-dir \
--where "substr(ordertime,1,10)='${dete2}'" \
--target-dir /user/hive/warehouse/ruozedata.db/ruozedata_order_ods/ \
--fields-terminated-by '\t' \
--lines-terminated-by '\n' \
-m 1;

sqoop job \
--create job_ruozedata_orderdetail -- import \
--connect ${V_MYSQL_DRIVER} \
--username ${V_USER} \
--password ${V_PASSWORD} \
--table ruozedata_orderdetail \
--hive-drop-import-delims \
--delete-target-dir \
--where "crt_date='${dete2}'" \
--target-dir /user/hive/warehouse/ruozedata.db/ruozedata_orderdetail_ods/ \
--fields-terminated-by  '\t' \
--lines-terminated-by '\n' \
-m 1;


sqoop job \
--create job_ruozedata_address -- import \
--connect ${V_MYSQL_DRIVER} \
--username ${V_USER} \
--password ${V_PASSWORD} \
--table ruozedata_address \
--hive-drop-import-delims \
--delete-target-dir \
--where "crt_date='${dete2}'" \
--target-dir /user/hive/warehouse/ruozedata.db/ruozedata_address_ods/ \
--fields-terminated-by '\t' \
--lines-terminated-by '\n' \
-m 1;

sqoop job \
--create job_ruozedata_saleorg -- import \
--connect ${V_MYSQL_DRIVER} \
--username ${V_USER} \
--password ${V_PASSWORD} \
--table ruozedata_saleorg \
--hive-drop-import-delims \
--delete-target-dir \
--target-dir /user/hive/warehouse/ruozedata.db/ruozedata_saleorg_ods/ \
--hive-overwrite \
--fields-terminated-by  '\t' \
--lines-terminated-by '\n' \
-m 1;

sqoop job \
--create job_ruozedata_area -- import \
--connect ${V_MYSQL_DRIVER} \
--username ${V_USER} \
--password ${V_PASSWORD} \
--table ruozedata_area \
--hive-drop-import-delims \
--delete-target-dir \
--target-dir /user/hive/warehouse/ruozedata.db/ruozedata_area_ods/ \
--fields-terminated-by  '\t' \
--lines-terminated-by '\n' \
-m 1;

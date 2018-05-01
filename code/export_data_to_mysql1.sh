#!/bin/bash

dt=`date --date='1 days ago' +%Y-%m-%d`
date=`date +%Y%m%d -d'1 days ago'`
date="20161030"
echo ${date}

source /opt/BI_Project/ruozedata.properties

mysql -h${HOSTNAME} -P${PORT} -u${USERNAME} -p${PASSWORD} ${DBNAME} -e "
#报表1
delete from ruozedata_operatetrendandcity_rep where timeid='${date}';
#报表2
delete from ruozedata_dealcompany_rep where timeid='${date}';"
arr=(${tables//,/ })

for i in ${arr[@]}
     do
       echo "###########################table $i is running##############" 
sqoop export \
--connect ${driver_rep} \
--username ${username_rep} --password ${password_rep} \
--table $i \
--export-dir /user/hive/warehouse/ruozedata.db/$i/pt_date=$date/ \
--input-fields-terminated-by '\t' \
-m 1
      echo "###########################table $i is import finish##############" 
 done

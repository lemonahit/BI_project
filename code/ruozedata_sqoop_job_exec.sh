#########################################################################
## *@Company:     ¿¿¿¿                             
## *@Prog Desc:   ¿¿:¿¿job,¿¿¿¿hdfs¿¿hive¿
## *@Name:        ruozedata_exec_sqoopjob
## *@Modify       ¿¿¿¿
## *@Modify Date: 2017/09/10
## *@1,
#########################################################################
#!/bin/bash
date=`date +%Y%m%d -d'1 days ago'`
echo ${date}
date="20161030"
sqoop job -exec job_ruozedata_order;
sqoop job -exec job_ruozedata_orderdetail;
sqoop job -exec job_ruozedata_address;
sqoop job -exec job_ruozedata_area;
sqoop job -exec job_ruozedata_saleorg;

rm -rf /opt/BI_Project/*.java

exit 0

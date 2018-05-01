!/bin/bash

DATEHOUR=`date +%Y%m%d%H -d'1 day ago'`
date=${DATEHOUR:0:8}
date='20161030'

echo "##################################${date}${hour}####..........#############################################"

    sh /opt/ruozedata/ruozedata_sqoop_job_exec.sh  &
if [ $? -ne 0 ];then
        echo "data load error!!!!"
        exit 0
else
    sh /opt/ruozedata/ruozedata_ordersum_bic.sh &
    wait
    sh /opt/ruozedata/ruozedata_operatetrdata_rep.sh & 
    wait
    sh /opt/ruozedata/export_data_to_mysql2.sh &
fi

echo "##################################${date}${hour}####..........#############################################"

#########################################################################
## *@Company:     若泽数据 
## *@Mail:        ruoze@ruozedata.com.cn
## *@Prog Desc:   功能:报表指标维度处理
## *@Name:        ruozedata_operatetrend_rep
## *@Modify Date: 2017/09/10
#########################################################################
#!/bin/bash
date=`date +%Y%m%d -d'1 days ago'`

date='20161030'
echo $date
hive -e "
use ruozedata;

--运营分析/成交城市
insert overwrite table ruozedata_operatetrendandcity_rep  partition(pt_date = '${date}')
SELECT
/*+ MAPJOIN(b) */ 
a.timeid, --日期
sum(a.sales_amount), --销售额
sum(a.ordernums), --订单数
sum(a.deal_products), --成交商品数
b.province_name, --省(直辖市)
b.city_name, --市
b.zone_name  --区
FROM ruozedata_ordersum_bic a 
join ruozedata_area_ods b  on (a.province_id=b.province_code and a.city_id=b.city_code and a.street_id=b.street_code)  where a.pt_date='${date}'
group by a.timeid,b.province_name,b.city_name,b.zone_name; 

--成交公司销售额

insert overwrite table ruozedata_dealcompany_rep  partition(pt_date = '${date}')
select 
/*+ MAPJOIN(b) */ 
timeid, --日期
sum(sales_amount) as sales_amount, --销售额
saledesc --公司
From ruozedata_ordersum_bic a 
left outer join  
ruozedata_saleorg_ods b on (a.company_code=b.salecode) where a.pt_date='${date}' group by timeid,saledesc; "

#########################################################################
## *@Company:     若泽数据                             
## *@Mail:        ruoze@ruozedata.com.cn
## *@Prog Desc:   功能:维度指标信息汇总
## *@Name:        ruozedata_ordersum
## *@Modify       若泽数据
## *@Modify Date: 2017/09/12
#########################################################################
#!/bin/bash
date=`date +%Y%m%d -d'1 days ago'`

date='20161030'
echo $date

hive -e "
use ruozedata;

INSERT overwrite table ruozedata_ordersum_bic partition(pt_date = '${date}')
SELECT
  to_date(a.ordertime) as timeid,
  a.saleOrgId,
  c.provicne_id,
  c.city_id,
  c.region_id,
  c.street_id,
  sum(a.paymoney) as sales_amount, --销售额
  sum(case when a.state in(5,6,7) then a.paymoney else 0 end) pay_amount, --支付金额
  count(distinct a.orderid) as ordernums, --订单数
  count(distinct case when a.state in(5,6,7) then b.productId else null end)  as pay_products, --支付商品数
  count(distinct b.productId) as deal_products --成交商品数
FROM
ruozedata_order_ods a 
left outer join ruozedata_orderdetail_ods b on (a.orderid = b.orderMainId) 
left outer join ruozedata_address_ods c on (a.orderid=c.orderMainId) 
WHERE a.subOrder = 1 
GROUP BY to_date(a.ordertime),a.saleOrgId,c.provicne_id,c.city_id,c.region_id,c.street_id;"

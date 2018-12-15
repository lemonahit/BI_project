# 项目架构
Sqoop ==data==> HDFS ==关联==> Hive(做ETL操作) ==Sqoop==> MySQL

# 项目业务介绍
1. 订单表 ruozedata_order_ods
	订单状态表示已支付的，567
	待发货5
	待收货6
	交易成功7 
   subOrder=1表示有效子订单
2. ruozedata_orderdetail 订单的明细，成交商品数 与订单表 orderMainId与订单表orderid
3. ruozedata_address_ods 地址
4. ruozedata_area 地域
5. 公司表：ruozedata_saleorg 
   关联订单表：sale_ord_id

最终出3张报表：运营趋势、成交城市、成交公司

# 执行顺序
## 启动mysql service
	[hadoop@hadoop001 ~]$ su - mysqladmin
	Password: mysql
	[mysqladmin@hadoop001 ~]$ bin/mysqld_safe &
## 创建数据库
	mysql> create database ruozedata_bi;
## 导入数据到mysql中
	[mysqladmin@hadoop001 ~]$ mysql -uroot -p ruozedata_bi < /opt/BI_Project/ruozebi.sql
## 创建Sqoop job并执行
    [root@hadoop001 BI_Project]# sh ruozedata_sqoop_job_create.sh
## 将数据采集到HDFS中
    [root@hadoop001 BI_Project]# sh ruozedata_sqoop_job_exec.sh
## 在Hive中创建数据库
    hive> create database ruozedata;
## 执行ruozedata_hive_createtab_ods.sql
    [root@hadoop001 BI_Project]# hive -f /opt/BI_Project/ruozedata_hive_createtab_ods.sql
## 查看Hive表是否创建成功，HDFS数据是否关联成功
	hive> use ruozedata;
	OK
	Time taken: 0.602 seconds
	hive> show tables;
	OK
	ruozedata_address_ods
	ruozedata_area_ods
	ruozedata_order_ods
	ruozedata_orderdetail_ods
	ruozedata_saleorg_ods
	Time taken: 0.333 seconds, Fetched: 5 row(s)
## 创建指标信息汇总表和report报表(在Hive中的表)
	[root@hadoop001 BI_Project]# hive -f /opt/BI_Project/ruozedata_report_createtab.sql
## 统计维度指标信息
	[root@hadoop001 BI_Project]# sh ruozedata_ordersum_bic.sh
## 报表指标维度处理
	[root@hadoop001 BI_Project]# sh ruozedata_operatetrdata_rep.sh
## 在MySQL中建表
	mysql> create database BIreport;
	[mysqladmin@hadoop001 ~]$ mysql -uroot -p ruozedata_bi < /opt/BI_Project/mysql_report
## 将数据导入到MySQL中
	[root@hadoop001 BI_Project]# sh export_data_to_mysql1.sh
## 导入成功，查询数据
	mysql> use bireport;
	Database changed
	mysql> show tables;
	+-----------------------------------+
	| Tables_in_bireport                |
	+-----------------------------------+
	| ruozedata_dealcompany_rep         |
	| ruozedata_operatetrendandcity_rep |
	+-----------------------------------+
	2 rows in set (0.00 sec)

	mysql> select * from ruozedata_dealcompany_rep;
	+------------+--------------+---------+
	| timeid     | sales_amount | company |
	+------------+--------------+---------+
	| 2016-10-30 |     31831.00 | \N      |
	+------------+--------------+---------+
	1 row in set (0.00 sec)

	mysql> select * from ruozedata_operatetrendandcity_rep;
	+------------+--------------+-----------+---------------+---------------+--------------+-----------------------+
	| timeid     | sales_amount | ordernums | deal_products | province_name | city_name    | region_name           |
	+------------+--------------+-----------+---------------+---------------+--------------+-----------------------+
	| 2016-10-30 |     12117.00 |    146.00 |          6.00 | 北京          | 北京市       | 东城区                |
	| 2016-10-30 |       306.00 |     20.00 |          2.00 | 北京          | 北京市       | 朝阳区                |
	| 2016-10-30 |     13376.00 |    254.00 |          3.00 | 北京          | 北京市       | 西城区                |
	| 2016-10-30 |       234.00 |     18.00 |          2.00 | 山东省        | 济南市       | 历下区                |
	| 2016-10-30 |       104.00 |      6.00 |          1.00 | 江西省        | 南昌市       | 高新技术开发区        |
	| 2016-10-30 |      5496.00 |    404.00 |          4.00 | 河北省        | 张家口市     | 涿鹿县                |
	| 2016-10-30 |        78.00 |      6.00 |          1.00 | 浙江省        | 嘉兴市       | 秀洲区                |
	| 2016-10-30 |       120.00 |     10.00 |          1.00 | 黑龙江省      | 七台河市     | 桃山区                |
	+------------+--------------+-----------+---------------+---------------+--------------+-----------------------+
	8 rows in set (0.00 sec)
## 调度执行
	查看脚本：crontab_filterdomain.sh
	可以写到日志中去，追踪一下，因为可能会出错，写了日志的话就方便追踪，做法：
	$> sh /opt/ruozedata/ruozedata_sqoop_job_exec.sh  & >> /xx/xx/xxx.log

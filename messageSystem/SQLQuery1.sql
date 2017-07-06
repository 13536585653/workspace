create database MessageMS;

use MessageMs;  --消息表

create table MessageInfo(
	mid int primary key not null identity(1,1),
	mcontent varchar(200) not null, --mcontent 消息内容
	publish date not null	--发布日期
)

insert into MessageInfo values('没有什么大不了','2012-2-14');
select * from MessageInfo
truncate table MessageInfo
drop table MessageInfo
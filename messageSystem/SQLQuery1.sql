create database MessageMS;

use MessageMs;  --��Ϣ��

create table MessageInfo(
	mid int primary key not null identity(1,1),
	mcontent varchar(200) not null, --mcontent ��Ϣ����
	publish date not null	--��������
)

insert into MessageInfo values('û��ʲô����','2012-2-14');
select * from MessageInfo
truncate table MessageInfo
drop table MessageInfo
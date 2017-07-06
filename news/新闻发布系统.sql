create database newsDB;

use newsDB;

create table news(
	nid int primary key not null identity(1,1),
	ntitle varchar(50) not null,
	nauthor varchar(50) not null,
	ntype varchar(50) not null,
	ncontent ntext not null,
	narea varchar(50) not null,
	ntime datetime 
)
insert into news values(1,1,1,'1',1,1)

select * from news
delete from news where nid=4 or nid=5
--清除所有数据
truncate table news
delete from news

drop database newsDB


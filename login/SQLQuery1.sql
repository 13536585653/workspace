create database loginDB;

use loginDB;

create table userlogin(
	id int primary key not null identity(1,1),
	userName varchar(50) not null,
	passward varchar(100) not null,
	age int ,
	address varchar(50) 
)
insert into userlogin(userName,passward)values('wangzai','123')
drop table userlogin

select * from userlogin
select * from userlogin where userName='wangzai'
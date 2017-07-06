create database user_reg;

use  user_reg;

create table stu_info(
	u_id int primary key not null identity(1,1) ,
	u_name varchar(50) not null,
	u_pwd varchar(100) not null,
	u_sex varchar(20) not null
)

insert into  stu_info values('2','23','ÄÐ')
select * from stu_info
drop table stu_info


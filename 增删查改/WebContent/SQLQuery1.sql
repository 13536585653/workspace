create database userDB;

use userDB;

create table users(
	u_id int primary key not null identity(1,1),
	u_name varchar(50) not null,
	u_age int not null,
	u_address varchar(100)not null
)


--update   users  set u_name='dsaf',u_age=22,u_address='efsd' where u_id=5
select * from users
drop table users
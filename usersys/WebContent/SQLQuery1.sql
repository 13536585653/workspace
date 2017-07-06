use userDB;


create table users(
	u_id int primary key not null identity(1,1),
	u_name varchar(50) not null,
	u_password varchar(100) not null,
	u_age int not null,
	u_address varchar(100) not null
)
insert into  users values(2,'',3,2)

select * from users  u where u.u_name=1

select * from  users where u_id=5;

select * from users;

delete users where u_age=1

delete  from users where u_id=4

drop table users
 
 
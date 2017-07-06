create database EmployeeDB;

use EmployeeDB;

--员工信息表
create table Employee(
	eid int primary key not null identity(1,1),
	ename varchar(50) not null,
	eage int not null,
	esex varchar(20) not null,
	eemail varchar(50) not null
)
insert into Employee values('比比',2,'男','www.com')
select * from Employee
truncate table Employee
drop table Employee
drop database EmployeeDB
create database student;

use student;

create table students(
	id int primary key not null identity(1,1),
	name varchar(50) not null,
	password varchar(100) not null,
	age int not null,
	address varchar(100) not null
) 

select * from students
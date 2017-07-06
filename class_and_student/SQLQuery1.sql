create database class_and_student;

use class_and_student;

--创建班级表
drop table class
create table class(
	cid int primary key not null identity(1,1),
	cname varchar(50) not null,
)
insert into class values('Sisj128班')
select * from class where cname='Sisj128班'
select * from class
drop table class

--创建学生表

create table student(
	sid int primary key not null identity(1,1),
	sname varchar(50) not null,
	sage int ,
	ssex varchar(20) not null,
	c_id int references class(cid) not null,
	m_id int references major(mid) not null
)
drop table student
select * from student

insert into student values('张三',21,'男',1,1)
delete from student where sid=3
select * from student 
drop table student 

--创建专业课程表
create table major(
	mid int primary key not null identity(1,1),
	mname varchar(100) not null,
	mIntroduce varchar(100) not null
)

insert into major values('Java课程','这是一门程序语言')
delete from major where mid=2
select * from major
drop table major

--运用左连接，将三张表连接查询
select * from student s 
left join class c on s.c_id = c.cid 
left join major m on s.m_id = m.mid

--左连接简式
--select * from student  join class on c_id = cid join major on m_id=mid;
drop database class_and_student
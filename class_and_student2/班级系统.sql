create database class_and_student2;

use class_and_student2;

--班级表
create table Class(
	cid int primary key not null identity(1,1),
	cname varchar(50) not null
)
insert into  Class values('sisj120班')
select * from Class
drop table Class

--学生表
create table Student(
	sid int primary key not null identity (1,1),
	sname varchar(50) not null,
	sage int not null,
	ssex varchar(20) not null,
	c_id int references Class(cid) not null
)
insert into Student values('李白',18,'男',4)
select * from Student left join Class on c_id=cid
select * from Student where sage<=18
delete  from Student where sage=34 or sage=19
drop table Student
--删除所有数据
delete  from Student
truncate from Student
--链表查询
select cid,cname,sname,sage,ssex,c_id from Class left join Student on c_id=cid;

--查询所有班级男生和女生的总人数 ，inner join 是条件成立的时候才能用到的（查询条件成立），
--left join 是条件成立、不成立的时候都能用到（查询全部）。
select cname as 班级, ssex as 性别,count(sid) as 人数 from
 Student inner join Class on c_id=cid group by cname,ssex;


 --where 和 having都是条件过滤的语句
 --where用于group by之前，而having用于group by之后作为分组条件，分组条件必须是group by 中出现的列；

 --查询班级年龄大于18岁的人数
 select cname as 班级,sname as 姓名,sage as 年龄,count(sid) as 人数 from
  Student inner join Class on c_id=cid group by cname,sname,sage having sage>12;

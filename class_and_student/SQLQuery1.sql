create database class_and_student;

use class_and_student;

--�����༶��
drop table class
create table class(
	cid int primary key not null identity(1,1),
	cname varchar(50) not null,
)
insert into class values('Sisj128��')
select * from class where cname='Sisj128��'
select * from class
drop table class

--����ѧ����

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

insert into student values('����',21,'��',1,1)
delete from student where sid=3
select * from student 
drop table student 

--����רҵ�γ̱�
create table major(
	mid int primary key not null identity(1,1),
	mname varchar(100) not null,
	mIntroduce varchar(100) not null
)

insert into major values('Java�γ�','����һ�ų�������')
delete from major where mid=2
select * from major
drop table major

--���������ӣ������ű����Ӳ�ѯ
select * from student s 
left join class c on s.c_id = c.cid 
left join major m on s.m_id = m.mid

--�����Ӽ�ʽ
--select * from student  join class on c_id = cid join major on m_id=mid;
drop database class_and_student
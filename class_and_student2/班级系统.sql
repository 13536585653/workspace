create database class_and_student2;

use class_and_student2;

--�༶��
create table Class(
	cid int primary key not null identity(1,1),
	cname varchar(50) not null
)
insert into  Class values('sisj120��')
select * from Class
drop table Class

--ѧ����
create table Student(
	sid int primary key not null identity (1,1),
	sname varchar(50) not null,
	sage int not null,
	ssex varchar(20) not null,
	c_id int references Class(cid) not null
)
insert into Student values('���',18,'��',4)
select * from Student left join Class on c_id=cid
select * from Student where sage<=18
delete  from Student where sage=34 or sage=19
drop table Student
--ɾ����������
delete  from Student
truncate from Student
--�����ѯ
select cid,cname,sname,sage,ssex,c_id from Class left join Student on c_id=cid;

--��ѯ���а༶������Ů���������� ��inner join ������������ʱ������õ��ģ���ѯ������������
--left join ��������������������ʱ�����õ�����ѯȫ������
select cname as �༶, ssex as �Ա�,count(sid) as ���� from
 Student inner join Class on c_id=cid group by cname,ssex;


 --where �� having�����������˵����
 --where����group by֮ǰ����having����group by֮����Ϊ������������������������group by �г��ֵ��У�

 --��ѯ�༶�������18�������
 select cname as �༶,sname as ����,sage as ����,count(sid) as ���� from
  Student inner join Class on c_id=cid group by cname,sname,sage having sage>12;

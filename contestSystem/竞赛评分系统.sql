create database contestDB;

use contestDB;

--������Ŀ��
create table Project(
	projectid int primary key not null identity(1,1),
	projectname varchar(32) not null,
	remark varchar(100)  --��ע
)
insert into Project values('��������','����һ�����ҵľ�����')
select * from Project 
truncate table Project 
--������Ϣ��
create table myScore(
	scoreid int primary key not null identity(1,1),
	Projectid int references Project(projectid), --Projectid�������projectid
	ui float not null,	--ui����
	code Float not null, --�������
	document float not null,--�ĵ�
	speech float not null, --��Ŀ�ݽ�
	sdate datetime not null --ʱ������
)
--��ȡϵͳʱ��
Select CONVERT(varchar(100), GETDATE(), 120) as ϵͳʱ��

insert into myScore values(1,5.5,3.2,12.1,2.6,convert(varchar(100), getdate(), 120))
select projectname as ��Ŀ����,ui as UI�÷�,code as ����÷�,document as �ĵ��÷�,speech as �ݽ��÷�,sdate as ����ʱ�� from
Project p inner join myScore s on s.Projectid=p.projectid group by projectname,ui,code,document,speech,sdate 
select * from myScore
truncate table myScore

drop database contestDB
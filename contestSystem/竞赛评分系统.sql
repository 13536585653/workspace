create database contestDB;

use contestDB;

--竞赛项目表
create table Project(
	projectid int primary key not null identity(1,1),
	projectname varchar(32) not null,
	remark varchar(100)  --备注
)
insert into Project values('体育竞赛','这是一场激烈的竞争！')
select * from Project 
truncate table Project 
--评分信息表
create table myScore(
	scoreid int primary key not null identity(1,1),
	Projectid int references Project(projectid), --Projectid关联外键projectid
	ui float not null,	--ui界面
	code Float not null, --代码设计
	document float not null,--文档
	speech float not null, --项目演讲
	sdate datetime not null --时间日期
)
--获取系统时间
Select CONVERT(varchar(100), GETDATE(), 120) as 系统时间

insert into myScore values(1,5.5,3.2,12.1,2.6,convert(varchar(100), getdate(), 120))
select projectname as 项目名称,ui as UI得分,code as 代码得分,document as 文档得分,speech as 演讲得分,sdate as 评分时间 from
Project p inner join myScore s on s.Projectid=p.projectid group by projectname,ui,code,document,speech,sdate 
select * from myScore
truncate table myScore

drop database contestDB
create database pictureDB; 

use pictureDB;

--photoinfo ��Ƭ��Ϣ��
create table photoinfo(
	id int primary key not null identity(1,1),
	name varchar(50) not null,
	count int not null,
	type varchar(50) not null,
	email varchar(50),
	tel varchar(50) not null
)
insert into photoinfo values('p1',22,'�ڰ�','www.34323.com','12243433424')
insert into photoinfo values('p4',13,'��ɫ','www.3243.con','1255545555')
select * from photoinfo
delete from photoinfo where tel='1'

truncate table photoinfo
create database booksDB;

use booksDB;
create table Users(
	u_id int primary key not null identity(1,1),
	u_name varchar(50) not null,
	n_password varchar(100) not null
)
select * from Users
insert into Users values(1,1)


create table BookType(
	bt_id int primary key not null identity(1,1),
	bt_type varchar(100) 

)
insert into BookType values('������')
insert into BookType values('ϲ����')
insert into BookType values('�ƻ���')
insert into BookType values('������')
delete from BookType where bt_id=3
select * from BookType where bt_type='������'
select * from BookType 
drop table BookType

create table Books(
	b_id int primary key  not null identity(1,1),
	b_name varchar(100) not null,
	b_date varchar(100) not null,
	btid int references BookType(bt_id) not null --������bt_id�������btid
)
insert into Books values('����Ĺ���','2016-6-15',2)
insert into Books values('����','2015-3-23',1)
select * from Books
drop table Books

--�����Ӳ�ѯ
--select b_name,b_date,bt_type from BookType bt inner join Books b on bt_id = btid where bt.bt_type='ϲ����'
--�����Ӳ�ѯ
select b.b_id,b.b_name,b.b_date,bt.bt_id,bt.bt_type from Books b left join BookType bt on bt_id=btid ;
--��������
--select b.b_id,b.b_name,b.b_date,bt.bt_type from Books b ,BookType bt where b.b_id=bt_id and bt.bt_type ='ϲ����'


drop database booksDB
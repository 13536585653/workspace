use testDB2
create table table1(
t_id int primary key,
t_name varchar(50) not null,
t_address varchar(50) not null,
t_age int not null,
t_num varchar(20) not null
)
drop table table1
--�����������
--insert into table1 values(1,'����','�麣',22,1302323483)
--insert into table1 values(2,'����','����',34,1243892529)

select��* from product1
select * from table1

--��д�洢����1,��������
go
create proc p1
as
print '�洢���̱�ִ����'
update table1 set t_age=30 where t_id=1
go
--ִ�д洢����
exec p1;



--��д�洢����2,������
go
create proc p2
@id int
as
print '�洢���̱�ִ����'
update table1 set t_age=30 where t_id=@id

go
--���ô������Ĵ洢����
exec p2 4


--��д�����������з���ֵ�Ĵ洢����
go
create proc p3
@age int 
as
return  (select COUNT(*) from table1 where t_age<=@age);

exec p3 25
go
--��д��in������out�����Ĵ洢����
go
create proc p4
@age int,@num  int  out
as
set @num=(select COUNT(*) from table1 where t_age<=@age);
go
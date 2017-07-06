use testDB2
create table table1(
t_id int primary key,
t_name varchar(50) not null,
t_address varchar(50) not null,
t_age int not null,
t_num varchar(20) not null
)
drop table table1
--插入测试数据
--insert into table1 values(1,'张三','珠海',22,1302323483)
--insert into table1 values(2,'李四','深圳',34,1243892529)

select　* from product1
select * from table1

--编写存储过程1,不带参数
go
create proc p1
as
print '存储过程被执行了'
update table1 set t_age=30 where t_id=1
go
--执行存储过程
exec p1;



--编写存储过程2,带参数
go
create proc p2
@id int
as
print '存储过程被执行了'
update table1 set t_age=30 where t_id=@id

go
--调用带参数的存储过程
exec p2 4


--编写带参数并且有返回值的存储过程
go
create proc p3
@age int 
as
return  (select COUNT(*) from table1 where t_age<=@age);

exec p3 25
go
--编写带in参数和out参数的存储过程
go
create proc p4
@age int,@num  int  out
as
set @num=(select COUNT(*) from table1 where t_age<=@age);
go
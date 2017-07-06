create database TestDB
use TestDB

create table product(
id int primary key not null identity(1,1),
p_id int,
p_name varchar(20),
p_price varchar(10)
)

insert into product(p_id,p_name,p_price)values(1,'уехЩ',100)
--drop table product
select * from product
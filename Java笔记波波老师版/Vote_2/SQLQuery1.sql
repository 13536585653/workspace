create database vote_db;

use vote_db;


create table admins(
 
  admin_id  int primary key identity(1,1),
  admin_name varchar(50) not null,
  admin_pwd  varchar(100) not null 
 )
 
 
 create table vote(
   v_id int primary key identity(1,1),
   v_title varchar(50) not null,
   v_desc  text ,
   v_type varchar(20) not null
 )
 
 create table vote_option(
    o_id  int primary key identity(1,1),
    o_name varchar(50) not null,
    v_id  int not null,
    o_ticket  int not null
 )
 
 create table users(
   u_id int primary key identity(1,1),
   u_name varchar(50) not null,
   u_pwd  varchar(100) not null
 )
 
 create table user_vote(
   
   uv_id  int primary key identity(1,1),
   u_id  int not null,
   v_id  int not null,
   uv_time  datetime not null
)
 


--³õÊ¼¼ÇÂ¼
insert into admins(admin_name,admin_pwd)
values('admin','123456');
 
 select * from admins

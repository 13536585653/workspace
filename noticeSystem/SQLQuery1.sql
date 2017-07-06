create database noticeSystem;

use noticeSystem;

create table admins(
	a_id int primary key not null identity(1,1),
	a_name varchar(50) not null,
	a_pwd varchar(100) not null,
	a_position varchar(50)not null

)

create table users(
	u_id int primary key not null identity(1,1),
	u_name varchar(50) not null,
	u_pwd varchar(100) not null,
	u_position varchar(50)not null

)

create table Bulletin_board(
	bb_id int primary key not null identity(1,1),
	bb_title varchar(50) not null,
	bb_details varchar(50) not null,
    bb_time date not null,
	bb_author varchar(50) not null
)

select * from admins
select * from users
select * from Bulletin_board
use stuDB;


create table student(
  
  s_id  int primary key identity(1,1),
  s_name varchar(50) not null,
  s_age int not null,
  s_sex varchar(10) not null,
  s_fun varchar(50) not null
)


create database Student_Exam;
use Student_Exam;

create table Student_info
(
Enrollment varchar(30) primary key,
FirstName varchar(20) not null,
LastName varchar(20)not null,
college varchar(20) not null,
Branch varchar(20)not null,
semester varchar(20)not null,
Gmail varchar(20) not null unique,
Mobile varchar(20) not null unique,
photo longblob ,
Gender varchar(20) not null,
password varchar(20) not null
); 
select * from Student_info;
drop table Student_info;

create table quetions
(
     count int(11) primary key,
     quetions  varchar(1000),
     op1 varchar(20),
     op2 varchar(20),
     op3 varchar(20),
     op4 varchar(20),
     ans varchar(20)
);
create table Answer
(
   Enrollment varchar(15),
   count int (10),
   ans varchar(10)


);

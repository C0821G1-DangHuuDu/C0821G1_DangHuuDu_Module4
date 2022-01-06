drop database if exists user_manager_modue4;

create database user_manager_modue4;

use user_manager_modue4;

create table user_manager (
id int primary key,
first_name varchar(50),
last_name varchar(50),
phone_number varchar(20),
age int,
email varchar(50)
);

insert into user value 
(1, "dong", "nguyen", "0905111222",21,"dong@gmail.com"),
(2, "dong", "van", "0905111333",22,"dongvan@gmail.com"),
(3, "ba", "tran", "0905111444",23,"ba@gmail.com"),
(4, "tom", "dddd", "0905111555",23,"tom@gmail.com"),
(5, "bao", "tran", "0905111666",27,"bao@gmail.com"),
(6, "du", "van", "0905111777",31,"du@gmail.com"),
(7, "vy", "tran", "0905111888",26,"vy@gmail.com");

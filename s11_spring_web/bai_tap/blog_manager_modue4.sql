drop database if exists blog_manager_modue4;

create database blog_manager_modue4;

use blog_manager_modue4;

create table blog(
id int primary key auto_increment,
`name` varchar (50),
content varchar (255),
note varchar (255)
);

insert into blog value
(1, "dong", "nguyen", "abc"),
(2, "dong", "van", "abc1"),
(3, "ba", "tran", "abc2"),
(4, "tom", "dddd", "abc3"),
(5, "bao", "tran", "abc4"),
(6, "du", "van", "abc5"),
(7, "ba", "tran", "abc6"),
(8, "tran", "dddd", "abc7"),
(9, "vy", "tran", "abc8"),
(10, "tien", "dddd", "abc9");
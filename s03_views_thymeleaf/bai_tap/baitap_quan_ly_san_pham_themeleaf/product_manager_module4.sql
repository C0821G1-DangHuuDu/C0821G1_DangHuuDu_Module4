drop database if exists product_manager_modue4;

create database product_manager_modue4;

use product_manager_modue4;

create table product(
id int primary key auto_increment,
`name` varchar (50),
factory varchar (50),
price double
);

insert into product (`name`,factory,price) value ('Iphone 11','Apple', 15000000);
insert into product (`name`,factory,price) value ('Iphone 12','Apple', 16000000);
insert into product (`name`,factory,price) value ('Samsung Note 9','Samsung', 9000000);
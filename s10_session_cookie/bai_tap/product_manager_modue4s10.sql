drop database if exists product_manager_modue4s10;

create database product_manager_modue4s10;

use product_manager_modue4s10;

create table product(
id int primary key auto_increment,
`name` varchar (50),
price double,
detail varchar (255),
quantity int default 0
);

insert into product (`name`,price,detail, quantity) value 
('Iphone 11', 15000000,'Bảo hành chính hãng điện thoại 1 năm',0),
('Iphone 12', 16000000,'Bảo hành chính hãng điện thoại 1 năm',1),
('Samsung Note 9', 9000000,'Bảo hành chính hãng điện thoại 1 năm',2);
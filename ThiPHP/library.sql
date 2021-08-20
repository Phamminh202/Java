DROP DATABASE IF EXISTS library;
create database if not exists library;

use library;

drop table if exists books;
create table books (
    bookid int(11) AUTO_INCREMENT,
    authorid int(11),
    title varchar(55),
    ISBN varchar(25),
    pub_year SMALLINT(6),
    available tinyint(4),
    primary key (bookid));

insert into books values (1, 1,'The last day','051-457-98','1961',1 );
insert into books values (2, 1,'Legendary Moonlight Sculptor','037-214-64','1968',1 );
insert into books values (3, 2,'Dragon Ball ','064-214-84','1989',1 );
insert into books values (4, 2,'End Game','026-914-20','1958',1 );
insert into books values (5, 2,'One piece','021-547-61','1992',1 );

select * from books;
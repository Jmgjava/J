use testdb; -- 사용할 DB선택
show tables; -- DB에 테이블 조회

show databases;
drop table member_tbl1;

create table member_tbl1 (
no int auto_increment,
userId varchar(100) not null unique,
userPw varchar(100) not null unique,
gender varchar(10) not null unique,
hobby varchar(255) not null unique,
phone varchar(255) not null unique,
city varchar(10) not null unique,
memo varchar(255) not null unique,
primary key(no)
);


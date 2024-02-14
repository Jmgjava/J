-- 데이터베이스 조회
show databases;
-- DB생성
create database testdb;
-- DB 삭제
drop database testdb;
-- 사용할 DB 선택
use testdb;
-- DB 테이블 조회
show tables;
-- 사용자 생성 -- root(사용자권한)
create user 'user1'@'localhost' identified by '1111';
-- 사용자에게 권한을 설정
grant all privileges on *.* to 'user1'@'localhost';
-- 권한 적용
flush privileges;
-- 권한 확인
show grants for user1@'localhost';
-- 사용자에게 권한을 해제
revoke all privileges on  *.* from user1@localhost;

show databases;
show testdb;

drop table member1;
create table member1(
	no 	int not null auto_increment, -- 오라클의 sequence 1씩 증가(기본키)
	userId varchar(100) not null unique,
    userPw varchar(100) not null,
    userName varchar(100) not null,
    primary key(no)
);
show tables;

desc member1;

-- 데이터 추가
insert into member1(userId,userPw,userName) values('m1','11','s1'); -- 자동 commit;
insert into member1(userId,userPw,userName) values('m2','21','s2'); -- 자동 commit;
insert into member1(userId,userPw,userName) values('m3','31','s3'); -- 자동 commit;
insert into member1(userId,userPw,userName) values('m4','41','s4'); -- 자동 commit;
insert into member1(userId,userPw,userName) values('m5','51','s5'); -- 자동 commit;
-- 데이터 조회
select * from member1;
-- 데이터 수정
update member1 set userPw='22', userName='d1' where no=1;
-- 데이터 삭제
delete from member1 where no=1;



drop table board1;

create table board1(
	no int not null auto_increment, -- 게시글번호
	btitle varchar(255) not null,
    bcontent varchar(255) not null,
    userId varchar(100),
    primary key(no)
);

desc board1;

-- 외래키 설정
alter table board1
add constraint board1_FK
foreign key (userId)
references member1(userId)
on update cascade on delete cascade; -- 부모가 삭제되면 자식들도 삭제
-- on update cascade on delete restrict; -- 부모를 참조하면 삭제 불가능 

select * from member1;
select * from board1;
desc board1;

insert into board1(btitle,bcontent,userId) values('t1','c1','m2');
insert into board1(btitle,bcontent,userId) values('t2','c2','m3');
insert into board1(btitle,bcontent,userId) values('t1','c1','m3');
insert into board1(btitle,bcontent,userId) values('t13','c14','m5');

select * from board1;
select * from member1;

delete from member1 where userId='m2';
select *from all_users;
-- select * from 테이블;
-- all_users테이블(모든 사용자 정보)에서 모든 레코드 조회
-- system. sys 관리자 계정
select *from all_tables;
-- 오라클 현재 사용중인 테이블 조회

CREATE TABLE member0129(
    userId  varCHAR2(100)     not null,
    userPw VARCHAR2(100) not null,
    age number not null,
    name VARCHAR2(100) not null,
    PRIMARY key(userId)
);

-- 테이블 상세 내역
desc member0129;

-- 테이블 수정
alter table member0129 modify name not null;

desc member0129;

-- 테이블 조회
select * from member0129;

select member0129.userId from member0129;

--select member0129.userId , member0129,userPw from member0129;

-- 테이블 삭제
drop table member0129;

select* from member0129;

desc member0129;

-- 회원 등록
insert into member0129(userId, userPw,age,name) values('m1', '1111' ,11, 'name1');
insert into member0129(userId, userPw,age,name) values('m2', '2111' ,21, 'name2');
insert into member0129(userId, userPw,age,name) values('m3', '3111' ,31, 'name3');
insert into member0129(userId, userPw,age,name) values('m4', '4111' ,41, 'name4');

-- commit
commit;

-- rollback
ROLLBACK;

-- 전체 목록 조회
select* from member0129;

select member0129.userId from member0129;

select member0129.userId, userPw from member0129;

select userId, userPw from member0129;

select * from member0129 where userid='m1';

-- userID가 'm1'이 존재하면 1를 반환
select count(*) from member0129 where userid='m1';

select*from member0129;

-- 데이터 수정
update member0129 set userPw='3333',age=30,name='이름' where userId='m1';

commit;

Rollback;

-- 데이터 삭제
SELECT *from member0129;

delete from member0129 where userId='m4';

commit;
rollback;


insert into member0129(userId,userPw,age,name) VALUES('m4','4444','40','이이');

select *from member0129;

commit;
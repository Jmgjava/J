---   실습

drop table member0207;

create table member0207(
    custno number(6) not null,
    custname varchar2(20),
    phone varchar2(13),
    address varchar2(60),
    joindate date,
    grade char(1) ,
    city char(2) ,
    primary key(custno)
);

drop sequence custno2_seq;

create sequence custno2_seq
increment by 1
start with 100001
nocycle;


insert into member0207
values (custno2_seq.nextval, '김이름', '010-1111-2222', '서울 노원구 중계1동', '20241202', 'A', '01');
insert into member0207
values (custno2_seq.nextval, '이소리', '010-1111-3333', '서울 노원구 중계2동', '20241206', 'B', '01');
insert into member0207
values (custno2_seq.nextval, '박수진', '010-1111-4444', '경기도 수원시 망포동', '20241001', 'B', '03');
insert into member0207
values (custno2_seq.nextval, '최수원', '010-1111-5555', '경기도 의정부시 감축동', '20241113', 'A', '03');
insert into member0207
values (custno2_seq.nextval, '강만기', '010-1111-6666', '제주도 제주시 서귀포', '20241225', 'B', '06');
insert into member0207
values (custno2_seq.nextval, '우리민', '010-1111-7777', '강원도 춘천시 춘천동', '20241211', 'C', '06');

commit;

select * from member0207;




drop table money0207;

CREATE TABLE money0207(
custno number(6),
salenol number(8),
pcost number(8),
amount number(4),
price number(8),
pcode varchar2(4),
sdate date
);

insert into money0207 values(100001, 2024001, 500, 5, 2500, 'A001', '20240101');
insert into money0207 values(100001, 2024002, 1000, 4, 4000, 'A002', '20240101');
insert into money0207 values(100001, 2024003, 500, 3, 1500, 'A008', '20240101');
insert into money0207 values(100002, 2024004, 2000, 1, 2000, 'A004', '20240102');
insert into money0207 values(100002, 2024005, 500, 1, 500, 'A001', '20240103');
insert into money0207 values(100003, 2024006, 1500, 2, 3000, 'A003', '20240103');
commit ;

-- 외래키 설정 money0207 테이블 custno 외래키 설정 참조테이블 member0207(custno) 설정********************************
-- 외래키 명은 custnoFK
alter table money0207 -- 외래키 설정 테이블 (다, N)
add CONSTRAINT custno_fk -- 제약조건명(constraint)
foreign key (custno) -- 외래키 설정 테이블 (다,N) 칼럼 -> 외래키로 설정
references member0207(custno) -- 주키(PK,PK 성질) 테이블(참조키,주키)
on delete cascade -- 참조키(주키)를 삭제하는 참조하고있는 외래키 데이터를 삭제해라 -- on delete cascae -> 부모레코드(1)을 삭제하는 자식레코드가 삭제(다)
--                                제약조건명 삭제
alter table money0207 drop constraint custno_fk;



-- ORA -02298 에러 확인
select (custno) from money0207 minus select (custno) from member0207;




--참조 무결성 위반 -> 외래키
--insert into money0207 values(100007, 2024002, 1000, 4, 4000, 'A002', '20240101');
--insert into money0207 values(100008, 2024003, 500, 3, 1500, 'A008', '20240101');

-- delete from member0207 where custno=100001 on delete cascade;

-- 상품 구매자
select * from member0207;
-- 상품 구매내역
select * from money0207;

select me.*
from member0207 me inner join money0207 mo
on me.custno=mo.custno
;

select me.custname , me.grade
from member0207 me inner join money0207 mo
on me.custno=mo.custno
;

select me.custname 구매자 , me.grade 등급
from member0207 me inner join money0207 mo
on me.custno=mo.custno
;

-- 상품 구매내역이 있는 구매자의 등급을 조회 -- 구매자이름, 등급만 조회
select me.custname 구매자 , me.grade 등급
from member0207 me inner join money0207 mo
on me.custno=mo.custno -- 상품 구매내역이 있는 구매자
group by (me.custname , me.grade)
order by me.grade asc;

drop table group2;

create table group2(
    name varchar2(100) not null, --이름
    price number not null,
    depart varchar2(100) not null -- 부서
);

insert into group2(name,price,depart) values('m1',1000,'영업부');
insert into group2(name,price,depart) values('m2',2000,'영업부');
insert into group2(name,price,depart) values('m3',1500,'기획부');
insert into group2(name,price,depart) values('m4',3660,'기획부');
insert into group2(name,price,depart) values('m5',5800,'홍보부');
insert into group2(name,price,depart) values('m6',4480,'홍보부');

commit;


-- 서브 쿼리(SubQuery)
-- select 컬럼A, 컬럼B …. from 테이블명 where 조건연산자(서브쿼리);
select *
from group2
where price > ( select avg(price) from group2);

select round(avg(price),2) from group2 group by depart;

select round(avg(price),2) from group2;

select *
from group2
where price > ( select round(avg(price),2) from group2);


-- VIew
--create or replace view 뷰 이름 as select 칼럼1, 칼럼2, from 테이블 ;
--create view 뷰이름 as select 칼럼1, 칼럼2 from 테이블;
create view member0207_view
as
select custno, custname from member0207;

select* from user_views;

select* from member0207_view;


--인덱스
--생성
select*from group2;
create index group2_index on group2(name,price,depart);

select * from all_ind_columns
where table_name = 'group2'
order by 'group2_index';

select*from user_indexes; -- 인덱스 조회
select table_name from user_indexes; -- 인덱스 테이블 조회
select * from user_ind_columns; -- 인덱스가 설정된 컬럼
select * from user_ind_columns where table_name='GROUP2'; -- 인덱스가 설정된 컬럼

select table_name, index_name
from user_indexes
where table_name='GROUP2';
-- 삭제
drop index group2_index;



-- 사용자 권한 설정, 수정 ,삭제

select * from all_users; // 모든 계정에 대한 정보
select * from dba_users; // 모든 계정에 대한 정보

select username from all_users; // 모든 계정 이름
select username from dba_users; // 모든 계정 이름

-- 사용자 계정 생성 -> 관리자 권한 있는 계정(system.sys)
-- create user 계정이름 identified by 계정 비밀번호;
create user user1 identified by 1111;

--계정 비밀번호 수정
--alter user 계정이름 identified by 새비밀번호;
alter user user1 identified by 2222;

-- DDL
--계정 권한
--grant create [권한명] to [계정];
grant create sysdba to user1;
-- 권한 삭제
revoke sysdba from user1;

-- 계정 삭제
drop user user1 cascade;

--------------------------------------------------

--TCL 실습----------------------------------

drop table test0207;

create table test0207(
name varchar2(100)not null,
age number not null
);

desc test0207;
select * from test0207;


-- 사용자 권한 설정, 수정 ,삭제

select * from all_users; // 모든 계정에 대한 정보
select * from dba_users; // 모든 계정에 대한 정보

select username from all_users; // 모든 계정 이름
select username from dba_users; // 모든 계정 이름

-- 사용자 계정 생성 -> 관리자 권한 있는 계정(system.sys)
-- create user 계정이름 identified by 계정 비밀번호;
create user user1 identified by 1111;

--계정 비밀번호 수정
--alter user 계정이름 identified by 새비밀번호;
alter user user1 identified by 2222;

-- DDL
--계정 권한
--grant create [권한명] to [계정];
grant connect,resource,dba to user1;
-- 권한 삭제
revoke connect,resource,dba from user1;

-- 계정 삭제
drop user user1 cascade;

truncate table test0207;

insert into test0207(name,age) values('m1',1);
insert into test0207(name,age) values('m2',2);
insert into test0207(name,age) values('m3',3);
insert into test0207(name,age) values('m4',4);
insert into test0207(name,age) values('m5',5);
insert into test0207(name,age) values('m6',6);
commit;
-- A savepoint -> 자동 설정된 savepoint
delete from test0207 where name ='m1';
savepoint p1; -- savepoint 설정
delete from test0207 where name='m2';
savepoint p2;
select*from test0207;
--rollback
rollback; -- commit 전단계로 이동
-- 특정 savepoint로 rollback
rollback to p1;
-- 특정 savepoint로 rollback 2
rollback to p2;
commit;
select* from test0207;
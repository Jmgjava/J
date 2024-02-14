drop table employee;

-- 회사 소속 직원테이블
create table employee     (
       emp_id  number       NOT NULL ,                      -- 직원번호 고유번호 , 시퀀스 1000시작
       emp_name     varchar2(100)       NOT NULL ,  -- 직원이름
       emp_depart    varchar2(100)     NOT NULL  ,  -- 부서이름 (외래키)  -> 부서테이블 부서명
       emp_email        varchar2(255)    NOT NULL   , -- 직원이메일       
       create_date date  default sysdate,                  -- 입사일
       primary key( emp_id)
);
-- 시퀀스
create sequence employee_SEQ
increment by 1
start with 1000
nocycle;

-- 회사  부서 테이블
create table department(
	depart_id number not null, -- 부서 고유 아이디 , 시퀀스 1시작
	depart_name  varchar2(100)  not null  unique ,  -- employee  emp_depart외래키의 기본키
	primary key(depart_id)
);

-- 시퀀스
create sequence department_SEQ
increment by 1
start with 1
nocycle;

desc employee;
desc department;

select * from employee;
select * from department;

-- 외래키 설정  employee테이블 emp_depart칼럼 department 테이블  depart_name 칼럼을 참조 한다.
-- emp_depart칼럼의 데이터는 반드시  depart_name 칼럼의 값만 추가할수 있다.
-- emp_depart칼럼의 데이터가 depart_name 칼럼 이외의 값을 추가 하면 참조 무결성 위반.
--1: 다,  1:N

-- 외래키 설정 ******
alter table employee    	  -- employee 테이블
add foreign key(emp_depart) 	 -- emp_depart칼럼을 외래키로 등록해라 
REFERENCES department(depart_name); -- 기본키 또는 기본키 성질(UNIQUE) 갖는 키


-- 회사 부서 설정
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'영업부');
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'기획부');
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'마케팅부');
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'홍보부');
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'기술부');

commit;

select * from department;

-- 직원을 등록
desc employee;

insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'김이름','영업부','a@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'김이름2','영업부','a1@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'박이름1','영업부','a2@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'박이름2','기획부','b2@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'이민수','기획부','b3@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'강민수','마케팅부','c3@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'송민정','홍보부','c4@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'김민수','홍보부','d4@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'최강수','기술부','e4@email.com');

commit;

select*from employee;
select*from department;
desc employee;

-- 부서별 직원 수
select em.emp_depart, count(*) as 직원수
from employee em
group by em.emp_depart;

-- 부서별 직원 수 많은순서
select em.emp_depart, count(*) as 직원수
from employee em
group by em.emp_depart
order by 직원수 desc;

-- 부서 별 직원수가 2명 이상이고 많은순
select em.emp_depart, count(*) as 직원수
from employee em
group by em.emp_depart
having count(*) >= 2
order by 직원수 desc;


select emp_depart, count(*) as 직원수 from employee group by emp_depart order by emp_depart desc;





-- 실습테이블
drop table u1_tb;

drop table bi_tb;

--게시글 작성자
create table u1_tb(
    userId varchar(100) not null primary key,
    username varchar(100) not null
);
insert into u1_tb(userId,username) values('m1','s1'); //userId(중복X,Not Null)-. 게시글
insert into u1_tb(userId,username) values('m2','s1');
insert into u1_tb(userId,username) values('m4','s1');
insert into u1_tb(userId,username) values('m4','s2');
commit;
--게시글
create table bi_tb(
    board varchar(200) not null,    -- 게시글
    bid varchar(100) not null       -- 게시글 작성자
);
insert into bi_tb(board,bid) values('con1','m1');
insert into bi_tb(board,bid)  values('con2','m1');
insert into bi_tb(board,bid)  values('con3','m4');
insert into bi_tb(board,bid)  values('con3','m4');
insert into bi_tb(board,bid)  values('con3','m5');
insert into bi_tb(board,bid)  values('con3','m6');

commit;

select*from u1_tb;
select*from bi_tb;

select*from bi_tb where bid='m1';
select*from u1_tb where userId='m1';

-- union
select*from bi_tb where bid='m1'
UNION
select*from u1_tb where userId='m1';

select*from bi_tb where bid='m2'
UNION
select*from u1_tb where userId='m2';

select*from bi_tb where bid='m3'
UNION
select*from u1_tb where userId='m3';

-- intersect
select*from bi_tb where bid='m1'
Intersect
select*from u1_tb where userId='m1';

select*from bi_tb where bid='m1'
minus
select*from u1_tb where userId='m1';

select *from u1_tb;
select *from bi_tb;
-- u1_tb userID='m1', bl_tb bid m1 일치하는 두테이블의 레코드를 조회
select*
from u1_tb u inner join bi_tb b
on  u.userid=b.bid
;

select u.*
from u1_tb u inner join bi_tb b
on  u.userid=b.bid
;
--outer join
-- left outer join
select u.*
from u1_tb u left outer join bi_tb b
on  u.userid=b.bid
;

select u.*
from u1_tb u right outer join bi_tb b
on  u.userid=b.bid
;

select u.*
from u1_tb u full outer join bi_tb b
on  u.userid=b.bid
;

select u.*
from u1_tb u cross join bi_tb
;

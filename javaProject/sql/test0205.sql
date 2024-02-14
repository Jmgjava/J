drop table member0205;

CREATE table member0205(
    no number not null primary key,
    userId VARCHAR2(255) not null UNIQUE,
    userPw VARCHAR2(255) not null,
    email VARCHAR2(255) not null
);

desc member0205;


-- 시퀀스
drop SEQUENCE member0205_SEQ;

CREATE SEQUENCE member0205_SEQ
    increment by 1
    start with 1
    minvalue 1
    maxvalue 1000
    nocycle
    nocache;
    
-- 시퀀스 확인    
select * from user_sequences;
-- 현재 시퀀스
select member0205_SEQ.currval from dual;
-- 현재 시퀀스의 다음 시퀀스
select member0205_SEQ.nextval from dual; -- 시퀀스 같이 실행



-- 게시글 테이블 board0205 ** member0205에 등록된 userId 회원에 대해서만 작성할 수 있다.
-- 외래키 설정
drop table board0205;

create table board0205(
    no  number not null, -- 시퀀스 member0205_SEQ
    bTitle VARCHAR(255) not null UNIQUE,
    bCount VARCHAR(255) not null,
    bWriter VARCHAR2(255) not null, -- 외래키(PK)
    bNickName VARCHAR2(255) not null,
    primary key(no)
);

desc board0205;

-- 시퀀스 설정
drop SEQUENCE board_SEQ;

CREATE SEQUENCE board0205_SEQ
    increment by 1
    start with 1
    minvalue 1
    maxvalue 1000
    nocycle
    nocache;
    
-- 시퀀스 확인    
select * from user_sequences;
-- 현재 시퀀스
select board0205_SEQ.currval from dual;
-- 현재 시퀀스의 다음 시퀀스
select board0205_SEQ.nextval from dual; -- 시퀀스 같이 실행

-- 게시글 테이블 board0205 bWriter는 member0205 userId의 외래키이다.
alter table board0205
add foreign key (bWriter)
references member0205(userId); -- 참조키

-- 회원 5명 더미데이터로 표기
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m1','1111','ddd1@naver.com');
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m2','2111','ddd2@naver.com');
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m3','3111','ddd3@naver.com');
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m4','4111','ddd4@naver.com');
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m5','5111','ddd5@naver.com');

truncate table member0205;

-- 게시글 테이블 board0205 bWriter는 member0205 userId의 외래키이다.
alter table board0205
add CONSTRAINT board0205_PK foreign key (bWriter)
references member0205(userId); -- 참조키

-- 외래키 설정되어있는 경우 주의
truncate table member0205;

commit;
rollback;

select * from member0205;

-- 오라클 실습용 테이블
select * from HR.employees;
select * from HR.departments;

-- dual 테이블
-- 오라클 자체에서 제공되는 테이블
-- 간단하게 함수를 이용해서 계산 결과값을 확인 할 때 사용하는 테이블
-- 오직 한 행, 한 컬럼을 담고 잇는 dummy 테이블
select count(*) from member0205;
select SUSDATE from DUAL; -- date
select CURRENT_DATE from DUAL;
select board0205_SEQ.currval from dual;

select * from HR.employees;

select first_name, last_name, salary + 10000, hire_date
from HR.employees;

select forst_name, salary
FROM HR.employees;
select first_name as 이름, salary 급여 -- as 생략가능
FROM HR.employees;

-- member0205 회원등록된 userId 작성자만 board0205 게시글을 5개 작성
insert into board0205(no,bTitle,bCount,bWriter,bNickName) VALUES(board0205_seq.nextval,'제목1','내용1','m1','닉1');
insert into board0205(no,bTitle,bCount,bWriter,bNickName) VALUES(board0205_seq.nextval,'제목2','내용2','m2','닉2');
insert into board0205(no,bTitle,bCount,bWriter,bNickName) VALUES(board0205_seq.nextval,'제목3','내용3','m3','닉3');
insert into board0205(no,bTitle,bCount,bWriter,bNickName) VALUES(board0205_seq.nextval,'제목4','내용4','m4','닉4');
select first_name as 이름, salary 급여
FROM HR.employees;


-- 참조 무결성 위반
insert into board0205(no,bTitle,bCount,bWriter,bNickName) 
VALUES(board0205_seq.nextval,'제목5','내용5','m52','닉5');
commit;

select*from board0205;

select department_id FROM HR.employees;
select distinct department_id FROM HR.employees;

-------------------------------------연습-------------------------------------

drop table testdb1;

create table testdb1(
    userId VARCHAR2(255) not null,
    userAge number not null,
    userName VARCHAR2(255) not null,
    primary key(userId)
);

desc testdb1;

insert into testdb1(userId,userage,username) VALUES ('m1','11', 's1');
insert into testdb1(userId,userage,username) VALUES ('m2','21','s2');
insert into testdb1(userId,userage,username) VALUES ('m3','31','s3');
insert into testdb1(userId,userage,username) VALUES ('m4','41','s4');

--SQL> select userId,userAge,userName from testdb1;
--SQL> select*from testdb1;  -- 전체목록(회원,게시글, 상품....) -> List<E>
select userId,userAge,userName from testdb1;
select*from testdb1;
-- 작성자중 m1 을 제외한 글
select*from board0205 where bWriter <> 'm1';

--** AND
-- 두 가지 조건을 모두 만족해야만 검색
-- AND
-- select * from 테이블 where 칼럼명1 = 값1 AND 칼럼명2 >= 값2 --
--SQL> select * from testdb1 where userId='m1' and userAge > 10;

select * from testdb1 where userId='m1' and userAge > 10;

-- select * from 테이블 WHERE NOT 칼럼명1='A' AND NOT 칼럼명1 ='B';
select * from testdb1 where not userId='m1' and not userAge<=20;

select * from testdb1 where userAge between 10 and 30; -- 10 <= X <=30
--select*from 테이블 where 칼럼 IN(값1,값2);
select * from testdb1 where userId IN('m1','m4');

select*from testdb1 where userId not in('m1','m4');
                                                -- 1 or 2
select * from testdb1 where userId <> 'm1' or userId<>'m2';
                                                -- 1 and 2                          // not in 일치
select * from testdb1 where userId <> 'm1'and userId<>'m2';
-- select * from 테이블 where 칼럼명1 like 's%';
-- 첫 번째 위치에 s가 포함된 것
select * from testdb1 where userName like 's%';
-- LIKE S가 시작, 끝 모두 포함
select * from testdb1 where userName like '%s%';

select*from  HR.employees;

select em.first_name, em.salary
from HR.employees em
where em.first_name = 'Steven'; -- 정확한 값 검색

select em.first_name, em.salary
from HR.employees em
where em.first_name like 'S%';  -- 시작하는 문자열 검색

select em.first_name, em.salary
from HR.employees em
where em.first_name like '%en'; -- 으로 끝나는 문자열 검색

select em.first_name, em.salary
from HR.employees em
where em.first_name like '%St%'; -- 포함되어 있는 문자열 검색

-- 오라클 정렬 (숫자 > 영어 > 한글 순서)
select * from board0205 order by no asc; -- 오름차순
select * from board0205 order by no desc; -- 내림차순
select * from board0205 order by btitle asc;
select * from board0205 order by btitle desc;

select * from member0205 order by userId asc;
select * from member0205 order by no desc;

-- HR.employees 테이블에서
select* from HR.employees em;
select em.hire_date from HR.employees em order by em.hire_date asc; -- em.hire_date별로 오름차순 조회
select em.hire_date from HR.employees em order by em.hire_date desc; -- em.hire_date별로 내림차순 조회
select em.hire_date from HR.employees em where em.hire_date > '08/01/01'
order by em.hire_date desc; -- '08/01/01' 이후의 레코드를 em.hire_date별로 내림차순 조회 *

-- HR.employees 테이블에서 2008년 1월의 레코드를 em.hire_date별로 내림차순 조회
select *from HR.employees em
where em.hire_date >= '08/01/01' and em.hire_date <= '08/01/31'
order by em.hire_date desc;

-- 문자 연산자
-- 조회 시
select userId, userName from testdb1;
select userId ||','|| userName as idName from testdb1;
select userId ||'--'|| userName as idName from testdb1;


-- 실습용 table
drop table test_tb2;

CREATE table test_tb2(
    no number not null primary key,
    userId VARCHAR2(255) not null UNIQUE,
    userPw VARCHAR2(255) not null,
    email VARCHAR2(255) not null
);

desc test_tb2;

drop SEQUENCE test_tb2_SEQ;

CREATE SEQUENCE test_tb2_SEQ
    increment by 1
    start with 1
    minvalue 1
    maxvalue 1000
    nocycle
    nocache;
    
select * from test_tb2;
select * from test_tb2 where no=1;
    
insert into test_tb2(no,userId,userPw,email) VALUES(test_tb2_SEQ.nextval,'m1','11','mail1');

update test_tb2 set userId='id', userPw='1', email='mail' where no=1;

delete from test_tb2 where no=1;

commit;
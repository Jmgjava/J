---   실습

drop table member0206;

create table member0206(
    custno number(6) not null,
    custname varchar2(20),
    phone varchar2(13),
    address varchar2(60),
    joindate date,
    grade char(1) ,
    city char(2) ,
    primary key(custno)
);

drop sequence custno_seq;

create sequence custno_seq
increment by 1
start with 100001
nocycle;


insert into member0206
values (custno_seq.nextval, '김이름', '010-1111-2222', '서울 노원구 중계1동', '20241202', 'A', '01');

insert into member0206
values (custno_seq.nextval, '이소리', '010-1111-3333', '서울 노원구 중계2동', '20241206', 'B', '01');

insert into member0206
values (custno_seq.nextval, '박수진', '010-1111-4444', '경기도 수원시 망포동', '20241001', 'B', '03');

insert into member0206
values (custno_seq.nextval, '최수원', '010-1111-5555', '경기도 의정부시 감축동', '20241113', 'A', '03');

insert into member0206
values (custno_seq.nextval, '강만기', '010-1111-6666', '제주도 제주시 서귀포', '20241225', 'B', '06');

insert into member0206
values (custno_seq.nextval, '우리민', '010-1111-7777', '강원도 춘천시 춘천동', '20241211', 'C', '06');
commit;



select * from member0206;


drop table money0206;

CREATE TABLE money0206(
custno number(6),
salenol number(8),
pcost number(8),
amount number(4),
price number(8),
pcode varchar2(4),
sdate date
);

insert into money0206 values(100001, 2024001, 500, 5, 2500, 'A001', '20240101');
insert into money0206 values(100001, 2024002, 1000, 4, 4000, 'A002', '20240101');
insert into money0206 values(100001, 2024003, 500, 3, 1500, 'A008', '20240101');
insert into money0206 values(100002, 2024004, 2000, 1, 2000, 'A004', '20240102');
insert into money0206 values(100002, 2024005, 500, 1, 500, 'A001', '20240103');
insert into money0206 values(100003, 2024006, 1500, 2, 3000, 'A003', '20240103');
commit ;

insert into money0206 values(100007, 2024001, 500, 5, 2500, 'A001', '20240101');
insert into money0206 values(100007, 2024002, 1000, 4, 4000, 'A002', '20240101');
insert into money0206 values(100008, 2024003, 500, 3, 1500, 'A008', '20240101');
insert into money0206 values(100008, 2024004, 2000, 1, 2000, 'A004', '20240102');
commit ;


-- 구매자
select* from member0206;
-- 상품 구매내역
select* from money0206;

-- 구매자테이블에 있는 구매자가 구매한 상품내역을 조회
-- 사용자별 구매비용의 합계를 조회 ( 구매자,구매비용 총액)
select  me.custname 구매자, sum(mo.price) as 합계, round(avg(mo.price),2) 평균
from member0206 me inner join money0206 mo
on me.custno=mo.custno
group by me.custname
;

-- 2024년 1월 1일 이후의 구매 내역 조회
select mo.*
from member0206 me inner join money0206 mo
on me.custno=mo.custno
where mo.sdate >= '24/01/01'
;

-- 2024년 1얼 1일 이후의 구매 내역 조회, 구매자이름 ,전화번호
select mo.custno, sum(mo.price) 구매합계 , sum(mo.amount) 구매횟수합계, sum(mo.pcost) 비용합계, mo.sdate
from member0206 me inner join money0206 mo
on me.custno=mo.custno
--where mo.sdate >= '24/01/01'
group by (mo.custno, me.custname, mo.sdate) -- 그룹을 2개 이상 
having mo.sdate >='24/01/01'
order by mo.sdate desc
;

-- 상품 구매내역이 있는 구매자별 등급을 조회
select me.custname , me.grade
from member0206 me inner join money0206 mo
on me.custno=mo.custno
group by (me.custname, me.grade)
order by me.grade asc
;
--memeber0206, money0206 inner join money0206.custno와 member0206.custno
-- 일치하는 레코드를 조회
select *
from member0206 me inner join money0206 mo
on me.custno=mo.custno
;

select me.*
from member0206 me inner join money0206 mo
on me.custno=mo.custno
;

select mo.*
from member0206 me inner join money0206 mo
on me.custno=mo.custno
;

select distinct me.custname
from member0206 me inner join money0206 mo
on me.custno=mo.custno
;
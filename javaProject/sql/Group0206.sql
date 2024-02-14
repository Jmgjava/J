drop table group1;

create table group1(
    name varchar2(100) not null, --이름
    price number not null,
    depart varchar2(100) not null -- 부서
);

insert into group1(name,price,depart) values('m1',1000,'영업부');
insert into group1(name,price,depart) values('m2',2000,'영업부');
insert into group1(name,price,depart) values('m3',1500,'기획부');
insert into group1(name,price,depart) values('m4',3660,'기획부');
insert into group1(name,price,depart) values('m5',5800,'홍보부');
insert into group1(name,price,depart) values('m6',4480,'홍보부');

commit;

select * from group1;

-- 부서별로
select depart from group1 group by depart;

-- 부서별로 금액의 합계
select depart, sum(price) as 부서별합계 from group1 group by  depart;
-- 부서별로 금액의 합계 부서별 합계가 높은순으로 정렬(내림차순)
select depart, sum(price) as 부서별합계
from group1
group by depart
order by 부서별합계 desc;
-- 부서별로 금액의 합계 부서별 합계가 5000크고 합계가 많은 순으로 정렬
select depart, sum(price) as 부서별합계
from group1
group by depart
having sum(price) > 5000
order by 부서별합계 desc;

-- 부서별로 금액의 평균
select depart, round(avg(price),2) as 부서별평균 from group1 group by  depart;
-- 부서별로 평균이 2000 초과인 부서와 부서별 평균을 높은순으로 정렬
select depart, round(avg(price),2) as 부서별평균
from group1
group by depart
having round(avg(price),2) > 2000
order by 부서별평균 desc;

select depart, count(price) as 부서별개수 from group1 group by  depart;

-- 부서별 최대값
select depart, max(price) as 부서별최대값 from group1 group by  depart;
-- 부서별로 금액의 최대값이 3000 이상인 부서를 낮은순으로 정렬
select depart, max(price) as 부서별최대값
from group1
group by depart
having max(price) >=3000
order by 부서별최대값 asc;

-- 부서별 최소값
select depart, min(price) as 부서별최소값 from group1 group by  depart;

select depart, sum(price) as 부서별합계, round( avg(price),2) as 부서별평균, max(price) as 부서별최대값
from group1 group by depart;




 



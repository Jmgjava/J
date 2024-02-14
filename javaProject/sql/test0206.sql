

-- 올림, 내림, 반올림 함수
select round(10.123) from dual; --반올림 소수 첫째자리에서 반올림(기본)
select round(10.523) from dual; --반올림 소수 첫째자리에서 반올림(기본)
select round(10.525,2) from dual; --반올림 소수 둘째자리까지(셋째자리에서) 반올림(기본)
select ceil(10.123) from dual; --CEIL ceil > 올림 ***
select floor(10.123) from dual; ---FLOOR floor → 버림 **

create table test1(
    kor number
);

insert into test1(kor) values(100);
insert into test1(kor) values(59);
insert into test1(kor) values(80);
insert into test1(kor) values(90);
commit;
select*from test1;
select kor, rank() over(order by kor desc) from test1;
select kor 국어성적, rank() over(order by kor desc) 국어등수 from test1;

-- 절대값(양수)
select abs(-10) from dual;
-- 계승
select power(3,4)from dual;
-- 나머지
select mod(10,2) from dual;
-- 제곱근
select sort(4) SQRT from dual;

-- 문자 조작 함수
select lower('JAVA') from dual; -- 소문자
select initcap('java') from dual; -- 첫글자 대문자
select upper('java') from dual; -- 대문자
select length('java') from dual; -- 문자열 길이
select concat('java','_Spring') from dual; -- 문자열 결합

select substr('java_Spring_AWS',5,11) from dual; -- 문자열의 인덱스, 5부터 11앞까지
select instr('java_Spring_AWS','S')from dual; -- 문자의 위치

select lpad(2500,10,'*')from dual; -- 10자리 문자열 공간에서 기존 문자열을 제외하고 왼쪽부터*채워라
select rpad(2500,10,'*')from dual; -- 10자리 문자열 공간에서 기존 문자열을 제외하고 오른쪽부터*채워라

select ltrim('   java') from dual; -- 왼쪽 공백제거
select length('    java') from dual; -- 왼쪽 공백포함 문자열 길이
select length(ltrim('   java')) from dual; -- 왼쪽 공백 제거 문자열 길이
select replace('java_Spring_AWS','java','SQL') from dual; -- 문자열의 특정 문자를 변경


-- 날짜 함수
select sysdate from dual; -- YY/MM/DD, 시스템 오늘 날짜
select systimestamp from dual; -- YY/MM/DD hh:mm:ss ...

select sysdate+10 from dual;
select sysdate-10 from dual;
select sysdate-sysdate from dual;

select add_months(sysdate,2) from dual; -- 날짜 + 월
select next_day(sysdate,2) from dual; -- 날짜 + 다음주(2월요일) , 특정날 다음주(1234567)
select last_day(sysdate) from dual; --날짜 -> 해당 달의 마지막 일

-- 변환 함수 ***
-- 날짜 -> 문자열로 변환
select sysdate, to_char(sysdate,'YYYY"년 "MM"월 "DD"일 "') from dual;
select sysdate, to_char(systimestamp,'YYYY"년 "MM"월 "DD"일 "hh"시 "mm"분 "ss"초 "') from dual;
select sysdate, to_char(systimestamp,'YYYY"/"MM"/ "DD"/ "hh":"mm":"ss') from dual;

-- 날짜 -> 생성날짜, 수정 날짜 Spring boot JPA(ORM)에서 자동으로 설정 할 수 있다.


-- �ø�, ����, �ݿø� �Լ�
select round(10.123) from dual; --�ݿø� �Ҽ� ù°�ڸ����� �ݿø�(�⺻)
select round(10.523) from dual; --�ݿø� �Ҽ� ù°�ڸ����� �ݿø�(�⺻)
select round(10.525,2) from dual; --�ݿø� �Ҽ� ��°�ڸ�����(��°�ڸ�����) �ݿø�(�⺻)
select ceil(10.123) from dual; --CEIL ceil > �ø� ***
select floor(10.123) from dual; ---FLOOR floor �� ���� **

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
select kor �����, rank() over(order by kor desc) ������ from test1;

-- ���밪(���)
select abs(-10) from dual;
-- ���
select power(3,4)from dual;
-- ������
select mod(10,2) from dual;
-- ������
select sort(4) SQRT from dual;

-- ���� ���� �Լ�
select lower('JAVA') from dual; -- �ҹ���
select initcap('java') from dual; -- ù���� �빮��
select upper('java') from dual; -- �빮��
select length('java') from dual; -- ���ڿ� ����
select concat('java','_Spring') from dual; -- ���ڿ� ����

select substr('java_Spring_AWS',5,11) from dual; -- ���ڿ��� �ε���, 5���� 11�ձ���
select instr('java_Spring_AWS','S')from dual; -- ������ ��ġ

select lpad(2500,10,'*')from dual; -- 10�ڸ� ���ڿ� �������� ���� ���ڿ��� �����ϰ� ���ʺ���*ä����
select rpad(2500,10,'*')from dual; -- 10�ڸ� ���ڿ� �������� ���� ���ڿ��� �����ϰ� �����ʺ���*ä����

select ltrim('   java') from dual; -- ���� ��������
select length('    java') from dual; -- ���� �������� ���ڿ� ����
select length(ltrim('   java')) from dual; -- ���� ���� ���� ���ڿ� ����
select replace('java_Spring_AWS','java','SQL') from dual; -- ���ڿ��� Ư�� ���ڸ� ����


-- ��¥ �Լ�
select sysdate from dual; -- YY/MM/DD, �ý��� ���� ��¥
select systimestamp from dual; -- YY/MM/DD hh:mm:ss ...

select sysdate+10 from dual;
select sysdate-10 from dual;
select sysdate-sysdate from dual;

select add_months(sysdate,2) from dual; -- ��¥ + ��
select next_day(sysdate,2) from dual; -- ��¥ + ������(2������) , Ư���� ������(1234567)
select last_day(sysdate) from dual; --��¥ -> �ش� ���� ������ ��

-- ��ȯ �Լ� ***
-- ��¥ -> ���ڿ��� ��ȯ
select sysdate, to_char(sysdate,'YYYY"�� "MM"�� "DD"�� "') from dual;
select sysdate, to_char(systimestamp,'YYYY"�� "MM"�� "DD"�� "hh"�� "mm"�� "ss"�� "') from dual;
select sysdate, to_char(systimestamp,'YYYY"/"MM"/ "DD"/ "hh":"mm":"ss') from dual;

-- ��¥ -> ������¥, ���� ��¥ Spring boot JPA(ORM)���� �ڵ����� ���� �� �� �ִ�.
---   �ǽ�

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
values (custno_seq.nextval, '���̸�', '010-1111-2222', '���� ����� �߰�1��', '20241202', 'A', '01');

insert into member0206
values (custno_seq.nextval, '�̼Ҹ�', '010-1111-3333', '���� ����� �߰�2��', '20241206', 'B', '01');

insert into member0206
values (custno_seq.nextval, '�ڼ���', '010-1111-4444', '��⵵ ������ ������', '20241001', 'B', '03');

insert into member0206
values (custno_seq.nextval, '�ּ���', '010-1111-5555', '��⵵ �����ν� ���ൿ', '20241113', 'A', '03');

insert into member0206
values (custno_seq.nextval, '������', '010-1111-6666', '���ֵ� ���ֽ� ������', '20241225', 'B', '06');

insert into member0206
values (custno_seq.nextval, '�츮��', '010-1111-7777', '������ ��õ�� ��õ��', '20241211', 'C', '06');
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


-- ������
select* from member0206;
-- ��ǰ ���ų���
select* from money0206;

-- ���������̺� �ִ� �����ڰ� ������ ��ǰ������ ��ȸ
-- ����ں� ���ź���� �հ踦 ��ȸ ( ������,���ź�� �Ѿ�)
select  me.custname ������, sum(mo.price) as �հ�, round(avg(mo.price),2) ���
from member0206 me inner join money0206 mo
on me.custno=mo.custno
group by me.custname
;

-- 2024�� 1�� 1�� ������ ���� ���� ��ȸ
select mo.*
from member0206 me inner join money0206 mo
on me.custno=mo.custno
where mo.sdate >= '24/01/01'
;

-- 2024�� 1�� 1�� ������ ���� ���� ��ȸ, �������̸� ,��ȭ��ȣ
select mo.custno, sum(mo.price) �����հ� , sum(mo.amount) ����Ƚ���հ�, sum(mo.pcost) ����հ�, mo.sdate
from member0206 me inner join money0206 mo
on me.custno=mo.custno
--where mo.sdate >= '24/01/01'
group by (mo.custno, me.custname, mo.sdate) -- �׷��� 2�� �̻� 
having mo.sdate >='24/01/01'
order by mo.sdate desc
;

-- ��ǰ ���ų����� �ִ� �����ں� ����� ��ȸ
select me.custname , me.grade
from member0206 me inner join money0206 mo
on me.custno=mo.custno
group by (me.custname, me.grade)
order by me.grade asc
;
--memeber0206, money0206 inner join money0206.custno�� member0206.custno
-- ��ġ�ϴ� ���ڵ带 ��ȸ
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
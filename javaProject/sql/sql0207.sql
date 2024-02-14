---   �ǽ�

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
values (custno2_seq.nextval, '���̸�', '010-1111-2222', '���� ����� �߰�1��', '20241202', 'A', '01');
insert into member0207
values (custno2_seq.nextval, '�̼Ҹ�', '010-1111-3333', '���� ����� �߰�2��', '20241206', 'B', '01');
insert into member0207
values (custno2_seq.nextval, '�ڼ���', '010-1111-4444', '��⵵ ������ ������', '20241001', 'B', '03');
insert into member0207
values (custno2_seq.nextval, '�ּ���', '010-1111-5555', '��⵵ �����ν� ���ൿ', '20241113', 'A', '03');
insert into member0207
values (custno2_seq.nextval, '������', '010-1111-6666', '���ֵ� ���ֽ� ������', '20241225', 'B', '06');
insert into member0207
values (custno2_seq.nextval, '�츮��', '010-1111-7777', '������ ��õ�� ��õ��', '20241211', 'C', '06');

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

-- �ܷ�Ű ���� money0207 ���̺� custno �ܷ�Ű ���� �������̺� member0207(custno) ����********************************
-- �ܷ�Ű ���� custnoFK
alter table money0207 -- �ܷ�Ű ���� ���̺� (��, N)
add CONSTRAINT custno_fk -- �������Ǹ�(constraint)
foreign key (custno) -- �ܷ�Ű ���� ���̺� (��,N) Į�� -> �ܷ�Ű�� ����
references member0207(custno) -- ��Ű(PK,PK ����) ���̺�(����Ű,��Ű)
on delete cascade -- ����Ű(��Ű)�� �����ϴ� �����ϰ��ִ� �ܷ�Ű �����͸� �����ض� -- on delete cascae -> �θ��ڵ�(1)�� �����ϴ� �ڽķ��ڵ尡 ����(��)
--                                �������Ǹ� ����
alter table money0207 drop constraint custno_fk;



-- ORA -02298 ���� Ȯ��
select (custno) from money0207 minus select (custno) from member0207;




--���� ���Ἲ ���� -> �ܷ�Ű
--insert into money0207 values(100007, 2024002, 1000, 4, 4000, 'A002', '20240101');
--insert into money0207 values(100008, 2024003, 500, 3, 1500, 'A008', '20240101');

-- delete from member0207 where custno=100001 on delete cascade;

-- ��ǰ ������
select * from member0207;
-- ��ǰ ���ų���
select * from money0207;

select me.*
from member0207 me inner join money0207 mo
on me.custno=mo.custno
;

select me.custname , me.grade
from member0207 me inner join money0207 mo
on me.custno=mo.custno
;

select me.custname ������ , me.grade ���
from member0207 me inner join money0207 mo
on me.custno=mo.custno
;

-- ��ǰ ���ų����� �ִ� �������� ����� ��ȸ -- �������̸�, ��޸� ��ȸ
select me.custname ������ , me.grade ���
from member0207 me inner join money0207 mo
on me.custno=mo.custno -- ��ǰ ���ų����� �ִ� ������
group by (me.custname , me.grade)
order by me.grade asc;

drop table group2;

create table group2(
    name varchar2(100) not null, --�̸�
    price number not null,
    depart varchar2(100) not null -- �μ�
);

insert into group2(name,price,depart) values('m1',1000,'������');
insert into group2(name,price,depart) values('m2',2000,'������');
insert into group2(name,price,depart) values('m3',1500,'��ȹ��');
insert into group2(name,price,depart) values('m4',3660,'��ȹ��');
insert into group2(name,price,depart) values('m5',5800,'ȫ����');
insert into group2(name,price,depart) values('m6',4480,'ȫ����');

commit;


-- ���� ����(SubQuery)
-- select �÷�A, �÷�B ��. from ���̺�� where ���ǿ�����(��������);
select *
from group2
where price > ( select avg(price) from group2);

select round(avg(price),2) from group2 group by depart;

select round(avg(price),2) from group2;

select *
from group2
where price > ( select round(avg(price),2) from group2);


-- VIew
--create or replace view �� �̸� as select Į��1, Į��2, from ���̺� ;
--create view ���̸� as select Į��1, Į��2 from ���̺�;
create view member0207_view
as
select custno, custname from member0207;

select* from user_views;

select* from member0207_view;


--�ε���
--����
select*from group2;
create index group2_index on group2(name,price,depart);

select * from all_ind_columns
where table_name = 'group2'
order by 'group2_index';

select*from user_indexes; -- �ε��� ��ȸ
select table_name from user_indexes; -- �ε��� ���̺� ��ȸ
select * from user_ind_columns; -- �ε����� ������ �÷�
select * from user_ind_columns where table_name='GROUP2'; -- �ε����� ������ �÷�

select table_name, index_name
from user_indexes
where table_name='GROUP2';
-- ����
drop index group2_index;



-- ����� ���� ����, ���� ,����

select * from all_users; // ��� ������ ���� ����
select * from dba_users; // ��� ������ ���� ����

select username from all_users; // ��� ���� �̸�
select username from dba_users; // ��� ���� �̸�

-- ����� ���� ���� -> ������ ���� �ִ� ����(system.sys)
-- create user �����̸� identified by ���� ��й�ȣ;
create user user1 identified by 1111;

--���� ��й�ȣ ����
--alter user �����̸� identified by ����й�ȣ;
alter user user1 identified by 2222;

-- DDL
--���� ����
--grant create [���Ѹ�] to [����];
grant create sysdba to user1;
-- ���� ����
revoke sysdba from user1;

-- ���� ����
drop user user1 cascade;

--------------------------------------------------

--TCL �ǽ�----------------------------------

drop table test0207;

create table test0207(
name varchar2(100)not null,
age number not null
);

desc test0207;
select * from test0207;


-- ����� ���� ����, ���� ,����

select * from all_users; // ��� ������ ���� ����
select * from dba_users; // ��� ������ ���� ����

select username from all_users; // ��� ���� �̸�
select username from dba_users; // ��� ���� �̸�

-- ����� ���� ���� -> ������ ���� �ִ� ����(system.sys)
-- create user �����̸� identified by ���� ��й�ȣ;
create user user1 identified by 1111;

--���� ��й�ȣ ����
--alter user �����̸� identified by ����й�ȣ;
alter user user1 identified by 2222;

-- DDL
--���� ����
--grant create [���Ѹ�] to [����];
grant connect,resource,dba to user1;
-- ���� ����
revoke connect,resource,dba from user1;

-- ���� ����
drop user user1 cascade;

truncate table test0207;

insert into test0207(name,age) values('m1',1);
insert into test0207(name,age) values('m2',2);
insert into test0207(name,age) values('m3',3);
insert into test0207(name,age) values('m4',4);
insert into test0207(name,age) values('m5',5);
insert into test0207(name,age) values('m6',6);
commit;
-- A savepoint -> �ڵ� ������ savepoint
delete from test0207 where name ='m1';
savepoint p1; -- savepoint ����
delete from test0207 where name='m2';
savepoint p2;
select*from test0207;
--rollback
rollback; -- commit ���ܰ�� �̵�
-- Ư�� savepoint�� rollback
rollback to p1;
-- Ư�� savepoint�� rollback 2
rollback to p2;
commit;
select* from test0207;
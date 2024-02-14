drop table employee;

-- ȸ�� �Ҽ� �������̺�
create table employee     (
       emp_id  number       NOT NULL ,                      -- ������ȣ ������ȣ , ������ 1000����
       emp_name     varchar2(100)       NOT NULL ,  -- �����̸�
       emp_depart    varchar2(100)     NOT NULL  ,  -- �μ��̸� (�ܷ�Ű)  -> �μ����̺� �μ���
       emp_email        varchar2(255)    NOT NULL   , -- �����̸���       
       create_date date  default sysdate,                  -- �Ի���
       primary key( emp_id)
);
-- ������
create sequence employee_SEQ
increment by 1
start with 1000
nocycle;

-- ȸ��  �μ� ���̺�
create table department(
	depart_id number not null, -- �μ� ���� ���̵� , ������ 1����
	depart_name  varchar2(100)  not null  unique ,  -- employee  emp_depart�ܷ�Ű�� �⺻Ű
	primary key(depart_id)
);

-- ������
create sequence department_SEQ
increment by 1
start with 1
nocycle;

desc employee;
desc department;

select * from employee;
select * from department;

-- �ܷ�Ű ����  employee���̺� emp_departĮ�� department ���̺�  depart_name Į���� ���� �Ѵ�.
-- emp_departĮ���� �����ʹ� �ݵ��  depart_name Į���� ���� �߰��Ҽ� �ִ�.
-- emp_departĮ���� �����Ͱ� depart_name Į�� �̿��� ���� �߰� �ϸ� ���� ���Ἲ ����.
--1: ��,  1:N

-- �ܷ�Ű ���� ******
alter table employee    	  -- employee ���̺�
add foreign key(emp_depart) 	 -- emp_departĮ���� �ܷ�Ű�� ����ض� 
REFERENCES department(depart_name); -- �⺻Ű �Ǵ� �⺻Ű ����(UNIQUE) ���� Ű


-- ȸ�� �μ� ����
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'������');
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'��ȹ��');
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'�����ú�');
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'ȫ����');
insert into department(depart_id, depart_name)  values(department_SEQ.NEXTVAL,'�����');

commit;

select * from department;

-- ������ ���
desc employee;

insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'���̸�','������','a@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'���̸�2','������','a1@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'���̸�1','������','a2@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'���̸�2','��ȹ��','b2@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'�̹μ�','��ȹ��','b3@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'���μ�','�����ú�','c3@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'�۹���','ȫ����','c4@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'��μ�','ȫ����','d4@email.com');
insert into employee(emp_id,emp_name,emp_depart,emp_email) values(employee_SEQ.NEXTVAL,'�ְ���','�����','e4@email.com');

commit;

select*from employee;
select*from department;
desc employee;

-- �μ��� ���� ��
select em.emp_depart, count(*) as ������
from employee em
group by em.emp_depart;

-- �μ��� ���� �� ��������
select em.emp_depart, count(*) as ������
from employee em
group by em.emp_depart
order by ������ desc;

-- �μ� �� �������� 2�� �̻��̰� ������
select em.emp_depart, count(*) as ������
from employee em
group by em.emp_depart
having count(*) >= 2
order by ������ desc;


select emp_depart, count(*) as ������ from employee group by emp_depart order by emp_depart desc;





-- �ǽ����̺�
drop table u1_tb;

drop table bi_tb;

--�Խñ� �ۼ���
create table u1_tb(
    userId varchar(100) not null primary key,
    username varchar(100) not null
);
insert into u1_tb(userId,username) values('m1','s1'); //userId(�ߺ�X,Not Null)-. �Խñ�
insert into u1_tb(userId,username) values('m2','s1');
insert into u1_tb(userId,username) values('m4','s1');
insert into u1_tb(userId,username) values('m4','s2');
commit;
--�Խñ�
create table bi_tb(
    board varchar(200) not null,    -- �Խñ�
    bid varchar(100) not null       -- �Խñ� �ۼ���
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
-- u1_tb userID='m1', bl_tb bid m1 ��ġ�ϴ� �����̺��� ���ڵ带 ��ȸ
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

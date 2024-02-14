drop table member0205;

CREATE table member0205(
    no number not null primary key,
    userId VARCHAR2(255) not null UNIQUE,
    userPw VARCHAR2(255) not null,
    email VARCHAR2(255) not null
);

desc member0205;


-- ������
drop SEQUENCE member0205_SEQ;

CREATE SEQUENCE member0205_SEQ
    increment by 1
    start with 1
    minvalue 1
    maxvalue 1000
    nocycle
    nocache;
    
-- ������ Ȯ��    
select * from user_sequences;
-- ���� ������
select member0205_SEQ.currval from dual;
-- ���� �������� ���� ������
select member0205_SEQ.nextval from dual; -- ������ ���� ����



-- �Խñ� ���̺� board0205 ** member0205�� ��ϵ� userId ȸ���� ���ؼ��� �ۼ��� �� �ִ�.
-- �ܷ�Ű ����
drop table board0205;

create table board0205(
    no  number not null, -- ������ member0205_SEQ
    bTitle VARCHAR(255) not null UNIQUE,
    bCount VARCHAR(255) not null,
    bWriter VARCHAR2(255) not null, -- �ܷ�Ű(PK)
    bNickName VARCHAR2(255) not null,
    primary key(no)
);

desc board0205;

-- ������ ����
drop SEQUENCE board_SEQ;

CREATE SEQUENCE board0205_SEQ
    increment by 1
    start with 1
    minvalue 1
    maxvalue 1000
    nocycle
    nocache;
    
-- ������ Ȯ��    
select * from user_sequences;
-- ���� ������
select board0205_SEQ.currval from dual;
-- ���� �������� ���� ������
select board0205_SEQ.nextval from dual; -- ������ ���� ����

-- �Խñ� ���̺� board0205 bWriter�� member0205 userId�� �ܷ�Ű�̴�.
alter table board0205
add foreign key (bWriter)
references member0205(userId); -- ����Ű

-- ȸ�� 5�� ���̵����ͷ� ǥ��
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m1','1111','ddd1@naver.com');
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m2','2111','ddd2@naver.com');
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m3','3111','ddd3@naver.com');
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m4','4111','ddd4@naver.com');
insert into member0205(no,userId,userPw,email) VALUES(member0205_seq.nextval,'m5','5111','ddd5@naver.com');

truncate table member0205;

-- �Խñ� ���̺� board0205 bWriter�� member0205 userId�� �ܷ�Ű�̴�.
alter table board0205
add CONSTRAINT board0205_PK foreign key (bWriter)
references member0205(userId); -- ����Ű

-- �ܷ�Ű �����Ǿ��ִ� ��� ����
truncate table member0205;

commit;
rollback;

select * from member0205;

-- ����Ŭ �ǽ��� ���̺�
select * from HR.employees;
select * from HR.departments;

-- dual ���̺�
-- ����Ŭ ��ü���� �����Ǵ� ���̺�
-- �����ϰ� �Լ��� �̿��ؼ� ��� ������� Ȯ�� �� �� ����ϴ� ���̺�
-- ���� �� ��, �� �÷��� ��� �մ� dummy ���̺�
select count(*) from member0205;
select SUSDATE from DUAL; -- date
select CURRENT_DATE from DUAL;
select board0205_SEQ.currval from dual;

select * from HR.employees;

select first_name, last_name, salary + 10000, hire_date
from HR.employees;

select forst_name, salary
FROM HR.employees;
select first_name as �̸�, salary �޿� -- as ��������
FROM HR.employees;

-- member0205 ȸ����ϵ� userId �ۼ��ڸ� board0205 �Խñ��� 5�� �ۼ�
insert into board0205(no,bTitle,bCount,bWriter,bNickName) VALUES(board0205_seq.nextval,'����1','����1','m1','��1');
insert into board0205(no,bTitle,bCount,bWriter,bNickName) VALUES(board0205_seq.nextval,'����2','����2','m2','��2');
insert into board0205(no,bTitle,bCount,bWriter,bNickName) VALUES(board0205_seq.nextval,'����3','����3','m3','��3');
insert into board0205(no,bTitle,bCount,bWriter,bNickName) VALUES(board0205_seq.nextval,'����4','����4','m4','��4');
select first_name as �̸�, salary �޿�
FROM HR.employees;


-- ���� ���Ἲ ����
insert into board0205(no,bTitle,bCount,bWriter,bNickName) 
VALUES(board0205_seq.nextval,'����5','����5','m52','��5');
commit;

select*from board0205;

select department_id FROM HR.employees;
select distinct department_id FROM HR.employees;

-------------------------------------����-------------------------------------

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
--SQL> select*from testdb1;  -- ��ü���(ȸ��,�Խñ�, ��ǰ....) -> List<E>
select userId,userAge,userName from testdb1;
select*from testdb1;
-- �ۼ����� m1 �� ������ ��
select*from board0205 where bWriter <> 'm1';

--** AND
-- �� ���� ������ ��� �����ؾ߸� �˻�
-- AND
-- select * from ���̺� where Į����1 = ��1 AND Į����2 >= ��2 --
--SQL> select * from testdb1 where userId='m1' and userAge > 10;

select * from testdb1 where userId='m1' and userAge > 10;

-- select * from ���̺� WHERE NOT Į����1='A' AND NOT Į����1 ='B';
select * from testdb1 where not userId='m1' and not userAge<=20;

select * from testdb1 where userAge between 10 and 30; -- 10 <= X <=30
--select*from ���̺� where Į�� IN(��1,��2);
select * from testdb1 where userId IN('m1','m4');

select*from testdb1 where userId not in('m1','m4');
                                                -- 1 or 2
select * from testdb1 where userId <> 'm1' or userId<>'m2';
                                                -- 1 and 2                          // not in ��ġ
select * from testdb1 where userId <> 'm1'and userId<>'m2';
-- select * from ���̺� where Į����1 like 's%';
-- ù ��° ��ġ�� s�� ���Ե� ��
select * from testdb1 where userName like 's%';
-- LIKE S�� ����, �� ��� ����
select * from testdb1 where userName like '%s%';

select*from  HR.employees;

select em.first_name, em.salary
from HR.employees em
where em.first_name = 'Steven'; -- ��Ȯ�� �� �˻�

select em.first_name, em.salary
from HR.employees em
where em.first_name like 'S%';  -- �����ϴ� ���ڿ� �˻�

select em.first_name, em.salary
from HR.employees em
where em.first_name like '%en'; -- ���� ������ ���ڿ� �˻�

select em.first_name, em.salary
from HR.employees em
where em.first_name like '%St%'; -- ���ԵǾ� �ִ� ���ڿ� �˻�

-- ����Ŭ ���� (���� > ���� > �ѱ� ����)
select * from board0205 order by no asc; -- ��������
select * from board0205 order by no desc; -- ��������
select * from board0205 order by btitle asc;
select * from board0205 order by btitle desc;

select * from member0205 order by userId asc;
select * from member0205 order by no desc;

-- HR.employees ���̺���
select* from HR.employees em;
select em.hire_date from HR.employees em order by em.hire_date asc; -- em.hire_date���� �������� ��ȸ
select em.hire_date from HR.employees em order by em.hire_date desc; -- em.hire_date���� �������� ��ȸ
select em.hire_date from HR.employees em where em.hire_date > '08/01/01'
order by em.hire_date desc; -- '08/01/01' ������ ���ڵ带 em.hire_date���� �������� ��ȸ *

-- HR.employees ���̺��� 2008�� 1���� ���ڵ带 em.hire_date���� �������� ��ȸ
select *from HR.employees em
where em.hire_date >= '08/01/01' and em.hire_date <= '08/01/31'
order by em.hire_date desc;

-- ���� ������
-- ��ȸ ��
select userId, userName from testdb1;
select userId ||','|| userName as idName from testdb1;
select userId ||'--'|| userName as idName from testdb1;


-- �ǽ��� table
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
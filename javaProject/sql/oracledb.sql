select *from all_users;
-- select * from ���̺�;
-- all_users���̺�(��� ����� ����)���� ��� ���ڵ� ��ȸ
-- system. sys ������ ����
select *from all_tables;
-- ����Ŭ ���� ������� ���̺� ��ȸ

CREATE TABLE member0129(
    userId  varCHAR2(100)     not null,
    userPw VARCHAR2(100) not null,
    age number not null,
    name VARCHAR2(100) not null,
    PRIMARY key(userId)
);

-- ���̺� �� ����
desc member0129;

-- ���̺� ����
alter table member0129 modify name not null;

desc member0129;

-- ���̺� ��ȸ
select * from member0129;

select member0129.userId from member0129;

--select member0129.userId , member0129,userPw from member0129;

-- ���̺� ����
drop table member0129;

select* from member0129;

desc member0129;

-- ȸ�� ���
insert into member0129(userId, userPw,age,name) values('m1', '1111' ,11, 'name1');
insert into member0129(userId, userPw,age,name) values('m2', '2111' ,21, 'name2');
insert into member0129(userId, userPw,age,name) values('m3', '3111' ,31, 'name3');
insert into member0129(userId, userPw,age,name) values('m4', '4111' ,41, 'name4');

-- commit
commit;

-- rollback
ROLLBACK;

-- ��ü ��� ��ȸ
select* from member0129;

select member0129.userId from member0129;

select member0129.userId, userPw from member0129;

select userId, userPw from member0129;

select * from member0129 where userid='m1';

-- userID�� 'm1'�� �����ϸ� 1�� ��ȯ
select count(*) from member0129 where userid='m1';

select*from member0129;

-- ������ ����
update member0129 set userPw='3333',age=30,name='�̸�' where userId='m1';

commit;

Rollback;

-- ������ ����
SELECT *from member0129;

delete from member0129 where userId='m4';

commit;
rollback;


insert into member0129(userId,userPw,age,name) VALUES('m4','4444','40','����');

select *from member0129;

commit;
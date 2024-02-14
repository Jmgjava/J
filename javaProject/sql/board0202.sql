drop table board0201;

-- ���̺� ����
create table board0201(
    no number not null, -- �ڵ����� 1���� 1�� ���� -> ������(sequence)
    title varchar2(255) not null,
    content varchar2(255) not null,
    writer varchar(100) not null,
    nickname varchar(100) not null,
    primary key(no)
);

desc board0201;

-- ���̺� �̸� ����

alter table board0201 rename to board0202;

desc board0202;

-- ���̺� Į���� ����
alter table board0202 rename column title to bTitle;

desc board0202;
-- ���̺� Į���� �߰�
alter table board0202 add hit number null;

desc board0202;
-- ���̺� Į���� ����
alter table board0202 modify hit not null;

desc board0202;
-- ���̺� Į�� ����
alter table board0202 drop column hit;

insert into board0202(no,btitle,content,writer,nickname) values(1,'m1','c1','w1','n1');
insert into board0202(no,btitle,content,writer,nickname) values(2,'m2','c1','w1','n1');
insert into board0202(no,btitle,content,writer,nickname) values(3,'m3','c1','w1','n1');

commit;

truncate table board0202; -- �ڵ� commit;

select * from board0202;

desc board0202;













--------------------------------------------------------------------------------------------------------



-- ȸ�� ���̺�
truncate table member0202;
drop table member0202;

create table member0202(
    no number not null, -- �ڵ����� ��Ϲ�ȣ�� ���� -> ������(Sequence)�� ��ü
    userId varchar2(255) not null unique, -- �Խñ� �ۼ���
    userPw varchar2(255) not null,
    phone varchar2(255) not null,
    primary key(no) -- UNIQUE NOT NULL
);

desc member0202;
select* from member0202;
select count(*) from member0202 where userId='m1';

insert into member0202(no,userId,userPw,phone) VALUES (1,'m1','1111',01012345678);
-- ��ü���Ἲ ���� -> �⺻Ű
insert into member0202(no,userId,userPw,phone) VALUES (1,'m2','2111',01012345678);
-- ��ü���Ἲ ���� -> �⺻Ű NOT NULL constraint
insert into member0202(no,userId,userPw,phone) VALUES (null,'m2','2111',01012345678);
-- UNIQUE constraint
insert into member0202(no,userId,userPw,phone) VALUES (2,'m1','2111',01012345678);


insert into member0202(no,userId,userPw,phone) VALUES (2,'m2','2111',01012345678);

commit;

-- ������ ����
create sequence member0202_SEQ --������ ��
increment by 1 -- 1�� ����
start with 1 -- 1����~
minvalue 1
maxvalue 1000
nocycle -- �⺻��
nocache -- �⺻�� 20
;



select * from member0202;
--member0202 dropX -> ��� ���ڵ� ����

select * from user_sequences;

select member0202_SEQ.currval from dual;
select member0202_SEQ.nextval from dual;

-- member0202_SEQ
insert into member0202(no,userId,userPw,phone) VALUES (member0202_SEQ.nextval,'m1','1111',01012345678);
insert into member0202(no,userId,userPw,phone) VALUES (member0202_SEQ.nextval,'m2','2111',01012345678);
insert into member0202(no,userId,userPw,phone) VALUES (member0202_SEQ.nextval,'m3','3111',01012345678);
insert into member0202(no,userId,userPw,phone) VALUES (member0202_SEQ.nextval,'m4','4111',01012345678);

commit;
select * from member0202;

-- ������ ����
drop sequence member0202_SEQ;

select * from member0202;

--------------------------------------------------------------------------------------------------------



-- ������ ���� board0202_SEQ �����ϰ� 1���� 1�� �ڵ����� ���� : 10000���� �ִ� ����

create sequence board0202_SEQ
increment by 1
start with 1
minvalue 1
maxvalue 10000
nocycle
nocache
;
-- board0202_SEQ�� �̿��ؼ� board0202 ���̺��� ���� ������ 5���� �߰�
-- no Į���� board0202_SEQ�� ���� -> 1���� 1�� ����

insert into board0202(no,title,content,writer,nickname) values(board0202_SEQ.nextval,'����1','����1','�ۼ���1','�г���1');
insert into board0202(no,title,content,writer,nickname) values(board0202_SEQ.nextval,'����2','����2','�ۼ���1','�г���2');
insert into board0202(no,title,content,writer,nickname) values(board0202_SEQ.nextval,'����3','����3','�ۼ���2','�г���3');
insert into board0202(no,title,content,writer,nickname) values(board0202_SEQ.nextval,'����4','����4','�ۼ���2','�г���4');

commit;

select*from board0202;

-- ��� ������ ��ȸ
select * from user_sequences;
--���� ������ ��
select board0202_SEQ.currval from dual;
-- ���� ������ ������
select board0202_SEQ.nextval from dual;

drop sequence board0202_SEQ;




--------------------------------------------------------------------------------------------------------
drop sequence board0202_SEQ;
drop sequence member0202_SEQ;

truncate table member0202; -- �ڵ� commit;
drop table member0202;

truncate table board0202; -- �ڵ� commit;
drop table board0202;

-- ���̺� ����
create table board0202(
    no number not null, -- �ڵ����� 1���� 1�� ���� -> ������(sequence)
    title varchar2(255) not null,
    content varchar2(255) not null,
    writer varchar(100) not null,
    nickname varchar(100) not null,
    primary key(no)
);

desc board0202;
select*from board0202;


-- board0202 ���̺��� writer Į���� member0202���̺��� userId�� �����Ѵ�.
-- board0202 ���̺��� writer Į���� �ܷ�Ű(FK)�� ���� -> member0202���̺��� userId�� ����
-- board0202 ��  ��  member0202
-- board0202 N   1   member0202
alter table board0202
add foreign key (writer)
references member0202(userId);

insert into member0202(no,userId,userPw,phone) VALUES (board0202_seq.nextval,'m1','1111',111111);
insert into member0202(no,userId,userPw,phone) VALUES (board0202_seq.nextval,'m2','2222',222222);

insert into board0202(no,title,content,writer,nickname) values(board0202_seq.nextval,'����1','����1','�ۼ���1','�г���1');
insert into board0202(no,title,content,writer,nickname) values(board0202_seq.nextval,'����2','����2','�ۼ���2','�г���2');
insert into board0202(no,title,content,writer,nickname) values(board0202_seq.nextval,'����3','����3','�ۼ���3','�г���3');




commit;

select * from board0202;

desc board0202;


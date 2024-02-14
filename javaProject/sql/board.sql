drop table board0130;

create table board0130(
no number not null, -- �ڵ����� 1���� 1�� ���� -> ������(sequence)
title varchar2(255) not null,
content varchar2(255) not null,
writer varchar(100) not null,
nickname varchar(100) not null,
primary key(no)
);

-- ���� ������ <-> �׽�Ʈ
-- �Խñ� ���� Create
insert into board0130(no,title,content,writer,nickname) VALUES('1','����1','����1','�ۼ���1','m1');
insert into board0130(no,title,content,writer,nickname) VALUES('2','����2','����2','�ۼ���2','m2');
insert into board0130(no,title,content,writer,nickname) VALUES('3','����3','����3','�ۼ���3','m3');
insert into board0130(no,title,content,writer,nickname) VALUES('4','����4','����4','�ۼ���4','m4');
insert into board0130(no,title,content,writer,nickname) VALUES('5','����5','����5','�ۼ���5','m5');

commit;
rollback;

-- �Խñ� ��ȸ Read
select*from board0130;

select*from board0130 where no=1;


-- ��ü ���ڵ� ��(�Խñ� ��)
select count(*) from board0130;
-- ���ǿ� �´� ���ڵ� ���� : 1(����), 0(����)
select count(*) from board0130 where no=1;


-- �Խñ� ���� Update
update board0130 set title='����1����',content='����1����',writer='�ۼ���1����',nickname='m1����' where no=1;

commit;

-- �Խñ� ���� Delete
delete from board0130 where no=1;

commit;
rollback;

drop table board0201;

create table board0201(
no number not null, -- �ڵ����� 1���� 1�� ���� -> ������(sequence)
title varchar2(255) not null,
content varchar2(255) not null,
writer varchar(100) not null,
nickname varchar(100) not null,
primary key(no)
);

insert into board0201(no,title,content,writer,nickname) VALUES('1','m1','1111','11','�̸�1');

commit;
rollback;

desc board0201;
select*from board0201;
select* from board0201 where no=1;
select count(*) from board0201 where no=1; -- ���� Ȯ�� *****

update board0201 set title='m1����',content='1111����',writer='12',nickname='�̸�1����' where no=1;

delete from board0201 where no=1;
drop table shop0131;

create table shop0131(
    -- ��ǰ ��ȣ
    no number not null, -- �ڵ����� 1���� 1�� ���� -> ������(sequence)
    -- ��ǰ��
    title varchar2(255) not null,
    -- ��ǰ�󼼳���
    detail varchar2(255) not null,
    -- ��ǰ�����
    writer varchar(100) not null,
    -- ��ǰ �̹��� ��� ���� -> �̹����� �����ϸ� 1 , ���ٸ� 0
    isFile number(1) not null,
    primary key(no) -- �ߺ� �Ұ���(UNIQUE), not null
);

desc shop0131;
// ����
insert into shop0131(no, title, detail, writer, isFile) VALUES(1,'1��ǰ','1��ǰ �󼼳���','�����1',1);
insert into shop0131(no, title, detail, writer, isFile) VALUES(2,'2��ǰ','2��ǰ �󼼳���','�����1',1);
insert into shop0131(no, title, detail, writer, isFile) VALUES(3,'3��ǰ','3��ǰ �󼼳���','�����2',1);
insert into shop0131(no, title, detail, writer, isFile) VALUES(4,'4��ǰ','4��ǰ �󼼳���','�����2',1);
insert into shop0131(no, title, detail, writer, isFile) VALUES(5,'5��ǰ','5��ǰ �󼼳���','�����3',0);

commit;

// ����
update shop0131 set title='����',detail='����',writer='�ۼ���',isFile=1 where no=1;


// ��ȸ
select*from shop0131;
-- ��ǰ �� ����
select count(*) from shop0131;

select * from shop0131 where writer='�����1'; -- �����1�� ����� ��ǰ ���

select * from shop0131 where isFile=1; -- �̹����� �ִ� ��ǰ���
select * from shop0131 where isFile=0; -- �̹����� ���� ��ǰ���

-- ���� ���� ctr+shift+d
-- ���� ���� alt+shift+d

TRUNCATE table shop0131; -- rollback ������� �ʴ´� -> ���̺��� ��� �����͸� ����

ROLLBACK;

select*from shop0131;
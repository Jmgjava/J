-- ���̺� ����
drop table member0130;
create table member0130(
    -- Į���� Ÿ�� ��������
    userId  varchar2 (100) not null,
    userPw varchar2(100) not null,
    age number  not null,
    name varchar(100) not null,
    -- �⺻Ű ����(userId)
    primary key(userId)
    );
    -- ���̵����� -> �׽�Ʈ
    --���� ������ 5���� insert�� �̿��ؼ� memeber0130���̺� ����
    
    insert into member0130(userid, userPw, age, name) values('m1','1111',11,'�̸�1');
    insert into member0130(userid, userPw, age, name) values('m2','2111',11,'�̸�2');
    insert into member0130(userid, userPw, age, name) values('m3','3111',11,'�̸�3');
    insert into member0130(userid, userPw, age, name) values('m4','4111',11,'�̸�4');
    -- ���̺� ��� Į�� ��ȸ
    select*from member0130;
    -- m1 ȸ�� Į�� ��ȸ
    select*from member0130 where userId='m1';
    -- ���̺��� ���ڵ� ����
    select count(*) from member0130;
    -- ȸ���� �����ϴ��� Ȯ�ΰ��� -> ����,����,����, ��ȸ ���
    select count(*) from member0130 where userId='m1';
    
    
    -- ������ ȸ���� �ִ��� Ȯ��
    select count(*) from member0130 where userId ='m1';
    -- �ִٸ�
    delete from member0130 where userId='m1';
    commit;
    rollback;
    select *from member0130;
    
    
    
    
    
    
    
    select*from all_constraints where table_name='member0130';
    
    update member0130 set userPw='30', age=2, name='�̸�22' where userId='m1';
    
    delete member0130 where userid='m5';
    
    commit;
    
    desc member0130;
    select*from member0130;
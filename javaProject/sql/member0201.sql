drop table member0201;

create table member0201(
    no number not null,
    userId varchar2(100) not null,
    userPw varchar2(100) not null,
    age number(3) not null,
    name varchar(100) not null,
    primary key(no)
);

insert into member0201(no,userId,userPw,age,name) VALUES('1','m1','1111','11','�̸�1');
insert into member0201(no,userId,userPw,age,name) VALUES('2','m2','2222','22','�̸�2');
insert into member0201(no,userId,userPw,age,name) VALUES('3','m3','3333','33','�̸�3');
insert into member0201(no,userId,userPw,age,name) VALUES('4','m4','4444','44','�̸�4');
insert into member0201(no,userId,userPw,age,name) VALUES('5','m5','5555','55','�̸�5');

commit;
rollback;

desc member0201;
select*from member0201;
select* from member0201 where no=1;
select count(*) from member0201 where no=1; -- ���� Ȯ�� *****

update member0201 set userId='m1����',userPw='1111����',age=12,name='�̸�1����' where no=1;

delete from member0201 where no=1;
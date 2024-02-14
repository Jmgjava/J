drop table practice;

create table practice(
    no number not null,
    userId VARCHAR2(100) not null,
    userPw VARCHAR2(100) not null,
    age number(3) not null,
    name VARCHAR(10) not null
);

commit;

insert into practice(no,userId,userPw,age,name) VALUES(1,'m1','1111',11,'이름1');
insert into practice(no,userId,userPw,age,name) VALUES(2,'m2','2222',22,'이름2');
insert into practice(no,userId,userPw,age,name) VALUES(3,'m3','3333',33,'이름3');
insert into practice(no,userId,userPw,age,name) VALUES(4,'m4','4444',44,'이름4');
insert into practice(no,userId,userPw,age,name) VALUES(5,'m5','5555',55,'이름5');

select*from practice;
select*from practice where no=1;
select count(*) from practice where no=1;

update practice set userID='m11',userPw='11111',age=111,name='이름11' where no=1;

delete from practice where no=1;

select*from practice;
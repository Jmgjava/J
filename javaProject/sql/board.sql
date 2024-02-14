drop table board0130;

create table board0130(
no number not null, -- 자동으로 1부터 1씩 증가 -> 시퀀스(sequence)
title varchar2(255) not null,
content varchar2(255) not null,
writer varchar(100) not null,
nickname varchar(100) not null,
primary key(no)
);

-- 더미 데이터 <-> 테스트
-- 게시글 생성 Create
insert into board0130(no,title,content,writer,nickname) VALUES('1','제목1','내용1','작성자1','m1');
insert into board0130(no,title,content,writer,nickname) VALUES('2','제목2','내용2','작성자2','m2');
insert into board0130(no,title,content,writer,nickname) VALUES('3','제목3','내용3','작성자3','m3');
insert into board0130(no,title,content,writer,nickname) VALUES('4','제목4','내용4','작성자4','m4');
insert into board0130(no,title,content,writer,nickname) VALUES('5','제목5','내용5','작성자5','m5');

commit;
rollback;

-- 게시글 조회 Read
select*from board0130;

select*from board0130 where no=1;


-- 전체 레코드 수(게시글 수)
select count(*) from board0130;
-- 조건에 맞는 레코드 갯수 : 1(존재), 0(없음)
select count(*) from board0130 where no=1;


-- 게시글 수정 Update
update board0130 set title='제목1변경',content='내용1변경',writer='작성자1변경',nickname='m1변경' where no=1;

commit;

-- 게시글 삭제 Delete
delete from board0130 where no=1;

commit;
rollback;

drop table board0201;

create table board0201(
no number not null, -- 자동으로 1부터 1씩 증가 -> 시퀀스(sequence)
title varchar2(255) not null,
content varchar2(255) not null,
writer varchar(100) not null,
nickname varchar(100) not null,
primary key(no)
);

insert into board0201(no,title,content,writer,nickname) VALUES('1','m1','1111','11','이름1');

commit;
rollback;

desc board0201;
select*from board0201;
select* from board0201 where no=1;
select count(*) from board0201 where no=1; -- 유무 확인 *****

update board0201 set title='m1수정',content='1111수정',writer='12',nickname='이름1수정' where no=1;

delete from board0201 where no=1;
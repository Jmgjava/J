drop table board0201;

-- 테이블 생성
create table board0201(
    no number not null, -- 자동으로 1부터 1씩 증가 -> 시퀀스(sequence)
    title varchar2(255) not null,
    content varchar2(255) not null,
    writer varchar(100) not null,
    nickname varchar(100) not null,
    primary key(no)
);

desc board0201;

-- 테이블 이름 변경

alter table board0201 rename to board0202;

desc board0202;

-- 테이블 칼럼명 변경
alter table board0202 rename column title to bTitle;

desc board0202;
-- 테이블 칼럼을 추가
alter table board0202 add hit number null;

desc board0202;
-- 테이블 칼럼을 수정
alter table board0202 modify hit not null;

desc board0202;
-- 테이블 칼럼 삭제
alter table board0202 drop column hit;

insert into board0202(no,btitle,content,writer,nickname) values(1,'m1','c1','w1','n1');
insert into board0202(no,btitle,content,writer,nickname) values(2,'m2','c1','w1','n1');
insert into board0202(no,btitle,content,writer,nickname) values(3,'m3','c1','w1','n1');

commit;

truncate table board0202; -- 자동 commit;

select * from board0202;

desc board0202;













--------------------------------------------------------------------------------------------------------



-- 회원 테이블
truncate table member0202;
drop table member0202;

create table member0202(
    no number not null, -- 자동으로 등록번호를 설정 -> 시퀀스(Sequence)로 대체
    userId varchar2(255) not null unique, -- 게시글 작성자
    userPw varchar2(255) not null,
    phone varchar2(255) not null,
    primary key(no) -- UNIQUE NOT NULL
);

desc member0202;
select* from member0202;
select count(*) from member0202 where userId='m1';

insert into member0202(no,userId,userPw,phone) VALUES (1,'m1','1111',01012345678);
-- 개체무결성 위반 -> 기본키
insert into member0202(no,userId,userPw,phone) VALUES (1,'m2','2111',01012345678);
-- 개체무결성 위반 -> 기본키 NOT NULL constraint
insert into member0202(no,userId,userPw,phone) VALUES (null,'m2','2111',01012345678);
-- UNIQUE constraint
insert into member0202(no,userId,userPw,phone) VALUES (2,'m1','2111',01012345678);


insert into member0202(no,userId,userPw,phone) VALUES (2,'m2','2111',01012345678);

commit;

-- 시퀀스 생성
create sequence member0202_SEQ --시퀀스 명
increment by 1 -- 1씩 증가
start with 1 -- 1부터~
minvalue 1
maxvalue 1000
nocycle -- 기본값
nocache -- 기본값 20
;



select * from member0202;
--member0202 dropX -> 모든 레코드 삭제

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

-- 시퀀스 삭제
drop sequence member0202_SEQ;

select * from member0202;

--------------------------------------------------------------------------------------------------------



-- 시퀀스 생성 board0202_SEQ 생성하고 1부터 1씩 자동으로 증가 : 10000까지 최대 설정

create sequence board0202_SEQ
increment by 1
start with 1
minvalue 1
maxvalue 10000
nocycle
nocache
;
-- board0202_SEQ를 이용해서 board0202 테이블의 더미 데이터 5개를 추가
-- no 칼럼에 board0202_SEQ를 적용 -> 1부터 1씩 증가

insert into board0202(no,title,content,writer,nickname) values(board0202_SEQ.nextval,'제목1','내용1','작성자1','닉네임1');
insert into board0202(no,title,content,writer,nickname) values(board0202_SEQ.nextval,'제목2','내용2','작성자1','닉네임2');
insert into board0202(no,title,content,writer,nickname) values(board0202_SEQ.nextval,'제목3','내용3','작성자2','닉네임3');
insert into board0202(no,title,content,writer,nickname) values(board0202_SEQ.nextval,'제목4','내용4','작성자2','닉네임4');

commit;

select*from board0202;

-- 모든 시퀀스 조회
select * from user_sequences;
--현재 시퀀스 값
select board0202_SEQ.currval from dual;
-- 현재 시퀀스 다음값
select board0202_SEQ.nextval from dual;

drop sequence board0202_SEQ;




--------------------------------------------------------------------------------------------------------
drop sequence board0202_SEQ;
drop sequence member0202_SEQ;

truncate table member0202; -- 자동 commit;
drop table member0202;

truncate table board0202; -- 자동 commit;
drop table board0202;

-- 테이블 생성
create table board0202(
    no number not null, -- 자동으로 1부터 1씩 증가 -> 시퀀스(sequence)
    title varchar2(255) not null,
    content varchar2(255) not null,
    writer varchar(100) not null,
    nickname varchar(100) not null,
    primary key(no)
);

desc board0202;
select*from board0202;


-- board0202 테이블의 writer 칼럼이 member0202테이블의 userId를 참조한다.
-- board0202 테이블의 writer 칼럼을 외래키(FK)로 설정 -> member0202테이블의 userId를 참조
-- board0202 다  일  member0202
-- board0202 N   1   member0202
alter table board0202
add foreign key (writer)
references member0202(userId);

insert into member0202(no,userId,userPw,phone) VALUES (board0202_seq.nextval,'m1','1111',111111);
insert into member0202(no,userId,userPw,phone) VALUES (board0202_seq.nextval,'m2','2222',222222);

insert into board0202(no,title,content,writer,nickname) values(board0202_seq.nextval,'제목1','내용1','작성자1','닉네임1');
insert into board0202(no,title,content,writer,nickname) values(board0202_seq.nextval,'제목2','내용2','작성자2','닉네임2');
insert into board0202(no,title,content,writer,nickname) values(board0202_seq.nextval,'제목3','내용3','작성자3','닉네임3');




commit;

select * from board0202;

desc board0202;


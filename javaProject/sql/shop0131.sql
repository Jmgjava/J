drop table shop0131;

create table shop0131(
    -- 상품 번호
    no number not null, -- 자동으로 1부터 1씩 증가 -> 시퀀스(sequence)
    -- 상품명
    title varchar2(255) not null,
    -- 상품상세내역
    detail varchar2(255) not null,
    -- 상품등록자
    writer varchar(100) not null,
    -- 상품 이미지 등록 유무 -> 이미지가 존재하면 1 , 없다면 0
    isFile number(1) not null,
    primary key(no) -- 중복 불가능(UNIQUE), not null
);

desc shop0131;
// 생성
insert into shop0131(no, title, detail, writer, isFile) VALUES(1,'1상품','1상품 상세내역','등록자1',1);
insert into shop0131(no, title, detail, writer, isFile) VALUES(2,'2상품','2상품 상세내역','등록자1',1);
insert into shop0131(no, title, detail, writer, isFile) VALUES(3,'3상품','3상품 상세내역','등록자2',1);
insert into shop0131(no, title, detail, writer, isFile) VALUES(4,'4상품','4상품 상세내역','등록자2',1);
insert into shop0131(no, title, detail, writer, isFile) VALUES(5,'5상품','5상품 상세내역','등록자3',0);

commit;

// 수정
update shop0131 set title='제목',detail='내용',writer='작성자',isFile=1 where no=1;


// 조회
select*from shop0131;
-- 상품 총 개수
select count(*) from shop0131;

select * from shop0131 where writer='등록자1'; -- 등록자1이 등록한 상품 목록

select * from shop0131 where isFile=1; -- 이미지가 있는 상품목록
select * from shop0131 where isFile=0; -- 이미지가 없는 상품목록

-- 한줄 복사 ctr+shift+d
-- 한줄 삭제 alt+shift+d

TRUNCATE table shop0131; -- rollback 적용되지 않는다 -> 테이블의 모든 데이터를 삭제

ROLLBACK;

select*from shop0131;
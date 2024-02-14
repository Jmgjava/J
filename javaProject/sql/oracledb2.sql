-- 테이블 생성
drop table member0130;
create table member0130(
    -- 칼럼명 타입 제약조건
    userId  varchar2 (100) not null,
    userPw varchar2(100) not null,
    age number  not null,
    name varchar(100) not null,
    -- 기본키 설정(userId)
    primary key(userId)
    );
    -- 더미데이터 -> 테스트
    --더미 데이터 5개를 insert를 이용해서 memeber0130테이블에 저장
    
    insert into member0130(userid, userPw, age, name) values('m1','1111',11,'이름1');
    insert into member0130(userid, userPw, age, name) values('m2','2111',11,'이름2');
    insert into member0130(userid, userPw, age, name) values('m3','3111',11,'이름3');
    insert into member0130(userid, userPw, age, name) values('m4','4111',11,'이름4');
    -- 테이블 모든 칼럼 조회
    select*from member0130;
    -- m1 회원 칼럼 조회
    select*from member0130 where userId='m1';
    -- 테이블의 레코드 갯수
    select count(*) from member0130;
    -- 회원이 존재하는지 확인가능 -> 가입,수정,삭제, 조회 사용
    select count(*) from member0130 where userId='m1';
    
    
    -- 삭제할 회원이 있는지 확인
    select count(*) from member0130 where userId ='m1';
    -- 있다면
    delete from member0130 where userId='m1';
    commit;
    rollback;
    select *from member0130;
    
    
    
    
    
    
    
    select*from all_constraints where table_name='member0130';
    
    update member0130 set userPw='30', age=2, name='이름22' where userId='m1';
    
    delete member0130 where userid='m5';
    
    commit;
    
    desc member0130;
    select*from member0130;
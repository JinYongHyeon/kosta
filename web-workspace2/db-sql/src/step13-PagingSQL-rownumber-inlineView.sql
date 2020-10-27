drop table player;
create table player(
 no number primary key,
 title varchar2(100) not null,
 singer varchar2(30) not null,
 price number not null
)

select * from player;

create sequence mp3_seq;

insert into player(no,title,singer,price) values(mp3_seq.nextval,'가을아침','아이유',700);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'좋니','윤종신',500);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'시차','우원재',400);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'DNA','방탄소년단',800);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'밤편지','아이유',900);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'가시나','선미',1000);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'Power','EXO',300);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'Ko Ko Bop','EXO',600);
commit
select count(*) from player;

/*
	Oracle row_number() over() : 조회된 ROW(행)에 대한 순차적인 번호를 제공하는 오라클 함수
	
	Inline View : SQL 문장에서 From 절에 사용되는 Subquery FROM 절에 서브쿼리로 SELECT 되는 조회결과를 테이블처럼 사용
	
	EX) SELECT 
	    FROM(
	    	서브쿼리
	    )별칭
	    
*/

--내림차순 정렬
SELECT * FROM player ORDER BY NO DESC

--ROW_NUMBER() OVER(정렬)
SELECT ROW_NUMBER() OVER(ORDER BY no DESC) AS rnum,title,no FROM player;

DELETE FROM player where title='Power'

--ROW_NUMBER()는 조회된 결과행에 대해서 행번호를 매긴다.
--아래의 WHERE 조건절에서는 사용할 수 없다.
SELECT ROW_NUMBER() OVER(ORDER BY no DESC) AS rnum,no,title FROM player
WHERE rnum<3;

--SubQuery의 InlineView를 이용하면 된다.
SELECT rnum,no,title
FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY no DESC) AS rnum,no,title FROM player
)WHERE rnum<=3;
--rnum이 4이상 6이하인 곡들을 조회
SELECT rnum,no,title
FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY no DESC) AS rnum,no,title FROM player
)WHERE rnum BETWEEN 4 AND 6;

--Board Paging SQL
-- 게시물 rnum이 1 이상 5 이하인 게시물 정보를 조회

/*
	
	SELECT
	FROM(
		
	)B, MEMBER M
	WHERE 조인조건 AND rnum BETWEEN 1 AND 5
    
*/
--step1 : 게시물을 내림차순 정렬하고 row number를 생성한다.
SELECT row_number() OVER(ORDER BY NO DESC) as rnum,no,title,hits,
TO_CHAR(time_posted,'YYYY.MM.DD') as time_posted,id
FROM board;
--step2 : step1을 인라인뷰로 이용하고 member와 join 한다.
SELECT b.no,b.title,b.hits,b.time_posted,m.id,m.name FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY NO DESC) AS rnum,no,title,hits,
	TO_CHAR(time_posted,'YYYY.MM.DD') AS time_posted,id FROM board
)b,board_member m
WHERE m.id =b.id AND rnum BETWEEN  5 AND 10

SELECT rnum,b.no,b.title,b.content 
FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY NO DESC) AS rnum,no,title,content,id FROM board 
)b,board_member m WHERE b.id=m.id AND rnum BETWEEN 5 AND 10


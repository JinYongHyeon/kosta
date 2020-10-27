DROP TABLE board_member;
DROP TABLE board;

DROP SEQUENCE board_seq;

CREATE SEQUENCE board_seq;

CREATE TABLE board_member(
	id VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL
);

CREATE TABLE board(
	no NUMBER PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	content CLOB NOT NULL,
	hits NUMBER DEFAULT 0,
	time_posted DATE NOT NULL,
	id VARCHAR2(100) NOT NULL,
	CONSTRAINT board_fk FOREIGN KEY(id) REFERENCES board_member(id)
);

INSERT INTO board_member VALUES('qwer','1234','용현진')
INSERT INTO board_member VALUES('qwer2','1234','용현진')

INSERT INTO board(no,title,content,time_posted,id) VALUES(board_seq.nextval,'타이틀','내용123',SYSDATE,'qwer');
INSERT INTO board(no,title,content,time_posted,id) VALUES(board_seq.nextval,'타이틀','aasdd',SYSDATE,'qwer')

SELECT * FROM board_member;

--리스트에서는 게시물번호, 제목, 작성자, 작성일, 조회수
SELECT b.no,b.title,m.id,m.name,TO_CHAR(b.time_posted,'YYYY-MM-DD') AS 작성일,b.hits, b.content FROM
board b, board_member m
WHERE b.id=m.id AND b.no=1

select 

SELECT * FROM (SELECT * FROM(
	SELECT ROWNUM AS RNUM,NO,TITLE FROM board
)board WHERE rnum<=20
)WHERE RNUM>=10

SELECT * FROM (SELECT ROWNUM AS ROW FROM BOARD WHERE ROW<=20) WHERE ROW>=10


SELECT * FROM USER_SEQUENCES  


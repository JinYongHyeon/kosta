CREATE TABLE USER_NOTICE(
	ID VARCHAR2(100) PRIMARY KEY,
	PASSWORD VARCHAR2(100) NOT NULL,
	NAME VARCHAR2(100) NOT NULL,d
	AGE NUMBER NOT NULL,
	ADDRESS VARCHAR2(100) NOT NULL, 
	authority VARCHAR2(100) NOT NULL
)

INSERT INTO USER_NOTICE VALUES('admin','1234','진용현',23,'판교','관리자')

SELECT * FROM USER_NOTICE

DROP TABLE USER_NOICE

CREATE TABLE NOTICE(
NO NUMBER PRIMARY KEY,
TITLE VARCHAR2(100) NOT NULL,
CONTENT VARCHAR2(1000) NOT NULL,
WRITER VARCHAR2(100) NOT NULL,
NOTICEDATE DATE NOT NULL,
POINT NUMBER NOT NULL
)

CREATE SEQUENCE NOTICE_SEQ

SELECT * FROM NOTICE


INSERT INTO NOTICE VALUES(NOTICE_SEQ.NEXTVAL,'안녕하세요 가입인사!','반갑습니다 안녕하세요','admin',SYSDATE,0);
INSERT INTO NOTICE VALUES(NOTICE_SEQ.NEXTVAL,'안녕하세요 가입인사!','반갑습니다 안녕하세요반갑습니다 안녕하세요반갑습니다 안녕하세요반갑습니다 안녕하세요반갑습니다 안녕하세요반갑습니다 안녕하세요반갑습니다 안녕하세요반갑습니다 안녕하세요반갑습니다 안녕하세요반갑습니다 안녕하세요','admin',SYSDATE,0);


SELECT * FROM NOTICE;


SELECT no,TITLE,CONTENT,WRITER,NOTICEDATE,POINT FROM NOTICE
WHERE ROWNUM BETWEEN 10 AND 13



UPDATE NOTICE SET POINT=POINT+1 WHERE NO=?


	/* SQL 여러줄 주석   */ 

-- <-- SQL 한줄 주석

/*
 * SQL (Structured Query Language) : 데이터를 정의하고, 조작, 제어하는 언어
 * 
 * DDL , DML , DCL
 * 1.DDL (Data Definition Language / 데이터 정의어) : CREATE(생성) , DROR(삭제) , ALTER(수정) 
 * 2.DML (Data Manipulation Language / 데이터 조작어): INSERT(삽입), DELETE(삭제), UPDATE(수정), SELECT(검색) 
 * CRUD ( CREATE , READ , UPDATE , DELETE) <-- INSERT , SELECT , UPDATE , DELETE
 * 3.DCL (Data Control Language / 데이터 제어어) : COMMIT(실제 DB에 반영), ROLLBACK(작업취소하고 되돌린다), GRANT 권한부여, REVOE 권한취소
 * 
 * TABLE - 데이터를 저장하는 공간
 * COLUMN - 속성 (attribute) <-- java 비유 변수
 * CONSTRAINT : 제약조건 ex) PRIMARY KEY - 중복 허용 X , NOT NULL
 * DataType : 문자열 varchar2(100) , 숫자형 number
 */

--MEMBER TABLE을 생성하고 정보를 저장한 후 조회해본다.

--실행 단축키 영역 지정 후 ALT + X
CREATE TABLE MEMBER3(
	ID VARCHAR2(30) PRIMARY KEY ,
	PASSWORD VARCHAR2(30) NOT NULL,
	NAME VARCHAR2(30) NOT NULL,
	ADDRESS VARCHAR2(30)
)
DROP TABLE MEMBER; --테이블 삭제 DDL

--DML : INSERT 테이블 MEMBER에 정보를 추가
INSERT INTO MEMBER(id,password,name,address) VALUES('java','1234','아이유','판교');
INSERT INTO MEMBER(id,password,name,address) VALUES('java2','1234','아이유','판교2');
--제약조건 PRIMARY KEY는 중복된 값을 허용하지 않으므로 아래SQL을 ERROR가 난다
INSERT INTO MEMBER(id,password,name,address) VALUES('java3','test','test','test');
--총 회원수를 조회해본다 COUNT(*)
SELECT COUNT(*) FROM MEMBER;


SELECT * FROM MEMBER




--DML : UPDATE정보를 수정
UPDATE member SET address='미쿡' where id='YH';
--DML, SELECT, WHERE 절을 이용해 YH라는 아이디를 가진 회원 정보만 조회
SELECT * FROM MEMBER WHERE ID='YH';

--DML : DELETE정보만 삭제
DELETE FROM MEMBER WHERE address='판교'

--MEMBER TABLE의 정보를 조회시 회원  NAME, ADDRESS만 조회
SELECT NAME,ADDRESS FROM MEMBER;
--SELECT 시 WHERE 컬럼='' AND 컬럼='' NAME= 아이유 ADDRESS= 판교인 회원의 ID를 조회해본다.
SELECT ID FROM MEMBER WHERE NAME='아이유' AND ADDRESS='판교'

--제약조건 테스트 : PRIMARY KEY로 지정된 컬럼은 유일해야(UNIQUE)하며 NOT NULL이어야 하므로 반드시 중복되지 않은 정보를 저장해야 한다.
INSERT INTO MEMBER(PASSWORD,NAME,ADDRESS)VALUES('A','홍길동','판교')

--PASSWORD 컬럼에 NOT NULL 제약조건이 있으므로 반드시 INSERT 해야 하므로 ERROR
INSERT INTO MEMEBER(id,name,address)VALUES('A','A123','홍길동');
--ADDRESS는 별도의 제약조건이 없으므로 NULL을 허용된다.
INSERT INTO MEMBER(id,password,name) VALUES('A','test','test');

/*
 * 1.회원정보 두명을 입력
 * ID PASSWORD NAME ADDRESS
 * spring aop 고슬링 뉴욕
 * mybatis di 양성식 뉴욕
 */
INSERT INTO MEMBER(ID,PASSWORD,NAME,ADDRESS)VALUES('spring','aop','고슬링','뉴욕')
INSERT INTO MEMBER(ID,PASSWORD,NAME,ADDRESS)VALUES('mybatis','di','양성식','뉴욕')
 /* 
 * 2.INSERT 구문 실행 후 뉴욕에 사는 회원의 이름만 출력(SELECT)
 */
SELECT NAME FROM MEMBER WHERE ADDRESS='뉴욕'
/*
 * 3.ADDRESS가 뉴욕인 회원들의 ADDRESS를 워싱턴으로 수정
 */*/
 UPDATE MEMBER SET ADDRESS='워싱턴' WHERE ADDRESS='뉴욕'
 --전체 회원 정보를 조회
 SELECT * FROM MEMBER
 
 COMMIT -- 실행 데이터베이스에 반영 ( 작업 정보를 저장)
 ROLLBACK -- COMMIT 이전의 모든 작업을 취소하고 되돌리는 명령어 
 
 -- 기본 SQL 리뷰
 INSERT INTO member(id,password,name,address)VALUES('ebs','abcd','펭수','양재')
 INSERT INTO member(id,password,name,address)VALUES("ebs","abcd","펭수","양재")
 
 --member 테이블에서 name이 펭수이고 address가 양재인 회원의 id를 조회
 SELECT ID FROM member where name='펭수' and address='양재'
 
 --member 테이블의 회원 주소 중 양재인 회원의 주소를 판교로 업데이트
 UPDATE member SET ADDRESS='판교' WHERE ADDRESS='양재';
 
 DELETE FROM MEMBER;
 

 

 
 

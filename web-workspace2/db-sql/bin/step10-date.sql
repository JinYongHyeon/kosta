/*	date 타입 : 데이터베이스 시간 (년, 월, 일, 시, 분, 초) 을 관리하는 타입
 *  
 *  주요함수
 *  1. TO_CHAR() : 데이터베이스에 저장된 DATE형의 정보를 문자열로 반환받을 때 사용
 *  2. TO_DATE() : 문자타입의 시간 정보를 데이터베이스의 DATE형으로 변환해 저장할 때 사용 
 * 
 *  sysdate 키워드 : 현재 시간을 표현하는 키워드
 *  
 *  dual 테이블을 이용해서 현재 시간을 조회
 */

SELECT SYSDATE FROM DUAL 
-- TO_CHAR() :원하는 시간 포맷을 설정해 문자열로 반환받는 함수
SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD') AS 년월일 FROM DUAL;
SELECT TO_CHAR(SYSDATE,'YYYY. MM. DD') AS 년월일 FROM DUAL;
SELECT TO_CHAR(SYSDATE,'YYYY') AS 년 FROM DUAL;
SELECT TO_CHAR(SYSDATE,'MM') AS 월 FROM DUAL;
SELECT TO_CHAR(SYSDATE,'DD') AS 일 FROM DUAL;
SELECT TO_CHAR(SYSDATE,'HH24:MI:SS') AS 시분초 FROM DUAL; --24시간 기준표시
SELECT TO_CHAR(SYSDATE,'HH:MI:SS') AS 시분초 FROM DUAL;
SELECT TO_CHAR(SYSDATE,'DAY') AS 요일 FROM DUAL; --요일
--년 월 일 시 분 초
SELECT TO_CHAR(SYSDATE,'YYYY/MM/DD HH24:MI:SS') FROM DUAL

--실제 테이블을 생성해서 테스트
CREATE TABLE DATA_TEST(
	ID VARCHAR2(100) PRIMARY KEY,
	MYDATE DATE NOT NULL
);

--INSERT : ID = JAVA, MYDATE = 현재시간을 지정
INSERT INTO DATA_TEST(ID,MYDATE) VALUES('java',SYSDATE);
--조회 년,월,일만 조회 [TO_CHAR()를 이용]
SELECT ID,TO_CHAR(MYDATE,'YYYY.MM.DD') AS 년월일 FROM DATA_TEST;
/* TO_DATE(시간정보,시간포맷) : 문자형 데이터를 DATE형으로 변환
 * 
 * 웹 어플리케이션에서 시간 정보를 전달받아 DB에 저장하기 위해 주로 사용 <-- EX)생년월일
 */
INSERT INTO DATA_TEST(ID,MYDATE) VALUES('jstl',TO_DATE('2020.9.1','YYYY.MM.DD'))
INSERT INTO DATA_TEST(ID,MYDATE) VALUES('Ajax',TO_DATE('1989.1.7 5:20:33','YYYY.MM.DD HH24:MI:SS'))

--DATE형 데이터 연산

 --하루전
SELECT ID,MYDATE ,MYDATE-1 AS 하루전 FROM DATA_TEST;

--현재시간과 저장시간의 일수를 확인
SELECT ID,MYDATE,SYSDATE-MYDATE FROM DATA_TEST;

--소수점 이하는 버리겠다 TRUNC()
SELECT ID, MYDATE, TRUNC(SYSDATE-MYDATE) FROM DATA_TEST;

--몇개월차이 MONTHS_BETWEEN(현재시간,등록시간)
SELECT ID, MYDATE, TRUNC(MONTHS_BETWEEN(SYSDATE,MYDATE)) FROM DATA_TEST;

--몇년차이
SELECT ID, MYDATE, TRUNC(MONTHS_BETWEEN(SYSDATE,MYDATE)/12) FROM DATA_TEST;



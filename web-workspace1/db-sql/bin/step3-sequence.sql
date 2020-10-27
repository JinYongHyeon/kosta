/* 오라클 시퀀스(sequence) : 순차적으로 증가, 유일한 값을 생성하기 위한 객체 주로 PRIMARY KEY (unique + not null)
 * 						 을 생성하기 위해 사용
 * 테이블과는 독립적 구조
 * 
 * CREATE SEQUENCE 시퀀스명 
 * [START WITH 시작번호] -> DEFUALT 0
 * [INCREMENT BY 증가값] -> DEFUALT 1++
 * [MAXVALUE 최대값]
 * [MINVALUE 최소값]
 * [CYCLE or NOCYCLE] -> 최대값을 넘었을 때 최소값으로 다시 갈건지 안할건지 설정
 * [NOCACHE] -> 임시메모리
 */

--시퀀스 생성
CREATE SEQUENCE test_seq;
--시퀀스 삭제
DROP SEQUENCE test_seq;

/*Oracle dual table : 오라클에서 제공하는 기본 테이블 컬럼 하나만 존재, 주로 시퀀스 또는 날짜함수, 산술연산에 사용
  sys Admin 계정에서 관리, 수정 및 삭제 등 조작은 불가
 **/

SELECT * FROM DUAL;

--dual table을 이용해 생성한 시퀀스 값을 확인 
--시퀀스 : 시퀀스명.nextval ->  다음 시퀀스 값을 생성

--car table 생섷새ㅓ 시퀀스 적용해보기
CREATE TABLE CAR(
	CAR_NO NUMBER PRIMARY KEY, -- 시퀀스로 자동 발급
	MODEL VARCHAR2(100) NOT NULL
)

SELECT * FROM CAR

--시퀀스 다음값
select car_seq.nextval from dual;
--시퀀스 전체 검색

SELECT car_seq.currval from dual
SELECT * FROM USER_SEQUENCES  

--시퀀스 : 현재값 시퀀스명.currval -> 하나의 컨텍션에서 nextval 후 currval만 가능
--application에서 테스트 : 다수의 사용자들에 의해 공유되는 시퀀스이므로 하나의 컨넥션에서만 시퀀스 현재값을 볼 수 있다.
--SELECT test_seq.currval FROM DUAL 단독으로 사용할 수 없다.

--car_seq 이름으로 시퀀스 생성
CREATE SEQUENCE car_seq;

INSERT INTO car(car_no,model) VALUES(car_seq.nextval,'소나타');
INSERT INTO car(car_no,model) VALUES(car_seq.nextval,'말리부');

--GUESTBOOK Table 생성
CREATE TABLE GUESTBOOK(
	guestbook_no NUMBER PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	content VARCHAR2(1000) NOT NULL
)

SELECT * FROM GUESTBOOK


--guestbook_seq 시퀀스 생성
CREATE SEQUENCE guestbook_seq

INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES(guestbook_seq.nextval,'자바의정석','JAVA')
INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES(guestbook_seq.nextval,'이것이자바다','JAVA')
INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES(car_seq.nextval,'이것이자바다','JAVA')


SELECT guestbook_no,title,content FROM GUESTBOOK ORDER BY guestbook_no DESC

--시퀀스 테스트2
--테이블 생성, 시퀀스 생성
CREATE TABLE MOVIE(
	id NUMBER PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	attendance NUMBER DEFAULT 0
)
--캐쉬 기능을 사용하지 않겠다는 옵션을 할당 -> 비정상종료시에도 번호가 이어지도록 (성능은 떨어짐)
CREATE SEQUENCE movie_seq nocache;

INSERT INTO MOVIE(ID,TITLE)VALUES(movie_seq.nextval,'8월의크리스마스')

SELECT ID,TITLE,ATTENDANCE FROM MOVIE

SELECT movie_seq.nextval from dual;
SELECT movie_seq.currval from dual;


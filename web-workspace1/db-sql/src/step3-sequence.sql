/* ����Ŭ ������(sequence) : ���������� ����, ������ ���� �����ϱ� ���� ��ü �ַ� PRIMARY KEY (unique + not null)
 * 						 �� �����ϱ� ���� ���
 * ���̺���� ������ ����
 * 
 * CREATE SEQUENCE �������� 
 * [START WITH ���۹�ȣ] -> DEFUALT 0
 * [INCREMENT BY ������] -> DEFUALT 1++
 * [MAXVALUE �ִ밪]
 * [MINVALUE �ּҰ�]
 * [CYCLE or NOCYCLE] -> �ִ밪�� �Ѿ��� �� �ּҰ����� �ٽ� ������ ���Ұ��� ����
 * [NOCACHE] -> �ӽø޸�
 */

--������ ����
CREATE SEQUENCE test_seq;
--������ ����
DROP SEQUENCE test_seq;

/*Oracle dual table : ����Ŭ���� �����ϴ� �⺻ ���̺� �÷� �ϳ��� ����, �ַ� ������ �Ǵ� ��¥�Լ�, ������꿡 ���
  sys Admin �������� ����, ���� �� ���� �� ������ �Ұ�
 **/

SELECT * FROM DUAL;

--dual table�� �̿��� ������ ������ ���� Ȯ�� 
--������ : ��������.nextval ->  ���� ������ ���� ����

--car table ���E���� ������ �����غ���
CREATE TABLE CAR(
	CAR_NO NUMBER PRIMARY KEY, -- �������� �ڵ� �߱�
	MODEL VARCHAR2(100) NOT NULL
)

SELECT * FROM CAR

--������ ������
select car_seq.nextval from dual;
--������ ��ü �˻�

SELECT car_seq.currval from dual
SELECT * FROM USER_SEQUENCES  

--������ : ���簪 ��������.currval -> �ϳ��� ���ؼǿ��� nextval �� currval�� ����
--application���� �׽�Ʈ : �ټ��� ����ڵ鿡 ���� �����Ǵ� �������̹Ƿ� �ϳ��� ���ؼǿ����� ������ ���簪�� �� �� �ִ�.
--SELECT test_seq.currval FROM DUAL �ܵ����� ����� �� ����.

--car_seq �̸����� ������ ����
CREATE SEQUENCE car_seq;

INSERT INTO car(car_no,model) VALUES(car_seq.nextval,'�ҳ�Ÿ');
INSERT INTO car(car_no,model) VALUES(car_seq.nextval,'������');

--GUESTBOOK Table ����
CREATE TABLE GUESTBOOK(
	guestbook_no NUMBER PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	content VARCHAR2(1000) NOT NULL
)

SELECT * FROM GUESTBOOK


--guestbook_seq ������ ����
CREATE SEQUENCE guestbook_seq

INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES(guestbook_seq.nextval,'�ڹ�������','JAVA')
INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES(guestbook_seq.nextval,'�̰����ڹٴ�','JAVA')
INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES(car_seq.nextval,'�̰����ڹٴ�','JAVA')


SELECT guestbook_no,title,content FROM GUESTBOOK ORDER BY guestbook_no DESC

--������ �׽�Ʈ2
--���̺� ����, ������ ����
CREATE TABLE MOVIE(
	id NUMBER PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	attendance NUMBER DEFAULT 0
)
--ĳ�� ����� ������� �ʰڴٴ� �ɼ��� �Ҵ� -> ����������ÿ��� ��ȣ�� �̾������� (������ ������)
CREATE SEQUENCE movie_seq nocache;

INSERT INTO MOVIE(ID,TITLE)VALUES(movie_seq.nextval,'8����ũ��������')

SELECT ID,TITLE,ATTENDANCE FROM MOVIE

SELECT movie_seq.nextval from dual;
SELECT movie_seq.currval from dual;


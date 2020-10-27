/*	date Ÿ�� : �����ͺ��̽� �ð� (��, ��, ��, ��, ��, ��) �� �����ϴ� Ÿ��
 *  
 *  �ֿ��Լ�
 *  1. TO_CHAR() : �����ͺ��̽��� ����� DATE���� ������ ���ڿ��� ��ȯ���� �� ���
 *  2. TO_DATE() : ����Ÿ���� �ð� ������ �����ͺ��̽��� DATE������ ��ȯ�� ������ �� ��� 
 * 
 *  sysdate Ű���� : ���� �ð��� ǥ���ϴ� Ű����
 *  
 *  dual ���̺��� �̿��ؼ� ���� �ð��� ��ȸ
 */

SELECT SYSDATE FROM DUAL 
-- TO_CHAR() :���ϴ� �ð� ������ ������ ���ڿ��� ��ȯ�޴� �Լ�
SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD') AS ����� FROM DUAL;
SELECT TO_CHAR(SYSDATE,'YYYY. MM. DD') AS ����� FROM DUAL;
SELECT TO_CHAR(SYSDATE,'YYYY') AS �� FROM DUAL;
SELECT TO_CHAR(SYSDATE,'MM') AS �� FROM DUAL;
SELECT TO_CHAR(SYSDATE,'DD') AS �� FROM DUAL;
SELECT TO_CHAR(SYSDATE,'HH24:MI:SS') AS �ú��� FROM DUAL; --24�ð� ����ǥ��
SELECT TO_CHAR(SYSDATE,'HH:MI:SS') AS �ú��� FROM DUAL;
SELECT TO_CHAR(SYSDATE,'DAY') AS ���� FROM DUAL; --����
--�� �� �� �� �� ��
SELECT TO_CHAR(SYSDATE,'YYYY/MM/DD HH24:MI:SS') FROM DUAL

--���� ���̺��� �����ؼ� �׽�Ʈ
CREATE TABLE DATA_TEST(
	ID VARCHAR2(100) PRIMARY KEY,
	MYDATE DATE NOT NULL
);

--INSERT : ID = JAVA, MYDATE = ����ð��� ����
INSERT INTO DATA_TEST(ID,MYDATE) VALUES('java',SYSDATE);
--��ȸ ��,��,�ϸ� ��ȸ [TO_CHAR()�� �̿�]
SELECT ID,TO_CHAR(MYDATE,'YYYY.MM.DD') AS ����� FROM DATA_TEST;
/* TO_DATE(�ð�����,�ð�����) : ������ �����͸� DATE������ ��ȯ
 * 
 * �� ���ø����̼ǿ��� �ð� ������ ���޹޾� DB�� �����ϱ� ���� �ַ� ��� <-- EX)�������
 */
INSERT INTO DATA_TEST(ID,MYDATE) VALUES('jstl',TO_DATE('2020.9.1','YYYY.MM.DD'))
INSERT INTO DATA_TEST(ID,MYDATE) VALUES('Ajax',TO_DATE('1989.1.7 5:20:33','YYYY.MM.DD HH24:MI:SS'))

--DATE�� ������ ����

 --�Ϸ���
SELECT ID,MYDATE ,MYDATE-1 AS �Ϸ��� FROM DATA_TEST;

--����ð��� ����ð��� �ϼ��� Ȯ��
SELECT ID,MYDATE,SYSDATE-MYDATE FROM DATA_TEST;

--�Ҽ��� ���ϴ� �����ڴ� TRUNC()
SELECT ID, MYDATE, TRUNC(SYSDATE-MYDATE) FROM DATA_TEST;

--������� MONTHS_BETWEEN(����ð�,��Ͻð�)
SELECT ID, MYDATE, TRUNC(MONTHS_BETWEEN(SYSDATE,MYDATE)) FROM DATA_TEST;

--�������
SELECT ID, MYDATE, TRUNC(MONTHS_BETWEEN(SYSDATE,MYDATE)/12) FROM DATA_TEST;



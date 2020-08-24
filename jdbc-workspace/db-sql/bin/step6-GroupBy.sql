/*
 * GROUP BY : ���̺��� Ư�� �÷��� �������� �׷�ȭ�Ͽ� �˻��� �� ���, �׷��Ҽ��� �Բ� ���
 * (�׷��Լ� - MAX, MIN, AVG, COUNT)
 * HAVING : GROUP BY�� �Բ� ����ϴ� ������(�׷쿡 ���� ������ ����)
 * 
 * ��)��ǰ���̺��� �����纰 ��ǰ��, ��� ����, �μ��� �����, ��տ���
 */

--�����纰 ��ǰ���� ��ȸ
SELECT * FROM PRODUCT ORDER BY MAKER ASC

SELECT MAKER, COUNT(*) AS ��ǰ��
FROM PRODUCT
GROUP BY MAKER
--HAVING COUNT(*)>1 GROUP BY �ÿ� ������ �ο��� �� HAVING �̿�
ORDER BY ��ǰ�� DESC

--������ MAKER �u ��ǰ��հ��� ��ȸ�ϵ� ��հ� ������������ �����Ͽ� ��ȸ

SELECT MAKER, AVG(PRICE) AS ��հ���, COUNT(*)
FROM PRODUCT
GROUP BY MAKER
ORDER BY ��հ��� DESC

--��ǰ��հ� 1500 �� �ʰ��ϴ� ��ǰ�鸸 ��ȸ�ϵ�, MAKER �� ��ǰ��, ��հ��� ��ȸ�Ѵ�

SELECT MAKER,COUNT(*) AS ��ǰ��,AVG(PRICE) AS ��հ���
FROM PRODUCT 	
GROUP BY MAKER
HAVING AVG(PRICE) >1500
ORDER BY ��հ��� DESC
	
SELECT * FROM EMPLOYEE

--JOB �÷��� �������� �׷�ȭ JOB, �����, ��տ��� ��������
--JOB�� ��տ����� 500�� �ʰ��ϴ� JOB�� ��ȸ�ϴ� ������ �׷� ��ȸ ������ �߰�
SELECT JOB , COUNT(*) AS ����� , ROUND(AVG(SALARY)) AS ��տ��� 
FROM EMPLOYEE
GROUP BY JOB 
HAVING ROUND(AVG(SALARY)) > 500
ORDER BY ��տ��� DESC

INSERT INTO EMPLOYEE(EMPNO,NAME,JOB,SALARY) VALUES(employee_seq.nextval,'������','��ȹ',1000)
INSERT INTO EMPLOYEE(EMPNO,NAME,JOB,SALARY) VALUES(employee_seq.nextval,'������','��ȹ',1200)
INSERT INTO EMPLOYEE(EMPNO,NAME,JOB,SALARY) VALUES(employee_seq.nextval,'�տ���','��ȹ',700)

	
--JOB�׷캰  �ְ� SALARY�� ��ȸ , HIGHSALARY �������� 	 (JOB , HIGHSALARY)
		
			 
SELECT JOB,MAX(SALARY) AS HIGHSALARY
FROM EMPLOYEE 
GROUP BY JOB
ORDER BY HIGHSALARY

SELECT DISTINCT(JOB) FROM EMPLOYEE;
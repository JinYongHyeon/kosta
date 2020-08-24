/*
	JOIN SQL -���� ���̺��� �����Ͽ� ������ ��ȸ�ϱ� ���� SQL
	INNER JOIN - JOIN ���ǿ��� ���� ��ġ�ϴ� ���� ��ȯ
	 -1)equi-join 2)non-equi-join
	 
	OUTER JOIN - JOIN ���ǿ��� ���� ���� ��ġ���� �ʴ��� ���� ��ȯ
	
	SELF JOIN
*/

/*
	1.INNER JOIN
	 1)equi join : ���� ��� ���̺��� ����ϴ� �÷� ������ ��Ȯ�ϰ� ��ġ�ϴ� ��쿡 ����ϴ� JOIN
	  ex)����� �μ����̺��� �μ���ȣ�� �̿��� ���� -> Ư¡ : WHERE ���� = �����ڸ� �̿��� ���������� ����
     2)non-equi join : ���� ���̺� ���� ����ϴ� �÷� ������ ���� �� ����ϴ� ����
      ex)��� ���̺��� ���޵�����̺��� �÷��� �������� ������ ����� ���� ����� Ȯ���ϱ� ���� non-equi join �̿�
         -> Ư¡ : WHERE ���� >(ũ�ų� �۰ų�..) �� ���� �����ڸ� �̿��� ���� ������ ����
*/
SELECT E.EMPNO,E.ENAME,D.DEPTNO,D.DNAME,D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;
--�� SQL��  JOIN ON ���� ǥ��
SELECT E.EMPNO,E.ENAME,D.DEPTNO,D.DNAME,D.LOC
FROM EMP E
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO
--�� SQL�� JOIN USING ���� ǥ��
SELECT E.EMPNO,E.ENAME,DEPTNO,D.DNAME,D.LOC
FROM EMP E
INNER JOIN DEPT D USING(DEPTNO) -- USING ���� ��Ī ����(�÷�)

--���� ���� sal ������ �޴� ��� emp��  empno,ename,sal,deptno,loc�� ��ȸ
SELECT MAX(SAL) FROM EMP;

SELECT * FROM EMP WHERE SAL = 5000
--equi join(INNER JOIN)
SELECT E.EMPNO,E.ENAME,E.SAL,D.DEPTNO,D.LOC
FROM EMP E, DEPT D 
--WHERE E.DEPTNO = D.DEPTNO AND E.SAL=(SELECT MAX(SAL) FROM EMP)
WHERE E.DEPTNO = D.DEPTNO AND E.EMPNO = (
SELECT EMPNO FROM EMP WHERE SAL = (
SELECT MAX(SAL) FROM EMP))

--non-equi join(INNER JOIN)
--ex) emp(���)  salgrade(���޵��)
--    sal	    hisal , losal
-- �� ���̺��� �������� ����� sal�� salgrade�� �ְ���hisal ������losal ���̿� �ִ�.
SELECT * FROM EMP;

SELECT * FROM SALGRADE

SELECT E.ENAME, E.SAL, S.GRADE, S.LOSAL, S.HISAL
FROM EMP E, SALGRADE S
WHERE E.ENAME = 'SMITH' AND E.SAL>=S.LOSAL AND E.SAL<=S.HISAL

/*
 * 2. OUTER JOIN
 *    �Ϲ����� ���� ���ǿ� �������� �ʴ� ��쿡�� �ٸ� ���� ��ȸ�ϱ� ���� ��� 
 *    --> INNER JOIN�� ���̺� ���� �÷��� ��ġ�Ǵ� ���� ���� ��쿡�� ��ȸ���� �ʴ´�.
 * 
 *     HOW ? JOIN ���ǿ�(+)�� ���� (���ν�ų ���� ���� ���� ǥ��)
 * 	   SELECT COLUMN ... 
 *     FROM TABLE1,TABLE2
 *     WHERE TABLE1.COLUMN(+) = TABLE2.COLUMN
 */
 
SELECT DISTINCT(DEPTNO) FROM EMP;

SELECT DISTINCT(DEPTNO) FROM DEPT;
--�⺻ INNER JOIN������ ����� ���� �μ� ��ȣ 40�� �ش��ϴ� �μ������� ��ȸ���� �ʴ´�.
SELECT E.ENAME,D.DEPTNO,D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
ORDER BY D.DEPTNO ASC;
--����� ���� �μ��������� ��� ��ȸ�ϰ��� �� ���� OUTER JOIN�� �̿��Ѵ�
SELECT E.ENAME,D.DEPTNO,D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO(+) = D.DEPTNO
ORDER BY D.DEPTNO ASC;
--LEFT OUTER JOIN ���·� �� SQL�� ��� (���� ���̺��� ������� NULL�� �پ��ش�)
SELECT E.ENAME,D.DEPTNO,D.DNAME
FROM DEPT D
LEFT OUTER JOIN EMP E
ON D.DEPTNO = E.DEPTNO
--RIGHT OUTER JOIN ���·� ���
SELECT E.ENAME,D.DEPTNO,D.DNAME
FROM EMP E
RIGHT OUTER JOIN DEPT D
ON D.DEPTNO = E.DEPTNO
/*
 *  SELF JOIN : ���̺� ��ü���� ����
 *  ������ ���̺������� ���������� �ٸ� ������ ����
 *  ��� - 
 */

--SMITH�� �Ŵ��� �����ȣ�� 7902�̴�
SELECT EMPNO,ENAME,MGR FROM EMP WHERE EMPNO = 7369
--SMITH�� �Ŵ��� ��ȣ MGR�� �� �ٸ� ����� �����ȣEMPNO�̴�.
SELECT EMPNO,ENAME,MGR FROM EMP WHERE EMPNO = 7902

--���� ������� �����ȣ EMPNO, ����� ENAME, �Ŵ�����ȣMGR, �Ŵ������� ��ȸ
SELECT E.EMPNO,E.ENAME,E.MGR,M.EMPNO,M.ENAME
FROM EMP E,EMP M
WHERE E.MGR = M.EMPNO
--�� SQL�� INNER JOIN �����̹Ƿ� �Ŵ����� ���� ����� ���ܵǾ� 13���� ��ȸ(����14��)
--�Ŵ����� ���� ������� ��� ��ȸ�ϰ��� �� ���� OUTER JOIN
SELECT E.EMPNO,E.ENAME,E.MGR,M.EMPNO,M.ENAME
FROM EMP E,EMP M
WHERE E.MGR = M.EMPNO(+)

--7369 EMPNO�� ENAME�� DNAME, �Ŵ�����, GRADE(���޵��)�� ��ȸ
SELECT E.EMPNO,E.ENAME,E.SAL,D.DNAME,M.ENAME,S.GRADE
FROM EMP E, EMP M, DEPT D ,SALGRADE S	
WHERE E.EMPNO = 7369
AND E.DEPTNO = D.DEPTNO -- �μ�
AND E.MGR = M.EMPNO -- �Ŵ���
AND E.SAL >= S.LOSAL  --����
AND E.SAL <= S.HISAL --����

SELECT * 
FROM NOTICE
ORDER BY NO ASC;

CREATE SEQUENCE NOTICE_SEQ;
DROP SEQUENCE NOTICE_SEQ;

DELETE FROM NOTICE

SELECT ROWNUM,NO,TITLE,CONTENT,POINT FROM NOTICE WHERE ROWNUM BETWEEN 1 AND 20;
 select * from user_tab_columns WHERE TABLE_NAME='NOTICE'


 
 
 SELECT ROWNUM,NO,TITLE,CONTENT,POINT
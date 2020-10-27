/* IN������ : Ư������ ���ԵǴ� �����͸� ��ȸ�ϰ��� �� �� ����ϴ� ������
 * SELECT �÷�,�÷� FROM ���̺�� WHERE �÷� IN('�Ե�','���׷�','����') <-- ���������� ����
 * 
 * NOT IN ������ : Ư������ ���Ե��� �ʴ� �����͸� ��ȸ�ϰ��� �� �� ����ϴ� ������
 * SELECT �÷�,�÷� FROM ���̺�� WHERE �÷� NOT IN('�Ե�','���׷�','����') <-- ���������� ����
 */

--MAKER�� �Ե� ���� ���׷��� ��ǰ�� ������ ��ȸ�Ѵ�
SELECT ID,NAME,MAKER,PRICE 
FROM PRODUCT 
WHERE MAKER = '�Ե�' OR MAKER = '���׷�' OR MAKER = '����' 
--�� SQL�� IN���� ��ȸ�غ���
SELECT ID,NAME,MAKER,PRICE 
FROM PRODUCT
WHERE MAKER IN('�Ե�','���׷�','����')
--MAKER�� �Ե� ���� ���׷��� �ƴ� ��ǰ���� ��ȸ NOT <>
SELECT ID,NAME,MAKER,PRICE 
FROM PRODUCT 
WHERE MAKER <> '�Ե�' AND MAKER <> '���׷�' AND MAKER <> '����' 
--�� SQL�� NOT IN���� ��ȸ�غ���
SELECT ID,NAME,MAKER,PRICE 
FROM PRODUCT
WHERE MAKER NOT IN('�Ե�','���׷�','����')

--MAKER�� ��ǰ���� �ϳ��� MAKER�� ��ǰ�� ��ȸ(SubQuery�� �̿�)
-- GROUP BY�� �̿��� MAKER�� ��ǰ���� Ȯ��
--ũ��� 1...
SELECT * FROM PRODUCT WHERE MAKER IN(
SELECT MAKER FROM PRODUCT
GROUP BY MAKER
HAVING COUNT(*) = 1
)

--��ü ����� ���  ���� , ��ü ��� ��� ���� < ���� ��� ���޵�
--��ü ��� ��� ���޺��� JOB�� ��տ����� ���� JOB�� ��� ������ ��ȸ (JOB,NAME)


SELECT * FROM EMPLOYEE;
--��ü ����� ��� ���� 709 ��ȹ ����
SELECT ROUND(AVG(SALARY))
FROM EMPLOYEE 
--JOB�� ��տ��� �ѹ� 333, ��ȹ 967, ���� 780
SELECT JOB,ROUND(AVG(SALARY))
FROM EMPLOYEE 
GROUP BY JOBz
--��ü ��� ��� ���޺��� ���� �޴� JOB
SELECT NAME,JOB FROM EMPLOYEE 
WHERE JOB IN(
	SELECT JOB
	FROM EMPLOYEE 
	GROUP BY JOB
	HAVING AVG(SALARY) > (SELECT AVG(SALARY) FROM EMPLOYEE)
)



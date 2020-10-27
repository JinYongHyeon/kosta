	/* SQL ������ �ּ�   */ 

-- <-- SQL ���� �ּ�

/*
 * SQL (Structured Query Language) : �����͸� �����ϰ�, ����, �����ϴ� ���
 * 
 * DDL , DML , DCL
 * 1.DDL (Data Definition Language / ������ ���Ǿ�) : CREATE(����) , DROR(����) , ALTER(����) 
 * 2.DML (Data Manipulation Language / ������ ���۾�): INSERT(����), DELETE(����), UPDATE(����), SELECT(�˻�) 
 * CRUD ( CREATE , READ , UPDATE , DELETE) <-- INSERT , SELECT , UPDATE , DELETE
 * 3.DCL (Data Control Language / ������ �����) : COMMIT(���� DB�� �ݿ�), ROLLBACK(�۾�����ϰ� �ǵ�����), GRANT ���Ѻο�, REVOE �������
 * 
 * TABLE - �����͸� �����ϴ� ����
 * COLUMN - �Ӽ� (attribute) <-- java ���� ����
 * CONSTRAINT : �������� ex) PRIMARY KEY - �ߺ� ��� X , NOT NULL
 * DataType : ���ڿ� varchar2(100) , ������ number
 */

--MEMBER TABLE�� �����ϰ� ������ ������ �� ��ȸ�غ���.

--���� ����Ű ���� ���� �� ALT + X
CREATE TABLE MEMBER3(
	ID VARCHAR2(30) PRIMARY KEY ,
	PASSWORD VARCHAR2(30) NOT NULL,
	NAME VARCHAR2(30) NOT NULL,
	ADDRESS VARCHAR2(30)
)
DROP TABLE MEMBER; --���̺� ���� DDL

--DML : INSERT ���̺� MEMBER�� ������ �߰�
INSERT INTO MEMBER(id,password,name,address) VALUES('java','1234','������','�Ǳ�');
INSERT INTO MEMBER(id,password,name,address) VALUES('java2','1234','������','�Ǳ�2');
--�������� PRIMARY KEY�� �ߺ��� ���� ������� �����Ƿ� �Ʒ�SQL�� ERROR�� ����
INSERT INTO MEMBER(id,password,name,address) VALUES('java3','test','test','test');
--�� ȸ������ ��ȸ�غ��� COUNT(*)
SELECT COUNT(*) FROM MEMBER;


SELECT * FROM MEMBER




--DML : UPDATE������ ����
UPDATE member SET address='����' where id='YH';
--DML, SELECT, WHERE ���� �̿��� YH��� ���̵� ���� ȸ�� ������ ��ȸ
SELECT * FROM MEMBER WHERE ID='YH';

--DML : DELETE������ ����
DELETE FROM MEMBER WHERE address='�Ǳ�'

--MEMBER TABLE�� ������ ��ȸ�� ȸ��  NAME, ADDRESS�� ��ȸ
SELECT NAME,ADDRESS FROM MEMBER;
--SELECT �� WHERE �÷�='' AND �÷�='' NAME= ������ ADDRESS= �Ǳ��� ȸ���� ID�� ��ȸ�غ���.
SELECT ID FROM MEMBER WHERE NAME='������' AND ADDRESS='�Ǳ�'

--�������� �׽�Ʈ : PRIMARY KEY�� ������ �÷��� �����ؾ�(UNIQUE)�ϸ� NOT NULL�̾�� �ϹǷ� �ݵ�� �ߺ����� ���� ������ �����ؾ� �Ѵ�.
INSERT INTO MEMBER(PASSWORD,NAME,ADDRESS)VALUES('A','ȫ�浿','�Ǳ�')

--PASSWORD �÷��� NOT NULL ���������� �����Ƿ� �ݵ�� INSERT �ؾ� �ϹǷ� ERROR
INSERT INTO MEMEBER(id,name,address)VALUES('A','A123','ȫ�浿');
--ADDRESS�� ������ ���������� �����Ƿ� NULL�� ���ȴ�.
INSERT INTO MEMBER(id,password,name) VALUES('A','test','test');

/*
 * 1.ȸ������ �θ��� �Է�
 * ID PASSWORD NAME ADDRESS
 * spring aop ���� ����
 * mybatis di �缺�� ����
 */
INSERT INTO MEMBER(ID,PASSWORD,NAME,ADDRESS)VALUES('spring','aop','����','����')
INSERT INTO MEMBER(ID,PASSWORD,NAME,ADDRESS)VALUES('mybatis','di','�缺��','����')
 /* 
 * 2.INSERT ���� ���� �� ���忡 ��� ȸ���� �̸��� ���(SELECT)
 */
SELECT NAME FROM MEMBER WHERE ADDRESS='����'
/*
 * 3.ADDRESS�� ������ ȸ������ ADDRESS�� ���������� ����
 */*/
 UPDATE MEMBER SET ADDRESS='������' WHERE ADDRESS='����'
 --��ü ȸ�� ������ ��ȸ
 SELECT * FROM MEMBER
 
 COMMIT -- ���� �����ͺ��̽��� �ݿ� ( �۾� ������ ����)
 ROLLBACK -- COMMIT ������ ��� �۾��� ����ϰ� �ǵ����� ��ɾ� 
 
 -- �⺻ SQL ����
 INSERT INTO member(id,password,name,address)VALUES('ebs','abcd','���','����')
 INSERT INTO member(id,password,name,address)VALUES("ebs","abcd","���","����")
 
 --member ���̺��� name�� ����̰� address�� ������ ȸ���� id�� ��ȸ
 SELECT ID FROM member where name='���' and address='����'
 
 --member ���̺��� ȸ�� �ּ� �� ������ ȸ���� �ּҸ� �Ǳ��� ������Ʈ
 UPDATE member SET ADDRESS='�Ǳ�' WHERE ADDRESS='����';
 
 DELETE FROM MEMBER;
 

 

 
 

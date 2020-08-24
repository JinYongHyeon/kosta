/*
 * SubQuery : ��������  ,������ , �������� , ��������
 * SQL���� SQL
 */

DROP TABLE PRODUCT;

 create table product(
	id varchar2(100) primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number default 0
)
select * from product;
delete from product;
commit
drop sequence product_seq;
create sequence product_seq;

insert into product(id,name,maker,price) values(product_seq.nextval,'�ٳ�������','���׷�',1200);
insert into product(id,name,maker,price) values(product_seq.nextval,'������','ũ���',2000);
insert into product(id,name,maker,price) values(product_seq.nextval,'�ֽĽ�','�Ե�',1000);
insert into product(id,name,maker,price) values(product_seq.nextval,'Ŭ����','�Ե�',2200);
insert into product(id,name,maker,price) values(product_seq.nextval,'���̽�','����',1300);

--����� ��ǰ���� �� ���� ��� ��ǰ ������ ��ǰ��?
--1)��ǰ �ְ����� ��ȸ
SELECT MAX(price) FROM PRODUCT
--2)��ȸ�� ��ǰ �ְ����� �̿��� ��ǰ�� �˻�
SELECT NAME FROM PRODUCT WHERE PRICE =2200;
--���������� �̿��� 1,2 SQL�� �ѹ��� �����ϰ� ����
SELECT NAME FROM PRODUCT WHERE PRICE = (SELECT MAX(PRICE) FROM PRODUCT)
--������ ��ǰ�� name,maker,price�� ��ȸ(���� ������ �̿�)
SELECT NAME FROM PRODUCT WHERE PRICE = (SELECT MIN(PRICE) FROM PRODUCT)

--��հ� (AVG(�÷���))
--��ü ��ǰ�� ��հ��ݺ��� ���� ������ ��ǰ �� ���� ����  ������ name,maker,price�� ��ȸ
SELECT NAME,MAKER,PRICE FROM PRODUCT WHERE PRICE = (SELECT MIN(PRICE) FROM PRODUCT WHERE PRICE > (SELECT AVG(PRICE) FROM PRODUCT))


-------------------------------------------------
-- employee ��� ���̺� 
create table employee(
	empno number primary key,
	name varchar2(100) not null,
	job varchar2(100) not null,
	salary number not null
)
create sequence employee_seq;	
	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','����',700);	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','�ѹ�',300);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�ż�ȣ','����',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','�ѹ�',400);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','����',500);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','����',900);	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������2','�ѹ�',300);
commit	
	
select * from employee order by salary asc;	
	
-- ���� job �� ����� �� ���� ���� sal�� �޴� ���������?
SELECT * FROM EMPLOYEE WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE WHERE JOB='����')
--�ѹ��� �μ��� ����� �� ���� ���� ������ ���� ����� ������ ��ȸ
SELECT * FROM EMPLOYEE WHERE SALARY =(SELECT MIN(SALARY) FROM EMPLOYEE WHERE JOB = '�ѹ�')

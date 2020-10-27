/*
 * SubQuery : 서브쿼리  ,부쿼리 , 내부쿼리 , 하위쿼리
 * SQL내의 SQL
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

insert into product(id,name,maker,price) values(product_seq.nextval,'바나나우유','빙그레',1200);
insert into product(id,name,maker,price) values(product_seq.nextval,'마이쮸','크라운',2000);
insert into product(id,name,maker,price) values(product_seq.nextval,'핫식스','롯데',1000);
insert into product(id,name,maker,price) values(product_seq.nextval,'클라우드','롯데',2200);
insert into product(id,name,maker,price) values(product_seq.nextval,'참이슬','진로',1300);

--저장된 상품정보 중 가장 비싼 상품 가격의 상품명?
--1)상품 최고가격을 조회
SELECT MAX(price) FROM PRODUCT
--2)조회한 상품 최고가격을 이용해 상품명 검색
SELECT NAME FROM PRODUCT WHERE PRICE =2200;
--서브쿼리를 이용해 1,2 SQL을 한번에 정의하고 실행
SELECT NAME FROM PRODUCT WHERE PRICE = (SELECT MAX(PRICE) FROM PRODUCT)
--최저가 상품의 name,maker,price를 조회(서브 쿼리를 이용)
SELECT NAME FROM PRODUCT WHERE PRICE = (SELECT MIN(PRICE) FROM PRODUCT)

--평균가 (AVG(컬럼명))
--전체 상품의 평균가격보다 높은 가격의 상품 중 가장 낮은  가격의 name,maker,price를 조회
SELECT NAME,MAKER,PRICE FROM PRODUCT WHERE PRICE = (SELECT MIN(PRICE) FROM PRODUCT WHERE PRICE > (SELECT AVG(PRICE) FROM PRODUCT))


-------------------------------------------------
-- employee 사원 테이블 
create table employee(
	empno number primary key,
	name varchar2(100) not null,
	job varchar2(100) not null,
	salary number not null
)
create sequence employee_seq;	
	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'강상훈','개발',700);	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'아이유','총무',300);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'신성호','개발',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'장기하','총무',400);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'김수민','개발',500);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'정재우','개발',900);	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'아이유2','총무',300);
commit	
	
select * from employee order by salary asc;	
	
-- 개발 job 인 사원들 중 가장 높은 sal을 받는 사원정보는?
SELECT * FROM EMPLOYEE WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE WHERE JOB='개발')
--총무부 부서인 사원들 중 가장 낮은 월급을 받은 사원들 정보를 조회
SELECT * FROM EMPLOYEE WHERE SALARY =(SELECT MIN(SALARY) FROM EMPLOYEE WHERE JOB = '총무')

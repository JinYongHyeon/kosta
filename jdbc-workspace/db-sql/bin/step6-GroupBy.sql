/*
 * GROUP BY : 테이블에서 특정 컬럼을 기준으로 그룹화하여 검색할 때 사용, 그룹할수와 함께 사용
 * (그룹함수 - MAX, MIN, AVG, COUNT)
 * HAVING : GROUP BY와 함께 사용하는 조건절(그룹에 대한 조건을 지정)
 * 
 * 예)상품테이블에서 제조사별 상품수, 평균 가격, 부서별 사원수, 평균월급
 */

--제조사별 상품수를 조회
SELECT * FROM PRODUCT ORDER BY MAKER ASC

SELECT MAKER, COUNT(*) AS 상품수
FROM PRODUCT
GROUP BY MAKER
--HAVING COUNT(*)>1 GROUP BY 시에 조건을 부여할 때 HAVING 이요
ORDER BY 상품수 DESC

--제조사 MAKER 뱔 상품평균가를 조회하되 평균가 내림차순으로 정렬하여 조회

SELECT MAKER, AVG(PRICE) AS 평균가격, COUNT(*)
FROM PRODUCT
GROUP BY MAKER
ORDER BY 평균가격 DESC

--상품평균가 1500 을 초과하는 상품들만 조회하되, MAKER 별 상품수, 평균가를 조회한다

SELECT MAKER,COUNT(*) AS 상품수,AVG(PRICE) AS 평균가격
FROM PRODUCT 	
GROUP BY MAKER
HAVING AVG(PRICE) >1500
ORDER BY 평균가격 DESC
	
SELECT * FROM EMPLOYEE

--JOB 컬럼을 기준으로 그룹화 JOB, 사원수, 평균월급 내림차순
--JOB별 평균월급이 500을 초과하는 JOB을 조회하는 것으로 그룹 조회 조건을 추가
SELECT JOB , COUNT(*) AS 사원수 , ROUND(AVG(SALARY)) AS 평균월급 
FROM EMPLOYEE
GROUP BY JOB 
HAVING ROUND(AVG(SALARY)) > 500
ORDER BY 평균월급 DESC

INSERT INTO EMPLOYEE(EMPNO,NAME,JOB,SALARY) VALUES(employee_seq.nextval,'진용현','기획',1000)
INSERT INTO EMPLOYEE(EMPNO,NAME,JOB,SALARY) VALUES(employee_seq.nextval,'정세희','기획',1200)
INSERT INTO EMPLOYEE(EMPNO,NAME,JOB,SALARY) VALUES(employee_seq.nextval,'손오공','기획',700)

	
--JOB그룹별  최고 SALARY를 조회 , HIGHSALARY 내림차순 	 (JOB , HIGHSALARY)
		
			 
SELECT JOB,MAX(SALARY) AS HIGHSALARY
FROM EMPLOYEE 
GROUP BY JOB
ORDER BY HIGHSALARY

SELECT DISTINCT(JOB) FROM EMPLOYEE;
/* IN연산자 : 특정값이 포함되는 데이터를 조회하고자 할 떄 사용하는 연산자
 * SELECT 컬럼,컬럼 FROM 테이블명 WHERE 컬렴 IN('롯데','빙그레','진로') <-- 서브쿼리도 가능
 * 
 * NOT IN 연산자 : 특정값이 포함되지 않는 데이터를 조회하고자 할 떄 사용하는 연산자
 * SELECT 컬럼,컬럼 FROM 테이블명 WHERE 컬럼 NOT IN('롯데','빙그레','진로') <-- 서브쿼리도 가능
 */

--MAKER가 롯데 진로 빙그레인 상품의 정보를 조회한다
SELECT ID,NAME,MAKER,PRICE 
FROM PRODUCT 
WHERE MAKER = '롯데' OR MAKER = '빙그레' OR MAKER = '진로' 
--위 SQL을 IN으로 조회해본다
SELECT ID,NAME,MAKER,PRICE 
FROM PRODUCT
WHERE MAKER IN('롯데','빙그레','진로')
--MAKER가 롯데 진로 빙그레가 아닌 상품들을 조회 NOT <>
SELECT ID,NAME,MAKER,PRICE 
FROM PRODUCT 
WHERE MAKER <> '롯데' AND MAKER <> '빙그레' AND MAKER <> '진로' 
--위 SQL을 NOT IN으로 조회해본다
SELECT ID,NAME,MAKER,PRICE 
FROM PRODUCT
WHERE MAKER NOT IN('롯데','빙그레','진로')

--MAKER별 상품수가 하나인 MAKER의 상품을 조회(SubQuery를 이용)
-- GROUP BY를 이용해 MAKER별 상품수를 확인
--크라운 1...
SELECT * FROM PRODUCT WHERE MAKER IN(
SELECT MAKER FROM PRODUCT
GROUP BY MAKER
HAVING COUNT(*) = 1
)

--전체 사원의 평균  월급 , 전체 사원 평균 월급 < 직종 평균 월급들
--전체 사원 평균 월급보다 JOB별 평균월급이 많은 JOB의 사원 정보를 조회 (JOB,NAME)


SELECT * FROM EMPLOYEE;
--전체 사원의 평균 월급 709 기획 개발
SELECT ROUND(AVG(SALARY))
FROM EMPLOYEE 
--JOB별 평균월급 총무 333, 기획 967, 개발 780
SELECT JOB,ROUND(AVG(SALARY))
FROM EMPLOYEE 
GROUP BY JOBz
--전체 사원 평균 월급보다 많이 받는 JOB
SELECT NAME,JOB FROM EMPLOYEE 
WHERE JOB IN(
	SELECT JOB
	FROM EMPLOYEE 
	GROUP BY JOB
	HAVING AVG(SALARY) > (SELECT AVG(SALARY) FROM EMPLOYEE)
)



/*
 	SQL -> DCL 트랜잭션(Transaction) -> 작업단위 or 업무단위 : 트랙잭션이란 데이터베이스의 상태를 변화시키기 위해 수행하는 작업 단위를 말한다. 예) COMMIT, ROLLBACK?
 	 -COMMIT : 변경된 모든 내용을 실제 데이터베이스에 반영(실제 저장)
 	 -ROLLBACK : 변경된 모든 내용을 취소하고 이전 상태로 되돌림
 	 
  	ex) 계좌이체 업무 단위(계좌이체 Transaction)에서는
  	     1. 송금자의 계좌에서 출금 작업
  	     2. 송금자의 계좌에서 출금한 일시와 사용한 기기에 대한 정보에 대한 이력 저장
  	     3. 수금자의 계좌 유무 확인 작업
  	     4. 수금자의 송금액을 입금 작업
  	     5. 수금자의 이체 일시와 기타 정보에 대한 이력저장
  	     
  	      위 작업이 모두 정상적으로 수행 되었을 떄에만 실제 데이터베이스에 정보를 저장 -> COMMIT, 만약 하나의 작업이라도 문제가 발생 할 경우에는 현 작업단위의 모든 작업을 취소해야한다. -> ROLLBACK
  	      
  	      이를 위해서는 데이터베이스를 사용하는 프로그램 차원에서 COMMIT을 수동모드로 전환해야 한다.
  	   JDBC 에서는 기본 AUTOCOMMIT 모드이므로 수동모드로 전환 후  트랙잭션 처리를 해야 한다.
  	   
  	   
  	ex2)카드 발급시에 포인트를 지급하기 작업단위가 설정
  		1. 카드 발급
  		2. 포인트 지급
  		만약 포인트 지급시에 문제가 발생할 경우에는 작업취소(ROLLBACK)하고 1~2번 작업이 모두 정상적으로 수행되었을 떄 실제 디비에 반영하도록 구현해본다(COMMIT)
 */
	--ex2 테스트를 위한 테이블
	CREATE TABLE CARD(
		ID VARCHAR2(100) PRIMARY KEY,
		NAME VARCHAR2(100) NOT NULL
	)
	
	CREATE TABLE POINT(
		ID VARCHAR2(100) PRIMARY KEY,
		POINT_TYPE VARCHAR2(100) NOT NULL,
		POINT NUMBER NOT NULL
	)
	
	SELECT * FROM CARD
	SELECT * FROM POINT
	
	DELETE FROM CARD 
	DELETE FROM POINT
	
	

		
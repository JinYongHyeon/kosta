/*
		복합기본키 (복합 primary key)
	    두 개 이상의 컬럼을 이용하여 primary key를 만드는 것을 말함
*/

DROP TABLE mvc_shares;

CREATE TABLE mvc_shares(
	customer_id VARCHAR2(100),
	stock_id VARCHAR2(100),
	quantity NUMBER NOT NULL,
	CONSTRAINT pk_mvc_shares PRIMARY KEY(customer_id,stock_id)
);

--복합 pk 테스트
INSERT INTO mvc_shares VALUES('java','삼성',10);
INSERT INTO mvc_shares VALUES('angel','삼성',20);
INSERT INTO mvc_shares VALUES('angel','LG',30);
--복합 pk란 컬럼의 조합 정보가 유일해야 한다. ERROR
INSERT INTO mvc_shares VALUES('angel','삼성',1);
--ERROR
INSERT INTO mvc_shares VALUES('java','삼성',20);
--OK
INSERT INTO mvc_shares VALUES('java','LG',20);
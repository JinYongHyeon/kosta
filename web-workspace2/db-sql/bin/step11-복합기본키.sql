/*
		���ձ⺻Ű (���� primary key)
	    �� �� �̻��� �÷��� �̿��Ͽ� primary key�� ����� ���� ����
*/

DROP TABLE mvc_shares;

CREATE TABLE mvc_shares(
	customer_id VARCHAR2(100),
	stock_id VARCHAR2(100),
	quantity NUMBER NOT NULL,
	CONSTRAINT pk_mvc_shares PRIMARY KEY(customer_id,stock_id)
);

--���� pk �׽�Ʈ
INSERT INTO mvc_shares VALUES('java','�Ｚ',10);
INSERT INTO mvc_shares VALUES('angel','�Ｚ',20);
INSERT INTO mvc_shares VALUES('angel','LG',30);
--���� pk�� �÷��� ���� ������ �����ؾ� �Ѵ�. ERROR
INSERT INTO mvc_shares VALUES('angel','�Ｚ',1);
--ERROR
INSERT INTO mvc_shares VALUES('java','�Ｚ',20);
--OK
INSERT INTO mvc_shares VALUES('java','LG',20);
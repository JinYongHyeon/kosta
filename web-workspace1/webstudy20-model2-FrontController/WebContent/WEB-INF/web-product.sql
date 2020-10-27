DROP TABLE web_product;

CREATE TABLE web_product(
	id number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null
)
CREATE SEQUENCE web_product_seq nocache;

INSERT INTO web_product VALUES(web_product_seq.nextval,'카스','두산',1500);
INSERT INTO web_product VALUES(web_product_seq.nextval,'테라','진로',1700);
INSERT INTO web_product VALUES(web_product_seq.nextval,'참이슬','진로',1300);

commit

SELECT * FROM web_product;

-- MAKER 종류만 조회

SELECT DISTINCT(MAKER) FROM WEB_PRODUCT

SELECT MAKER, SUM(PRICE) FROM WEB_PRODUCT
GROUP BY MAKER 










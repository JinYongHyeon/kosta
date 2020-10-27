SELECT * FROM MVC_CAR;

CREATE TABLE mvc_car(
	car_no NUMBER PRIMARY KEY,
	model VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL
);

CREATE SEQUENCE mvc_car_seq;

INSERT INTO mvc_car(car_no,model,price) VALUES(mvc_car_seq.NEXTVAL,'k5',2000);
INSERT INTO mvc_car(car_no,model,price) VALUES(mvc_car_seq.NEXTVAL,'k7',2500);
INSERT INTO mvc_car(car_no,model,price) VALUES(mvc_car_seq.NEXTVAL,'k9',3000);

DROP TABLE MVC_CAR;
DROP SEQUENCE MVC_CAR_SEQ;



/*
 	SQL -> DCL Ʈ�����(Transaction) -> �۾����� or �������� : Ʈ������̶� �����ͺ��̽��� ���¸� ��ȭ��Ű�� ���� �����ϴ� �۾� ������ ���Ѵ�. ��) COMMIT, ROLLBACK?
 	 -COMMIT : ����� ��� ������ ���� �����ͺ��̽��� �ݿ�(���� ����)
 	 -ROLLBACK : ����� ��� ������ ����ϰ� ���� ���·� �ǵ���
 	 
  	ex) ������ü ���� ����(������ü Transaction)������
  	     1. �۱����� ���¿��� ��� �۾�
  	     2. �۱����� ���¿��� ����� �Ͻÿ� ����� ��⿡ ���� ������ ���� �̷� ����
  	     3. �������� ���� ���� Ȯ�� �۾�
  	     4. �������� �۱ݾ��� �Ա� �۾�
  	     5. �������� ��ü �Ͻÿ� ��Ÿ ������ ���� �̷�����
  	     
  	      �� �۾��� ��� ���������� ���� �Ǿ��� ������ ���� �����ͺ��̽��� ������ ���� -> COMMIT, ���� �ϳ��� �۾��̶� ������ �߻� �� ��쿡�� �� �۾������� ��� �۾��� ����ؾ��Ѵ�. -> ROLLBACK
  	      
  	      �̸� ���ؼ��� �����ͺ��̽��� ����ϴ� ���α׷� �������� COMMIT�� �������� ��ȯ�ؾ� �Ѵ�.
  	   JDBC ������ �⺻ AUTOCOMMIT ����̹Ƿ� �������� ��ȯ ��  Ʈ����� ó���� �ؾ� �Ѵ�.
  	   
  	   
  	ex2)ī�� �߱޽ÿ� ����Ʈ�� �����ϱ� �۾������� ����
  		1. ī�� �߱�
  		2. ����Ʈ ����
  		���� ����Ʈ ���޽ÿ� ������ �߻��� ��쿡�� �۾����(ROLLBACK)�ϰ� 1~2�� �۾��� ��� ���������� ����Ǿ��� �� ���� ��� �ݿ��ϵ��� �����غ���(COMMIT)
 */
	--ex2 �׽�Ʈ�� ���� ���̺�
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
	
	

		
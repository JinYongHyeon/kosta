drop table player;
create table player(
 no number primary key,
 title varchar2(100) not null,
 singer varchar2(30) not null,
 price number not null
)

select * from player;

create sequence mp3_seq;

insert into player(no,title,singer,price) values(mp3_seq.nextval,'������ħ','������',700);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'����','������',500);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'����','�����',400);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'DNA','��ź�ҳ��',800);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'������','������',900);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'���ó�','����',1000);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'Power','EXO',300);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'Ko Ko Bop','EXO',600);
commit
select count(*) from player;

/*
	Oracle row_number() over() : ��ȸ�� ROW(��)�� ���� �������� ��ȣ�� �����ϴ� ����Ŭ �Լ�
	
	Inline View : SQL ���忡�� From ���� ���Ǵ� Subquery FROM ���� ���������� SELECT �Ǵ� ��ȸ����� ���̺�ó�� ���
	
	EX) SELECT 
	    FROM(
	    	��������
	    )��Ī
	    
*/

--�������� ����
SELECT * FROM player ORDER BY NO DESC

--ROW_NUMBER() OVER(����)
SELECT ROW_NUMBER() OVER(ORDER BY no DESC) AS rnum,title,no FROM player;

DELETE FROM player where title='Power'

--ROW_NUMBER()�� ��ȸ�� ����࿡ ���ؼ� ���ȣ�� �ű��.
--�Ʒ��� WHERE ������������ ����� �� ����.
SELECT ROW_NUMBER() OVER(ORDER BY no DESC) AS rnum,no,title FROM player
WHERE rnum<3;

--SubQuery�� InlineView�� �̿��ϸ� �ȴ�.
SELECT rnum,no,title
FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY no DESC) AS rnum,no,title FROM player
)WHERE rnum<=3;
--rnum�� 4�̻� 6������ ����� ��ȸ
SELECT rnum,no,title
FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY no DESC) AS rnum,no,title FROM player
)WHERE rnum BETWEEN 4 AND 6;

--Board Paging SQL
-- �Խù� rnum�� 1 �̻� 5 ������ �Խù� ������ ��ȸ

/*
	
	SELECT
	FROM(
		
	)B, MEMBER M
	WHERE �������� AND rnum BETWEEN 1 AND 5
    
*/
--step1 : �Խù��� �������� �����ϰ� row number�� �����Ѵ�.
SELECT row_number() OVER(ORDER BY NO DESC) as rnum,no,title,hits,
TO_CHAR(time_posted,'YYYY.MM.DD') as time_posted,id
FROM board;
--step2 : step1�� �ζ��κ�� �̿��ϰ� member�� join �Ѵ�.
SELECT b.no,b.title,b.hits,b.time_posted,m.id,m.name FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY NO DESC) AS rnum,no,title,hits,
	TO_CHAR(time_posted,'YYYY.MM.DD') AS time_posted,id FROM board
)b,board_member m
WHERE m.id =b.id AND rnum BETWEEN  5 AND 10

SELECT rnum,b.no,b.title,b.content 
FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY NO DESC) AS rnum,no,title,content,id FROM board 
)b,board_member m WHERE b.id=m.id AND rnum BETWEEN 5 AND 10


drop sequence board_seq;
create sequence board_seq;

drop table board;
drop table board_member;


create table board_member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null
)

delete from board;
delete from board_member;

insert into board_member(id,password,name) values('java','1234','������');
insert into board_member(id,password,name) values('spring','1234','����');

create table board(
	no number primary key,
	title varchar2(50) not null,
    content clob not null,
	hits number default 0,
	time_posted date not null,
	id varchar2(100) not null,
	constraint board_fk foreign key(id) references board_member(id)
)

select board_seq.nextval from dual;

insert into board(no,title,content,time_posted,id) 
values(board_seq.nextval,'�氡','����',sysdate,'java');
insert into board(no,title,content,time_posted,id) 
values(board_seq.nextval,'�ȳ�','ġ��',sysdate,'spring');
insert into board(no,title,content,time_posted,id) 
values(board_seq.nextval,'����','�߼� ���� �ߺ�������^^',sysdate,'java');

select * from board;

commit

SELECT b.no,b.title,b.hits,
to_char(time_posted,'YYYY.MM.DD') as time_posted,m.id,m.name 
FROM board b , board_member m
WHERE b.id=m.id
order by no desc


delete from board;
commit

SELECT b.no,b.title,to_char(time_posted,'YYYY.MM.DD') as time_posted,
b.hits,m.id,m.name
FROM board b , board_member m 
WHERE b.id=m.id 	
order by no desc


select * from board;

delete from board;
commit
insert into board(no,title,content,time_posted,id) 
values(board_seq.nextval,'�氡','����',sysdate,'java');
insert into board(no,title,content,time_posted,id) 
values(board_seq.nextval,'�ȳ�','ġ��',sysdate,'spring');
insert into board(no,title,content,time_posted,id) 
values(board_seq.nextval,'����','�߼� ���� �ߺ�������^^',sysdate,'java');

select count(*) from board;

-- ��������  �����͸� insert ���� - ���� �� 3��  insert �� 4���� �������� 
insert into board(no,title,content,time_posted,id) 
select board_seq.nextval,title,content,sysdate,id  from board
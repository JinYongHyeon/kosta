<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<form action="FrontController" method="post">
	<input type="hidden" name="command" value="NoticeInsert">
	<input type="text" name="noticeTitle" required="required" placeholder="제목을 입력해주세요">
	<input type="text" name="noticeContent" required="required" placeholder="내용을 입력해주세요">
	<input type="submit" value="등록"> 
</form>
</body>
</html>
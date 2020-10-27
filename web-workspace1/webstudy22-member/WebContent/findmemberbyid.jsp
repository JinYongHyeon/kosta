<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<div class="container">
		<a href="index.jsp">HOME</a>
		<hr>
		<h3>Model2 회원관리</h3>
		<a href="findmemberbyid.jsp">회원검색</a>
		<hr>
		<form action="front" method="get">
			<input type="hidden" name="command" value="findMemberById">
			<span><input type="text" name="userId" required="required" placeholder="아이디를 입력해주세요"></span>
			<input type="submit" value="검색">
		</form>
	</div>
	<%--
		FindMemberByIdController MemberDAO().findMemberById(String id):MemberVO
				  |
				  | --(forward)
		findmemberbyid-ok.jsp
		(아이디,이름,주소 제공)
		        or
        findmemberbyid-fail.jsp
  javascript alert : ~~ 아이디를 가진 회원이 없습니다.
      location.href=index.jsp  
	 --%>
</body>
</html>
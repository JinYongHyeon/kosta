<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<style>
#loginForm {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	padding: 50px;
	border: 1px solid #000;
	box-shadow: 3px 3px #000;
}

#loginForm h1 {
	text-align: center;
}

#loginForm input {
	width: 100%;
	height: 50px;
	float: left;
	margin-bottom: 10px;
	padding: 0;
	border: 1px solid #000;
	margin-right: 0;
	margin-left: 0;
	text-align: center;
}

#loginForm input[type=submit] {
	background-color: #03c75a;
	color: #fff;
	border: none;
}

</style>
</head>
<body>
	<% HttpSession session2 = request.getSession(false);
		if(session2 != null){%>
			<h1>session은 있음</h1>
			<% if(session2.getAttribute("a") != null){  %>
				<h1>아이디 있네</h1>
			<%}else { %>
				<h1>아이디 없네...</h1>
				<% session2.setAttribute("a", "bb"); %>
			<%} %>			
		<%}%>
	<form action="FrontController" method="post" id="loginForm">
	<input type="hidden" name="command" value="LoginCheck">
		<h1>Login</h1>
		<input type="text" name="userId" required="required"
			placeholder="아이디를 입력해주세요"> <input type="password"
			name="userPass" required="required" placeholder="비밀번호를 입력해주세요">
		<input type="submit" value="로그인">
	</form>
</body>
</html>
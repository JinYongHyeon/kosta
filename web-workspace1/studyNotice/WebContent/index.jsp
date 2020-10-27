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
	<form action="LoginCheck" method="post" id="loginForm">
		<h1>Login</h1>
		<input type="text" name="userId" required="required"
			placeholder="아이디를 입력해주세요"> <input type="password"
			name="userPass" required="required" placeholder="비밀번호를 입력해주세요">
		<input type="submit" value="로그인">
	</form>
</body>
</html>
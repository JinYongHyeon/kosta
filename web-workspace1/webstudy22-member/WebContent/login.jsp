<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
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
<%--
	login.jsp --command=login --> LoginController <---> MemberDAO().login(MemberVO) : MemberVO
	               					    |
	              login-fail.jsp(로그인 실패! alert 후 index.jsp로 이동)
	               						|
	               				   login-ok.jsp
	               				   (홍길동님 로그인하셨습니다)
		   만약 상단부에 Home 링크를 클릭하면 index.jsp에서는 로그인 폼으로 링크를 보여주지 않고  판교에 사는 홍길동님 로그인 상태
		   아래에서 로그아웃 링크를 보여준다.
		   로그아웃 링크를 누르면 LogoutController가 동작되고 로그아웃처리 후 index.jsp로 redirect한다. 로그아웃 처리된 index.jsp는
		   다시 로그인폼으로 라는 링크가 제공된다.
	               					  
 --%>
	<form action="front" method="post" id="loginForm">
	<input type="hidden" name="command" value="login">
		<h1>Login</h1>
		<input type="text" name="userId" required="required"
			placeholder="아이디를 입력해주세요"> <input type="password"
			name="userPass" required="required" placeholder="비밀번호를 입력해주세요">
		<input type="submit" value="로그인">
	</form>
</body>
</html>
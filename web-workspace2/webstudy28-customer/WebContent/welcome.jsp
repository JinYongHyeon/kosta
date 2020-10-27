<%@page import="org.kosta.model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resource/css/signin.css">
<style>
table tr {
	height: 75px;
}

table tr td {
	text-align: center;
}

.form-signin {
	padding: 50px;
	border: 1px solid #000;
	box-shadow: 4px 2px 6px #000;
}
</style>
<title>메인페이지</title>
</head>
<body>
	<%
		int count = (Integer) request.getAttribute("count");
	%>
	<div class="form-signin">
		<table style="width: 100%">
			<tr>
				<td colspan="2">
					<h1>WelCome</h1>
				</td>
			<tr>
				<td>고객 수</td>
				<td><%=count%></td>
			</tr>

			<%
				HttpSession session = request.getSession(false);
				if (session != null && session.getAttribute("user") != null) {
					MemberDTO vo = (MemberDTO) session.getAttribute("user");
			%>

			<tr>
				<td colspan="2"><%=vo.getName()%>님 안녕하세요</td>
			</tr>
			<tr>
				<td><a href="info-result.jsp" class="btn btn-lg btn-primary btn-block">마이페이지</a></td>
				<td><a href="front?command=logout" class="btn btn-lg btn-primary btn-block">로그아웃</a></td>
			</tr>
			<%
				} else {
			%>
			<tr>
				<td><a href="join-form.jsp"
					class="btn btn-lg btn-primary btn-block">회원가입</a></td>
				<td><a href="login-form.jsp"
					class="btn btn-lg btn-primary btn-block">로그인</a></td>
			</tr>
			<%
				}
			%>



		</table>
	</div>
</body>
</html>
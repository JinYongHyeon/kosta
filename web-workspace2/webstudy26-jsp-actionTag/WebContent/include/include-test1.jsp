<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	list-style:none;
	margin: 0 auto;
}
</style>
<title>include-test1.jsp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div style="width: 400px; height: 600px;">
		<ul style="border:1px solid #000">
			<li><h2>메인화면</h2></li>
			<li><p>Lorem ipsum dolor sit amet, consectetur adipisicing
					elit, sed do eiusmod tempor incididunt ut labore et dolore magna
					aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
					laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
					dolor in reprehenderit in voluptate velit esse cillum dolore eu
					fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
					proident, sunt in culpa qui officia deserunt mollit anim id est
					laborum.</p></li>
		</ul>
	</div>
	<a href="include-test2.jsp">화면2로 이동</a>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
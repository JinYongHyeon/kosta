<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/mycss.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function memberLogout() {
		var flag = false;
		if (confirm("로그아웃을 하시겠습니까?")) {
			flag = true;
		}
		return flag;
	}
</script>
</head>
<body>
	<header>
		<nav class="navbar navbar-inverse" style="background-color: #fff;">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">WebSiteName</a>
				</div>

				<c:choose>
					<c:when test="${sessionScope.member != null}">
						<ul class="nav navbar-nav">
							<li class="active"><a href="${pageContext.request.contextPath}/front?command=getAllPostList">Home</a></li>
							<li><a href="#">Page 1</a></li>
							<li><a href="#">Page 2</a></li>
							<li><a href="#">Page 3</a></li>
						</ul>
					${member.name}님 안녕하세요
					<form action="${pageContext.request.contextPath}/front"
							method="post" onsubmit="return memberLogout()">
							<input type="hidden" name="command" value="logout"> <input
								type="submit" value="로그아웃">
						</form>
						<a href="${pageContext.request.contextPath}/front?command=writePostFrom">글쓰기</a>
					</c:when>
					<c:otherwise>
						<form action="${pageContext.request.contextPath}/front"
							method="post" id="loginForm">
							<input type="hidden" name="command" value="login"> <span>아이디</span><input
								type="text" name="id" required="required"> <span>패스워드</span><input
								type="password" name="pass" required="required"> <input
								type="submit" value="로그인">
						</form>
					</c:otherwise>
				</c:choose>
			</div>
		</nav>
	</header>

	<c:import url="${requestScope.url}"></c:import>
</body>
</html>
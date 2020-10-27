<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/myhome.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row header">
			<div class="col-sm-12">
				<%--<c:import url="/template/header.jsp"></c:import>%--%>
				<nav class="navbar navbar-inverse">
					<div class="container-fluid">
						<div class="navbar-header">
							<a class="navbar-brand" href="#">WebSiteName</a>
						</div>
						<ul class="nav navbar-nav">
							<li class="active"><a
								href="${pageContext.request.contextPath}/front?command=home">Home</a></li>
							<li><a href="${pageContext.request.contextPath}/front?command=cartList">장바구니</a></li>
							<li><a href="#">Link</a></li>
						</ul>
						<button class="btn btn-danger navbar-btn">Button</button>
					</div>
				</nav>
			</div>
		</div>
		<div class="row main">
			<div class="col-sm-8">
				<%--
					메인 화면에 대한 view 정보(url or jsp파일명)을 컨트롤러에서 동적으로 할당받는다.
				 --%>
				<c:import url="/${url}"></c:import>
			</div>
			<div class="col-sm-4">
				<c:choose>
					<c:when test="${sessionScope.userDTO == null }">
						<%--
							로그인하면 아래 로그인폼은 보여주지 않고 누구님 로그인과 아래에 로그아웃을 보여준다.
							로그인 상태가 아니면 로그인폼을 보여준다.
							JSTL의 choose when otherwise를 이용해 구현해본다.
						 --%>
						<form action="${pageContext.request.contextPath}/front"
							method="post">
							<input type="hidden" name="command" value="login">
							<table>
								<tr>
									<td>아이디</td>
									<td><input type="text" name="id" required="required"
										placeholder="아이디를 입력하세요"></td>
								</tr>

								<tr>
									<td>패스워드</td>
									<td><input type="password" name="password"
										required="required" placeholder="비밀번호를 입력하세요"></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" value="로그인"></td>
								</tr>
							</table>
						</form>
					</c:when>
					<c:otherwise>
						<%--<c:import url="/template/right.jsp"></c:import>--%>
						<h1>${sessionScope.userDTO.name}님</h1>
						<a href="${pageContext.request.contextPath}/front?command=logout">로그아웃</a>
						<br>
						<a href="${pageContext.request.contextPath}/front?command=RegisterItemForm">상품등록</a>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12">
				<%--<c:import url="/template/footer.jsp"></c:import>--%>
				<footer>
					© 2020 Copyright: <a href="https://mdbootstrap.com/">
						MDBootstrap.com</a>
				</footer>
			</div>
		</div>
	</div>
</body>
</html>
<!-- 
	JSTL : 주소 값 기준은 WEB 컨테이너에서 작동하기 때문에 /을 하면 -> 127.0.0.1:8888/ProjectName 이 된다.
	
	HTML CSS JAVASCRIPT 같은경우 /을하면 절대적이여서 pageContext.request.contextPath을 이용하여 /ProjectName을 해야 한다.
	
	상대경로 : 현 폴더에서 찾음
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>로그인Home</title>
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
							<li><a href="#">Link</a></li>
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
				<%--<c:import url="/template/right.jsp"></c:import>--%>
				<ul>
					<li><a
						href="${pageContext.request.contextPath}/front?command=findMemberByIdForm">회원검색</a>
						<%-- forward case --%>
				</ul>
				<h1>${sessionScope.userVO.name}님로그인 상태</h1>
				<a href="${pageContext.request.contextPath}/front?command=logout">로그아웃</a><br>
				<a href="${pageContext.request.contextPath}/front?command=updateForm">회원정보수정</a>
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

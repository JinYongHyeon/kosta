<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
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
				<c:import url="/template/header.jsp"></c:import>
			</div>
		</div>
		<div class="row main">
			<div class="col-sm-8">
				<table class="table">
					<thead>
						<tr>
							<th colspan="4" style="text-align: center;">회원정보</th>
						</tr>
						<tr>
							<th>아이디</th>
							<th>비밀번호</th>
							<th>이름</th>
							<th>주소</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="vo1" value="${requestScope.vo}"></c:set>
						<tr>
							<td>${vo1.id}</td>
							<td>${vo1.password}</td>
							<td>${vo1.name}</td>
							<td>${vo1.address}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-sm-4">
				<c:import url="/template/right.jsp"></c:import>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12">
				<c:import url="/template/footer.jsp"></c:import>
			</div>
		</div>
	</div>

</body>
</html>
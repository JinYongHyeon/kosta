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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<a href="${pageContext.request.contextPath}/index.jsp">Home</a>
				<table class="table">
					<thead>
						<tr>
							<th>사원번호</th>
							<th>사원명</th>
							<th>월급</th>
							<th>부서번호</th>
							<th>부서명</th>
							<th>지역</th>
							<th>TEL</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.empList}" var="emp">
							<tr>
								<td>${emp.empNo}</td>
								<td>${emp.eName}</td>
								<td>${emp.sal}</td>
								<td>${emp.departmentDTO.deptno}</td>
								<td>${emp.departmentDTO.dname}</td>
								<td>${emp.departmentDTO.loc}</td>
								<td>${emp.departmentDTO.tel}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
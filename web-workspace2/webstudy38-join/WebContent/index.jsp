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
<%--
			EmployeeController가 실행되어
			employee-list.jsp에서 사원(부서) 리스트가 제공된다.
 --%>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-3">
				<h3>사원과 부서테이블을 조인하는 예제</h3>
				<a href="${pageContext.request.contextPath}/front?command=EmployeeList">사원리스트(부서정보포함)</a>
			</div>
		</div>
	</div>
</body>
</html>
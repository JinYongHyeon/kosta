<%@page import="org.kosta.model.CarDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차 정보</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
<h1>\f0de</h1>
	<div class="container-fluid">
	<div class="col-sm-6 col-sm-offset-3">
		<table class="table table-bordered table-hover table-striped">
			<thead>
				<tr class="success">
					<th scope="col">차번호</th>
					<th scope="col">모델명</th>
					<th scope="col">가격</th>
				</tr>
			</thead>
			<tbody>
				<%
					CarDTO car = (CarDTO) request.getAttribute("car");
				%>
				<tr>
					<td><%=car.getCarNO()%></td>
					<td><%=car.getModel()%></td>
					<td><%=car.getPrice()%></td>
				</tr>
			</tbody>
		</table>
		</div>
	
	</div>

</body>
</html>
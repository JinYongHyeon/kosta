<%@page import="org.kosta.model.CarDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>자동차 전체리스트</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-6 offset-3">
				<table class="table table-bordered table-hover table-striped">
					<thead>
						<tr>
							<th>차 번호</th>
							<th>모델</th>
						</tr>
					</thead>
					<tbody>
						<%
							ArrayList<CarDTO> list = (ArrayList<CarDTO>) request.getAttribute("list");
						for (int i = 0; i < list.size(); i++) {
						%>
						<tr>
							<td><%=list.get(i).getCarNO()%></td>
							<td><%=list.get(i).getModel()%></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
<%@page import="model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품검색 완료</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<% ProductVO vo =(ProductVO) request.getAttribute("vo"); %>
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>회사</th>
				<th>가격</th>
			</tr>
		</thead>
		<tbody>
			<tr>
			<td><%=vo.getId()%></td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getMaker() %></td>
			<td><%=vo.getPrice() %>	</td>
			</tr>
		</tbody>
	</table>
	
	
	
	
</body>
</html>
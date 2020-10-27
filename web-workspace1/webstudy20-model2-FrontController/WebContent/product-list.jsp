<%@page import="org.kosta.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 상품정보</title>
</head>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<body>
	<%
		ArrayList<ProductVO> list = (ArrayList<ProductVO>) request.getAttribute("list");
	%>
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
			</tr>
		</thead>
		<tbody>
			<%-- for loop --%>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
			<tr>
				<td><%=list.get(i).getId()%></td>
				<td><%=list.get(i).getName()%></td>
			</tr>
			<%
				}
			%>
		
		</tbody>
	</table>

</body>
</html>
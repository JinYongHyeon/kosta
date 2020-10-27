<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-checkbox-action.jsp</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>순번</th>
				<th>메뉴명</th>
			</tr>
		</thead>
		<tbody>
			<%
				String menu[] = request.getParameterValues("menu");
			for (int i = 0; i < menu.length; i++) {
			%>
			<tr>
				<td><%=i %></td>
				<td><%=menu[i] %>
			</tr>
			<%
				}
			%>


		</tbody>
	</table>
</body>
</html>
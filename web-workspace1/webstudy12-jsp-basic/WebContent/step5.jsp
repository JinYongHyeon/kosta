<%@page import="model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp test</title>
<style>
table {
	border-collapse: collapse;
	position:absolute;
	top:50%;
	left:50%;
	transform:translate(-50%,-50%);
}
table tr th{background-color:#baffe7;}

table tr th, td {
	padding:15px;
	border: 1px solid #000;
}

</style>
</head>
<body>
<% Person person = new Person("홍길동",235); %>
<table>
	<tr>
		<th>이름</th>
		<td><%=person.getName() %></td>
		
	</tr>
	<tr>
	<th>나이</th>
	<td><%=person.getAge() %></td>
	</tr>
</table>
</body>
</html>
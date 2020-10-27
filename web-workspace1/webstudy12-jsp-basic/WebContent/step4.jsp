<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp ArrayList test</title>
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

table tr:nth-child(odd) td{
background-color:#d1d1d1;
}
</style>
</head>
<body>
	<%
		ArrayList<String> list = new ArrayList<String>();
	list.add("애쉬");
	list.add("다리우스");
	list.add("티모");
	list.add("볼리베어");
	%>
	<table>
		<tr>
			<th>순번</th>
			<th>챔피언</th>
		</tr>
		<%-- tr부분을 전체적으로 for loop 화면에 표현 --%>
		<%
			for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=list.get(i)%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
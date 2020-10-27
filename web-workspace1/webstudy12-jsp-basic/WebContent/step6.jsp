<%@page import="java.util.ArrayList"%>
<%@page import="model.Person"%>
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
	box-shadow:7px 7px #000;
}
table tr th{background-color:#baffe7;}

table tr th, td {
	padding:15px;
	border: 1px solid #000;
	text-align: center;
}
table tr:nth-child(odd) td{
background-color:#d1d1d1;
 animation-duration: 1s;
  animation-name: slide;
  animation-iteration-count: infinite;
  animation-direction: alternate;
}



@keyframes slide{

 from{
 	background-color:#fff;
 }
 to{
 	background-color:#d1d1d1;
 }
}
</style>
</head>
<body>
	<%
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("볼리베어",23));
		list.add(new Person("나르",25));
		list.add(new Person("제이스",27));
		list.add(new Person("신짜오",31));
		list.add(new Person("진",44));
	%>
	<table>
	<!-- 제목 부분  thead -->
		<thead>
		<tr><th>순번</th><th>챔피언</th><th>나이</th></tr>
		</thead>
		<!-- 내용 부분 tbody -->
		<tbody>
		<!-- for loop tr td -->
		<%for(int i=0;i<list.size();i++){ %>
			<tr>
				<td><%=i %></td>
				<td><%=list.get(i).getName() %></td>
				<td><%=list.get(i).getAge() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>
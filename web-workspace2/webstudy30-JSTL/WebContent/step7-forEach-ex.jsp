<%@page import="org.kosta.model.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>JSTL forEach 연습</title>
</head>
<body>
	<%
		ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	list.add(new PersonVO("토르", 25));
	list.add(new PersonVO("스파이더맨", 18));
	list.add(new PersonVO("헐크", 27));
	request.setAttribute("memberList", list);
	%>
	<table class="table table-hover table-dark">
		<thead>
			<tr>
				<th scope="col">종류</th>
				<th scope="col">이름</th>
				<th scope="col">나이</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.memberList}" var="member">
				<tr>
					<c:choose>
						<c:when test="${member.age>=19 }">
							<td>성인</td>
						</c:when>
						<c:otherwise>
							<td>미성년</td>
						</c:otherwise>
					</c:choose>
					<td>${member.name}</td>
					<td>${member.age}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>
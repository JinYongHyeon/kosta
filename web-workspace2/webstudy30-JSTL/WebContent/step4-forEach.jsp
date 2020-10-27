<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>

	<%
		String friends[] = { "진용현", "손흥민", "알리스타" };
	request.setAttribute("fa", friends);
	%>
	<%-- jstl forEach : JSTL for loop 
		 item : 대상 배열 또는 컬렉션 
		 var : 요소를 저장할 변수
		 varStatus : index와 count 속성이 있다.
	 --%>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>index</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.fa}" var="fname" varStatus="order">
				<tr>
					<td>${order.count }</td>
					<td>${fname}</td>
					<td>${order.index}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
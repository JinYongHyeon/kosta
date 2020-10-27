<%@page import="org.kosta.model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세정보</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<%
		if (request.getAttribute("vo") == null) {
	%>
	<script type="text/javascript">
		alert("돌아가");
		location.href = "index.jsp";
	</script>
	<%
		} else {
	ProductVO vo = (ProductVO) request.getAttribute("vo");
	%>
	<table style="margin-top:30px;">

		<tr>
			<th>상품번호</th>
			<td><%=vo.getId()%></td>
		</tr>

		<tr>
			<th>상품명</th>
			<td><%=vo.getName()%></td>
		</tr>

		<tr>
			<th>제조사</th>
			<td><%=vo.getMaker()%></td>
		</tr>

		<tr>
			<th>가격</th>
			<td><%=vo.getPrice()%></td>
		</tr>

		<tr>
			<th>등록일지</th>
			<td><%=vo.getRegDate()%></td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>
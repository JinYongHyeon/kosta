<%@page import="model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품전체</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>

	<%
		@SuppressWarnings("unchecked")
	ArrayList<ProductVO> list = (ArrayList<ProductVO>) request.getAttribute("list");
	%>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
			<%-- 아래에 있는 상품명을 클릭하면 상품상세정보가 조회된다. --%>
			<tr>
				<td><%=list.get(i).getId()%></td>
				<td><a href="FindProductByIdServlet?productId=<%=list.get(i).getId()%>"><%=list.get(i).getName()%></a></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>
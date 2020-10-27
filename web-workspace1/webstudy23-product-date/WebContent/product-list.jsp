<%@page import="org.kosta.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 리스트</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<div class="container">
		<a href="index.jsp">HOME</a> <a href="register-form.jsp">상품등록</a> <a
			href="front?command=list">상품 리스트</a>
		<table style="margin-top: 30px;`">
		<%--
				tr for loop 
		 --%>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>등록날짜</th>
				</tr>
			</thead>
			<tbody>
				<%
					ArrayList<ProductVO> list = (ArrayList<ProductVO>) request.getAttribute("list");
				if (list.isEmpty()) {
				%>
				<tr>
					<td colspan="3">상품이 존재하지 않습니다.</td>
				</tr>
				<%
					} else {
				for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td><%=list.get(i).getId()%></td>
					<%--
												   상품 상세 정보 링크를 제공
						command=detailproduct --> ProductDetailController <--> ProductDAO().findProductById(id)
								 |
								 | --(redirect)
						 detail-product.jsp
								 
					 --%>
					<td><a href="front?command=detailproduct&id=<%=list.get(i).getId()%>"><%=list.get(i).getName()%></a></td>
					<td><%=list.get(i).getRegDate()%></td>
				</tr>
				<%
					}
				}
				%>

			</tbody>
		</table>
	</div>
</body>
</html>
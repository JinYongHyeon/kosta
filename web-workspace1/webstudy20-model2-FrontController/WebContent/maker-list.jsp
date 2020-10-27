<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제조사 리스트</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<%--db web_product table에 저자어된 maker 종류를 아래의 radio button으로 제공 --%>
<body>
	<%
		ArrayList<String> list = (ArrayList<String>) request.getAttribute("list");
	%>
	<form action="front" method="get">
		<input type="hidden" name="command"
			value="findproductlistbymaker">
		<table>
			<thead>
			<tr>
				<th>상품</th>
				<th>선택</th>
			</tr>
			</thead>
			<tbody>
				<%
					for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td><%=list.get(i)%></td>
					<td><input type="radio" name="maker" value="<%=list.get(i)%>" required="required"></td>
				</tr>
				<%
					}
				%>
				<tr>
					<td colspan="2"><input type="submit" value="검색"></td>
				</tr>
			</tbody>
		</table>
	</form>
	<%--
		maker-list.jsp -- command=findproductlistbymaker --> FindMakerProductListController
																		  |
																		  | -- (forward)
																		  |
															    productbymaker-list.jsp
															    (ID,NAME,MAKER,PRICE)
	 --%>
</body>
</html>
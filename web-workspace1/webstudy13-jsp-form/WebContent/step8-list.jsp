<%@page import="model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   ArrayList<MemberVO> list = new ArrayList<MemberVO>();
   list.add(new MemberVO("java","홍길동","판교","남"));
   list.add(new MemberVO("tomcat","드레이븐","용인","여"));
   list.add(new MemberVO("model2","가렌","강남","여"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step8-list.jsp</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">

</head>

<body>
<table>
	<thead>
		<tr>
			<th>순번</th>
			<th>이름</th>
			<th>주소</th>
			<th>성별</th>
		</tr>
	</thead>
	<tbody>
		<%--
			tr td를 list를 이용해서 동적으로 생성하되 이름부분은 링크를 부여해 id가 전송되도록 한다
		 --%>
		 <%for(int i=0;i<list.size();i++){ %>
		 	<tr>
		 	<td><%=i %></td>
		 	<td><a href="step8-action.jsp?id=<%=list.get(i).getId()%>"><%=list.get(i).getName() %></a></td>
		 		<td><%=list.get(i).getAddress()%></td>
		 			<td><%=list.get(i).getGender() %></td>
		 	</tr>
		 <% } %>
	</tbody>
</table>
</body>
</html>
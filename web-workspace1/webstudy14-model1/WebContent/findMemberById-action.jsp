<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findMemberById-action.jsp</title>
</head>
<body>
	<%
		MemberDAO dao = new MemberDAO();
	String id = request.getParameter("memberId");
		MemberVO vo = dao.findMemberById(id);
		if(vo != null){
	%>
	<h1>아이디 : <%=vo.getId()%></h1>
	<h1>이름 : <%=vo.getName()%></h1>
	<h1>주소 : <%=vo.getAddress()%></h1>
	<% }else {%>
	<script type="text/javascript">
		alert("<%=id%> 아이디에 해당하는 회원이 없습니다.");
		location.href="findMemberById-form.jsp";
	</script>
	<% } %>
	
	<a href="findMemberById-form.jsp">ㄱㄱ</a>
</body>
</html>
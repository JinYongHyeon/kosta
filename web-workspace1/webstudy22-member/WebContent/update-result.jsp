<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정 완료</title>


</head>
<body>
	<%
		HttpSession session = request.getSession(false);
	MemberVO vo = null;
	if (session != null && session.getAttribute("user") != null) {
		vo = (MemberVO) session.getAttribute("user");
	%>

	<table>
		<tr>
			<td>아이디</td>
			<td><%=vo.getId()%></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%=vo.getPassword()%></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=vo.getName()%></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=vo.getAddress()%></td>
		</tr>
	</table>
	<%
		} else {
	%>

	<script type="text/javascript">
		alert("로그인을 하고 오세요!");
		location.href = "index.jsp";
	</script>
	<%
		}
	%>
	<a href="index.jsp">HOME</a>
</body>
</html>
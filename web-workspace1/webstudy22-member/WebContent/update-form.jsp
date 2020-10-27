<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<%-- 	
	로그인 한 사용자인지 확인(세션 유무와 세션 내의 인증정보 유무)
	reguest.getSession(false) : 기존 세션이 있으면 기존 세션 객체 리턴, 없으면 null 리턴
 --%>

</head>
<body>
	<div class="container">
		<h1 style="text-align: center;">회원정보 수정</h1>
		<%
			HttpSession session = request.getSession(false);
		MemberVO vo = null;
		if (session != null && session.getAttribute("user") != null) {
			vo = (MemberVO) session.getAttribute("user");
		%>


		<form action="front" method="post" style="margin-top: 15px;">
			<input type="hidden" name="command" value="updateMember">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" readonly="readonly"
						value="<%=vo.getId()%>"></td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input type="password" name="password" required="required"
						placeholder="비밀번호를 입력해주세요" value="<%=vo.getPassword()%>"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" required="required"
						placeholder="이름을 입력해주세요" value="<%=vo.getName()%>"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address" required="required"
						placeholder="주소를 입력해주세요" value="<%=vo.getAddress()%>"></td>
				</tr>
				<tr>
					<td colspan="2" style="padding: 0;"><input type="submit"
						value="회원정보 수정"
						style="width: 100%; background-color: #77caf7; font-weight: bold; color: #fff; cursor: pointer;"></td>
				</tr>
			</table>

		</form>
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
	</div>
</body>
</html>


<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.LocalDate"%>
<%@page import="org.kosta.model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>마이페이지</title>

</head>
<body>
	<%
		HttpSession session = request.getSession(false);
		if (session == null && session.getAttribute("user") == null) {
	%>
	<script type="text/javascript">
		alert("계정이 존재하지않습니다 ");
		location.href = "index.jsp";
	</script>

	<%
		} else {
		MemberDTO vo = (MemberDTO) session.getAttribute("user");
	%>
	<table>
		<tr>
			<td>아이디</td>
			<td><%=vo.getId()%>
		</tr>

		<tr>
			<td>비밀번호</td>
			<td><%=vo.getPassword()%>
		</tr>

		<tr>
			<td>이름</td>
			<td><%=vo.getName()%>
		</tr>

		<tr>
			<td>주소</td>
			<td><%=vo.getAddress()%>
		</tr>

		<tr>
			<td>생일</td>
			<%
				String today = "";
			int age = 0;
			SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd"); //시스템 날짜를 가져와서 yyyyMMdd
			today = simple.format(new Date());
			int todayMonth = Integer.parseInt(today.substring(4, 6));
			int ddMonth = Integer.parseInt(vo.getBirthday().substring(5, 7));
		
			int todayDay = Integer.parseInt(today.substring(6, 8));
			int ddDay = Integer.parseInt(vo.getBirthday().substring(8, 10));
			age = Integer.parseInt(today.substring(0, 4)) - Integer.parseInt(vo.getBirthday().substring(0, 4));
			System.out.println(today);
			if (todayMonth < ddMonth) { // 생년월일 "월"이 지났는지 체크
				age--;
			} else if (todayMonth == ddMonth) { // 생년월일 "일"이 지났는지 체크
				if (todayDay < ddDay) {
					age--; // 생일 안지났으면 (만나이 - 1)
				}
			}
			%>
			<td><%=vo.getBirthday()%>(만)<%=age %>세
		</tr>
		<tr>
			<td>가입일</td>
			<td><%=vo.getRegdate()%></td>
		</tr>
	</table>
	<a href="index.jsp">메인페이지</a>

	<%
		}
	%>
</body>
</html>
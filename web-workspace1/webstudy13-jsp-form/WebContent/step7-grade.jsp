<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("studentName");
	int score = Integer.parseInt(request.getParameter("studentScore"));
	String grade = "F";
	if (score >= 90 && score <= 100) {
		grade = "A";
	} else if (score >= 80) {
		grade = "B";
	} else if (score >= 70) {
		grade = "C";
	}
	%>
	<%
		if (grade.equals("F")) {
	%>
	<script type="text/javascript">
		alert("<%=name%>님 F학점");
		location.href = "step7-F.jsp?name=<%=name%>";
	</script>
	<%
		} else {
	%>
		<%=name %>님<%=grade %>학점입니다.
	<%
		}
	%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>EL param 연습2</title>
</head>
<body>
<a href="step2-1.jsp">step2-1 이동</a>
<ol>
	<li>
		기존 방식으로 파라미터 전달받음 : <%=request.getParameter("name") %>
	</li>
	<li>
	<%--
		 EL 방식을 이용하면 null일 경우 화면에 표현하지 않는다. --> 값은 null은 전달함 화면에 안보여주는거임
		 기존 방식 <%= %> 은 null일 경우 null로 화면에 표현한다.
	 --%>
		EL 방식으로 파라미터 전달받음 : 이름 ${param.name} 주소 : ${param.address}
	</li>

</ol>
	<form action="step2-3.jsp" method="get">
		닉네임<input type="text" name="nick"><br>
		나이<input type="number" name="age"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>
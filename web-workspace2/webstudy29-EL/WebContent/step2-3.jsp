<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>EL parm 연습3</title>
</head>
<body>
<ol>
	<li>
		<%-- 기존 방식에서는 문자열로 인식되므로 문자열 1 이 뒤에 추가 --%>
		기존 방식 파라미터 처리 : <%=request.getParameter("nick") %> /  <%=request.getParameter("age")+1 %>
	</li>
	<li>
		<%-- EL 방식은 내부적으로 형변환하여(Integer.parseInt()) 연산되므로 +1이 된다. --%>
		EL 방식 파라미터 처리 : ${param.nick} / ${param.age}
	</li>
</ol>
<form action="step2-4.jsp">
	<input type="checkbox" name="food" value="삼겹살">삼겹살
	<input type="checkbox" name="food" value="등심">등심
	<input type="checkbox" name="food" value="곱창">곱창
	<input type="checkbox" name="food" value="막창">막창
	<input type="checkbox" name="food" value="양꼬치">양꼬치
	<input type="submit" value="주문">
</form>


</body>
</html>
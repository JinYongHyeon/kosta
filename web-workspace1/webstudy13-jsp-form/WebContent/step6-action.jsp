<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%int age = Integer.parseInt(request.getParameter("userAge")); 
	  String name = request.getParameter("userName");
	  if(age>=19){
	%>
	<h1><%=name%>님 즐거운 성인영화 관람하세요</h1>
	<%}else{ %>

	<script type="text/javascript">
		alert("<%=name%>님 나이 더 먹고 와라 마!!!!");
		location.href="step6-child.jsp";
	</script>
	<% }  %>

</body>
</html>
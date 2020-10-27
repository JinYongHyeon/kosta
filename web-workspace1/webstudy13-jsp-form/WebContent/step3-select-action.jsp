<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- step3-select-action.jsp 에서는 1호선~4호선까지는 
		  코레일 1호선 선택하셨습니다.
		 5~9호선까지는 도시철도 7호선 선택하셨습니다.
	 --%>
	 
	 <% int line = Integer.parseInt(request.getParameter("line"));
	 	if(line < 5){%>
	 	<H1>코레일 <%=line %>호선 선택</H1>
	 <%		
	 	}else{
	 %>
	 	<H1>도시철도 <%=line %>호선 선택</H1>
	 <% } %>
</body>
</html>
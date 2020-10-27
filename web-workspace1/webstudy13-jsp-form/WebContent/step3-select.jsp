<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select</title>
</head>
<body>
	<form action="step3-select-action.jsp">
		<select name="line" required="required">
			<%--
			jsp로 1호선에서 9호선까지 화면에 표현되도록 하세요 
			서버에 전송되는 정보는 (1~9) 이고 화면에 표현되는 형식은 1호선 ~ 9호선 
			--%>
			<option value="">--호선--</option>
			<%for(int i=1;i<=9;i++){ %>
			<option value="<%=i %>"><%=i %>호선</option>
			<% }  %>
		</select>
		<input type="submit" value="선택">
	</form>
	<%-- step3-select-action.jsp 에서는 1호선~4호선까지는 
		  코레일 1호선 선택하셨습니다.
		 5~9호선까지는 도시철도 7호선 선택하셨습니다.
	 --%>
</body>
</html>
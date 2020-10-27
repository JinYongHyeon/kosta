<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkbox</title>
<script type="text/javascript">
	function check(){
		var menu = document.getElementsByName("menu");
		var flag = false;
		for(var i=0;i<menu.length;i++){
			if(menu[i].checked){
				flag = true
			}
		}
		if(!flag)alert("체크박스 선택해주세요");
		return flag;
	}
</script>
</head>
<body>
	<%
		ArrayList<String> list = new ArrayList<String>();
	list.add("삼겹살");
	list.add("꽃등심");
	list.add("전어회");
	%>
	<form action="step5-checkbox-action.jsp" onsubmit="return check()">
		<%
			for (int i = 0; i < list.size(); i++) {
		%>
		<span><%=list.get(i)%></span></span><input type="checkbox" name="menu"
			value="<%=list.get(i)%>">
		<%
			}
		%>
		<input type="submit" value="주문">
	</form>
</body>
</html>
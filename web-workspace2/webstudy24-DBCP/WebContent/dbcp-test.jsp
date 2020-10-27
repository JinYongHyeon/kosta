<%@page import="java.sql.*,javax.sql.*,org.kosta.model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dbcp test</title>
</head>
<body>
1. 컨넥션을 생성, 소멸하는 기존 방식의 컨넥션
<%
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection con = DriverManager.getConnection(url,"scott","tiger"); //컨넥션 생성

%>	<%=con.getClass() %>
<br><br>
2. 컨넥션을 컨넥션풀에 미리 생성하고 반납하는 컨넥션
<% DataSource dataSource  = DataSourceManager.getInstance().getDataSource();
	Connection dbcpCon = dataSource.getConnection(); //컨넥션을 dbcp로부터 빌려옴
%><%=dbcpCon.getClass() %>
<%dbcpCon.close(); //컨넥션을 반납 %>
</body>
</html>
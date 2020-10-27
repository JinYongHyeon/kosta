<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
 <%-- 아래 코드 방식은 권장하지 않는다. --%>
 <%
 	String driver="oracle.jdbc.OracleDriver";
 	String url="jdbc:oracle:thin:@localhost:1521:xe";
 	Class.forName(driver);
 	Connection con = DriverManager.getConnection(url,"scott","tiger");
 	String sql ="SELECT COUNT(*) FROM WEB_MEMBER";
 	PreparedStatement pstmt = con.prepareStatement(sql);
 	ResultSet rs = pstmt.executeQuery();
 	int count =0;
 	while(rs.next()){
 		count = rs.getInt(1);
 	}
 	rs.close();
 	pstmt.close();
 	con.close();
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp db연동</title>
</head>
<body>
<h1>총 회원수 <%=count %></h1>
</body>
</html>
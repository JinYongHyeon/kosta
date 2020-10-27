<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>session Test</title>
</head>
<body>
<%-- 
	기존 스크립트 방식에는 session 유무 & session.getAttribute("") 유무를 체크했는데
	EL 방식은 ${sessionScope.memberVO 유무체크만 하면 된단)
 --%>
${sessionScope.memberVO} ${sessionScope.memberVO != null} ${sessionScope.memberVO == null} 
</body>
</html>
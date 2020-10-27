<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
	.inputGroup{margin-top:30px; margin-bottom:30px;}
	.inputGroup span{width:30%; float:left; line-height: 50px; font-weight: bold; text-align: center;}
	.inputGroup input[type=text]{width:70%; height: 50px; border:1px solid #000; box-shadow:4px 2px 6px #000;}
	input[type=submit]{width:100%; height: 50px; background:green; border:0; color:#fff;}
</style>
<title>회원검색</title>
</head>
<body>
<div style="position:absolute; top:50%; left:50%; transform:translate(-50%,-50%);">
<h1>Model2 회원관리(EL과 JSTL적용)</h1>
<form action="front" >
<input type="hidden" name="command" value="findMemberById">
<div class="inputGroup">
<span>아이디</span><input type="text" name="id" required="required" placeholder="검색 할 아이디를 입력해주세요">
</div>
<input type="submit" value="검색">
</form>
<a href="front?command=getAddressKind"">address-list</a>
</div>
</body>
</html>
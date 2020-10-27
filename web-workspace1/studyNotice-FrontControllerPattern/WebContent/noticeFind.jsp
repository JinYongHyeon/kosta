<%@page import="model.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 0 auto;
	padding: 0;
}

.container {
	width: 1300px;
}

#notice {
	width: 100%;
	list-style: none;
	position: relative;
	margin-top: 70px;
}

#notice>li {
	width: 100%;
	height: 40px;
	float: left;
	border: 1px solid #000;
	border-bottom: 0;
	padding: 20px;
}

#notice>li:nth-child(1) {
	text-align: center;
	font-size: 36px;
	font-weight: bold;
	background-color:#027521;
	color:#fff;
}

#notice>li:last-child {
	border-bottom: 1px solid #000;
	height: 600px;
}

#notice>li>ul {
	width: 100%;
	float: left;
	list-style: none;
}

#notice>li>ul li {
	float: right;
	margin-right:25px;
	font-weight: bold;
}

#notice>li>ul li:first-child{float:left; margin-right:0;}
button{width:150px; height: 50px; margin-top:15px; background-color:#fc942b; color:#fff; border:none; cursor:pointer}

</style>
<script type="text/javascript">
	function list(){
		location.href="FrontController?command=ListNotice";
	}
</script>
</head>
<body>
	<%
		NoticeVO vo = (NoticeVO) request.getAttribute("vo");
	%>
	<%
		if (vo == null) {
	%>
	<script type="text/javascript">
		alert("없는 번호입니다. 돌아가시오");
		location.href = "FrontController?command=ListNotice";
	</script>
	<%
		} else {
	%>
	<div class="container">
		<ul id="notice">
			<li><%=vo.getTitle()%></li>
			<li><ul>
					<li>아이디 : <%=vo.getWriter()%></li>
					<li>조회 : <%=vo.getPoint()%></li>
					<li>작성일 : <%=vo.getDate()%></li>
					
				</ul></li>
			<li><%=vo.getContent()%></li>
		</ul>
		<button onclick="list()">전체보기</button>
	</div>
	<%
		}
	%>
</body>
</html>
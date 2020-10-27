<%@page import="model.NoticeVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style>
* {
	margin: 0 auto;
	padding: 0;
}

.container {
	width: 1300px;

}

table {
	width:100%;
	float:left;
	border-collapse: collapse;
	margin-top:15px;
	text-align: center;
}

table tr th {
	background-color: #d5f7b2;
}

table tr th,td:nth-child(2){width:40%;}

table tr th, td {
	width:15%;
	height:30px;
	border: 1px solid #000;
}

table tr th, td:nth-child(odd) {
	background-color: c8c9c7;
}
</style>
</head>
<body>
	<%
		ArrayList<NoticeVO> list = (ArrayList<NoticeVO>) request.getAttribute("noticeList");
	%>
	<div class="container">
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회</th>
				</tr>
			</thead>
			<tbody>
				<%
					if (list.isEmpty()) {
				%>
				<tr>
					<td colspan="5">게시물이 존재하지 않습니다.</td>
				</tr>
				<%
					} else {
				%>
				<%
					for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td><%=list.get(i).getNo()%></td>
					<td><a href="findNotice?No=<%=list.get(i).getNo()%>"><%=list.get(i).getTitle()%></a></td>
					<td><%=list.get(i).getWriter()%></td>
					<td><%=list.get(i).getDate()%></td>
					<td><%=list.get(i).getPoint()%></td>
				</tr>
				<%
					}
				%>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>
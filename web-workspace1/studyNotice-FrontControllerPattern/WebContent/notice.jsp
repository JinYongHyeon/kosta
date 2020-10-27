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
	width: 100%;
	float: left;
	border-collapse: collapse;
	margin-top: 15px;
	text-align: center;
}

table tr th {
	background-color: #d5f7b2;
}

table tr th, td:nth-child(2) {
	width: 40%;
}

table tr th, td {
	width: 15%;
	height: 30px;
	border: 1px solid #000;
}

table tr th, td:nth-child(odd) {
	background-color: c8c9c7;
}

button {
	width: 150px;
	height: 50px;
	background-color: #fc942b;
	border: none;
	color: #fff;
	float: right;
	margin-top: 15px;
	cursor: pointer;
}

#paging {
	width: 50%;
	position: relative;
}

#paging ul {
	list-style: none;
}

#paging ul li {
	float: left;
	margin-right: 10px;
}
</style>
<script type="text/javascript">
	function listInert() {
		location.href = "noticeInsert.jsp";
	}
</script>
</head>
<body>
	<%
		ArrayList<NoticeVO> list = (ArrayList<NoticeVO>) request.getAttribute("noticeList");
	int pageno = 0;
	try {
		pageno = Integer.parseInt(request.getParameter("no"));//현페이지
	} catch (Exception e) {
		pageno = 1;
	}
	if (pageno < 1)
		pageno = 1;

	int total_record = list.size(); // 총 레코드 수
	int page_record_cnt = 10; // 페이지 당 레코드 수
	int group_page_cnt = 5; //페이지 당 보여줄 번호 수 [1][2]...

	//레코드 
	int record_end_no = pageno * page_record_cnt;
	int record_start_no = record_end_no - (page_record_cnt - 1);
	if (record_end_no > total_record)
		record_end_no = total_record;

	//총 페이지
	int total_page = total_record / page_record_cnt + (total_record % page_record_cnt > 0 ? 1 : 0);

	//페이지
	int groupNo = pageno / group_page_cnt + (pageno % group_page_cnt > 0 ? 1 : 0);
	int page_eno = groupNo * group_page_cnt;
	int page_sno = page_eno - (group_page_cnt - 1);

	if (page_eno > total_page)
		page_eno = total_page;
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
					for (int i = record_start_no - 1; i < record_end_no; i++) {
				%>
				<tr>
					<td><%=list.get(i).getNo()%></td>
					<td><a href="FrontController?No=<%=list.get(i).getNo()%>&command=FindNotice"><%=list.get(i).getTitle()%></a></td>
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
		<div id="paging">
			<ul>
				<%
					for (int i = page_sno; i <= page_eno; i++) {
				%>

				<li><a href="FrontController?no=<%=i%>&command=ListNotice"><%=i%></a></li>
				<%
					}
				%>
			</ul>
		</div>
		<button onclick="listInert()">글쓰기</button>
	</div>
</body>
</html>
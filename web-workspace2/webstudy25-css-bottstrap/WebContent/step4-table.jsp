<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
table tr td:hover {
	background-color: red;
}
.container{padding-top:20px;}
</style>
<title>Bootstrap Table</title>
</head>
<body>
<%-- 
	grid 적용해서 중간에 테이블을 배치 (3 - 6 - 3)
 --%>
	<div class="container-fluid">
		<h2>테이블 테스트</h2>
		<p>.table .table-hover class</p>
		<div class="row">
			<div class="col-sm-6 col-sm-offset-3">
			<table class="table table-hover table-bordered">
				<thead style="box-shadow: 4px 2px 8px #000;">
					<tr class="success">
						<th>Firstname</th>
						<th>Lastname</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>John</td>
						<td>Doe</td>
						<td>john@example.com</td>
					</tr>
					<tr>
						<td>Mary</td>
						<td>Moe</td>
						<td>mary@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
				</tbody>
			</table>
			</div>
		</div>
	</div>
</body>
</html>
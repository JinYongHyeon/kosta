<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax(JSONArray)</title>
<script type="text/javascript">
	var xhr;
	
	function startAjax(){
		var makerComp = document.getElementById("maker");
		var carViewComp = document.getElementById("carView");
		if(makerComp === ""){
			carview.innerHTML="";
			return
		}
		xhr = new XMLHttpRequest();
		xhr.onreadystatechange=function(){
			if(xhr.readyState == 4 && xhr.status==200){
				var ja = JSON.parse(xhr.responseText);
				var tb="";
				for(var i=0; i<ja.length;i++){
					tb+="<tr>";
					tb+="<td>"+i+"</td><td>"+ja[i].model+"</td><td>"+ja[i].price+"</td>"
					tb+="</tr>";
				}
				carViewComp.innerHTML=tb;
			}
		}
		xhr.open("get","CarJSONServlet?maker="+makerComp.value);
		xhr.send(null);
		
	}
</script>
<style>
table {
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid #000;
}

th, td {
	padding: 10px;
}
</style>
</head>
<body>
	<select id="maker" onchange="startAjax()">
		<option value="">---</option>
		<option value="현대">현대</option>
		<option value="르노">르노</option>
		<option value="기아">기아</option>
	</select>
	<br>
	<br>
	<br>
	<br>
	<table>
		<thead>
			<tr>
				<th>NO</th>
				<th>MODEL</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody id="carView">
			
		</tbody>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSONArray를 이용해 ajax 통신하는 예제</title>
<script type="text/javascript">
	var xhr;
	function startAjax() {
		xhr = new XMLHttpRequest();
		//alert(xhr);
		
		//익명함수방식으로 콜백함수를 등록한다.
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4 && xhr.status == 200){
				var json = JSON.parse(xhr.responseText);
				//alert(json);
				var tb = "";
				for(var i=0;i<json.length;i++){
					tb+="<tr><td>"+json[i]+"</td></tr>";
					//alert(json[i]);
				}
				document.getElementById("player").innerHTML=tb;
			}
		}
		xhr.open("get","JSONArrayServlet");
		xhr.send(null);
	}
	
	function clearPlayer(){
		document.getElementById("player").innerHTML="";
	}
</script>
</head>
<body>
	<input type="button" value="JSONArray확인" onclick="startAjax()">
	<input type="button" value="비우기" onclick="clearPlayer()">
	<table border="1">
		<thead>
			<tr>
				<th>선수명</th>
			</tr>
		</thead>
		<tbody id="player">
		
		</tbody>
	</table>
</body>
</html>
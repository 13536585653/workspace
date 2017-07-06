<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My jQuery2</title>
<script type="text/javascript" src="js/jquery-1.12.3.js"></script>
	<script type="text/javascript">
		window.onload=function(){
			alert("hello world!");
		}
		
		window.onload=function(){
			alert("旺仔！");
		}
		
		//解释：window加载弹框会被覆盖，而jQuery弹框不会覆盖
		
		$(document).ready(function(){
			alert("good sleep!");
		});
		
		$(function(){
			alert("仔多多！");
		})
	</script>
</head>
<body>

</body>
</html>
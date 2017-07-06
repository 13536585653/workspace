<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery 对象和 DOM 对象</title>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
		//表示获得id为myId元素内的html代码
		var domObj=document.getElementById("id");
		var html=domObj.innerHTML;	
		
		//表示获取id为myId元素内的html代码
		$("#id").html();
	</script>
</head>
<body>
	<div id="id">
		我是旺仔！
	</div>
	
	
	<ul id="myUL">
		<li>one</li>
		<li>two</li>
		<li>three</li>
	</ul>
</body>
</html>
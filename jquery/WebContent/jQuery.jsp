<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是我的第一个jQuery网页</title>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
		//方法一
		$(document).ready(function(){
			alert("hello world!");
		});
		
		//方法二
		$(function(){
			alert("hello 旺仔！");
		});
	</script>
</head>
<body>
	<center>
		
	</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery中的链式操作</title>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
		$(document)
		.ready(function(){
			alert("hello world!");
		})
		.ready(function(){
			alert("旺仔！");
		})
		.ready(function(){
			alert("美美哒。。。。");
		});
	</script>
</head>
<body>

</body>
</html>
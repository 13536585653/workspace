<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#top{
		width:100%;
		height:150px;
		border: 1px solid;
	}
	
	#left{
		width:20%;
		height:500px;
		float:left;
		border: 1px solid;
	}
	
	#right{
		width:79%;
		height:500px;
		float:right;
		border: 1px solid;
	}
</style>

</head>
<body>
	<div id="top">
		<p>欢迎，<font color="red" size="20px">${user.u_name }</font>登录图书室
	</div>
	<center>
	<div id="left">
		<h3>图书管理</h3><br>
		<p><a href="addBookType.jsp" target="frame">添加书类</a>
		<p><a href="addBooks.jsp" target="frame">添加书籍</a>
	</div>
	<div id="right">
		<iframe name="frame" src="welcome.html" style="width:100%;height:100%; border:0px"></iframe>
	</div>
	</center>
</body>
</html>
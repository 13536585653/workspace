<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>欢迎管理员${msg.a_name }进入公告栏系统</h2>
	<div style="width:24%;height:500px;border:1px solid #f00;float:left">
		<center>
			<h2>公告栏系统管理</h2>
			<h2><a href="admin/addUser.jsp" target="fram">添加用户</a></h2>
			<h2><a href="admin/addNotice.jsp" target="fram">添加公告</a></h2>
			<h2><a href="admin/superviseServlet" target="fram">管理公告</a></h2>
		</center>
	</div>
	<div style="width:75%;height:500px;border:1px solid #00f;float:right">
		<iframe name="fram" src="admin/welcom.html" style="width:100%;height:100%"></iframe>
	</div>
</body>
</html>
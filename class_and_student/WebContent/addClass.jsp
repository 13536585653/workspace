<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<a href="addStudent.jsp">addStudent</a>&nbsp&nbsp
		<a href="addMajor.jsp">addMajor</a>&nbsp&nbsp
		<a href="index.jsp">index</a>
		<br>
		<h3>添加班级页面</h3>
		<form action="addClass" method="post">
			<p>addClass:<input type="text" name="cname">
			<input type="submit" value="add">
			<input type="button" value="返回列表" onclick="return location.href='findAllStudent'">
		</form>
	</center>
</body>
</html>
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
		<a href="addClass.jsp">addClass</a>&nbsp&nbsp
		<a href="addStudent.jsp">addStudent</a>&nbsp&nbsp
		<a href="index.jsp">index</a>
		<br>
		<h3>添加专业页面</h3>
		<form action="addMajor" method="post">
			<p>addMajor:<input type="text" name="mname"><br>
			<p>addMIntroduce:<input type="text" name="mIntroduce"><br><br>
			<input type="button" value="返回列表" onclick="location.href='findAllStudent'">
			<input type="submit" value="add">
		</form>
	</center>
</body>
</html>
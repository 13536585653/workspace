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
		<h2>添加班级的页面</h2><br>
		<form action="addClass" method="post">
			<p><b>addClass:</b><input type="text" name="cname">
			<input type="submit" value="add">
			<input type="button" value="back" onclick="location.href='findStudent'">
		</form>
	</center>
</body>
</html>
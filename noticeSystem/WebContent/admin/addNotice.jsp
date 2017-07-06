<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加公告</h2>
	<form action="addNoticeServlet" method="post">
		<p>标题:<input type="text" name="bb_title">
		<p>内容:<textarea name="bb_details" style="width:400px;height:100px;"></textarea>
		<p>发布人:<input type="text" name="bb_author">
		<p><input type="submit" value="提交">
	</form>
</body>
</html>
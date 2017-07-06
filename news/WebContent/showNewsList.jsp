<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>新闻发布系统</h1>
	<form action="addNewsServlet" method="post">
		<p>新闻标题：<input type="text" name="ntitle"><br>
		<p>新闻类型：<select name="ntype">
			<option selected="selected">请选择</option>
			<option >财经</option>
			<option>娱乐</option>
			<option>军事</option>
		</select><br>
			<p>发布区域：<input type="checkbox" name="narea" value="珠海">珠海
			          <input type="checkbox" name="narea" value="深圳">深圳
			          <input type="checkbox" name="narea" value="广州">广州<br>
			<p>作&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp者：<input type="text" name="nauthor"><br>
			<p>发布时间：<input type="text" name="ntime"><br>
			<p>发布内容：<textarea rows="5" cols="20" name="ncontent"></textarea><br>
			<input type="submit" value="添加">
			<input type="reset" value="重置">
			
	</form>
</body>
</html>
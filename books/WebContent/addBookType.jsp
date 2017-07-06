<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function check(){
		if("${msg}"!=""){
			alert("${msg}");
		}
	}
</script>
</head>
<body onload="check()">
	<h2>书籍类型操作</h2>
	<form action="addBookType" method="post">
	<p><input type="text" name="btName">
	<input type="submit" value="添加书籍类型">
	<input type="button" value="返回列表" onclick="location.href='findBooksServlet'">
	</form>
	<p><a href="index.jsp" target="frame">查看在全部书籍分类</a>
</body>
</html>
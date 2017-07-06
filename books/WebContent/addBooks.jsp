<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<center>
		<h3>添加书籍</h3>
	<form action="addBooks" method="post">
		<p>书籍名称:<input type="text" name="bname"><br>
		<p>出版日期:<input type="text" name="ctime"><br>
		<p>所属类别:
		<select name="type">
			<c:forEach items="${types }" var="type">
			<option value="${type.bt_id }">${type.bt_type }</option>
			</c:forEach>
		</select>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<p><input type="submit" value="保存">
		<input type="button" value="返回列表" onclick="location.href='findBooksServlet'"/>
	</form>
		</center>
</body>
</html>
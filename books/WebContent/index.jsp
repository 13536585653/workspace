<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2>我的图书</h2><br></br>
	<table border="1">
		<tr>
		<th>书的ID</th>
		<th>书名</th>
		<th>出版日期</th>
		<th>所属类别</th>
		</tr>
		
		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.b_id }</td>
				<td>${book.b_name }</td>
				<td>${book.b_date }</td>
				<td><c:out value="${book.type.bt_type}" default="未知"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</center>

</body>
</html>
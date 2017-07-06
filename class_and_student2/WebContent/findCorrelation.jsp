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
		<h4>所有班级的男生和女生的总人数：</h4>
			<a href="index.jsp">index</a><br>
			<form>
				<table border="1px">
				<tr>
					<th>班级</th>
					<th>性别</th>
					<th>人数</th>
				</tr>
				
				<c:forEach items="${list }" var="l">
					<tr>
					<td>${l.cname.cname }</td>
					<td>${l.ssex }</td>
					<td>${l.sid }</td>
					</tr>
				</c:forEach>
				
				</table>
			</form>	
	</center>
</body>
</html>
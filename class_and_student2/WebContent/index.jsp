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
			<h1>全部学生的信息</h1>
			<br>
				<a href="addClass.jsp">addClass</a>
				<a href="addStudent.jsp">addStudent</a>
				&nbsp&nbsp<a href="findCorrelation">findCorrelation</a>
				&nbsp&nbsp</a>&nbsp&nbsp
				<a href="findCorrelation2">findCorrelation2</a><br><br>
				<table border="1px" width="35%">
			<tr>
				<th width="25%">班级</th>
				<th width="25%">姓名</th>
				<th width="25%">性别</th>
				<th width="25%">年龄</th>
			</tr>
				<c:forEach items="${slist }" var="list">
			<tr>
				<td>${list.cname.cname }</td>
				<td>${list.sname }</td>
				<td>${list.sage }</td>
				<td>${list.ssex }</td>
			</tr>
			
				</c:forEach>
				</table>
		</center>
</body>
</html>
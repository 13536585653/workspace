<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<a href="addClass.jsp">addClass</a>&nbsp&nbsp
		<a href="addMajor.jsp">addMajor</a>&nbsp&nbsp
		<a href="index.jsp">index</a>
		<br>
		<h3>添加学生页面</h3>
		<form action="addStudent" method="post">
			<p>addStudentName:<input type="text" name="sname"><br>
			<p>addStudentAge:<input type="text" name="sage"><br>
			<p>addStudentSex:<input type="text" name="ssex"><br>
			<p>addClass:
			<select name="cname">
				<c:forEach items="${clist}" var="cname">
					<option value="${cname.cid }">${cname.cname}</option>
				</c:forEach>
			</select><br><br>
			<p>addMajor:
			<select name="mname">
				<c:forEach items="${mlist }" var="mname">
					<option value="${mname.mid }">${mname.mname}</option>
				</c:forEach>
			</select><br><br>
			
			<input type="submit" value="add">
			<input type="button" value="返回列表" onclick="location.href='findAllStudent'">
		</form>
	</center>
</body>
</html>
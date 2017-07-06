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
		<h2>添加学生页面</h2>
		<form action="addStudent" method="post">
			<p><b>Studentname:</b><input type="text" name="sname"><br>
			<p><b>Studentage :</b><input type="text" name="sage"><br>
			<p><b>Studentsex :</b><input type="text" name="ssex"><br>
			<p><b>StudentClass&nbsp&nbsp&nbsp&nbsp:</b><select name="cname">
				<c:forEach items="${clist }" var="Class">
					<option value="${Class.cid }">${Class.cname }</option>
				</c:forEach>
			</select>
			<input type="submit" value="add">
		</form>
	</center>
</body>
</html>
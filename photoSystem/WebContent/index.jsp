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
		<h1>照片冲印管理系统</h1>
		<form action="addPhoto" method="post">
			<table border="1px">
				<tr style="background:red">
					<th>用户名</th>
					<th>冲印数量</th>
					<th>冲印类型</th>
					<th>Email地址</th>
					<th>联系电话</th>
				</tr>
			
			<c:forEach items="${Plist }" var="p">
				<tr>
					<td>${p.name }</td>
					<td>${p.count }</td>
					<td>${p.type }</td>
					<td>${p.email }</td>
					<td>${p.tel }</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10"><center><a href="addPhoto.jsp">添加照片信息</a></center></td>
			</tr>
			</table>
		</form>
	</center>
</body>
</html>
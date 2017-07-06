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
		<h2>项目评分子系统</h2><br>
		<form>
			<table border="1px" width="80%">
				<tr>
					<th>项目名称</th>
					<th>UI得分</th>
					<th>代码得分</th>
					<th>文档得分</th>
					<th>演讲得分</th>
					<th>总分</th>
					<th>评分时间</th>
				</tr>
				
			<c:forEach items="${mlist }" var="m">
				<tr>
			 		<td>${m.project.projectname}</td>
					<td>${m.ui }</td>
					<td>${m.code }</td>
					<td>${m.document }</td>
					<td>${m.speech }</td>
					<td>${m.ui+m.code +m.document+m.speech }</td>
					<td>${m.sdate }</td>
				</tr>
			</c:forEach>
			</table><br><br>
				<input type="button" value="增加" onclick="location.href='findProject'">
				<input type="button" value="退出" onclick="location.href='safety.jsp'">
		</form>
	</center>
</body>
</html>
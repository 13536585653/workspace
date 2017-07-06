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
		<h1>新闻发布列表</h1>
		<a href="showNewsList.jsp">发布新闻</a>
			<c:forEach items="${nblist }" var="list">
		<table border="1px" width="65%">
			<tr>
			<th width="20%">新闻标题：</th>
				<td colspan="10" width="10%">${list.ntitle }</td>
			<th>新闻类型</th>
				<td colspan="10">${list.ntype }</td>
			<th>发布区域</th>
				<td colspan="10">${list.narea }</td>
			</tr>
			
			<tr>
			<th>作者：</th>
			<td colspan="60">${list.nauthor }</td>
			</tr>
			<tr>
				<td colspan="100">描述：${list.ncontent }</td>
			</tr>
			
			<tr>
				<td align="right" colspan="100">发布时间：${list.ntime }</td>
			</tr>
		</table>
		<br><br>
		</c:forEach>
	</center>
</body>
</html>
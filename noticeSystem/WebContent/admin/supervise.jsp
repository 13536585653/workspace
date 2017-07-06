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
	<h2>管理公告栏</h2>
	<table border="1px">
		<tr>
			<td>编号</td>
			<td>标题</td>
			<td>日期</td>
			<td>作者</td>
			<td>详细信息</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${newbb }" var="item" varStatus="i">
			<tr>
				<td>${i.count }</td>
				<td>${item.bb_title }</td>
				<td>${item.bb_time }</td>
				<td>${item.bb_author }</td>
				<td><a href="detailsServlet?bb_id=${item.bb_id}">详细信息</a></td>
				<td>
					<a href="deleteServlet?bb_id=${item.bb_id }">删除</a>&nbsp
					<a href="updateServlet?bb_id=${item.bb_id }">修改</a>
				</td>
			</tr>
		
		</c:forEach>
	</table>
</body>
</html>
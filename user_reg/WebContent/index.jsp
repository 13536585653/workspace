<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style>
		#head{
			width:100%;
			height:100px;
			background:red;
			float:center;
		}
		#left{
			width:20%;
			height:500px;
			background:blue;
			float:left;
		}
		#right{
			float:right;
			width:79%;
			height:500px;
			background:green;
		}
	</style>
</head>
<body>
		消息：${msg }
		
		<div id="head">欢迎进入主页</div>
		<div id="left">
		<h4>管理菜单</h4>
		</div>
		<div id="right">当前在线人数：<br><br></br>
		<table border="1px">
		<tr>
		<th>ID</th>
		<th>UserName</th>
		<th>UserSex</th>
		</tr>
		<c:forEach items="${AllUserList }" var="a">
		<tr>
		<td>${a.u_id }</td>
		<td>${a.u_name }</td>
		<td>${a.u_sex }</td>
		</tr>
		</c:forEach>
	</table>
		</div>
</body>
</html>
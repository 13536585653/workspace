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
<h3>投票主题列表</h3>
<table border="1px" width="1000px"> 
<tr>
 <th>编号</th>
 <th>主题id</th>
 <th>主题标题</th>
 <th>主题描述</th>
 <th>类型</th>
 <th>操作</th>
</tr>
<c:forEach items="${list}" var="vote" varStatus="index"> 
<tr>
 <td>${index.count}</td>
 <td>${vote.v_id }</td>
 <td>${vote.v_title }</td>
 <td>${vote.v_desp }</td>
 <td>${vote.v_type}</td>
 <td>操作</td>
</tr>


</c:forEach>
</table>

</body>
</html>
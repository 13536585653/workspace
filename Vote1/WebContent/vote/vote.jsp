<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>欢迎${name},请选择你最爱投票</h2>
<form method="post" action="voteServlet">
<c:forEach items="${resultMap}" var="item">
<p><input type="checkbox" name="ball" value="${item.key}">${item.key}
</c:forEach>
<p><input type="submit" value="提交"> 
</form>
<a href="../result.jsp">查看投票结果</a>
</body>
</html>
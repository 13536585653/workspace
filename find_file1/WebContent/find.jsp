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
<h2>文件查找结果</h2>
<table border=1px>
<tr><td>
文件
</td></tr>
<tr><td>
<c:forEach items="${s }" var="s1">${s1 }<br></c:forEach>
</td></tr>
</table>
</body>
</html>
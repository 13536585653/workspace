<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>2.jsp</h2>
<p>request里的name:<%=request.getAttribute("name") %>
<p>session里的name:<%=session.getAttribute("name") %>
<p>ctx里的name:<%=application.getAttribute("name") %>
<p>pageContext里的name:<%=pageContext.getAttribute("name") %>



</body>
</html>
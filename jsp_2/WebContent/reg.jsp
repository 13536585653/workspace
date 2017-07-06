<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
     out.print("hello");
    
     request.setAttribute("name","张三");
     
     session.setAttribute("name", "李四");

     application.setAttribute("name", "王五");
     
     pageContext.setAttribute("name", "赵六");
%>

<p>request里的name:<%=request.getAttribute("name") %>
<p>session里的name:<%=session.getAttribute("name") %>
<p>ctx里的name:<%=application.getAttribute("name") %>
<p>pageContext里的name:<%=pageContext.getAttribute("name") %>

<p><a href="2.jsp">2.jsp</a>

</body>
</html>
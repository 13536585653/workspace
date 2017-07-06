<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.bean.Student" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>javaBean示例</h2>
<jsp:useBean id="stu1" class="com.test.bean.Student" 
scope="session"></jsp:useBean>

<jsp:setProperty name="stu1" property="name"  value="张三"/>
<jsp:setProperty name="stu1" property="age"  value="18"/>

<p>姓名:<jsp:getProperty property="name" name="stu1"/>
<p>年龄：<jsp:getProperty property="age" name="stu1"/>

<hr>
<%
     Student s=(Student)session.getAttribute("stu1");

%>
<p>姓名:<%=s.getName()%>
<p>年龄:<%=s.getAge() %>

</body>
</html>
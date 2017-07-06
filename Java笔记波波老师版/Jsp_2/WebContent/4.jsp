<%@page import="com.test.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>el表达式</h2>
<%
      Student stu=new Student("张三",20);
      application.setAttribute("stu",stu);
%>

<p>姓名:${stu.name}
<p>年龄:${stu.age}
<p>${empty stu}
<p>${empty s}

</body>
</html>
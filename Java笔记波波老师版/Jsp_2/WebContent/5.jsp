<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.test.bean.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>el表达式取值</h2>
<%
      Student stu1=new Student("张三",18);
      Student stu2 =new Student("李四",20);
      Student stu3=new Student("王五",22);
      Student stu4=new Student("赵六",24);

      //pageContext.setAttribute("stu", stu1);
     // request.setAttribute("stu", stu2);
      //session.setAttribute("stu", stu3);
      //application.setAttribute("stu", stu4);
      
%>
<p>默认：${stu.name}-${stu.age}
<p>page:${pageScope.stu.name}--${pageScope.stu.age}
<p>request:${requestScope.stu.name}-${requestScope.stu.age}
<p>session:${sessionScope.stu.name}-${sessionScope.stu.age}
<p>application:${applicationScope.stu.name}-${applicationScope.stu.age}
</body>


</html>
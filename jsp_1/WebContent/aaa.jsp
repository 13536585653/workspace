<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>jsp示例</h2>
<h2>欢迎<%=request.getSession().getAttribute("username")%></h2>
<!--java定义-->
<%!
    String name="张三";
    int n=0;
%>

<!--java代码块-->
<%
    Date date=new Date();
    String name="李四";
    int m=0;
    this.n++;
    m++;
%>
<!--java等式-->
<p>当前时间:<%=date %>
<p>当前页面访问人数:<%=n%>
<p>当前页面访问人数:<%=m%>


</body>
</html>
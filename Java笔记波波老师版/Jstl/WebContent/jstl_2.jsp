<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>    
<%@page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>格式化标签库案例</h2>
<p>未格式化的日期:<%=new Date() %>
<p><fmt:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd hh:mm:ss"/>
<p><fmt:formatDate value="<%=new Date()%>" pattern="yyyy年MM月dd日 hh:mm:ss"/>
<p>格式化数字
<p><fmt:formatNumber  value="11.1111111" type="currency" />
<fmt:formatNumber  value="11.1111111" type="percent" />
<fmt:formatNumber  value="11.1111111" type="number" />

</body>
</html>
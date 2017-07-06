<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@taglib tagdir="/WEB-INF/tags" prefix="my" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>修改学员</h2>
<form method="post"  action="update2">
<p>学号:${stu.s_id}	
<input type="hidden" name="id" value=${stu.s_id}>
<p>学员姓名:<input type="text" name="name"  value="${stu.s_name}">
<p>年龄:<input type="text" name="age" value="${stu.s_age}">
<p>性别:
<%
List list=new ArrayList();
 list.add("男");
 list.add("女");
 pageContext.setAttribute("sexList",list);
%>
<my:myRadio name="sex" value="${stu.s_sex}" list="${sexList}"></my:myRadio>


<p>爱好:
<%
List list2=new ArrayList();
list2.add("运动");
list2.add("游戏");
list2.add("旅游");
list2.add("摄影");
pageContext.setAttribute("funList",list2);
%>
<my:myCheckbox name="fun" value="${stu.s_fun}" list="${funList}"></my:myCheckbox>

<p>城市:
<my:mySelect name="c_id" value="${stu.city.c_id}" map="${cityMap}"></my:mySelect>

<p> <input type="submit" value="修改">
</form>
</body>
</html>
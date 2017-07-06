<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
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

<c:choose>
	<c:when test="${stu.s_sex=='男'}">
		<input type="radio" name="sex" value="男"  checked="checked">男
		<input type="radio" name="sex" value="女" >女
	</c:when>
	<c:otherwise>
		<input type="radio" name="sex" value="男"  >男
		<input type="radio" name="sex" value="女"  checked="checked">女
	</c:otherwise>
</c:choose>



<p>爱好:
<c:forEach items="运动,游戏,旅游,摄影" var="v">
  <c:choose>
    <c:when test="${fn:contains(stu.s_fun,v)}">
       <input type="checkbox" name="fun" value="${v}" checked="checked">${v} 
     </c:when>
     <c:otherwise>
        <input type="checkbox" name="fun" value="${v}">${v}  
     </c:otherwise>
  </c:choose>
</c:forEach>

<p> <input type="submit" value="修改">
</form>
</body>
</html>
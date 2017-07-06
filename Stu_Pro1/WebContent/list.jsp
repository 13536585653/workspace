<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>学员列表</h2>
<table width="600px" border="1px">
 <tr>
 <td>编号</td>
 <td>学员编号</td>
 <td>姓名</td>
 <td>年龄</td>
 <td>性别</td>
 <td>爱好</td>
 <td>操作</td>
 </tr>
 <c:forEach items="${list}" var="stu" varStatus="i">
 <tr>
 <td>${i.count}</td>
 <td>${stu.s_id}</td>
 <td>${stu.s_name}</td>
 <td>${stu.s_age}</td>
 <td>${stu.s_sex}</td>
 <td>${stu.s_fun}</td>
 <td>
 <a href='delete?s_id=${stu.s_id}'>删除</a>
 &nbsp;
 <a href='update1?s_id=${stu.s_id}'>修改</a>
 </td>
 </tr>
 </c:forEach>
 </table>
 <a href="addStudent.html">继续添加</a>
</body>
</html>
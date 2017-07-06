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
<h2>添加学员</h2>
<form action="add" method="post">
<p>学员姓名:<input type="text" name="name">
<p>年龄:<input type="text" name="age">
<p>性别:
<input type="radio" name="sex" value="男" checked="checked">男
<input type="radio" name="sex" value="女" >女
<p>爱好:
<input type="checkbox" name="fun" value="运动">运动
<input type="checkbox" name="fun" value="游戏">游戏
<input type="checkbox" name="fun" value="旅游">旅游
<input type="checkbox" name="fun" value="摄影">摄影
<p>你所在城市:
<my:mySelect name="c_id" value="1" map="${cityMap}"></my:mySelect>

<p> <input type="submit" value="添加">
</form>
</body>
</html>
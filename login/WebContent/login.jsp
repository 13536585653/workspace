<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<script type="text/javascript">
   function subcheck(){   
	   var userName = document.getElementById("uname").value;
	   var passwd = document.getElementById("passwd").value;
	   if(userName == "" || passwd == ""){
		   alert("请输入用户名或密码");
		   return false;
	   }
   }
   
   function checkUser(){
	   if("${msg}" != ""){
		   alert("${msg}");
	   }
   }
</script>
<body onload="checkUser()">
<center>
<h2>这是一个登录页面</h2>
<form action="login" method="post">
<p>用户名：<input id="uname" type="text" name="userName">
<p>密    码：<input id="passwd" type="password" name="password">
<p><input type="submit" value="登录" onclick="return subcheck();"/>
</form>
</center>
</body>
</html>
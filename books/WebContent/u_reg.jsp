<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   function subcheck(){   
	   var userName = document.getElementById("name").value;
	   var passwd = document.getElementById("pwd").value;
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
</head>
<body onload="checkUser()">
	<center>
		<h2>欢迎来到图书登录页面</h2><br><br>
		<form action="u_regServlet" method="post">
			用户名：<input id="name" type="text" name="name"><br><br>
			密&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp码：<input  id="pwd" type="password" name="pwd"><br><br>
			<input type="submit" value="登录" onclick="return subcheck();"> &nbsp&nbsp&nbsp
			没有账号？<a href="register.jsp">立即注册</a>
		</form>
		
	</center>
</body>
</html>
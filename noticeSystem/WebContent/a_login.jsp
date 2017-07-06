<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<script>
		function check_m(){
			var m_name=document.getElementById("m_name").value;
			var m_pwd=document.getElementById("m_pwd").value;
			if(m_name=="" || m_pwd==""){
				alert("用户名与密码不能为空！");
				return false;
			}
		}
		function check_a(){
			if("${msg}"!=""){
				alert("${msg}");
			}
		}
	</script>
</head>
<body onload="check_a()">
	<form action="loginServlet" method="post">
		<p>AdminName:<input id="m_name" type="text" name="a_name">
		<p>AdminPwd:<input id="m_pwd" type="password" name="a_pwd">
		<p><input type="submit" value="登录" onclick="return check_m()">&nbsp&nbsp
		去<a href="register.jsp">注册</a>
	</form>
</body>
</html>
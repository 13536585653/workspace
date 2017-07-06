<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<script>
		function check_m(){
			var m_name=document.getElementById("a_name").value;
			var m_pwd=document.getElementById("a_pwd").value;
			var m_pwd=document.getElementById("a_p").value;
			if(m_name=="" || m_pwd=="" || a_p==""){
				alert("用户信息不能为空！");
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
	<form action="regServlet" method="post">
		<p>AdminName:<input id="a_name" type="text" name="a_name">
		<p>AdminPwd:<input id="a_pwd" type="password" name="a_pwd">
		<p>Position:<input id="a_p" type="text" name="a_position">
		<p><input type="submit" value="注册" onclick="return check_m()">
		去<a href="a_login.jsp">登陆</a>
	</form>
</body>
</html>
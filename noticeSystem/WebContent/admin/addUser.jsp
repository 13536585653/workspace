<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script>
		function check_m(){
			var m_name=document.getElementById("u_name").value;
			var m_pwd=document.getElementById("u_pwd").value;
			var m_pwd=document.getElementById("u_p").value;
			if(m_name=="" || m_pwd=="" || a_p==""){
				alert("用户信息不能为空！");
				return false;
			}
		}
	</script>
</head>
<body>
	<h2>添加普通用户</h2>
	<form action="addUserServlet" method="post">
		<p>AdminName:<input id="u_name" type="text" name="u_name">
		<p>AdminPwd:<input id="u_pwd" type="password" name="u_pwd">
		<p>Position:<input id="u_p" type="text" name="u_position">
		<p><input type="submit" value="添加" onclick="return check_m()">
	</form>
</body>
</html>
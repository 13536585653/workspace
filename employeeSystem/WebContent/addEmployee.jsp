<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工管理系统</title>
	<script type="text/javascript">
	function check(){
		  if("${msg}" != ""){
			     alert("${msg}");
			     //请求servlet，查询所有用户
			     //location.href="findEmployee";
		  }
	  }
	</script>
	
</head>
<body onload="check()">	
		<center>
			<h2>员工添加信息</h2>
			<form action="addEmployee" method="post">
				<table width="30%" border="1px">
					<tr>
						<td>员工姓名：</td>
						<td><input type="text" name="ename"></td>
					</tr>
					<tr>
						<td>员工年龄：</td>
						<td><input type="text" name="eage"></td>
					</tr>
					<tr>
						<td>员工性别：</td>
						<td>
						<input type="radio" name="esex" value="男">男
						<input type="radio" name="esex" value="女">女
						</td>
					</tr>
					<tr>
						<td>员工Email</td>
						<td><input type="text" name="eemail"></td>
					</tr>
					<tr>
						<td><input type="submit" value="添加"></td>
					</tr>
				</table>
			</form>
		</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PhotoSystem</title>
	<script type="text/javascript">
		function checkPhoto(){
			if("${msg}" == "添加成功"){
				   alert("${msg}");
			   }
		}
		
		function subCheck(tel){
			var reg = /^1[3578][01379]\d{8}$/g;
			var name = document.getElementById("name").value;
			var count = document.getElementById("count").value;
			var tel = document.getElementById("tel").value;
			
			if(name==""||count==""||tel==""){
				alert("用户名、手机号以及数量三者都不能为空！");
				return false;
			}
			
			if(reg.test(tel)){
				return true;
			}else{
				alert("号码输入格式有误,并且只能输入数字(11位)！");
				return false;
			}
		}
	</script>
</head>
<body onload="checkPhoto()">
	<center>
		<h1>增加照片信息</h1><br>
		<form action="addPhoto" method="post">
			<table border="1px" width="45%">
				<tr>
					<td>用户名：</td>
					<td><input  id="name" type="text" name="name"></td>
				</tr>
				<tr>
					<td>冲印类型：</td>
					<td>
						<select name="type">
							<option selected="selected">请选择</option>
							<option>黑白</option>
							<option>彩色</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>冲印数量：</td>
					<td><input id="count" type="text" name="count"></td>
				</tr>
				<tr>
					<td>手机号码：</td>
					<td><input id="tel" type="text" name="tel" ></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td colspan="100"><center><input type="submit" value="增加" onclick="return subCheck();"></center></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
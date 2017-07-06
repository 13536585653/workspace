<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>添加项目名称页面</h2><br>
		<form action="addProject" method="post">
			<table>
				<tr>
					<td>添加项目：<input type="text" name="projectname"></td>
				</tr>
				
				<tr>
					<td>添加备注：<textarea rows="5" cols="10" name="remark"></textarea></td>
				</tr>
				
				<tr>
					<td colspan="10" align="center"><input type="submit" value="添加"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
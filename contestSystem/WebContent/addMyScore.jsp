<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加评分的页面</title>
</head>
<body>
	<center>
		<h2>添加评分页面</h2><br>
		<form action ="addMyScore" method="post">
			<table border="1px" width="30%">
				<tr>
					<td colspan="10" height="40px"><b>新增评分</b></td>
				</tr>
				
				<tr>
					<td valign="top" width="30%">项目名称</td>
				
					<td width="50%">
						<c:forEach items="${plist }" var="p">
							<input type="radio" name="projectname" value="${p.projectid}">${p.projectname}<br>
						</c:forEach>
					</td>
					
				</tr>
				
				<tr>
					<td>文档</td>
					<td><input type="text" name="document"></td>
				</tr>
				
				<tr>
					<td>代码设计</td>
					<td><input type="text" name="code"></td>
				</tr>
				
				<tr>
					<td>UI界面</td>
					<td><input type="text" name="ui"></td>
				</tr>
				
				<tr>
					<td>项目演讲</td>
					<td><input type="text" name="speech"></td>
				</tr>
				
				<tr height="60px">
					<td></td>
					<td align="right"><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
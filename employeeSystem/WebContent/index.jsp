<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
		<center>
			<h4>员工管理系统</h4><br>
			<form action="addEmployee" method="post">
				<table border="1px" width="50%">
					<tr style="background:red">
						<th>编号</th>
						<th>名称</th>
						<th>年龄</th>
						<th>性别</th>
						<th>Email</th>
					</tr>
					
				<c:forEach items="${elist}" var="employee" varStatus="s">
					<%-- <c:if test="${s.count%2==0 }">
						<tr style="background:blue">
					</c:if>
					<c:if test="${s.count%2!=0}">
						<tr>
					</c:if>	 --%>
					<c:if test="${s.index%2==0 }">
						<tr style="background:gray">
					</c:if>		
					<c:if test="${s.index%2!=0 }">
					<tr>
					</c:if>		
						<td>${employee.eid }</td>
						<td>${employee.ename }</td>
						<td>${employee.eage }</td>
						<td>${employee.esex }</td>
						<td>${employee.eemail }</td>
				</c:forEach>
				<tr>
					<td colspan="10">
					<center><a href="addEmployee.jsp">继续添加员工</a></center>
					</td>
				</tr>
				</table>
			</form>
		</center>
</body>
</html>
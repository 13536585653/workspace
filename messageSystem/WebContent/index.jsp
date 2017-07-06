<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消息管理系统</title>
	<script type="text/javascript">
		
		function check(){
			var checked=false;
			var ids=document.getElementsByName("cb");
			//ids.length是复选框的个数（长度）
			for(var i=0;i<ids.length;i++){
				//如果复选框被选上，则返回true;
				if(ids[i].checked){
					checked= true;
				}
			}
			//如果复选框不选上
			if(!checked){
				alert("你没有选择相关数据行！");
				return false;
			}else{
				 if(window.confirm("是否真的要删除？")){
				}else{
					return false;
				} 
				/*alert("是否真的要删除？")*/
			}
		}
		
		function loadCheck(){
			if("${msg}"==""){
				alret(" ");
			}else{
				alert("${msg}");
			}
		}
		
		function over(p){
			var color=document.getElementById(p);
			color.setAttribute("style","background-color:gray");
		}
		function out(p){
			var color=document.getElementById(p);
			color.setAttribute("style","background-color:#fff}");
		}
	</script>
</head>
<body onload="loadCheck()">
	<center>
		<h1>消息内容管理</h1><br>
		<form action="removeMessage" method="post">
			<table border="1px" width="55%">
				<tr style="background:blue">
					<th>选择</th>
					<th>编号</th>
					<th>内容</th>
					<th>发布日期</th>
				</tr>
			<c:forEach items="${mlist }" var="message" varStatus="i">
				
					<tr id="${message.mid }" onmouseover="over(${message.mid})" onmouseout="out(${message.mid})">
					<td><input type="checkbox" name="cb" value="${message.mid }"></td>
					<td>${message.mid }</td>
					<td>${message.mcontent }</td>
					<td>${message.publish }</td>
				</tr>
				
			</c:forEach>
				<tr align="right" height="70px">
					<td colspan="10"><input type="submit" value="删除所选择的行" onclick="return check()"></td>
				</tr>
			</table>	
		</form>
	</center>
</body>
</html>
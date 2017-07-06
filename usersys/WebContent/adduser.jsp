<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	if("${msg}" != ""){
		  if("${msg}" == "添加成功"){
		     alert("${msg}");
		     //请求servlet，查询所有用户
		     location.href="findAllUserServlet";
		  }else {
			 alert("${msg}"); 
		  }   
	}
	
</script>
</head>
<body onload="check()">
<center>
<form action="adduserServlet" mothod="post" name="f1">
UserName:<input type="text" name="u_name"><br/><br/>
Password:<input type="password" name="u_password"><br><br>
Age&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:<input type="text" name="u_age"><br/><br/>
Address:<input type="text" name="u_address"><br/><br/>
<input type="submit" value="添加">
</form>
</center>
</body >
</html>
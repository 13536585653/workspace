<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
#head{
 width: 100%;
 height: 100px;
 border: 1px solid;
}
#left{
 width: 20%;
 height: 600px;
 border: 1px solid;
 margin: 5px;
 float: left;
 text-align: center;

}

#right{
 width: 78%;
 height: 600px;
 border: 1px solid;
 margin: 5px;
 float: left;
 text-align: center;

}

</style>
<body>
<div id="head">
<h2>欢迎${admin_name},投票系统的后台</h2>
</div>


<div id="left">
  <h4>管理菜单</h4>
  <p><a href="addVote.html" target="frame">添加投票主题</a>
  <p><a href="listVote" target="frame">管理投票主题</a>

</div>


<div id="right">
   <iframe name="frame"  src="welcome.html"  style="width: 100%;height: 100%; border: 0px;" />
</div>



</body>
</html>
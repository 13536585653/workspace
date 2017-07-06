<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DOM对象和jQuery对象的相互转换</title>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
		//jQuery对象转成DOM对象
		var $id=$("id");
		var id=$id[0];
		//var id=$id.get(0);
		alert("id.innerHTML");
		//DOM对象转成jQuery对象
		var id=document.getElementById("id");
		var $id=$(id);
	</script>
</head>
<body>
	<div id="id">
		我是旺仔！
	</div>
</body>
</html>
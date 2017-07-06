<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>显示投票结果</h2>
<p>足球:${resultMap["足球"]}票
<p>篮球:${resultMap["篮球"]}票
<p>排球:${resultMap["排球"]}票
<p>羽毛球:${resultMap["羽毛球"]}票
<p>网球:${resultMap["网球"]}票
<p>乒乓球:${resultMap["乒乓球"]}票
<p><a href="vote.html">继续投票</a>
</body>
</html>
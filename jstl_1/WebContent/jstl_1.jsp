<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>核心标签库案列</h2>
<%
	List<String>list=new ArrayList<String>();
	list.add("aa");
	list.add("bb");
	list.add("cc");
	request.setAttribute("list", list);
	
	Map<String,Integer>map=new HashMap<String,Integer>();
	map.put("aaaa", 10);
	map.put("bbbb",20);
	map.put("cccc",30);
	map.put("dddd",40);
	
	session.setAttribute("map", map);
%>

<p>c:foreach标签输出list
<c:forEach items="${list} " var="item" varStatus="i">
<p>${i.count }---${item}
</c:forEach>

<p>c:foreach标签输出map
<c:forEach items="${map }" var="item" varStatus="i">
<p>${i.count }---${item.key}---${item.value}
</c:forEach>

<p>c:forTokens标签，分割
<c:forTokens items="aa,bb-cc;dd。ee" delims=",-;。" var="item">
<p>${item}
</c:forTokens>
</body>
</html>
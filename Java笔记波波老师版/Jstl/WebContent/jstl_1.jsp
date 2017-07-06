<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>核心标签库案例</h2>
<%
     
       List<String> list=new ArrayList<String>();
       list.add("aa");
       list.add("bb");
       list.add("cc");
  
       request.setAttribute("list", list);
       
       
       Map<String,Integer> map=new TreeMap<String,Integer>();
       map.put("aaaa", 10);
       map.put("bbbb", 20);
       map.put("cccc", 30);
       map.put("dddd", 40);
       
       session.setAttribute("map", map);
    
%>

<c:out value="xxxx"></c:out>
<c:set value="李四" var="name" scope="session"></c:set>
<p>${name}
<p>c:if标签
 <c:if test="${ 3>2 }">
   hello
 </c:if>

<p>c:choose -when -otherwise 标签 
 <p>
  <c:choose>
     <c:when test="${name=='张三'}">
              吃饭 
     </c:when>
     <c:when test="${name=='李四'}">
           睡觉 
     </c:when>
     <c:when test="${name=='王五'}">
          打豆豆    
     </c:when>
     <c:otherwise>
           运动                                 
     </c:otherwise>
  </c:choose>

<p>c:foreach 标签输出list
<c:forEach items="${list}" var="item" varStatus="i">
    <p>${i.count}------${item}
</c:forEach>

<p>c:foreach 标签输出map
<c:forEach items="${map}" var="item" varStatus="i">
    <p>${i.count}------${item.key} -----${item.value}
</c:forEach>

<p>c:forTokens标签 ，分割
<c:forTokens items="aa,bb-cc&dd" delims=",-&" var="item">
 <p>${item}
</c:forTokens>





</body>
</html>
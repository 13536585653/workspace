<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page  import="java.util.List" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  
  <% 
  
     String name=(String)request.getSession().getAttribute("username");
      if(name!=null){
  %>
   <h2>欢迎<%=name%></h2>
  <%
      }
  %>  
 <h2>xxx主页</h2>
 
 <%
     //从ctx取出list
     List<String> list=(List<String>)request.getServletContext().getAttribute("list");
 %>
 
 <table border="1px"> 
   <tr><td>标题</td></tr>
   
   <%
       for(int i=0;i<list.size();i++){
   %>
      
       <tr><td><%=list.get(i) %></td></tr>
       
   <% 	  
       }
   %>
 </table>
 
 <a href="aaa.jsp">页面2</a>
</body>
</html>
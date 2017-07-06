<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  


<%@ attribute name="list" type="java.util.List" required="true" %>
<%@ attribute name="value" type="java.lang.String" required="true" %>
<%@ attribute name="name" type="java.lang.String" required="true"%>

<c:forEach items="${list}" var="item">
  <c:choose>
    <c:when test="${fn:contains(value,item)}">
       <input type="checkbox" name="${name}" value="${item}" checked="checked">${item} 
     </c:when>
     <c:otherwise>
        <input type="checkbox" name="${name}" value="${item}">${item}  
     </c:otherwise>
  </c:choose>
</c:forEach>
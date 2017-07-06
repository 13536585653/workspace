<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ attribute name="list" type="java.util.List" required="true" %>
<%@ attribute name="value" type="java.lang.String" required="true" %>
<%@ attribute name="name" type="java.lang.String" required="true"%>
<c:forEach items="${list}" var="item">
  <c:choose>
	<c:when test="${item==value}">
		<input type="radio" name="${name}" checked="checked" value="${item}">${item}
	</c:when>
	<c:otherwise>
		<input type="radio" name="${name}" value="${item}">${item}
	</c:otherwise>
   </c:choose>
</c:forEach>
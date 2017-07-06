<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  


<%@ attribute name="map" type="java.util.Map" required="true" %>
<%@ attribute name="value" type="java.lang.String" required="true" %>
<%@ attribute name="name" type="java.lang.String" required="true"%>

<select name="${name}">
  <c:forEach items="${map}" var="item">
     <c:choose>
      <c:when test="${item.value==value || item.key==value}">
        <option value="${item.key}" selected='true'>${item.value}</option>
      </c:when>
      <c:otherwise>
       <option value="${item.key}" >${item.value}</option>
      </c:otherwise>
  </c:choose>
  </c:forEach>
 
</select>
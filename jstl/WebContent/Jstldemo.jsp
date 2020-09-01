<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>    


    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"content="text/html";charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%-- <c:forEach var="i" begin="1" end="10">
<c:out  value="${i}"/> <br>
</c:forEach> --%>

names from servlet are as follows
<c:set var="i" value="0"/>
<c:forTokens items="${playerNames}" delims="," var="name">
 <c:out  value="${i=i+1}"/>
 <c:out value="${name}"/> <br>
</c:forTokens>
<c:choose>

<c:when test="${(fn:containsIgnoreCase('this is java','JAVA;))}">
Yes the string is present
</c:when>
<c:otherwise>
no
</c:otherwise>
</c:choose>

<br>
<c:set var="age" value="10.555"/>
<fmt:parseNumber var="x" integerOnly="true" type="number" value="${age}">
<c:out value="${age }"></c:out>
<br>

after convert

<br>
<c:out value="${x}"></c:out>
<br>

<br>
<c:set var="string1" value="ashok kumar"> </c:set>
<c:out value="${fn:substringAfter(string1,'mani') }"></c:out>
<br>

<c:choose>
<c:when test="${(fn:startsWith(string1,'my')) }">Good</c:when>
<c:otherwise>great</c:otherwise>
</c:choose>
<fmt:parseNumber var="p" type="number" integerOnly="false" value="${age}"/></p>
<c:out value="${fn:substring(p,0,4)}"></c:out>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String username = "test";
	session.setAttribute("username", "session");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="${sessionScope.username}" default="default"/>
<c:out value="${requestScope.info}" default="default"/>
<c:out value="${pageScope.username}" default="default"/>
</br>
<c:if test="${4>3}" var="flag" scope="page">123</c:if>
<c:out value="${flag}" default="default"/>
<c:out value="${pageScope.flag}" default="default"/>
</body>
</html>
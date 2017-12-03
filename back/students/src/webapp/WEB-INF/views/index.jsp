<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<link rel="stylesheet" href="<spring:url value="/resources/css/main.css" />" />
	<title>Spring Starter Project</title>
</head>
	<p><a href="<c:url value="add" />">New Student</a></p>
	<body>
		<h2 class="title">${title}</h2>
		
		<%-- <ul>
			<c:forEach var="student" items="${students}">
			<li>${student.email}</li>
			</c:forEach>
		</ul> --%>
	</body>
</html>
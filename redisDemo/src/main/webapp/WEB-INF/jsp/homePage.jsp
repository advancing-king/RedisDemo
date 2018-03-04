<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Spitter</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>" />
</head>
<body>
	<h1>Welcome to Spitter</h1>
	
	<a href="<c:url value="/spittle/getSpittles"/>">Spitters</a> |
	<a href="<c:url value="/spitter/register"/>">Register</a>
	
</body>
</html>
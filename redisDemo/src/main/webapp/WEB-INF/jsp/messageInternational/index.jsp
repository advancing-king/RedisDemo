<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>



<h1>
	<s:message code="spitter.welcome"></s:message>
</h1>

<a href="<c:url value="/spittle/getSpittles"/>">Spitters</a> |
<!-- 下面将会被渲染为 <a href="/spittr/spittle/getSpittles">Spitters</a>-->
<a href="<s:url value="/spittle/getSpittles"/>">Spitters</a> |

<!-- 我们还可以使用变量，供模板在稍后使用 -->
<s:url value="/spittle/getSpittles" var="registerUrl" />
<a href="${registerUrl }">Spitters</a>


<s:url value="/spittle/getSpittles" var="registerUrl2" scope="request"></s:url>
</body>
</html>
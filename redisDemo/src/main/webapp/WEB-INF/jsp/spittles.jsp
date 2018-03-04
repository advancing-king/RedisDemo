<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Recent Spittles</h1>
	<c:forEach items="${spittlesList}" var="spittle">
		<li id= "spittle_<c:out value="spittle.id" />" >
			<div class="spittleMessage">
				<c:out value="${spittle.message }"></c:out>
			</div>
			<div >
				<span class="spittleTime">
					<c:out value="${spittle.time }"></c:out>
				</span>
				<span class="spittleLocation">
					(<c:out value="${spittle.latitude }"></c:out>,
					<c:out value="${spittle.longitude }"></c:out>)
				</span>
				
			</div>	
			</li>		
	</c:forEach>
</body>
</html>
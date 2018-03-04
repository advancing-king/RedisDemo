<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>引入spring的jsp库，www.springframework.org/tags/form该库用于渲染html form表单</h1>


<h1>Register Form</h1>
<!-- 没有指定action默认当前url,通过commandName属性构建针对某个模型对象的上下文信息，
在其他的表单绑定标签中，会引用这个模型对象的属性,我们将commandName设置为spitter, 
在controller中，我们将需要有一个key为spitter的对象，否则jsp会报错-->
<sf:form action="" method="post" commandName="spitter">
	<sf:input path="username"/>
	<sf:errors path="username">用户名长度不足或超出指定长度</sf:errors>
	<sf:password path="password"/>
	<sf:input path="name"/>
	<input type="submit" value="注册" />
</sf:form>

</body>
</html>
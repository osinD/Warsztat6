<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

	<form:form method ="post" modelAttribute="user">
		<form:errors path="*"></form:errors>
		<form:label path="name">FirstName</form:label>
		<form:input path="name" id="name"/>
		<form:label path="password">FirstName</form:label>
		<form:password path="password" id="password"/>
		<form:label path="email">Email</form:label>
		<form:input type="email" path="email" id="email"/>
		<input type="submit">Wyslij</input>
		
	</form:form>

</body>
</html>
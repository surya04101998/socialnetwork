<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
<center>
<h1>Coders Cafe</h1>

Sign-Up
<form:form action="signup" method="GET" modelAttribute="currentUser">


UserName<form:input path="username" type="text" id="username" name="username" />
		<br>
Password<form:input path="password" type="password" name="password" id="password"/>
		<br>

<input type="submit" value="signin" name="submit" id="submit" />
<input type="reset" value="Clear" name="Clear" id="Clear" />
</form:form>
</center>
</body>
</html>
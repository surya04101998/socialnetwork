<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body bgcolor="edcba">

	<div style="height: 50px; border =50px; background-color:"></div>


	<form:form action="success" method="post" modelAttribute="signup">

Enter UserName: <form:input path="name" />
		<br>
		<br>
Enter Password: <form:input type="password" path="password" />
		<br>
		<br>
		
Enter E-Mail: <form:input type="email" path="emailid" />
		<br>
		<br>

		

		<input type="submit" value="Sign Up" />
	</form:form>

	

</body>
</html>
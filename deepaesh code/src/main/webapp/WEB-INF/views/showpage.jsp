<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>





<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<body style="background-color: lavender">
	<br />
	<br />
	<br />
	<div style="display: flex; justify-content: space-between;">
		<span>DEEPASH </span> <span>Logged in as Mentor</span>
	</div>

	<%
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prosact", "root", "root");
		String sql = "select * from project";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
	%>

	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<center>
	<table style="border:2px solid;padding: 10px">
	<caption>DETAILS</caption>
		<tr>
			<th>description</th>
			<th>mentor</th>
			<th>techies</th>
		</tr>
		<%
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><a href="">ADD</a></td>
			<td><a href="">EDIT</a></td>
		</tr>

		<%
			}
		%>
	</table>

</center>
</body>

</html>
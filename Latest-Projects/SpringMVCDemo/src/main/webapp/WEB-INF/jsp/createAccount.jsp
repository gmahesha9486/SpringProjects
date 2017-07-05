<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		 <h1>Enter account details</h1>
		 
		 <form:form commandName="aNewAccount" method="POST" action="doCreate">
		 		<table>
		 			<tr><td>First name: <form:input path="firstName" type="text" name="firstname"/></td></tr>
		 			<tr><td>Last name: <form:input path="lastName" type="text" name="lastname"/></td></tr>
		 			<tr><td>Address: <form:input path="address" type="text" name="address"/></td></tr>
		 			<tr><td>Email: <form:input path="email" type="text" name="email"/></td></tr>
		 			<tr><td><input type="submit" value="create"/></td></tr>
		 			
		 		</table>
		 
		 </form:form>

</body>
</html>
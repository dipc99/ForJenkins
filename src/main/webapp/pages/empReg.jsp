<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
<h1>Employee Form</h1>
<form action="saveEmployee" method="post">
<table>

<tr>
	<td>Employee Name</td>
	<td><input type="text" name="employeeName"></td>
</tr>

<tr>
	<td>EmpoyeeAddr</td>
	<td><input type="text" name="employeeAddr"></td>
</tr>

<tr>
	<td>EmpoyeeEmail</td>
	<td><input type="text" name="employeeEmail"></td>
</tr>


<tr>
<td><input type="submit" value="Register"></td>
</tr>

</table>
</form>
</body>
</html>
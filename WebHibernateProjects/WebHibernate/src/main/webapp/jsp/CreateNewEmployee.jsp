<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CreateEmployeeServlet" method="post">
		<pre>
		Enter Employee Id : 
		<input type="text" name="Id">
		Enter Employee Name : 
		<input type="text" name="Name">
		Enter Employee Email : 
		<input type="text" name="Email">
		Enter Employee salary : 
		<input type="text" name="salary">
		<button type="submit" value="submit">Create</button>
		</pre>
	</form>
</body>
</html>
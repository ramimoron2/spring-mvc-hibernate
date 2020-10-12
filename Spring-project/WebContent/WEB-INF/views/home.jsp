<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world!</h1>
	<p>${welcomeText}</p>
    
	<P>The time on the server is ${serverTime}. </p>

	<form action="showdata" method="get">
		<input type="submit" value="Click here to see the data">
	</form>


	<form action="user" method="post">
		<input type="text" name="userName"><br> <input
			type="submit" value="Login">
	</form>
	
	<form action="insertEmployee" method="post">
	<p>Emplaoyee Number</p>	<input type="text" name="EMPNO"><br> 
	<p>Emplaoyee Name</p>	<input type="text" name="ENAME"><br> 
	<p>Job</p>	            <input type="text" name="JOB"><br> 
	<p>Manager</p>	        <input type="text" name="MGR"><br> 
	<p>HireDate</p>	        <input type="text" name="HIREDATE"><br> 
	<p>Salary</p>		    <input type="text" name="SAL"><br> 
	<p>Commision</p>		<input type="text" name="COMM"><br> 
	<p>Department Number</p><input type="text" name="DEPTNO"><br> 
		<input type="submit" value="Insert Employees">
	</form>
	
	
</body>
<
</html>
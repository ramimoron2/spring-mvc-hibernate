<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>

<body>
  <h3>Hi ${userName}</h3>
 
  
  <c:if test="${!empty allemployees}">
	<table class="tg">
	<tr>
		<th width="80">Empno</th>
		<th width="120">Ename</th>
		<th width="120">Job</th>
		<th width="60">Mgr</th>
		<th width="60">Hiredate</th>
		<th width="60">Sal</th>
		<th width="60">Comm</th>
		<th width="60">Deptno</th>
	</tr>
	<c:forEach items="${allemployees}" var="person">
		<tr>
			<td>${person.EMPNO}</td>
			<td>${person.ENAME}</td>
			<td>${person.JOB}</td>
			<td>${person.MGR}</td>
			<td>${person.HIREDATE}</td>
			<td>${person.SAL}</td>
			<td>${person.COMM}</td>
			<td>${person.DEPTNO}</td>
			
		</tr>
	</c:forEach>
	</table>
</c:if>


</body>
</html>
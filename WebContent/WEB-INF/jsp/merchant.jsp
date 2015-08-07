<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Merchant Login</title>
</head>
<body>
Logged in as: <sec:authentication property="name"/><sec:authentication property="authorities"/>

	<form:form action="merchant.do" method="POST" commandName="merchant">

		<table>
		
			
			<tr>
				<td>Merchant Name</td>
				<td><form:input path="merchantName" /></td>
			</tr>

			<tr>
				<td>Merchant Address</td>
				<td><form:input path="merchantAddress" /></td>
			</tr>
			<tr>
				<td>Created Date</td>
				<td><form:input path="created_date" /></td>
			
				
		</table>
		
			<input type="submit" value="add" />
	
		
	</form:form>
	
<br>
		<a href="<c:url value='/just' />"> see the list </a>
		<br>
 <a href="logout">Logout</a>
<br>

</body>
</html>
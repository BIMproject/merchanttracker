<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserList</title>
</head>
<body>
List of Users 

<table>


		<tr>
			<th>ID</th>
			<th>UserName</th>
			<th>Position</th>
			<th>Password</th>
			<th>Created Date</th>
			<th>Email</th>
			<th >Edit</th>
            <th >Delete</th>
		</tr>
		<c:forEach items="${userList}" var="user">

			<tr>
				<td>${user.user_id }</td>
				<td>${user.username }</td>
				<td>${user.position }</td>
				<td>${user.password }</td>
				<td>${user.created_date }</td>
				<td>${user.email }</td>
				<td><a href="<c:url value='/edit/${user.user_id}' />">Edit</a></td>
				<td><a href="<c:url value='/delete/${user.user_id}'/>">Delete</a></td>
				
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>
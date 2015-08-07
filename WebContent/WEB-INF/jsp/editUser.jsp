<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${user.user_id }"  method="POST" commandName="user">
	
    
    
    
		<table>
			
			<tr>
				<td>User Name</td>
				<td><form:input path="username" /></td>
				<form:errors path="username" ></form:errors>
			</tr>
		
			<tr>
				<td> Position</td>
				<td><form:input path="position" /></td>
				<form:errors path="position" ></form:errors>
			</tr>
			<tr>
				<td> Password</td>
				<td><form:input type="password" path="password" /></td>
				<form:errors path="position" ></form:errors>
			</tr>
			<tr>
				<td>Created Date </td>
				<td><form:input  path="created_date"/></td>
				<form:errors path="created_date" ></form:errors>
			
			<tr>
			<tr>
				<td>Email</td>
				<td><form:input  path="email"/></td>
				<form:errors path="email" ></form:errors>
			
			<tr>
			
        <td colspan="2">
          
                <input type="submit" name="action"
                    value="<spring:message text="Edit User"/>" />
           
        </td>
    </tr>
		</table>
		</form:form>
</body>
</html>
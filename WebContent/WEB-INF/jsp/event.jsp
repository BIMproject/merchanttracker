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
<c:url var="addAction" value="event.do" ></c:url>
	<form:form action="${addAction}" commandName="event">
	
    
    
    
		<table>
			
			<tr>
				<td>Created Date</td>
				<td><form:input path="date" /></td>
				<form:errors path="date" ></form:errors>
			</tr>
			<tr>
				<td> Location</td>
				<td><form:input  path="location" /></td>
				<form:errors path="location" ></form:errors>
			</tr>
		
			<tr>
				<td> Purpose</td>
				<td><form:input path="purpose" /></td>
				<form:errors path="purpose" ></form:errors>
			</tr>
			
			<tr>
				<td>Conclusion </td>
				<td><form:input  path="conclusion"/></td>
				<form:errors path="conclusion" ></form:errors>
			
			<tr>
			
			

        <td colspan="2">
          
                <input type="submit" name="action"
                    value="<spring:message text="Add Event"/>" />
           
        </td>
    </tr>
		</table>
		</form:form>
</body>
</html>
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

	<form:form action="Service.do" method="POST" commandName="Service">

		<table>
		
			<tr>
				<td>Service Name</td>
				<td><form:input path="ServiceName" /></td>
			</tr>

			
		</table>
		
			<input type="submit" value="add" />
	
		
	</form:form>
	
<br>
		<a href="<c:url value='/just2' />"> see the list </a>

</body>
</html>
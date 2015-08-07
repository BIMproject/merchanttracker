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
<table border=10>


		<tr>
			<th>ID</th>
			<th>Service Name</th>
	
		</tr>

		<c:forEach items="${ServiceList}" var="Services">

			<tr>
				<td>${Services.ID }</td>
				<td>${Services.ServiceName }</td>
				
				<td><a href="<c:url value='/1stedit/${Services.ID}' />">Edit</a></td>
				<td><a href="<c:url value='/deleted/${Services.ID}'/>">Delete</a></td>

			</tr>

		</c:forEach>


	</table>

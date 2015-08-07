<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event List</title>
</head>
<body>
<body>
List of Events 

<table>


		<tr>
			<th>ID</th>
			<th>Created Date</th>
			<th>Location</th>
			<th>Purpose</th>
			<th>Conclusion</th>
			
			<th >Edit</th>
            <th >Delete</th>
		</tr>
		<c:forEach items="${eventList}" var="event">

			<tr>
				<td>${event.event_id }</td>
				<td>${event.date }</td>
				<td>${event.location }</td>
				<td>${event.purpose }</td>
				<td>${event.conclusion }</td>
			
				<td><a href="<c:url value='/edit/${event.event_id}' />">Edit</a></td>
				<td><a href="<c:url value='/delete/${event.event_id}'/>">Delete</a></td>
				
			</tr>
		</c:forEach>
	</table>
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The list of Merchants</title>
</head>
<body>
	<table border=10>


		<tr>
			<th>id</th>
			<th>merchant Name</th>
			<th>Merchant Adderss</th>
			
			<th>Created Date</th>
		</tr>

		<c:forEach items="${merchantList}" var="merchants">

			<tr>
				<td>${merchants.merchant_id }</td>
				<td>${merchants.merchantName }</td>
				<td>${merchants.merchantAddress }</td>
				
				<td>${merchants.created_date }</td>
				<td><a href="<c:url value='/update/${merchants.merchant_id}' />">Edit</a></td>
				<td><a href="<c:url value='/remove/${merchants.merchant_id}'/>">Delete</a></td>

			</tr>

		</c:forEach>


	</table>

</body>
</html>
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

	<form:form action="${merchant.merchant_id}" method="POST" commandName="merchant">

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
				<td>Created Date{(dd-MM-yyyy)format}
			
				
		</table>
		
			<input type="submit" value="Edit" />
	
		
	</form:form>
	
</body>
</html>
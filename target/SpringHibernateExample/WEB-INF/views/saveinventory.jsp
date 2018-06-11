<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Inventory Form</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Inventory Form Form</h2>
 
	<form:form method="POST" modelAttribute="saveinventory">
		<%-- <form:input type="hidden" path="id" id="id"/> --%>
		<table>
			<tr>
				<td><label for="fromInventory">From Inventory: </label> </td>
				<td><form:input path="fromInventory" id="fromInventory"/></td>
				<td><form:errors path="fromInventory" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="toInventory">To Inventory: </label> </td>
				<td><form:input path="toInventory" id="toInventory"/></td>
				<td><form:errors path="toInventory" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="itemCode">Item Code: </label> </td>
				<td><form:input path="itemCode" id="itemCode"/></td>
				<td><form:errors path="itemCode" cssClass="error"/></td>
		    </tr>
	
			<%-- <tr>
				<td><label for="ssn">SSN: </label> </td>
				<td><form:input path="ssn" id="ssn"/></td>
				<td><form:errors path="ssn" cssClass="error"/></td>
		    </tr> --%>
	
			<tr>
				<td colspan="3">
					
							<input type="submit" value="Save"/>
						
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/list' />">List of All Employees</a>
</body>
</html>
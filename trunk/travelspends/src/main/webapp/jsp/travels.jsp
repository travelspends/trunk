<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

</head>
<body>
	<h2>Travels Manager</h2>
	<form:form method="post" action="add.html" commandName="travel">
		<table>
			<tr>
				<td><form:label path="From">
						<spring:message code="label.from" />
					</form:label></td>
				<td><form:input path="from" /></td>
			</tr>
			<tr>
				<td><form:label path="To">
						<spring:message code="label.to" />
					</form:label></td>
				<td><form:input path="to" /></td>
			</tr>
			<tr>
				<td><form:label path="TravelDate">
						<spring:message code="label.travelDate" />
					</form:label></td>
				<td><form:input path="travelDate" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message code="label.addTravel"/>" /></td>
			</tr>
		</table>
	</form:form>
	<h3>Contacts</h3>
	<c:if test="${!empty travelsList}">
		<table class="data">
			<tr>
				<th>From</th>
				<th>To</th>
				<th>Travel Date</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${travelsList}" var="travel">
				<tr>
					<td>${travel.from}</td>
					<td>${travel.to}</td>
					<td>${travel.travelDate}</td>
					
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<h2> update lead here</h2>
<form action="updatelead" method="post">

id<input type="text" name="id"   value ="${lead.id}"/>
firstName<input type="text" name="firstName"   value ="${lead.firstName}"/>
lastName<input type="text" name="lastName"value ="${lead.lastName}"/>
mobile<input type="text" name="mobile"  value ="${lead.mobile}"/>
<input type = "submit"  value ="update"/>

</form>
"${msg}"
</body>
</html>
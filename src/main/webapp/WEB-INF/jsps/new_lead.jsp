<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> save lead here</h2>
<form action="savelead" method="post">
firstName<input type="text" name="firstName"/>
lastName<input type="text" name="lastName"/>
mobile<input type="text" name="mobile"/>
<input type = "submit"  value ="save"/>

</form>
${msg }
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
</head>
<body>
  news successfully posted........
  <p><b> <a href="<c:url value="http://localhost:8080/newsportal/submit${object.argument}" />" >click here.</a> to post the news again.</b></p>
  
</body>
</html>
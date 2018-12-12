<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p><b>Redirect to homepage =============></b>
<b> <a href="<c:url value="homepage${object.argument}" />" >click here.</a> </b></p>
</body>
</html>

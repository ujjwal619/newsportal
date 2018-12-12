<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
		<form method = "post" action="http://localhost:8080/newsportal/login/create">
			<input type = "text" id="unname" name="uname">
			<input type = "text" id="pwd" name="pwd">
			<input type = "submit" value = "Signup">
		
		</form>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>

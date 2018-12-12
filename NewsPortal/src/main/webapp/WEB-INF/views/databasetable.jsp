<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.util.List" %>
<%@ page import = "com.ujjwal.newsportal.model.News" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<table>
		<tr>
			<th>id</th>
			<th>title</th>
		</tr>
		<% List<News> newsList = (List<News>)request.getAttribute("news"); %>
		<% for (int i= 0; i < newsList.size(); i ++ ) { %>
			<tr>
				<td> <%= i %> </td>
				<td> <%= newsList.get(i).getDescription()%>
			</tr>
		<%} %>
	</table>  
</body>
</html>
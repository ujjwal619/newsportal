<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page import="java.util.List"%>
<%@ page import="com.ujjwal.newsportal.model.News"%>

<html>
<head>
<title>Home</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<h1>NEWS From Database Directly.</h1>
	<table class="table">
		<thead class="table-dark">
			<tr>
				<th scope="col">S.N.</th>
				<th scope="col">ID</th>
				<th scope="col">Title</th>
				<th scope="col">Description</th>
				<th scope="col">Image</th>
			</tr>
		</thead>
		<tbody>
			    <%List<News> newsList = (List<News>) request.getAttribute("news"); %>
				<%for (int i = 0; i < newsList.size(); i++) {%>
			<tr>
				<td><%=i%></td>
				<td><%=newsList.get(i).getId()%></td>
				<td><%=newsList.get(i).getNewtitle()%></td>
				<td><%=newsList.get(i).getDescription()%></td>
				<td><%=newsList.get(i).getImg()%></td>
			</tr>
			<%} 	%>
			
		</tbody>
	</table>
</body>
</html>
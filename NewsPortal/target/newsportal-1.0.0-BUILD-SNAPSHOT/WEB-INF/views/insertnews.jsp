<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

	<script type="text/javascript">

	$(document).ready(function() {
		$("p").click(function() {
			$(this).hide();
		});
	});
</script>
<meta charset="ISO-8859-1">
<title>Insert news</title>


</head>

<body>
	<form method="post" action="http://localhost:8080/newsportal/insert">
		<div class="mx-auto" style="width: 300px;">
			<h1>Insert News</h1>
		</div>

		<div class="form-group">
			<div class="row">
				<div class="col">
					<input type="text" id="firstname" class="form-control"
						placeholder="First name">
				</div>
				<div class="col">
					<input type="text" id="lastname" class="form-control"
						placeholder="Last name">
				</div>
			</div>
			<label for="title">News title</label> <input type="text"
				id="newstitle" placeholder="News title" required=true
				class="form-control">

			<div class="form-group">
				<label for="exampleFormControlTextarea1">News Content</label>
				<textarea class="form-control" id="insertnewsTextarea" rows="3"></textarea>
			</div>
			<label for="title">Publish Date</label> <input type="Date"
				id="publishdate" placeholder="Dates" required=true
				class="form-control">

		</div>
		<input type="submit" class="btn btn-success" value="Submit Post">

	</form>
	<p>test</p>
</body>
</html>
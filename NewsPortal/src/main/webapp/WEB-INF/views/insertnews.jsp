<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

    <link href="https://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://getbootstrap.com/docs/4.1/examples/floating-labels/floating-labels.css"rel="stylesheet">
<link href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert news</title>
</head>

<body class="text-center">
	<form class="form-signin" method="post" action="http://localhost:8080/newsportal/news/submit">
		<div class="text-center mb-4" style="width: 300px;">
			<h1>Insert News</h1>
		</div>

		<div class="form-label-group">
			<div class="row">
				<div class="col">
					<label for="title">First Name</label> <input type="text" name="firstname" class="form-control"
						placeholder="First name">
				</div>
				<div class="col">
					<label for="title">Last Name</label> <input type="text" name="lastname" class="form-control"
						placeholder="Last name">
				</div>
			</div>
			<div>
				<label for="title">News title</label> <input type="text"
					name="newstitle" placeholder="News title" required=true
					class="form-control">
			</div>


			<div class="form-group">
				<label for="exampleFormControlTextarea1">News Content</label>
				<textarea class="form-control" name="insertnewsTextarea"
					placeholder="Post News Content here....." rows="3"></textarea>
			</div>
			<div>
				<label for="title">Publish Date</label> <input type="Date"
					name="publishdate" placeholder="Dates" required=true
					class="form-control">
			</div>


		</div>
		<input type="submit" class="btn btn-success" value="Submit Post">

	</form>
</body>
</html>
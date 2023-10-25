<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<!-- bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
body {
background-color: #343a40;
 }
      .container {
        margin-top: 100px;
        background-color: #28a745;
        border-radius: 5px;
        padding: 30px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
 }
h1 {
 text-align: left;
}
 .form-group {
margin-bottom: 40px;
   }
        label {
        font-weight: bold;
    }
    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }
    .btn {
        width: 100%;
    }
</style>
</head>
<body>
<div class="container">
<h1>Login Page</h1>
<form action="login" method="post">
<div class="form-group">
<label for="name">Name:</label>
<input type="text" class="form-control" id="name" name="name"/>
</div>
<div class="form-group">
<label for="pass">Password:</label>
<input type="password" class="form-control" id="pass" name="pass"/>
</div>
<button type="submit" class="btn btn-primary" name="submit">Login</button>
</form>
</div>
</body>
</html>
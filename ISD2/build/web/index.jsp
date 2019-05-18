<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="uts.isd.controller.*"%>
<!doctype html>
<html>
<head>
<title>Online Movie Store</title>

<meta charset="utf-8" />
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
</head>

<link rel="stylesheet" type="text/css" href="bootstrap.css" media="screen" />
<style>
		.form-control {
  display: block;
  width: 100%;
  max-width: 330px;
  margin: auto;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  line-height: 1.5;
  color: #495057;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid #ced4da;
  border-radius: 0.25rem;
  transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}



	body{
		background: #c9daf2;
	}

</style>

<body>

<main role="main">

  <section class="jumbotron text-center">
    <div class="container">
      <img class="mb-4" src="cinema.png" alt="" width="100" height="100">
      <h1 class="jumbotron-heading">Online Movie Store</h1>
      <p class="lead text-muted">Hub for movie lovers! Buy and watch a vast range of movies that is constantly updated. View the library or register an account now!</p>
      <p>
        <a href="login.html" class="btn btn-primary my-2">Login</a>
        <a href="https://zmnewk.github.io/database.html" class="btn btn-secondary my-2">View Library</a>
      </p>
    </div>

  </main>

</section>

<section class="text-center">
  <br />
<div>
<h1 class="jumbotron-heading">Create an Account</h1>
<form>
<div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <label for="exampleInputPassword1">Gender</label>
  <br />
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="Female">
  <label class="form-check-label" for="inlineRadio1">Female</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="Male">
  <label class="form-check-label" for="inlineRadio2">Male</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="Other">
  <label class="form-check-label" for="inlineRadio1">Other</label>
</div>
<br /><br />
  <a location.href = 'database.jsp' class="btn btn-secondary my-2">Submit</a>

</form>

</div>

</section>

<br /><br />
<!-- The core Firebase JS SDK is always required and must be listed first -->
<script src="https://www.gstatic.com/firebasejs/5.11.1/firebase-app.js"></script>

<!-- TODO: Add SDKs for Firebase products that you want to use
     https://firebase.google.com/docs/web/setup#config-web-app -->

<script>
  // Your web app's Firebase configuration
  var firebaseConfig = {
    apiKey: "AIzaSyCWHXERezjawFL3qiQZU-lYdSLQYtwR9J4",
    authDomain: "isd-project-2.firebaseapp.com",
    databaseURL: "https://isd-project-2.firebaseio.com",
    projectId: "isd-project-2",
    storageBucket: "isd-project-2.appspot.com",
    messagingSenderId: "192291480470",
    appId: "1:192291480470:web:c67c6e624c404199"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);
</script>
</body>
</html>

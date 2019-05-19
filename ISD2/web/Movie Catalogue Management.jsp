<%-- 
    Document   : Movie Catalogue Management
    Created on : 19/05/2019, 11:46:47 PM
    Author     : richa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Movie Catalogue</title>

        <meta charset="utf-8" />
        <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
    </head>

<link rel="stylesheet" type="text/css" href="bootstrap.css" media="screen" />

<style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }
      

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="login.css" rel="stylesheet">

<body class="text-center">
    <form class="form-signin">
  <img class="mb-4" src="cinema.png" alt="" width="75" height="75">
  
  
  <h1 class="h3 mb-3 font-weight-normal">Movie Catalogue</h1>
  
  
  <div class="btn">
  <a href="#" data-toggle="popover" title="Popover Header" data-content="Display movies">Add Movie</a>
    </div>
  
  <div class="btn">
  <a href="#" data-toggle="popover" title="Popover Header" data-content="Display movies">Edit Movie</a>
    </div>
  <div class="btn">
  <a href="#" data-toggle="popover" title="Popover Header" data-content="Display movies">Remove Movie</a>
    </div>
  <div class="btn">
  <a href="#" data-toggle="popover" title="Popover Header" data-content="Display movies">List Movies</a>
    </div>
  
<script>
$(document).ready(function(){
    $('[data-toggle="popover"]').popover();   
});
</script>
  


</form>
</body>
  <a href="database.jsp" class="btn btn-secondary my-2">Login</a>
  <p class="mt-5 mb-3 text-muted">&copy; 2019</p>

</html>

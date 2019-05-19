<%-- 
    Document   : addUser
    Created on : 19/05/2019, 12:55:34 PM
    Author     : zac_papachatgis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
        <title>User Management</title>
    </head>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand">MovieStore</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link" href="userManagement.jsp">Admin Panel</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" href="addUser.jsp">Add User<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Logout</a>
                </li>
              </ul>
            </div>
          </nav>
        
        <section class="jumbotron text-center">
            <div class="container">
              <img class="mb-4" src="cinema.png" alt="" width="100" height="100">
              <h1 class="jumbotron-heading">Add User</h1>
              <p class="lead text-muted">Here you can add admin and customer users to the system. Note: all fields are required.</p>
            </div>
        </section>
        
        <div class="container">
            <h1>Add User</h1>
            
            <form>
                <div class="form-group">
                  <label for="exampleInputEmail1">First Name</label>
                  <input type="text" class="form-control" id="exampleInputEmail1"placeholder="Enter first name">
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">Last Name</label>
                  <input type="text" class="form-control" id="exampleInputEmail1"] placeholder="Enter last name">
                </div>
                <div class="form-group">
                    <label for="exampleFormControlSelect1">Gender</label>
                    <select class="form-control" id="exampleFormControlSelect1">
                      <option selected disabled>Select</option>
                      <option>Male</option>
                      <option>Female</option>
                      <option>Other</option>
                    </select>
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">Email address</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">Phone</label>
                  <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Enter phone number">
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">Year of Birth</label>
                  <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Enter year of birth">
                </div>
                
                <div class="form-group">
                    <label for="exampleFormControlSelect1">Type of User</label>
                    <select class="form-control" id="exampleFormControlSelect1">
                      <option selected disabled>Select</option>
                      <option>Customer</option>
                      <option>Admin</option>
                    </select>
                </div>
                
                
                
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        
        </div>
        
        
    </body>
</html>

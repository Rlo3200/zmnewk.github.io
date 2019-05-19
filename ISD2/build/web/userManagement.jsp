<%-- 
    Document   : userManagement
    Created on : 19/05/2019, 11:47:31 AM
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
                <li class="nav-item active">
                  <a class="nav-link" href="userManagement.jsp">Admin Panel<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="addUser.jsp">Add User</a>
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
              <h1 class="jumbotron-heading">Admin Panel</h1>
              <p class="lead text-muted">Here you can view, search by full name and phone number, activate/deactivate and delete accounts</p>
            </div>
         </section>
        
        
        <div class="container">
            <h1>User list</h1>
            
            <input class="form-control" type="text" placeholder="Search" aria-label="Search">
            <br />
            
            <table id="tablePreview" class="table table-striped table-sm table-hover">
            <!--Table head-->
              <thead>
                <tr>
                  <th>#</th>
                  <th>First Name</th>
                  <th>Last Name</th>
                  <th>Email</th>
                  <th>Phone</th>
                  <th>Age</th>
                  <th>Admin</th>
                  <th>Status</th>
                  <th>Delete</th>
                </tr>
              </thead>
              <!--Table head-->
              <!--Table body-->
              <tbody>
                <tr>
                  <th scope="row">1</th>
                  <td>Mark</td>
                  <td>Otto</td>
                  <td>mark@mdo.com</td>
                  <td>0463572268</td>
                  <td>45</td>
                  <td>yes</td>
                  <td><button type="button" class="btn btn-secondary btn-sm">Active</button></td>
                  <td><button type="button" class="btn btn-danger btn-sm">Delete</button></td>
                </tr>
                <tr>
                  <th scope="row">2</th>
                  <td>John</td>
                  <td>Smith</td>
                  <td>john@sihe.com</td>
                  <td>0437572287</td>
                  <td>30</td>
                  <td>no</td>
                  <td><button type="button" class="btn btn-secondary btn-sm">Active</button></td>
                  <td><button type="button" class="btn btn-danger btn-sm">Delete</button></td>
                </tr>
                <tr>
                  <th scope="row">3</th>
                  <td>Mark</td>
                  <td>Otto</td>
                  <td>mark@mdo.com</td>
                  <td>0463942245</td>
                  <td>22</td>
                  <td>no</td>
                  <td><button type="button" class="btn btn-secondary btn-sm">Inactive</button></td>
                  <td><button type="button" class="btn btn-danger btn-sm">Delete</button></td>
                </tr>
              </tbody>
              <!--Table body-->
            </table>
            <!--Table-->
        </div>
    </body>
</html>

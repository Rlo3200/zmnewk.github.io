<%@page import="uts.isd.model.dao.*"%>
<%@page import="uts.isd.controller.*"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.isd.model.*" import="java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
   "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Online Movie Store : Payment</title>
<link rel="stylesheet" type="text/css" href="bootstrap3.min.css">
          <script>
          window.onload = function(){
              var numRand = Math.floor(Math.random() * 10000000);
              if (numRand.toString().length == 8)
                  {
                      document.getElementById('output').innerHTML = "Your Order Number is: " + numRand;
                  }
              else
                  {
                      document.getElementById('output').innerHTML = "Your Order Number is: " + (10000000 + numRand);
                  }
              
          }
          
      </script>
</head>
    
     <style type="text/css">
         h3
         {
             text-align: center;
         }
         body
         {
             background: #c9daf2;
         }
        .container
        {
            
            margin-top: 5%;
            height: 500px;
            background-color: aliceblue;
            width:40%;
            margin-left: 30%;
            align-content: center;
        }
        form
        {
            margin: auto;
            align-content: center;
        }
button {
    margin-left: 30%;
    margin-top: 60%;
    width: 40%;
         }
         h1
         {
            text-align: center;
         }
    </style>
    
<body>
  <div class="container">
  <h1>Payment Completed</h1>
      <br>
      
     <h3 id="output"></h3>
             <%
            String CardNumber = request.getParameter("CardNumber");
            
        %>
    <form method="get" action="database.html"><button type="submit">BACK TO MOVIES</button></form>
      <br>
</div>
</body>
</html>

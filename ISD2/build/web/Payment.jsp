<%@page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
   "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Online Movie Store : Payment</title>
<link rel="stylesheet" type="text/css" href="bootstrap3.min.css">
</head>
    
    <style type="text/css">

        button
        {
            margin-top: 10px;
            align-content: center;
        }
        
        input
        {
            margin-top: 10px;
            margin-right: 5px;
        }
                 body
         {
             background: #c9daf2;
         }
        h1
        {
            display: grid;
            text-align: center;
        }
.container
        {
            display: grid;
            margin-top: 5%;
            margin-left:30%;
            height: 500px;
            background-color: aliceblue;
            width:40%;
            align-content: center;
        }
        form
        {
            margin: auto;
        }
    </style>
    
<body>
  <div class="container">
  <h1>Payment</h1>
      <form method="post" action="Payment_C.jsp">
CardNumber: <input type= "text" name="Card Number" value="" minlength="1000000000000000" maxlength="16" required autofocus><br>
CVV: <input type="text" name="CVV" value="" size="3" min= "001" max="999" maxlength="3" required>
Expiry Date: <input  type= "month" name="Expiry" value="" size="8" required><br>
<button type="submit">SUBMIT</button>
</form>
</div>
    
    <script>
function myFunction() {
    var x = document.getElementById("CVV").id;
    document.getElementById("demo").innerHTML = x;
}
        
</script>
    
</body>
</html>


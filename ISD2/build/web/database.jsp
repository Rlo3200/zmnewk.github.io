<%@page import="uts.isd.model.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
   "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Online Movie Store</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap3.min.css">
</head>

<style type="text/css">
  .Main_Display {

  Margin: auto;
  text-align:center;
  justify-content:space-evenly;
  display: flex;             
  flex-wrap: wrap;
}

  .row {
     margin: 0px auto;
  }

  .col-sm-3{
    padding: 2em;
    width: 20vh;
  }

  .thumbnail {
    background-color: #0C2F5A;
  }

  body {
    background-color: #556B85;
  }

  h1 {
    color: white;
    text-align: center;
  }

  a {
    color: white;
    padding: 2px;
    margin: 2px;
  }

    button {
        width: 60%;
        margin-right: 20%;
        margin-left: 20%;
    }
  

</style>

<body>

<div align="left"> 
<b><a href="login.html"> LOGIN</a>
  <a>  |  </a>
<a href="index.html"> SIGN UP </a></b>
</div>  

<h1>
Available Movies
</h1>

   


<div class="col-sm-4 col-md-3">
  <div class="thumbnail">
    <img src="MovieImages/12485_Batman-The-Dark-Knight-Joker-Wallpaper.jpg">
    <div class="caption">
      <h3>The Dark Knight</h3>
      <p style="height:40px;overflow-y:scroll;" >With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.</p>  
    </div>
      <br>
        <form method="get" action="order.html"><button type="submit">BUY</button></form>
  </div>
</div>

<div class="col-sm-4 col-md-3">
  <div class="thumbnail">
    <img src="MovieImages/1Divergent-movie-poster-wallpaper-1920x1200.jpg">
    <div class="caption">
      <h3>Divergent</h3>
      <p style="height:40px;overflow-y:scroll;" >Tris Prior (Shailene Woodley) lives in a futuristic world in which society is divided into five factions. As each person enters adulthood, he or she must choose a faction and commit to it for life. Tris chooses Dauntless -- those who pursue bravery above all else. However, her initiation leads to the discovery that she is a Divergent and will never be able to fit into just one faction. Warned that she must conceal her status, Tris uncovers a looming war which threatens everyone she loves.</p>
    </div>
      <br>
        <form method="get" action="order.html"><button type="submit">BUY</button></form>
  </div>
</div>

<div class="col-sm-4 col-md-3">
  <div class="thumbnail">
    <img src="MovieImages/GN_onesheet_AU.jpg">
    <div class="caption">
      <h3>Game Night</h3>
      <p style="height:40px;overflow-y:scroll;" >Max and Annie's weekly game night gets kicked up a notch when Max's brother Brooks arranges a murder mystery party -- complete with fake thugs and federal agents. So when Brooks gets kidnapped, it's all supposed to be part of the game. As the competitors set out to solve the case, they start to learn that neither the game nor Brooks are what they seem to be. The friends soon find themselves in over their heads as each twist leads to another unexpected turn over the course of one chaotic night.<span class="label label-success">VEG</span></p>
    </div>
      <br>
        <form method="get" action="order.html"><button type="submit">BUY</button></form>
  </div>
</div>

<div class="col-sm-4 col-md-3">
  <div class="thumbnail">
    <img src="MovieImages/1Miller-Landscape.jpg">
    <div class="caption">
      <h3>We're The Millers</h3>
      <p style="height:40px;overflow-y:scroll;" >Small-time pot dealer David (Jason Sudeikis) learns the hard way that no good deed goes unpunished; trying to help some teens, he is jumped by thugs and loses his cash and stash. Now, David's in big debt to his supplier and -- to wipe the slate clean -- he must go to Mexico to pick up the guy's latest shipment. To accomplish his mission, Dave devises a foolproof plan: He packs a fake family into a huge RV and heads south of the border for a wild weekend that is sure to end with a bang.</p>
    </div>
      <br>
        <form method="get" action="order.html"><button type="submit">BUY</button></form>
  </div>
</div>

<div class="col-sm-4 col-md-3">
  <div class="thumbnail">
    <img src="MovieImages/1NYSM poster.jpg">
    <div class="caption">
      <h3>Now You See Me</h3>
      <p style="height:40px;overflow-y:scroll;" >Now You See Me is a series of heist thriller films written by Ed Solomon, Boaz Yakin, and Edward Ricourt. They focus on the actions of a team of illusionists named "The Four Horsemen" who pull off near impossible heists.</p>
    </div>
      <br>
        <form method="get" action="order.html"><button type="submit">BUY</button></form>
  </div>
</div>


</body>
</html>


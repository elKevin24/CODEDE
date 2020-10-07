<%-- 
    Document   : index
    Created on : 21/05/2018, 12:12:11 PM
    Author     : carlo
--%>

<%-- 
    Document   : index
    Created on : 21/05/2018, 12:12:11 PM
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
    
     <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
              <jsp:include page="menu.jsp" flush="true"></jsp:include>

    </head>
    <body>
       <center> <h3 class="light blue-text text-lighten-3">Consejo Departamental de Desarrollo Zacapa</h3></center>
    
     <div class="slider">
    <ul class="slides">
      <li>
        <img class="responsive-img" src="IMG/consejo.jpg"> <!-- random image -->
       
      </li>
      <li>
        <img class="responsive-img"  src="IMG/consejo2.jpg"> <!-- random image -->
        <div class="caption left-align">
        <h3 class="light black-text text-lighten-3">GOBIERNO DE GUATEMALA</h3>
          <h5 class="light black-text text-lighten-3">AVANZANDO JUNTOS</h5>
        </div>
      </li>
      <li>
        <img class="responsive-img"  src="IMG/bandera.jpg"> <!-- random image -->
        <div class="caption center-align">
        <h3 class="light black-text text-lighten-3">GOBIERNO DE GUATEMALA</h3>
          <h5 class="light black-text text-lighten-3">AVANZANDO JUNTOS</h5>
        </div>
      </li>
      </ul>
  </div>
    

    </body>
    <script>
 
          
    document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.slider');
    var instances = M.Slider.init(elems,{
        duration:500,
        interval:2000,
        height:550
        
            });
  });      

  
 </script>
    
  
  </html>

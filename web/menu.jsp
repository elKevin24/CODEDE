<%-- 
    Document   : index
    Created on : 21/05/2018, 12:12:11 PM
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/jpeg" href="IMG/LOGOGOB.png" />


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>

        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="/your-path-to-fontawesome/css/all.css" rel="stylesheet">
    </head>

    <body>
        <nav>
            <div class="nav-wrapper">
                <div class="blue darken-1 black-text text-darken-2"


                     <a href="#!" class="brand-logo">GOBIERNO DE GUATEMALA</a>

                    <ul class="right hide-on-med-and-down"> 

                        <li><a href="Login.jsp">Salir</a></li>
                    </ul>


                    <ul id="slide-out" class="sidenav">
                        <li><div class="user-view">
                                <div class="background">
                                    <img src="IMG/Fondo.png">
                                </div>
                                <a href="#user"><img class="circle" src="IMG/consejo.jpg"></a>
                                <a href="#name"><span class="white-text name">Consejo Departamental de Desarrollo Zacapa </span></a>
                            </div></li>
                        <li><a class="subheader">CODEDE</a></li>
                        <ul class="collapsible collapsible-accordion">
                            <li>
                                
                                <a class="collapsible-header">Proyectos<i class="material-icons">account_boxarrow_drop_down</i></a>
                                <div class="collapsible-body">
                                    <ul>
                                        <li><a href="Proyectos.jsp">Ingreso</a></li>
                                        <li><a href="Consulta.jsp">Consulta</a></li>
                                        <li><a href="Reporte.jsp">Reporte</a></li>
                                    </ul>
                                </div>
                            </li>
                        </ul>

                    </ul>

                    <a href="#" data-target="slide-out" class="sidenav-trigger show-on-large"><i class="material-icons">menu</i></a>
                </div>
            </div>
        </nav>

    </body>

    <script>

       document.addEventListener('DOMContentLoaded', function() { 
        var elems = document.querySelectorAll('.sidenav');
        var instances = M.Sidenav.init(elems, {
            direction: 'left',
            hoverEnabled: false
        });
        var collapsibleElem = document.querySelector('.collapsible');
        var collapsibleInstance = M.Collapsible.init(collapsibleElem, {
            direction: 'left',
            hoverEnabled: false
        });
});
       
    </script>
</html>

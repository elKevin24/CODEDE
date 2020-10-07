<%-- 
    Document   : Consulta
    Created on : 21-abr-2018, 11:58:06
    Author     : nichodeveloper
--%>


<%@page import="controlador.BeanProyecto"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@ page import = "java.util.LinkedList"%>
<%@page import="modelo.Proyecto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "controlador.BeanProyecto"%> 
<%@ page import = "modelo.Proyecto"%> 


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>

        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">


        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">






        <jsp:include page="menu.jsp" flush="true"></jsp:include>


            <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.css"/>

            <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.js"></script>
            
          

        </head>
        <body>

            <img src="IMG/logo.png" alt="" width="150"/>



        

        
        </div>
                <h3 class="center-align">Consulta Proyectos Concluidos</h3>
                </div>
                
                
               

                <form action="Consulta_Financiera_1.jsp" method="post">
            
            <div class="row">
                <div class="input-field col s3 offset-s2">

                    <input type="date" name="fecha" id="fecha" value="" required >

                </div>
                
               

                <div class="input-field col s3">

                    <input type="date" name="fecha2"  value="" required >

                

            </div>
               <input type="submit" value="Registrar" class="btn-large light-blue accent-4" name="enviar">
                <%
              //s  out.println("<td>" + "<a class='waves-effect waves-light btn-small light-blue accent-4' onclick='return myFunction()' href=Consulta_Financiera.jsp?id=" + a + ">" + "Editar" + "</a>" + "</td>");
        
                %>
                </div>
                

</form>


        
        </div>
        <a href="index.jsp">Regresar </a>
        <script src="https://unpkg.com/jquery@3.3.1/dist/jquery.min.js"></script>

        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>

        <script>
            $(document).ready(function () {
                $('#table_id').DataTable();
            });
            
            


        </script>


    </body>





</html>

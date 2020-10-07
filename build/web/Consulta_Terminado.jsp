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
            <h3>Consulta Proyectos Concluidos</h3>

        <%
            LinkedList<BeanProyecto> lista = Proyecto.consultarProyecto_Terminado();
            NumberFormat formatter = new DecimalFormat("###,###,###.00");
        %>


<div class="row">
    
    
    <div class="col s10 offset-s1">
        <table id="table_id"    class="display"  >
            <thead>
                <tr>

                    <th>Id Proyecto</th>
                    <th>Nombre</th>
                    <th>Convenio</th> 
                    
                    <th>Descripcion</th>
                    <th>Monto Total</th>
                    <th>Direccion</th>
                    
                    <th>Editar</th>
                    


                </tr>
            </thead>
            <tbody>
                <%
                    for (int i = 0; i < lista.size(); i++) {

                        out.println("<tr>");
                        out.println("<td>" + lista.get(i).getId_proyecto() + "</td>");
                        out.println("<td>" + lista.get(i).getNombre() + "</td>");
                        out.println("<td>" + lista.get(i).getNum_convenio() + "</td>");
                        
                        out.println("<td>" + lista.get(i).getDescripcion() + "</td>");
                        out.println("<td> Q" + formatter.format(lista.get(i).getMonto_total()) + "</td>");
                        out.println("<td>" + lista.get(i).getDireccion() + "</td>");

                        out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Editar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "Editar" + "</a>" + "</td>");
                             out.println("</tr>");

                    }
                %>  
            </tbody>
        </table>  
            
     </div>
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

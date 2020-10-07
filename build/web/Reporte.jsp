<%-- 
    Document   : Reporte
    Created on : 2/10/2020, 01:01:53 AM
    Author     : Carlos Cabrera
--%>

<%@page import="modelo.Proyecto"%>
<%@page import="controlador.BeanProyecto"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <title>Reportes de Proyectos</title>
        <jsp:include page="menu.jsp" flush="true"></jsp:include>

        </head>
        <body>

            <div class="container">
                <CENTER><h3> REPORTES </h3></CENTER> 

                <br> </br>

                <!--
                <div class="row">
                    <form class="col s12" action="Servletreporteindividual" method="post">
                        <div class="row">
                            <div class="input-field col s6">
                                <input placeholder="No.Convenio" type="text" name="convenio" class="validate" /> 
                                <label for="first_name">Inserte el numero de Convenio</label>
                            </div>
                            <div class="input-field col s6">
                            <input type="submit" value="Generar PDF" class="btn-large" name="btnver"/><br></br>
                            </div>
                        </div>
                    </form>
                </div>
                -->

                <div class="col s12">

                    <table border="1"   class="highlight responsive-table striped " >
                        <tr>

                            <td>Id Proyecto</td>
                            <td>Nombre</td>
                            <td>No.Convenio</td>
                            <td>Descripcion</td>
                            <td>Fecha</td>
                            <td>Municipio</td>
                        </tr>
                    <%
                        LinkedList<BeanProyecto> lista = Proyecto.consultarProyecto();
                        for (int i = 0; i < lista.size(); i++) {
                            out.println("<tr>");
                            out.println("<td>" + lista.get(i).getId_proyecto() + "</td>");
                            out.println("<td>" + lista.get(i).getNombre() + "</td>");
                            out.println("<td>" + lista.get(i).getNum_convenio() + "</td>");
                            out.println("<td>" + lista.get(i).getDescripcion() + "</td>");
                            out.println("<td>" + lista.get(i).getFecha() + "</td>");
                            out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Servletreporteindividual?convenio=" + lista.get(i).getNum_convenio() + ">" + "PDF" + "</a>" + "</td>");
                            out.println("</tr>");
                        }
                    %>  
            </div>
        </div>
        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('select').material_select();
            });

        </script>   
        <div class="col s3">
            <form action="reporte" method="post" >

                <div class="input-field col s3">
                    <input type="submit" value="REPORTE GENERAL" class="btn-large" name="reporte">

                </div>
            </form>
        </div>
    </body>
</html>

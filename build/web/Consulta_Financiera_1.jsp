<%-- 
    Document   : Consulta
    Created on : 21-abr-2018, 11:58:06
    Author     : nichodeveloper
--%>


<%@page import="controlador.BeanDesembolso"%>
<%@page import="modelo.Desembolso"%>
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
                <h3 class="center-align">Consulta Proyectos </h3>
                <%
                    
                    
                    
String fecha = request.getParameter("fecha");
String fecha2 = request.getParameter("fecha2");

out.println("<h5 class='center-align'> Del "+fecha+" Al "+fecha2+"</h3>");

                    %>
                </div>
                
                
                

                <form action="Consulta_Financiera.jsp" method="post">
                    
            
           


        <div class="row">


            <div class="col s10 offset-s1">
                <table id="table_id"    class="display"  >
                    <thead>
                        <tr>

                            <th>Id Proyecto</th>
                            <th>Nombre</th>
                            <th>Convenio</th>                    
                            <th>Descripcion</th>                    
                            <th>Desembolso</th>
                            <th>Ejecutado</th>
                            <th>Restante</th>





                        </tr>
                    </thead>
                    <tbody>
                        <%
                            
                             LinkedList<BeanProyecto> lista = Proyecto.consultarProyectos(fecha, fecha2);
            NumberFormat formatter = new DecimalFormat("###,###,###.00");
                            
                            for (int i = 0; i < lista.size(); i++) {

                                out.println("<tr>");
                                out.println("<td>" + lista.get(i).getId_proyecto() + "</td>");
                                out.println("<td>" + lista.get(i).getNombre() + "</td>");
                                out.println("<td>" + lista.get(i).getNum_convenio() + "</td>");

                                out.println("<td>" + lista.get(i).getDescripcion() + "</td>");
                                out.println("<td> Q" + formatter.format(lista.get(i).getMonto_total()) + "</td>");
                                out.println("<td> Q" + formatter.format(lista.get(i).getInvertido()) + "</td>");
                                out.println("<td> Q" + formatter.format(lista.get(i).getTotal()) + "</td>");

                                out.println("</tr>");

                            }
                            


                        %>  
                    </tbody>
                </table>  

            </div>
        </div>
                     <div class="row">


            <div class="col s10 offset-s1">
                <table id="table_id"    class="display"  >
                    <thead>
                        <tr>

                            <th>Asignado A Proyectos</th>
                            <th>Desembolso</th>
                            <th>Restante</th>                    
                            





                        </tr>
                    </thead>
                    <tbody>
                        <%
                            
                             BeanDesembolso des = new BeanDesembolso();
                             des = Desembolso.Obtener(fecha, fecha2);
                             
                              
                            
                           

                                out.println("<tr>");
                                out.println("<td > Q" + formatter.format(des.getDes_porcentaje())+ "</td>");
                                out.println("<td > Q" + formatter.format(des.getDes_porciento())+ "</td>");
                                out.println("<td > Q" + formatter.format(des.getDiferencia())+ "</td>");
                                out.println("</tr>");

                            


                        %>  
                    </tbody>
                </table>  

            </div>
        </div>
        <a href="Consulta_Financiera.jsp">Regresar </a>
        <script src="https://unpkg.com/jquery@3.3.1/dist/jquery.min.js"></script>

        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>

        <script>
            $(document).ready(function () {
                $('#table_id').DataTable();
            });
            
            


        </script>


    </body>





</html>

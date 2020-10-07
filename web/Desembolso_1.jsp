<%-- 
    Document   : Desembolso
    Created on : 17/09/2020, 08:43:44 AM
    Author     : kcordon
--%>
<%@page import="modelo.Desembolso"%>
<%@page import="controlador.BeanDesembolso"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@ page import="controlador.BeanProyecto"%> 
<%@ page import="modelo.Proyecto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Desembolso</title>
         <jsp:include page="menu.jsp" flush="true"></jsp:include>
    </head>
    <body>
        <div class="container">

            <%  
                
                String id = request.getParameter("id");
                NumberFormat formatter = new DecimalFormat("###,###,###.00");
                BeanDesembolso des = new BeanDesembolso();
                des = Desembolso.consultarSuma(id);
                LinkedList<BeanDesembolso> lista = Desembolso.consultarDesembolsos(id);
                 des.getDiferencia();
                

                BeanProyecto user = new BeanProyecto();
                user = Proyecto.ObtenerProyecto(id);
                out.println("<h4 align='center'>Desembolso del Proyecto  " + user.getNombre() + "</h4>");
                out.println("<h4 align='center'>Monto total Q " + formatter.format(user.getMonto_total()) + " Pendiente Q" + formatter.format(des.getDiferencia()) +"</h4>");


            %>

            <form action="ServletDesembolso" method="post" >
                <div class="row">
                    <div class="col s12">

                       
                        <div class="input-field col s4">
                            <input  type="number" id="first_name" type="text" class="validate" name="Monto"
                                    required pattern="[0-9]+" min="1" max="<%=des.getDiferencia()%>">
                            <label for="Monto">Ingresar Monto</label>
                        </div>
                        <input  name="Id_proyecto" type="hidden" value="<%=id%>">
                        <input  name="Id_desembolso" type="hidden" value="<%=lista.size() + 1%>">


                        <div class="input-field col s3">
                            <input type="submit" value="Registrar" class="btn-large" name="enviar">

                        </div>
                    </div>


                </div>
            </form>

            <div class="col s12">

                <table border="1"   class="highlight responsive-table striped " >
                    <tr>

                        <td>Id Desembolso</td>
                        <td>Monto</td>
                        <td>Numero Desembolso</td>
                        


                    </tr>
                    <%

                        for (int i = 0; i < lista.size(); i++) {

                            out.println("<tr>");
                            out.println("<td>" + lista.get(i).getId_desembolso() + "</td>");
                            out.println("<td>" + formatter.format(lista.get(i).getDes_porciento()) + "</td>");

                            out.println("<td>" + lista.get(i).getFecha_commit() + "</td>");

                            out.println("</tr>");
                        }


                    %>  

                    <%                        out.println("<p>Total desembolso:  " + formatter.format(des.getDes_porcentaje()) + "<p");

                    %>
            </div>

        </div>
            <script>
                
                
                </script>
    </body>
</html>

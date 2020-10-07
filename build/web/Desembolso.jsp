<%-- 
    Document   : Desembolso
    Created on : 17/09/2020, 08:43:44 AM
    Author     : kcordon
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="modelo.Conexion"%>
<%@page import="java.math.BigDecimal"%>
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
        <link href="css/moneda.css" rel="stylesheet" type="text/css"/>
        </head>
        <body>
            
            
            <div class="container">
                

            <%

                String id = request.getParameter("id");
                NumberFormat formatter = new DecimalFormat("###,###,###.00");
                BeanDesembolso des = new BeanDesembolso();
                des = Desembolso.consultarSuma(id);
                LinkedList<BeanDesembolso> lista = Desembolso.consultarDesembolsos(id);
                
                //convertir bigdecimal en double
                

                BeanProyecto user = new BeanProyecto();
                user = Proyecto.ObtenerProyecto(id);
                
                double total = user.getMonto_total().doubleValue();
                double restante = des.getDiferencia().doubleValue();
                
                double result = restante * 100 / total;

                out.println("<h4 align='center'>Desembolso del Proyecto  " + user.getNombre() + "</h4>");
                out.println("<h5 align='center'>Monto total Q " + formatter.format(user.getMonto_total()) + " Pendiente Q" + formatter.format(des.getDiferencia()) + " Avance en Porcentaje %" + result + "</h5>");


            %>
            <div class="col s12">

                    <a  href="index.jsp" class="btn-floating pulse light-blue accent-4" ><i class="material-icons">arrow_back</i></a>

                </div>

            <form action="ServletDesembolso" method="post" >
                <div class="row">
                    <div class="col s12">
                        
                        
                        <div class="input-field col s4">
                            <div class="input-icon">
                                <i>Q</i>
                            <input  type="number"   class="validate reves" name="Monto"
                                    required pattern="[0-9]+" min="1" max="<%=des.getDiferencia()%>">
                            <label for="Monto">Ingresar Monto</label>
                            </div>
                        </div>
                                                

                        <input  name="Id_proyecto" type="hidden" value="<%=id%>">
                        <input  name="Id_desembolso" type="hidden" value="<%=lista.size() + 1%>">

                        <div class="row">
                                <div class="input-field col s3">
                                    <select name="Tipo" required >

                                    <%

                                        try {
                                            Conexion c = new Conexion();

                                            Connection con = c.getConexion();
                                            Statement st;
                                            st = con.createStatement();
                                            ResultSet rs = st.executeQuery("select id_tipoD, nombre from dbo.catalogoTipodDesembolso");
                                            while (rs.next()) {
                                    %>
                                    <option value="<%=rs.getInt("id_tipoD")%>"><%=rs.getString("nombre")%></option>

                                    <%
                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            out.println("Error " + e.getMessage());
                                        }


                                    %>
                                </select>
                                <label>Escoger Tipo Desembolso</label>
                            </div>
                                
                                
                                <div class="input-field col s4">
                            <input   type="number" class="validate" name="Numero"
                                     required pattern="[0-9]+" min="1" >
                            <label for="Numero Documento">Numero Documento</label>
                        </div>  
                        </div>
<div class="input-field col s3">
                            <input type="submit" value="Registrar" class="btn-large light-blue accent-4" name="enviar">

                        </div>

                    </div>
            </form>

            <div class="col s12">

                <table border="1"   class="highlight responsive-table striped " >
                    <tr>
                        
                        <td>No. Desembolso</td>
                        <td>Monto</td>
                        <td>Documento</td>
                        
                        <td>Fecha</td>
                        <td>Tipo Desembolso</td>
                        



                    </tr>
                    <%

                        for (int i = 0; i < lista.size(); i++) {

                            out.println("<tr>");
                            out.println("<td>" + lista.get(i).getNum_desembolso() + "</td>");
                            out.println("<td>  Q" + formatter.format(lista.get(i).getDes_porciento()) + "</td>");
                            
                            
                            out.println("<td>" + lista.get(i).getNumero_documento() + "</td>");
                            out.println("<td>" + lista.get(i).getId_tipo_desembolso() + "</td>");

                            out.println("<td>" + lista.get(i).getFecha_commit() + "</td>");

                            out.println("</tr>");
                        }


                    %>  

                    <%                        out.println("<p>Total desembolso: Q" + formatter.format(des.getDes_porcentaje()) + "<p");

                    %>
            </div>

        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('select').material_select();
            });


            function validar() {
                if (confirm("Desea Borrar los datos?")) {
                    alert("Datos borrados exitosamente");
                } else {
                    alert("No se borrara");
                    return false;
                }
            }

        </script>
    </body>
</html>

<%-- 
--%>
<%@page import="controlador.BeanProyecto"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="modelo.Conexion"%>
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
        <jsp:include page="menu.jsp" flush="true"></jsp:include>

        <title>Modificacion de datos</title>
    </head>
    <body>
         <div class="row">
                    


        <%
            String id = request.getParameter("id");

            BeanProyecto user = new BeanProyecto();
            user = Proyecto.ObtenerProyecto(id);

            out.println("<h3>Modificación de Proyecto</h3>");
            
            out.println("<div class='row'>");
            out.println("<form action='Actualizar.jsp' method='post'>");
            out.println("<div class='row'>");
            out.println("<div class='input-field col s3'>");
            out.println("<input type='text' size='20' name='Nombre' value=" + user.getNombre()+ ">");
            out.println("<label for='Nombre'>Nombre Proyecto</label>");
            out.println("</div>");
            
            out.println("<div class='input-field col s3'>");
            out.println("<input type='text' size='20' name='Convenio' value=" + user.getNum_convenio()+ ">");
            out.println("<label for='convenio'>Convenio</label>");
            out.println("</div>");
            out.println("<div class='input-field col s3'>");
            out.println("<input type='text' size='20' name='Descripcion' value=" + user.getDescripcion()+ ">");
            out.println("<label for='Telefono'>Descripcion</label>");
            out.println("</div>");
            
            out.println("<div class='input-field col s3'>");
            out.println("<input type='text' size='20' name='Monto' value=" + user.getMonto_total()+ ">");
            out.println("<label for='Monto'>Monto total</label>");
            out.println("</div>");
            
            out.println("<div class='input-field col s3'>");
            out.println("<input type='text' size='20' name='Municipio' disabled value=" + user.getId_municipio()+ ">");
            out.println("<label for='Municipio'>Municipio</label>");
            
            out.println("</div>");
            
            
           
                                        
            out.println("<div class='row'>");
            out.println("<div class='input-field col s3'>");
            out.println("<select name='Id_municipio'>");

                                        try {
                                            Conexion c = new Conexion();

                                            Connection con = c.getConexion();
                                            Statement st;
                                            st = con.createStatement();
                                            ResultSet rs = st.executeQuery("select id_municipio, nombre from t_municipio");
                                            while (rs.next()) {
                                    %>
                                   out.println(" <option value="<%=rs.getInt("id_municipio")%>"><%=rs.getString("nombre")%></option>");

                                    <%
                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            out.println("Error " + e.getMessage());
                                        }


                                    
                              
            out.println("</select>");
            out.println("<label>Escoger Tipo</label>");
            out.println("</div>");

out.println("<div class='input-field col s3'>");
            out.println("<select name='Tipo'>");

                                        try {
                                            Conexion c = new Conexion();

                                            Connection con = c.getConexion();
                                            Statement st;
                                            st = con.createStatement();
                                            ResultSet rs = st.executeQuery("SELECT [id_tipoProyecto],[tipo_proyecto]FROM [dbo].[t_tipoproyecto]");
                                            while (rs.next()) {
                                    %>
                                   out.println(" <option value="<%=rs.getInt("id_tipoProyecto")%>"><%=rs.getString("tipo_proyecto")%></option>");

                                    <%
                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            out.println("Error " + e.getMessage());
                                        }


                                    
                              
            out.println("</select>");
            out.println("<label>Escoger Municipio</label>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='input-field col s1'>");
            out.println("<input type='hidden' size='20' name='Id_proyecto' value=" + user.getId_proyecto()+ ">");
            
            out.println("</div>");
            
            

            out.println("<div class='row'>");
            out.println("<input type='submit' value='Actualizar' class='btn-large'>");
            out.println("<a href='Alumnos.jsp' value='Regresar' class='btn-large'>Regresar</a>");
            out.println("'</div>'");
            out.println("</form>");
            out.println("</div>");


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
    </body>
</html>

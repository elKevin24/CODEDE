<%-- 
    Document   : Editar
    Created on : 05-may-2018, 12:51:49
    Author     : nichodeveloper
--%>



<%@ page import="controlador.BeanUsuario"%> 
<%@ page import="modelo.Usuario"%>
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

        <title>Modificacion de datos</title>
    </head>
    <body>


        <%
            String id = request.getParameter("id");

            BeanUsuario user = new BeanUsuario();
            user = Usuario.ObtenerUsuario(id);

            out.println("<h3>Modificación de alumno</h3>");
            out.println("<img src='logo.png' width='100'/>");
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
            out.println("<input type='text' size='20' name='Municipio' disabled value=" + user.getMunicipio()+ ">");
            out.println("<label for='Municipio'>Municipio</label>");
            out.println("</div>");
            
            
            
            out.println("<div class='row'>");
            out.println("<div class='input-field col s3'>");
            out.println("<select name='Id_municipio'>");
            out.println("<option value='1'>Zacapa</option>");
            out.println("<option value='2'>Estanzuela</option>");
            out.println("<option value='3'>Rio Hondo</option>");
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

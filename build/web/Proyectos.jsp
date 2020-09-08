<%@page import="modelo.Seccioon"%>
<%@page import="controlador.BeanSeccion"%>
<%@page import="modelo.Grados"%>
<%@page import="controlador.BeanGrados"%>


<%@page import="modelo.Usuarios"%>
<%@page import="controlador.BeanUsuarios"%>
<%@page import="java.util.*"%>
<%@page import="modelo.Usuario"%>
<%@page import="controlador.BeanUsuario"%>
<%@page import="vista.ServletRegistro"%>
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





        <title>Registro de Proyectos</title>
    </head>
    <body>
        <div class="container">
            <h3> Ingreso de Proyectos Codede </h3>


            <div class="col s12">

                <a  href="grados.jsp" class="btn-floating pulse" ><i class="material-icons">arrow_back</i></a>

            </div>
            <form action="ServletRegistro.do" method="post" >
                <div class="row">
                    <div class="col s12">

                        <div class="input-field col s3">
                            <input type="text" size="20" name="Nombre">
                            <label for="Nombre">Nombre</label>
                        </div>
                        <div class="input-field col s3">
                            <input type="text" size="20" name="Convenio">
                            <label for="Convenio">Convenio</label>
                        </div>
                        <div class="input-field col s3">
                            <input type="text" size="20" name="Descripcion">
                            <label for="Descripcion">Descripcion</label>
                        </div>
                        <div class="input-field col s3">
                            <input type="text" size="20" name="monto_total">
                            <label for="monto_total">Monto Total</label>
                        </div>
                        <div class="input-field col s3">
                            <input type="text" size="20" name="Sapellido">
                            <label for="Sapellido">Segundo Apellido</label>
                        </div>
                        <div class="row">
                            <div class="input-field col s3">
                                <select name="municipio">
                                    <option value="" disabled selected>Municipio</option>
                                    <option value="1">Zacapa</option>
                                    <option value="2">Estanzuela</option>
                                    <option value="3">Rio Hondo</option>
                                </select>
                                <label>Escoger Municipio</label>
                            </div>
                        </div>
                        
                        <div class="input-field col s3">
                            <input type="submit" value="Registrar" class="btn-large" name="enviar">

                        </div>
                    </div>


                </div>
            </form>


            <div class="col s12">

                <table border="1"   class="highlight responsive-table striped " >
                    <tr>

                        <td>Id_Proyecto</td>
                        <td>Nombre</td>
                        <td>Descripcion</td>
                        <td>Fecha</td>
                        <td>Municipio</td>


                    </tr>
                    <%
                        LinkedList<BeanUsuario> lista = Usuario.consultarUsuario();

                        for (int i = 0; i < lista.size(); i++) {

                            out.println("<tr>");
                            out.println("<td>" + lista.get(i).getId_proyecto() + "</td>");
                            out.println("<td>" + lista.get(i).getNombre() + "</td>");
                            out.println("<td>" + lista.get(i).getDescripcion() + "</td>");
                            out.println("<td>" + lista.get(i).getFecha_comit() + "</td>");
                            out.println("<td>" + lista.get(i).getMunicipio() + "</td>");

                            out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Editar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "Editar" + "</a>" + "</td>");
                            out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=Eliminar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "<i class='material-icons'>delete_forever</i>" + "Eliminar" + "</a>" + "</td>");

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
    </body>


</html>

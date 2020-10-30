<%@page import="modelo.Proyecto"%>
<%@page import="controlador.BeanProyecto"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.*"%>
<%@page import="modelo.Municipio"%>
<%@page import="controlador.BeanMunicipio"%>
<%@page import="vista.ServletRegistro"%>
<%@page import="modelo.Conexion"%>
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
        <jsp:include page="menu.jsp" flush="true"></jsp:include>



        <%
            Date myDate = new Date();

            String a = new SimpleDateFormat("dd-MM-yyyy").format(myDate);
        %>


        <title>Registro de Proyectos</title>
        
        <link href="css/moneda.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h3> Ingreso de Proyectos Codede </h3>


            <div class="col s12">

                <a  href="index.jsp" class="btn-floating pulse light-blue accent-4" ><i class="material-icons">arrow_back</i></a>

            </div>





            <form action="ServletRegistro.do" method="post" >
                <div class="row">
                    <div class="col s12">

                        <div class="input-field col s3">
                            <input type="text" size="20" name="Nombre" required >
                            <label for="Nombre">Nombre</label>
                        </div>
                        <div class="input-field col s3">
                            <input type="number" size="20" name="Convenio" required pattern="[0-9]+" >
                            <label for="Convenio">Convenio</label>
                        </div>
                        <div class="input-field col s3">
                            <select name="Tipo" required >




                                <%
                                    try {
                                        Conexion c = new Conexion();

                                        Connection con = c.getConexion();
                                        Statement st;
                                        st = con.createStatement();
                                        ResultSet rs = st.executeQuery("SELECT [id_tipoProyecto],[tipo_proyecto]FROM [dbo].[t_tipoproyecto]");
                                        while (rs.next()) {
                                %>
                                <option value="<%=rs.getInt("id_tipoProyecto")%>"><%=rs.getString("tipo_proyecto")%></option>

                                <%
                                        }

                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        out.println("Error " + e.getMessage());
                                    }


                                %>
                            </select>
                            <label>Escoger Tipo de Proyecto</label>
                        </div>
                            
                            
                
                
            
                        <div class="input-field col s3">
                            <div class="input-icon">
                                <i>Q</i>
                            <input type="text" size="20" name="monto_total"  required min="1">
                            <label for="monto_total">Monto Total</label>
                            </div>
                        </div>
                        <div class="input-field col s3">
                            <input type="text" size="20" name="Descripcion"  data-length="120" required >
                            <label for="Descripcion">Descripcion</label>
                        </div>



                        <div class="input-field col s3">
                            <input type="text" size="20" name="Direccion" required >
                            <label for="Direccion">Direccion</label>
                        </div>


                        <div class="input-field col s3">

                            <input type="date" name="fecha"  required >

                        </div>

                        <div class="row">
                            <div class="input-field col s3">
                                <select name="municipio" required >




                                    <%                                        try {
                                            Conexion c = new Conexion();

                                            Connection con = c.getConexion();
                                            Statement st;
                                            st = con.createStatement();
                                            ResultSet rs = st.executeQuery("select id_municipio, nombre from t_municipio");
                                            while (rs.next()) {
                                    %>
                                    <option value="<%=rs.getInt("id_municipio")%>"><%=rs.getString("nombre")%></option>

                                    <%
                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            out.println("Error " + e.getMessage());
                                        }


                                    %>
                                </select>
                                <label>Escoger Municipio</label>
                            </div>
                        </div>




                        <div class="input-field col s3">
                            <input type="submit" value="Registrar" class="btn-large light-blue accent-4" name="enviar">

                        </div>
                    </div>


                </div>
            </form>


            <div class="col s12">

                <table border="1"   class="highlight responsive-table striped " >
                    <tr>

                        <td>Id Proyecto</td>
                        <td>Nombre</td>
                        <td>Descripcion</td>
                        <td>Fecha</td>
                        <td>Municipio</td>
                        <td>Editar</td>
                        <td>Eliminar</td>
                        <td>Desembolso</td>


                    </tr>
                    <%                        LinkedList<BeanProyecto> lista = Proyecto.consultarProyecto();

                        for (int i = 0; i < lista.size(); i++) {

                            out.println("<tr>");
                            out.println("<td>" + lista.get(i).getId_proyecto() + "</td>");
                            out.println("<td>" + lista.get(i).getNombre() + "</td>");
                            out.println("<td>" + lista.get(i).getDescripcion() + "</td>");
                            out.println("<td>" + lista.get(i).getFecha() + "</td>");
                            out.println("<td>" + lista.get(i).getId_municipio() + "</td>");

                            out.println("<td>" + "<a class='waves-effect waves-light btn-small lime accent-4' onclick='return myFunction()' href=Editar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "Editar" + "</a>" + "</td>");
                            out.println("<td>" + "<a class='waves-effect waves-light btn-small red accent-4' onclick='return validar()' href=Eliminar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "<i class='material-icons'>delete_forever</i>" + "Eliminar" + "</a>" + "</td>");
                            out.println("<td>" + "<a class='waves-effect waves-light btn-small amber darken-4' onclick='return myFunction1()' href=Desembolso.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "Desembolso" + "</a>" + "</td>");
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

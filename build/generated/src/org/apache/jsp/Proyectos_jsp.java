package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Proyecto;
import controlador.BeanProyecto;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;
import modelo.Municipio;
import controlador.BeanMunicipio;
import vista.ServletRegistro;
import modelo.Conexion;

public final class Proyectos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <!--Import materialize.css-->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            Date myDate = new Date();
            
          String a = new SimpleDateFormat("dd-MM-yyyy").format(myDate);
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <title>Registro de Proyectos</title>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h3> Ingreso de Proyectos Codede </h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("                    <a  href=\"index.jsp\" class=\"btn-floating pulse light-blue accent-4\" ><i class=\"material-icons\">arrow_back</i></a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <form action=\"ServletRegistro.do\" method=\"post\" >\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"input-field col s3\">\r\n");
      out.write("                                <input type=\"text\" size=\"20\" name=\"Nombre\" required >\r\n");
      out.write("                                <label for=\"Nombre\">Nombre</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-field col s3\">\r\n");
      out.write("                                <input type=\"number\" size=\"20\" name=\"Convenio\" required pattern=\"[0-9]+\" >\r\n");
      out.write("                                <label for=\"Convenio\">Convenio</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"input-field col s3\">\r\n");
      out.write("                                    <select name=\"Tipo\" required >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");


                                        try {
                                            Conexion c = new Conexion();

                                            Connection con = c.getConexion();
                                            Statement st;
                                            st = con.createStatement();
                                            ResultSet rs = st.executeQuery("SELECT [id_tipoProyecto],[tipo_proyecto]FROM [dbo].[t_tipoproyecto]");
                                            while (rs.next()) {
                                    
      out.write("\r\n");
      out.write("                                    <option value=\"");
      out.print(rs.getInt("id_tipoProyecto"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("tipo_proyecto"));
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            out.println("Error " + e.getMessage());
                                        }


                                    
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <label>Escoger Tipo de Proyecto</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"input-field col s3\">\r\n");
      out.write("                                <input type=\"text\" size=\"20\" name=\"monto_total\" required min=\"1\">\r\n");
      out.write("                                <label for=\"monto_total\">Monto Total</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-field col s3\">\r\n");
      out.write("                                <input type=\"text\" size=\"20\" name=\"Descripcion\"  data-length=\"120\" required >\r\n");
      out.write("                                <label for=\"Descripcion\">Descripcion</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"input-field col s3\">\r\n");
      out.write("                                <input type=\"text\" size=\"20\" name=\"Direccion\" required >\r\n");
      out.write("                                <label for=\"Direccion\">Direccion</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"input-field col s3\">\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"date\" name=\"fecha\"  required >\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"input-field col s3\">\r\n");
      out.write("                                    <select name=\"municipio\" required >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");


                                        try {
                                            Conexion c = new Conexion();

                                            Connection con = c.getConexion();
                                            Statement st;
                                            st = con.createStatement();
                                            ResultSet rs = st.executeQuery("select id_municipio, nombre from t_municipio");
                                            while (rs.next()) {
                                    
      out.write("\r\n");
      out.write("                                    <option value=\"");
      out.print(rs.getInt("id_municipio"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("nombre"));
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            out.println("Error " + e.getMessage());
                                        }


                                    
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <label>Escoger Municipio</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"input-field col s3\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Registrar\" class=\"btn-large light-blue accent-4\" name=\"enviar\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("                <table border=\"1\"   class=\"highlight responsive-table striped \" >\r\n");
      out.write("                    <tr>\r\n");
      out.write("\r\n");
      out.write("                        <td>Id Proyecto</td>\r\n");
      out.write("                        <td>Nombre</td>\r\n");
      out.write("                        <td>Descripcion</td>\r\n");
      out.write("                        <td>Fecha</td>\r\n");
      out.write("                        <td>Municipio</td>\r\n");
      out.write("                        <td>Editar</td>\r\n");
      out.write("                        <td>Eliminar</td>\r\n");
      out.write("                        <td>Desembolso</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
                        LinkedList<BeanProyecto> lista = Proyecto.consultarProyecto();

                        for (int i = 0; i < lista.size(); i++) {

                            out.println("<tr>");
                            out.println("<td>" + lista.get(i).getId_proyecto() + "</td>");
                            out.println("<td>" + lista.get(i).getNombre() + "</td>");
                            out.println("<td>" + lista.get(i).getDescripcion() + "</td>");
                            out.println("<td>" + lista.get(i).getFecha() + "</td>");
                            out.println("<td>" + lista.get(i).getId_municipio() + "</td>");

                            out.println("<td>" + "<a class='waves-effect waves-light btn-small light-blue accent-4' onclick='return myFunction()' href=Editar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "Editar" + "</a>" + "</td>");
                            out.println("<td>" + "<a class='waves-effect waves-light btn-small light-blue accent-4' onclick='return validar()' href=Eliminar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "<i class='material-icons'>delete_forever</i>" + "Eliminar" + "</a>" + "</td>");
                            out.println("<td>" + "<a class='waves-effect waves-light btn-small light-blue accent-4' onclick='return myFunction1()' href=Desembolso.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "Desembolso" + "</a>" + "</td>");
                            out.println("</tr>");
                        }
                    
      out.write("  \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--Import jQuery before materialize.js-->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('select').material_select();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            function validar() {\r\n");
      out.write("                if (confirm(\"Desea Borrar los datos?\")) {\r\n");
      out.write("                    alert(\"Datos borrados exitosamente\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"No se borrara\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

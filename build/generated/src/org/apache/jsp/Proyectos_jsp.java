package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Seccioon;
import controlador.BeanSeccion;
import modelo.Grados;
import controlador.BeanGrados;
import modelo.Usuarios;
import controlador.BeanUsuarios;
import java.util.*;
import modelo.Usuario;
import controlador.BeanUsuario;
import vista.ServletRegistro;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <title>Registro de Proyectos</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h3> Ingreso de Proyectos Codede </h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("                <a  href=\"grados.jsp\" class=\"btn-floating pulse\" ><i class=\"material-icons\">arrow_back</i></a>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <form action=\"ServletRegistro.do\" method=\"post\" >\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"input-field col s3\">\r\n");
      out.write("                            <input type=\"text\" size=\"20\" name=\"Nombre\">\r\n");
      out.write("                            <label for=\"Nombre\">Nombre</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-field col s3\">\r\n");
      out.write("                            <input type=\"text\" size=\"20\" name=\"Convenio\">\r\n");
      out.write("                            <label for=\"Convenio\">Convenio</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-field col s3\">\r\n");
      out.write("                            <input type=\"text\" size=\"20\" name=\"Descripcion\">\r\n");
      out.write("                            <label for=\"Descripcion\">Descripcion</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-field col s3\">\r\n");
      out.write("                            <input type=\"text\" size=\"20\" name=\"monto_total\">\r\n");
      out.write("                            <label for=\"monto_total\">Monto Total</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-field col s3\">\r\n");
      out.write("                            <input type=\"text\" size=\"20\" name=\"Sapellido\">\r\n");
      out.write("                            <label for=\"Sapellido\">Segundo Apellido</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"input-field col s3\">\r\n");
      out.write("                                <select name=\"municipio\">\r\n");
      out.write("                                    <option value=\"\" disabled selected>Municipio</option>\r\n");
      out.write("                                    <option value=\"1\">Zacapa</option>\r\n");
      out.write("                                    <option value=\"2\">Estanzuela</option>\r\n");
      out.write("                                    <option value=\"3\">Rio Hondo</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <label>Escoger Municipio</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"input-field col s3\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Registrar\" class=\"btn-large\" name=\"enviar\">\r\n");
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
      out.write("                        <td>Id_Proyecto</td>\r\n");
      out.write("                        <td>Nombre</td>\r\n");
      out.write("                        <td>Descripcion</td>\r\n");
      out.write("                        <td>Fecha</td>\r\n");
      out.write("                        <td>Municipio</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

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

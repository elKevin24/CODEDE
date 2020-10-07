package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controlador.BeanProyecto;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import modelo.Proyecto;
import controlador.BeanProyecto;
import modelo.Proyecto;

public final class Consulta_005fFinanciera_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.js\"></script>\r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("\r\n");
      out.write("            <img src=\"IMG/logo.png\" alt=\"\" width=\"150\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            LinkedList<BeanProyecto> lista = Proyecto.consultarProyectos();
            NumberFormat formatter = new DecimalFormat("###,###,###.00");
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("                <h3 class=\"center-align\">Consulta Proyectos Concluidos</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                ");

                    
                    
                    
String fecha = request.getParameter("fecha");
String fecha2 = request.getParameter("fecha2");

out.println("<h3>"+fecha+"</h3>");

                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <form action=\"Consulta_Financiera.jsp\" method=\"post\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"input-field col s3 offset-s2\">\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"date\" name=\"fecha\" id=\"fecha\" value=\"2020-10-06\" required >\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-field col s3\">\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"date\" name=\"fecha2\"  value=\"\" required >\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                <a class='waves-effect waves-light btn-small light-blue accent-4' onclick='myFunction2()' href=Consulta_Financiera.jsp?fecha=\"2020-10-04\"&fecha2=\"2020-10-6\">Editar</a>\r\n");
      out.write("                ");

              //s  out.println("<td>" + "<a class='waves-effect waves-light btn-small light-blue accent-4' onclick='return myFunction()' href=Consulta_Financiera.jsp?id=" + a + ">" + "Editar" + "</a>" + "</td>");
        
                
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col s10 offset-s1\">\r\n");
      out.write("                <table id=\"table_id\"    class=\"display\"  >\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("\r\n");
      out.write("                            <th>Id Proyecto</th>\r\n");
      out.write("                            <th>Nombre</th>\r\n");
      out.write("                            <th>Convenio</th>                    \r\n");
      out.write("                            <th>Descripcion</th>                    \r\n");
      out.write("                            <th>Direccion</th>\r\n");
      out.write("                            <th>Desembolso</th>\r\n");
      out.write("                            <th>Diferencia</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

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
                        
      out.write("  \r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>  \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"index.jsp\">Regresar </a>\r\n");
      out.write("        <script src=\"https://unpkg.com/jquery@3.3.1/dist/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf8\" src=\"https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#table_id').DataTable();\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

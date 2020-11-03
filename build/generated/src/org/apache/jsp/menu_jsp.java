package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/jpeg\" href=\"IMG/LOGOGOB.png\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!-- Compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"/your-path-to-fontawesome/css/all.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class=\"nav-wrapper\">\r\n");
      out.write("                <div class=\"blue darken-1 black-text text-darken-2\"\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                     <a href=\"#!\" class=\"brand-logo\">GOBIERNO DE GUATEMALA</a>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"right hide-on-med-and-down\"> \r\n");
      out.write("\r\n");
      out.write("                        <li><a href=\"Login.jsp\">Salir</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <ul id=\"slide-out\" class=\"sidenav\">\r\n");
      out.write("                        <li><div class=\"user-view\">\r\n");
      out.write("                                <div class=\"background\">\r\n");
      out.write("                                    <img src=\"IMG/Fondo.png\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"#user\"><img class=\"circle\" src=\"IMG/consejo.jpg\"></a>\r\n");
      out.write("                                <a href=\"#name\"><span class=\"white-text name\">Consejo Departamental de Desarrollo Zacapa </span></a>\r\n");
      out.write("                            </div></li>\r\n");
      out.write("                        <li><a class=\"subheader\">CODEDE</a></li>\r\n");
      out.write("                        <ul class=\"collapsible collapsible-accordion\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                \r\n");
      out.write("                                <a class=\"collapsible-header\">Proyectos<i class=\"material-icons\">account_boxarrow_drop_down</i></a>\r\n");
      out.write("                                <div class=\"collapsible-body\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"Proyectos.jsp\">Ingreso</a></li>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <li><a href=\"Reporte.jsp\">Reporte</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                \r\n");
      out.write("                                <a class=\"collapsible-header\">Consulta<i class=\"material-icons\"></i></a>\r\n");
      out.write("                                <div class=\"collapsible-body\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                       \r\n");
      out.write("                                        <li><a href=\"Consulta.jsp\">Consulta Todos los Proyectos</a></li>\r\n");
      out.write("                                        <li><a href=\"ConsultaEliminados.jsp\">Eliminados</a></li>\r\n");
      out.write("                                        <li><a href=\"Consulta_Terminado.jsp\">Finalizados</a></li>\r\n");
      out.write("                                        <li><a href=\"Consulta_Financiera.jsp\">Consulta Financiera</a></li>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#\" data-target=\"slide-out\" class=\"sidenav-trigger show-on-large\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("       document.addEventListener('DOMContentLoaded', function() { \r\n");
      out.write("        var elems = document.querySelectorAll('.sidenav');\r\n");
      out.write("        var instances = M.Sidenav.init(elems, {\r\n");
      out.write("            direction: 'left',\r\n");
      out.write("            hoverEnabled: false\r\n");
      out.write("        });\r\n");
      out.write("        var collapsibleElem = document.querySelector('.collapsible');\r\n");
      out.write("        var collapsibleInstance = M.Collapsible.init(collapsibleElem, {\r\n");
      out.write("            direction: 'left',\r\n");
      out.write("            hoverEnabled: false\r\n");
      out.write("        });\r\n");
      out.write("});\r\n");
      out.write("       \r\n");
      out.write("    </script>\r\n");
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

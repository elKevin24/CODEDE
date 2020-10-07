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

public final class Consulta_005f1_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css\">\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf8\" src=\"https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("                $(document).ready(function () {\r\n");
      out.write("                    $('#table_id').DataTable();\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <img src=\"IMG/logo.png\" alt=\"\" width=\"150\"/>\r\n");
      out.write("            <h3>Consulta Proyectos</h3>\r\n");
      out.write("        ");

            LinkedList<BeanProyecto> lista = Proyecto.consultarProyecto();
            NumberFormat formatter = new DecimalFormat("###,###,###.00");
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("        <table id=\"table_id\" border=\"1\"   class=\"highlight responsive-table striped\"  >\r\n");
      out.write("            <tr>\r\n");
      out.write("\r\n");
      out.write("                <td>Id Proyecto</td>\r\n");
      out.write("                <td>Nombre</td>\r\n");
      out.write("                <td>Monto</td>\r\n");
      out.write("                <td>Convenio</td>\r\n");
      out.write("                <td>Descripcion</td>\r\n");
      out.write("                <td>Fecha</td>\r\n");
      out.write("                <td>Municipio</td>\r\n");
      out.write("                <td>Editar</td>\r\n");
      out.write("                <td>Eliminar</td>\r\n");
      out.write("                <td>Desembolso</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                for (int i = 0; i < lista.size(); i++) {

                    out.println("<tr>");
                    out.println("<td>" + lista.get(i).getId_proyecto() + "</td>");
                    out.println("<td>" + lista.get(i).getNombre() + "</td>");
                    out.println("<td> Q" + formatter.format(lista.get(i).getMonto_total()) + "</td>");

                    out.println("<td>" + lista.get(i).getNum_convenio() + "</td>");
                    out.println("<td>" + lista.get(i).getDescripcion() + "</td>");
                    out.println("<td>" + lista.get(i).getFecha() + "</td>");
                    out.println("<td>" + lista.get(i).getId_municipio() + "</td>");

                    out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Editar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "Editar" + "</a>" + "</td>");
                    out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=Eliminar.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "<i class='material-icons'>delete_forever</i>" + "Eliminar" + "</a>" + "</td>");
                    out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=Desembolso.jsp?id=" + lista.get(i).getId_proyecto() + ">" + "Desembolso" + "</a>" + "</td>");
                    out.println("</tr>");
                }
            
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <a href=\"index.jsp\">Regresar </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    var elem = document.querySelector('.fixed-action-btn');\r\n");
      out.write("    var instance = M.FloatingActionButton.init(elem, {\r\n");
      out.write("        direction: 'left',\r\n");
      out.write("        hoverEnabled: false\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <html>\r\n");
      out.write("    <head>\r\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!-- Compiled and minified CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Compiled and minified JavaScript -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("     <!--Import Google Icon Font-->\r\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("              ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <center> <h3 class=\"light red-text text-lighten-3\">REGISTRO DE ALUMNOS</h3></center>\r\n");
      out.write("    \r\n");
      out.write("     <div class=\"slider\">\r\n");
      out.write("    <ul class=\"slides\">\r\n");
      out.write("      <li>\r\n");
      out.write("        <img src=\"IMG/LICEO1.jpg\"> <!-- random image -->\r\n");
      out.write("        <div class=\"caption center-align\">\r\n");
      out.write("         <h3>LICEO CRISTIANO ZACAPANECO</h3>\r\n");
      out.write("          <h5 class=\"light grey-text text-lighten-3\">ENSEÑANDO CON VALORES</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <img src=\"IMG/LICEO2.jpg\"> <!-- random image -->\r\n");
      out.write("        <div class=\"caption left-align\">\r\n");
      out.write("        <h3>LICEO CRISTIANO ZACAPANECO</h3>\r\n");
      out.write("          <h5 class=\"light grey-text text-lighten-3\">ENSEÑANDO CON VALORES</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <img src=\"IMG/LICEO3.jpg\"> <!-- random image -->\r\n");
      out.write("        <div class=\"caption right-align\">\r\n");
      out.write("            <h3>LICEO CRISTIANO ZACAPANECO</h3>\r\n");
      out.write("          <h5 class=\"light grey-text text-lighten-3\">ENSEÑANDO CON VALORES</h5>\r\n");
      out.write("      </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <img src=\"IMG/LICEO4.jpg\"> <!-- random image -->\r\n");
      out.write("        <div class=\"caption center-align\">\r\n");
      out.write("          <h3>LICEO CRISTIANO ZACAPANECO</h3>\r\n");
      out.write("          <h5 class=\"light grey-text text-lighten-3\">ENSEÑANDO CON VALORES</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <script>\r\n");
      out.write(" \r\n");
      out.write("          \r\n");
      out.write("    document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("    var elems = document.querySelectorAll('.slider');\r\n");
      out.write("    var instances = M.Slider.init(elems,{\r\n");
      out.write("        duration:500,\r\n");
      out.write("        interval:2000,\r\n");
      out.write("        height:600\r\n");
      out.write("    });\r\n");
      out.write("  });      \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" </script>\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("  </html>\r\n");
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import controlador.BeanProyecto;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Proyecto;
import modelo.Conexion;

/**
 *
 * @author nichodeveloper
 */
@WebServlet(name = "ServletRegistro", urlPatterns = {"/ServletRegistro.do"})
public class ServletRegistro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
     
        String Nombre = request.getParameter("Nombre");
        String Convenio = request.getParameter("Convenio");
        String Descripcion = request.getParameter("Descripcion");
        String a = request.getParameter("monto_total");
        String fecha = request.getParameter("fecha");
        String id_municipio = request.getParameter("municipio");
        BigDecimal monto_total = new BigDecimal(a);
        String id_tipo_proyecto2 = request.getParameter("Tipo");
        String direccion  = request.getParameter("Direccion");
        int id_tipo_proyecto = Integer.parseInt(id_tipo_proyecto2);
        
       
        BeanProyecto busuario;
        busuario = new BeanProyecto(Nombre, Convenio, Descripcion, monto_total, direccion, id_municipio, fecha, id_tipo_proyecto);
        
        //String nombre, String num_convenio, String descripcion, 
           //BigDecimal monto_total, String direccion, String id_municipio, String fecha, String id_tipo_proyecto
        boolean sw = Proyecto.agregarProyecto(busuario);

        PrintWriter out = response.getWriter();
        out.println( Nombre  + Convenio + Descripcion + monto_total + direccion +  id_municipio + fecha+ id_tipo_proyecto );

        if (sw) {
            response.sendRedirect("Guardado.jsp");

        } else {

            out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

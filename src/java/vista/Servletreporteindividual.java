/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Cabrera
 */
@WebServlet(name = "Servletreporteindividual", urlPatterns = {"/Servletreporteindividual"})
public class Servletreporteindividual extends HttpServlet {

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
       throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
String convenio = request.getParameter("convenio");
        try {
            try {
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            
 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bd_proyecto;"+
           "user=sa;"+"password=Zacapa2020");
   st = (Statement) con.createStatement();
   rs= st.executeQuery("SELECT TOP (100) PERCENT dbo.t_proyecto.nombre, dbo.t_proyecto.num_convenio, dbo.t_proyecto.descripcion, dbo.t_proyecto.monto_total, dbo.t_municipio.nombre AS Expr1, dbo.t_proyecto.fecha, dbo.t_proyecto.estado, \n" +
"                  dbo.t_proyecto.fecha_comit, dbo.t_municipio.cod_postal\n" +
"FROM     dbo.t_proyecto INNER JOIN\n" +
"                  dbo.t_municipio ON dbo.t_proyecto.id_municipio = dbo.t_municipio.id_municipio\n" +
"WHERE  (dbo.t_proyecto.estado = 1) AND (dbo.t_proyecto.num_convenio ='"+convenio+"')");
   
   if(con!=null){
                       

Document documento = new Document(PageSize.LETTER);
          PdfWriter.getInstance(documento, out);
documento.open();

Paragraph par1 = new Paragraph();
par1.add(new Phrase("CONSEJO DEPARTAMENTAL DE DESARROLLO"));
par1.setAlignment(Element.ALIGN_CENTER);
par1.add(new Phrase(Chunk.NEWLINE));
documento.add(par1);

Paragraph par2 = new Paragraph();
par2.add(new Phrase("DEPARTAMENTO DE ZACAPA"));
par2.setAlignment(Element.ALIGN_CENTER);
par2.add(new Phrase(Chunk.NEWLINE));
par2.add(new Phrase(Chunk.NEWLINE));
documento.add(par2);

Paragraph par3 = new Paragraph();
par3.add(new Phrase("REPORTE DE PROYECTO"));
par3.setAlignment(Element.ALIGN_CENTER);
par3.add(new Phrase(Chunk.NEWLINE));
par3.add(new Phrase(Chunk.NEWLINE));
documento.add(par3);

Paragraph par4 = new Paragraph();
par4.add(new Phrase(""));
par4.setAlignment(Element.ALIGN_CENTER);
par4.add(new Phrase(Chunk.NEWLINE));
par4.add(new Phrase(Chunk.NEWLINE));

//Image imagen = Image.getInstance("C:\\Users\\Carlos Cabrera\\Documents\\GitHub\\CODEDE\\web\\IMG\\consejo2.jpg");
//imagen.setAlignment(Element.ALIGN_CENTER);
//imagen.scaleToFit(300, 300);
//documento.add(imagen);

 PdfPTable Tabla1  = new PdfPTable(3);
            PdfPCell celda6 = new PdfPCell(new Paragraph("Nombre"));
            PdfPCell celda7 = new PdfPCell(new Paragraph("No.Convenio"));
            PdfPCell celda8 = new PdfPCell(new Paragraph("Descripcion"));


            PdfPTable Tabla  = new PdfPTable(4);
            PdfPCell celda9 = new PdfPCell(new Paragraph("Fecha"));
            PdfPCell celda10 = new PdfPCell(new Paragraph("Municipio"));
            PdfPCell celda11 = new PdfPCell(new Paragraph("Monto"));
            PdfPCell celda12 = new PdfPCell(new Paragraph("Cod.Postal"));

            float[] columnWidths = {20f,20f,22f,18f};
            Tabla.setWidths(columnWidths);
            
            Tabla1.addCell(celda6);
        Tabla1.addCell(celda7);
        Tabla1.addCell(celda8);
        Tabla.addCell(celda9);
        Tabla.addCell(celda10);
        Tabla.addCell(celda11);
        Tabla.addCell(celda12);   
        while(rs.next()){
          Tabla1.addCell(rs.getString(1));
          Tabla1.addCell(rs.getString(2));
           Tabla1.addCell(rs.getString(3));
            Tabla.addCell(rs.getString(6));
          Tabla.addCell(rs.getString(5));
           Tabla.addCell(rs.getString(4));
                      Tabla.addCell(rs.getString(9));
        }
documento.add(Tabla1);
documento.add(par4);
                  documento.add(Tabla);
                  
 Connection cone = null;
            Statement stt = null;
            ResultSet rss = null;
            
 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   cone = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bd_proyecto;"+
           "user=sa;"+"password=Zacapa2020");
   stt = (Statement) cone.createStatement();
   rss= stt.executeQuery("SELECT TOP (100) PERCENT dbo.t_proyecto.nombre, dbo.t_proyecto.num_convenio, dbo.t_proyecto.descripcion, dbo.t_proyecto.monto_total, dbo.t_municipio.nombre AS Expr1, dbo.t_proyecto.fecha, dbo.t_proyecto.estado, \n" +
"                  dbo.t_proyecto.fecha_comit, dbo.t_municipio.cod_postal, dbo.t_desembolso.num_desembolso, dbo.t_desembolso.des_porciento\n" +
"FROM     dbo.t_proyecto INNER JOIN\n" +
"                  dbo.t_municipio ON dbo.t_proyecto.id_municipio = dbo.t_municipio.id_municipio INNER JOIN\n" +
"                  dbo.t_desembolso ON dbo.t_proyecto.id_proyecto = dbo.t_desembolso.id_proyecto\n" +
"WHERE  (dbo.t_proyecto.estado = 1) AND (dbo.t_proyecto.num_convenio ='"+convenio+"')");
   
   if(cone!=null){
                       

Paragraph par5 = new Paragraph();
par5.add(new Phrase(""));
par5.setAlignment(Element.ALIGN_CENTER);
par5.add(new Phrase(Chunk.NEWLINE));
par5.add(new Phrase(Chunk.NEWLINE));

//Image imagen = Image.getInstance("C:\\Users\\Carlos Cabrera\\Documents\\GitHub\\CODEDE\\web\\IMG\\consejo2.jpg");
//imagen.setAlignment(Element.ALIGN_CENTER);
//imagen.scaleToFit(300, 300);
//documento.add(imagen);

 PdfPTable Tabla2  = new PdfPTable(2);
            PdfPCell celda1 = new PdfPCell(new Paragraph("No.Desembolso"));
            PdfPCell celda2 = new PdfPCell(new Paragraph("Cantidad En Quetzales"));

            Tabla2.addCell(celda1);
            Tabla2.addCell(celda2);
        
        while(rss.next()){
          Tabla2.addCell(rss.getString(10));
          Tabla2.addCell(rss.getString(11));
        }
documento.add(par5);
        documento.add(Tabla2);


                documento.close();          

            

        } 
    }
        }catch (Exception e) {
        }
        try {
            try {
            Connection cone = null;
            Statement stt = null;
            ResultSet rss = null;
            
 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   cone = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bd_proyecto;"+
           "user=sa;"+"password=Zacapa2020");
   stt = (Statement) cone.createStatement();
   rss= stt.executeQuery("SELECT TOP (100) PERCENT dbo.t_proyecto.nombre, dbo.t_proyecto.num_convenio, dbo.t_proyecto.descripcion, dbo.t_proyecto.monto_total, dbo.t_municipio.nombre AS Expr1, dbo.t_proyecto.fecha, dbo.t_proyecto.estado, \n" +
"                  dbo.t_proyecto.fecha_comit, dbo.t_municipio.cod_postal, dbo.t_desembolso.num_desembolso, dbo.t_desembolso.des_porciento\n" +
"FROM     dbo.t_proyecto INNER JOIN\n" +
"                  dbo.t_municipio ON dbo.t_proyecto.id_municipio = dbo.t_municipio.id_municipio INNER JOIN\n" +
"                  dbo.t_desembolso ON dbo.t_proyecto.id_proyecto = dbo.t_desembolso.id_proyecto\n" +
"WHERE  (dbo.t_proyecto.estado = 1) AND (dbo.t_proyecto.num_convenio ='"+convenio+"')");
   
   if(cone!=null){
                       

Document documento = new Document(PageSize.LETTER);
          PdfWriter.getInstance(documento, out);
documento.open();

Paragraph par4 = new Paragraph();
par4.add(new Phrase(""));
par4.setAlignment(Element.ALIGN_CENTER);
par4.add(new Phrase(Chunk.NEWLINE));
par4.add(new Phrase(Chunk.NEWLINE));

//Image imagen = Image.getInstance("C:\\Users\\Carlos Cabrera\\Documents\\GitHub\\CODEDE\\web\\IMG\\consejo2.jpg");
//imagen.setAlignment(Element.ALIGN_CENTER);
//imagen.scaleToFit(300, 300);
//documento.add(imagen);

 PdfPTable Tabla2  = new PdfPTable(2);
            PdfPCell celda6 = new PdfPCell(new Paragraph("Nombre"));
            PdfPCell celda7 = new PdfPCell(new Paragraph("No.Convenio"));

            Tabla2.addCell(celda6);
            Tabla2.addCell(celda7);
        
        while(rss.next()){
          Tabla2.addCell(rss.getString(10));
          Tabla2.addCell(rss.getString(11));
        }
   
documento.add(Tabla2);
documento.add(par4);

                documento.close();          

            

   }
            }        
    catch (Exception e) {
        }
        
        }catch (Exception e) {
    }
    }catch (Exception e) {
    }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servletreporteindividual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servletreporteindividual.class.getName()).log(Level.SEVERE, null, ex);
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


package vista;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
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
@WebServlet(name = "reporte", urlPatterns = {"/reporte"})
public class Servletreporte extends HttpServlet {

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();

        try {
            try {
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            
 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bd_proyecto;"+
           "user=sa;"+"password=Zacapa2020");
   st = (Statement) con.createStatement();
   rs= st.executeQuery("select id_proyecto, t_proyecto.nombre as nombre, num_convenio, fecha_comit, descripcion, monto_total,  ISnull(id_check, '') id_check, t_municipio.nombre as municipio, cod_postal\n" +
"from  t_proyecto, t_municipio\n" +
"where t_proyecto.id_municipio = t_municipio.id_municipio and estado = 1");
   
   if(con!=null){
                       

Document documento = new Document(PageSize.LETTER.rotate());
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
par3.add(new Phrase("REPORTE DE PROYECTOS ACTIVOS"));
par3.setAlignment(Element.ALIGN_CENTER);
par3.add(new Phrase(Chunk.NEWLINE));
par3.add(new Phrase(Chunk.NEWLINE));
documento.add(par3);


//Image imagen = Image.getInstance("C:\\Users\\Carlos Cabrera\\Documents\\GitHub\\CODEDE\\web\\IMG\\consejo2.jpg");
//imagen.setAlignment(Element.ALIGN_CENTER);
//imagen.scaleToFit(300, 300);
//documento.add(imagen);



            PdfPTable Tabla  = new PdfPTable(7);
            PdfPCell celda6 = new PdfPCell(new Paragraph("Nombre"));
            PdfPCell celda7 = new PdfPCell(new Paragraph("No.Convenio"));
            PdfPCell celda8 = new PdfPCell(new Paragraph("Descripcion"));
            PdfPCell celda9 = new PdfPCell(new Paragraph("Fecha"));
            PdfPCell celda10 = new PdfPCell(new Paragraph("Municipio"));
            PdfPCell celda11 = new PdfPCell(new Paragraph("Monto"));
            PdfPCell celda12 = new PdfPCell(new Paragraph("Cod.Postal"));

            float[] columnWidths = {20f,20f,30f,20f,20f,22f,18f};
            Tabla.setWidths(columnWidths);
            
            Tabla.addCell(celda6);
        Tabla.addCell(celda7);
        Tabla.addCell(celda8);
        Tabla.addCell(celda9);
        Tabla.addCell(celda10);
        Tabla.addCell(celda11);
        Tabla.addCell(celda12);   
        while(rs.next()){

          Tabla.addCell(rs.getString(2));
          Tabla.addCell(rs.getString(3));
           Tabla.addCell(rs.getString(5));
            Tabla.addCell(rs.getString(4));
          Tabla.addCell(rs.getString(8));
           Tabla.addCell(rs.getString(6));
                      Tabla.addCell(rs.getString(9));
        }

                  documento.add(Tabla);   
                documento.close();          

            

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
        Logger.getLogger(Servletreporte.class.getName()).log(Level.SEVERE, null, ex);
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
        Logger.getLogger(Servletreporte.class.getName()).log(Level.SEVERE, null, ex);
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

    private void documento(Rectangle rotate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Font newFont(Font.FontFamily fontFamily, int i, int BOLD, BaseColor BLUE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

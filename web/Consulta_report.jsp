<%-- 
    Document   : Consulta_report
    Created on : 22-ene-2020, 14:56:43
    Author     : busqu
--%>


<%@page import="net.sf.jasperreports.engine.xml.JRXmlLoader"%>
<%@page import="net.sf.jasperreports.engine.design.JasperDesign"%>
<%@page contentType="application/pdf" %>
<%@page trimDirectiveWhitespaces="true" %>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="java.sql.*"%>
<%@page import=" modelo.Conexion"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           Connection con = null;
             
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db_proyecto;"+
           "user=sa;"+"password=1234");
             
                JasperReport jasperReport = null;
JasperDesign jasperDesign = null;
Map parameters = new HashMap();

String path = getServletContext().getRealPath("/WEB-INF/");
jasperDesign = JRXmlLoader.load(path + "/RP.jrxml");
jasperReport = JasperCompileManager.compileReport(jasperDesign);
byte[] byteStream = JasperRunManager.runReportToPdf(jasperReport, parameters, con);
OutputStream outStream = response.getOutputStream();
response.setContentType("application/pdf");
response.setContentLength(byteStream.length);
outStream.write(byteStream, 0, byteStream.length);
                
            }
            
            %>
    </body>
</html>

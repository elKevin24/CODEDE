<%-- 
    Document   : Actualizar.jsp
    Created on : 05-may-2018, 14:39:42
    Author     : nichodeveloper
--%>
<%@page import="controlador.BeanProyecto"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Proyecto"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario Actualizado</title>
    </head>
    
     <body>
        
        <%
            
             boolean res=false;
             String Id_proyecto = request.getParameter("Id_proyecto");
             String Nombre = request.getParameter("Nombre");
             String Convenio = request.getParameter("Convenio");
             String Descripcion = request.getParameter("Descripcion");
             String a= request.getParameter("Monto");
             String Id_municipio = request.getParameter("Id_municipio");
             String id_tipo_proyecto = request.getParameter("Tipo");
             BigDecimal monto_total = new BigDecimal(a);
        
             BeanProyecto user = new BeanProyecto();
             user.setId_proyecto(Id_proyecto);
             user.setNombre(Nombre);
             user.setNum_convenio(Convenio);
             user.setDescripcion(Descripcion);
             user.setMonto_total(monto_total);
             user.setId_municipio(Id_municipio);
             user.setId_tipo_proyecto(id_tipo_proyecto);
             
             
             res=Proyecto.ActualizarUsuario(user);
             if(res)
             {
              out.println("<script> alert('Registro  Actualizado')</script>");
              response.sendRedirect("http://localhost:8084/CODEDE/Guardado.jsp");
               
             }
             else
             {
                  out.println("<script> alert('Error al actualizado el registro')</script>");
             }
             
             
                    
              


         %>
 
    </body>
    
</html>

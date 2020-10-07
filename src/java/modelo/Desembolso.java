/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.BeanDesembolso;
import controlador.BeanProyecto;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author busqu
 */
public class Desembolso {
    
    public static BeanDesembolso consultarSuma(String id) throws SQLException
{
     BeanDesembolso des = new BeanDesembolso();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select SUM(a.des_porciento) as desembolso,  b.monto_total -SUM(a.des_porciento) as diferencia  from t_desembolso a , t_proyecto b\n" +
"where a.id_proyecto = b.id_proyecto and a.id_proyecto = "+id+" group by b.monto_total" )) {
                    while (rs.next())
                    {
                        //des.setDes_porciento(rs.getBigDecimal("des_porciento"));
                        des.setDes_porcentaje(rs.getBigDecimal("desembolso"));
                        des.setDiferencia(rs.getBigDecimal("diferencia"));       
                               
                          
                        
                        
                                                                            
                                                      
                    }  }
             st.close();
         }                    
      }                        
     catch (SQLException e)
      {                                                            
      }                     
                             
    return des;
}    
    
    public static BeanDesembolso Obtener(String fecha, String fecha2) {
        BeanDesembolso user = new BeanDesembolso();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select  SUM(b.monto_total) as monto_total,SUM(a.des_porciento) desembolso, SUM(b.monto_total) -SUM(a.des_porciento) as diferencia\n" +
"from t_desembolso a , t_proyecto b where a.id_proyecto = b.id_proyecto  and b.estado = 1" +
"and fecha_commit between '"+fecha+"' and  '"+fecha2+"'\n" )) {
                    while (rs.next()) {
                        
                        user.setDes_porcentaje(rs.getBigDecimal("monto_total"));
                        user.setDes_porciento(rs.getBigDecimal("desembolso"));
                        user.setDiferencia(rs.getBigDecimal("diferencia"));
                        

                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }
        return user;

    }
    
    
    public static LinkedList<BeanDesembolso> consultarDesembolsos(String id) throws SQLException
{
     LinkedList<BeanDesembolso> desembolso = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT dbo.t_desembolso.des_porciento, dbo.t_desembolso.num_desembolso, dbo.t_desembolso.fecha_commit, dbo.t_desembolso.numero_documento, dbo.catalogoTipodDesembolso.nombre AS Expr1\n" +
"FROM     dbo.t_desembolso INNER JOIN\n" +
"                  dbo.catalogoTipodDesembolso ON dbo.t_desembolso.id_tipo_desembolso = dbo.catalogoTipodDesembolso.id_tipoD where id_proyecto ="+id+"")) {
                    while (rs.next())
                    {
                        BeanDesembolso des = new BeanDesembolso();
                        //des.setDes_porciento(rs.getBigDecimal("des_porciento"));                             
                        des.setDes_porciento(rs.getBigDecimal("des_porciento"));      
                        des.setNum_desembolso(rs.getString("num_desembolso"));             
                        des.setFecha_commit(rs.getString("fecha_commit"));
                        des.setNumero_documento(rs.getString("numero_documento"));
                        des.setId_tipo_desembolso(rs.getString("Expr1"));
                        
                              
                        
                        
                                                                            
                        desembolso.add(des);                                 
                    }  }
             st.close();
         }                    
      }                        
     catch (SQLException e)
      {                                                            
      }                     
                             
    return desembolso;
} 
    
    
    public static boolean ActualizarUsuario(BeanProyecto usuario)
{                                   
    boolean actualizado = false;     
                                            
    try                                        
    {               
         Conexion c=new Conexion();                 
         Connection con=c.getConexion();               
            if(con!=null)                 
            {
                
                
//                user.setNombre(Nombre);
//             user.setNum_convenio(Convenio);
//             user.setDescripcion(Descripcion);
//             user.setMonto_total(monto_total);
//             user.setId_municipio(Id_municipio);
                Statement st;        
                st = con.createStatement();    
//                UNA COMA ME HIZO DESVELARME HASTA LAS DOS DE LA MAÑANA
                String sql="update t_proyecto set nombre ='"+usuario.getNombre()+"', num_convenio='"+usuario.getNum_convenio()+"', descripcion='"+usuario.getDescripcion()+"', monto_total ='"+usuario.getMonto_total()+"', id_municipio='"+usuario.getId_municipio()+"' where id_proyecto="+usuario.getId_proyecto()+"";
                            
                st.execute(sql);
                actualizado=true;
                st.close();
            }                  
                                    
    }                       
   catch (SQLException e)         
   {                            
      actualizado=false;             
   }                                
                               
    return actualizado;          
 }      

    
    
    
    
    public static boolean agregarDesembolso(BeanDesembolso des)
 {
  boolean agregado=false;
  try {
    Conexion c=new Conexion();
    Connection con=c.getConexion();
    if(con!=null){
    Statement st;
    st = con.createStatement();
   
////    --campos de la tabla
//"INSERT INTO t_proyecto(nombre, num_convenio, descripcion, monto_total, id_municipio, fecha) VALUES ('"+Proyecto.getNombre()+"','"+Proyecto.getNum_convenio()+"','"+Proyecto.getDescripcion()+"','"+Proyecto.getMonto_total()+"','"+Proyecto.getMunicipio()+"','"+Proyecto.getFecha_comit()+"')";
    String sql="INSERT INTO [dbo].[t_desembolso]\n" +
"           ([des_porciento]\n" +
"           ,[num_desembolso]\n" +
"           ,[id_proyecto]\n" +
"           ,[id_tipo_desembolso]\n" +
"           ,[numero_documento])\n" +
"     VALUES "
            + "('"+des.getDes_porciento()+"','"+des.getNum_desembolso()+"','"+des.getId_proyecto()+"','"+des.getId_tipo_desembolso()+"','"+des.getNumero_documento()+"' )";
                                                                                       
    System.out.println(sql);                                                                     
    st.execute(sql);                                                                                             
                                                                                                                  
    agregado=true;                                                                                             
    st.close();                                                                                               
   }                                                                                                          
                                                                                                             
  } catch (SQLException e) {                                                                                 
    agregado=false;                                                                                          
  }                                                       
  return agregado;                                    
 }   
    
}

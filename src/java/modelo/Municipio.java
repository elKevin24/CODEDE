
package modelo;
import controlador.BeanMunicipio;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;
import java.util.LinkedList;



public class Municipio {
 
public static LinkedList<BeanMunicipio> consultarUsuario() throws SQLException
{
     LinkedList<BeanMunicipio> municipio = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select id_municipio, nombre from t_municipio" )) {
                    while (rs.next())
                    {
                        BeanMunicipio user = new BeanMunicipio();
                        user.setId_municipio(rs.getString("id_municipio"));       
                        user.setNombre(rs.getString("nombre"));             
                        
                        
                                                                            
                        municipio.add(user);                                 
                    }  }
             st.close();
         }                    
      }                        
     catch (SQLException e)
      {                                                            
      }                     
                             
    return municipio;
}  

                                                 

}

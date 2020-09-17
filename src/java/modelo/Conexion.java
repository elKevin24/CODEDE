
package modelo;

import java.sql.*;

public class Conexion 
{
  Connection con = null;

 public Conexion() {
  try {
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bd_proyecto;"+
           "user=sa;"+"password=1234");
   //jdbc:sqlserver://localhost:1433;databaseName=db_proyecto [sa on dbo]
  
  } 
  catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch bloc

  }
 }
 //este es elultimo
 public Connection getConexion(){
  return con;
 }
 

}
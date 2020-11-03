package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.BeanProyecto;

import java.sql.ResultSet;
import java.util.LinkedList;

public class Proyecto {

    public static LinkedList<BeanProyecto> consultarProyecto() throws SQLException {
        LinkedList<BeanProyecto> proyectos = new LinkedList<>();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select id_proyecto, t_proyecto.nombre as nombre, num_convenio, descripcion, monto_total, direccion, t_municipio.nombre as municipio, fecha\n" +
"                        \n" +
"						from  t_proyecto, t_municipio\n" +
"						where t_proyecto.id_municipio = t_municipio.id_municipio   and estado = 1 order by fecha_comit desc")) {
                    while (rs.next()) {
                        BeanProyecto proyecto = new BeanProyecto();
                        proyecto.setId_proyecto(rs.getString("id_proyecto"));
                        proyecto.setNombre(rs.getString("nombre"));
                        proyecto.setNum_convenio(rs.getString("num_convenio"));
                        proyecto.setDescripcion(rs.getString("descripcion"));
                        proyecto.setMonto_total(rs.getBigDecimal("monto_total"));
                        proyecto.setDireccion(rs.getString("direccion"));
                        proyecto.setId_municipio(rs.getString("municipio"));
                        proyecto.setFecha(rs.getString("fecha"));
                        
                        proyectos.add(proyecto);
                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }

        return proyectos;
    }

    
    public static LinkedList<BeanProyecto> consultarProyecto_Eliminados() throws SQLException {
        LinkedList<BeanProyecto> proyectos = new LinkedList<>();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select id_proyecto, t_proyecto.nombre as nombre, num_convenio, descripcion, monto_total, fecha\n" +
"from  t_proyecto where  estado = 0 order by fecha_comit desc")) {
                    while (rs.next()) {
                        BeanProyecto proyecto = new BeanProyecto();
                        proyecto.setId_proyecto(rs.getString("id_proyecto"));
                        proyecto.setNombre(rs.getString("nombre"));
                        proyecto.setNum_convenio(rs.getString("num_convenio"));
                        proyecto.setDescripcion(rs.getString("descripcion"));
                        proyecto.setMonto_total(rs.getBigDecimal("monto_total"));
                        proyecto.setFecha(rs.getString("fecha"));

                        proyectos.add(proyecto);
                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }

        return proyectos;
    }
    
    
    public static LinkedList<BeanProyecto> consultarProyecto_Terminado() throws SQLException {
        LinkedList<BeanProyecto> proyectos = new LinkedList<>();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select  b.id_proyecto, b.nombre, num_convenio, descripcion,  direccion,  b.monto_total,SUM(a.des_porciento) desembolso, b.monto_total -SUM(a.des_porciento) as diferencia\n" +
"from t_desembolso a , t_proyecto b where a.id_proyecto = b.id_proyecto  and b.estado = 1\n" +
"\n" +
"group by b.nombre, b.id_proyecto, b.monto_total, num_convenio, descripcion, direccion\n" +
"having b.monto_total -SUM(a.des_porciento) = 0;")) {
                    while (rs.next()) {
                        BeanProyecto proyecto = new BeanProyecto();
                        proyecto.setId_proyecto(rs.getString("id_proyecto"));
                        proyecto.setNombre(rs.getString("nombre"));
                        proyecto.setNum_convenio(rs.getString("num_convenio"));
                        proyecto.setDescripcion(rs.getString("descripcion"));
                        proyecto.setMonto_total(rs.getBigDecimal("monto_total"));
                        proyecto.setDireccion(rs.getString("direccion"));                      
                        
                        proyectos.add(proyecto);
                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }

        return proyectos;
    }
    
    public static LinkedList<BeanProyecto> consultarProyectos(String fecha, String fecha2) throws SQLException {
        LinkedList<BeanProyecto> proyectos = new LinkedList<>();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select  b.id_proyecto, b.nombre, num_convenio, descripcion,  direccion, b.monto_total,SUM(a.des_porciento) as desembolso, b.monto_total -SUM(a.des_porciento) as diferencia\n" +
"from t_desembolso a , t_proyecto b where a.id_proyecto = b.id_proyecto  and b.estado = 1\n" +
"and fecha_commit between '"+fecha+"' and  '"+fecha2+"'\n" +
"group by b.nombre, b.id_proyecto, b.monto_total, num_convenio, descripcion, direccion")) {
                    while (rs.next()) {
                        BeanProyecto proyecto = new BeanProyecto();
                        proyecto.setId_proyecto(rs.getString("id_proyecto"));
                        proyecto.setNombre(rs.getString("nombre"));
                        proyecto.setNum_convenio(rs.getString("num_convenio"));
                        proyecto.setDescripcion(rs.getString("descripcion"));
                        
                        proyecto.setDireccion(rs.getString("direccion")); 
                        proyecto.setMonto_total(rs.getBigDecimal("monto_total"));
                        proyecto.setInvertido(rs.getBigDecimal("desembolso"));
                        proyecto.setTotal(rs.getBigDecimal("diferencia"));
                        
                        
                        proyectos.add(proyecto);
                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }

        return proyectos;
    }
    
    
    
    public static boolean ActualizarUsuario(BeanProyecto usuario) {
        boolean actualizado = false;

        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {

                Statement st;
                st = con.createStatement();
//                UNA COMA ME HIZO DESVELARME HASTA LAS DOS DE LA MAÑANA
                String sql = "update t_proyecto set nombre ='" + usuario.getNombre() + "', num_convenio='" + usuario.getNum_convenio() + "', descripcion='" + usuario.getDescripcion() + "', monto_total ='" + usuario.getMonto_total() + "', id_municipio='" + usuario.getId_municipio() + "' , id_tipo_proyecto='" + usuario.getId_tipo_proyecto() + "' where id_proyecto=" + usuario.getId_proyecto() + "";

                st.execute(sql);
                actualizado = true;
                st.close();
            }

        } catch (SQLException e) {
            actualizado = false;
        }

        return actualizado;
    }

    public static boolean CambiarEstado(String id) {
        boolean actualizado = false;

        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                //UNA COMA ME HIZO DESVELARME HASTA LAS DOS DE LA MAÑANA
                String sql = "update t_proyecto set estado ='0' where id_proyecto=" + id + "";
                //"update tbl_seccion set grado ='"+usuario.getGrado()+"', seccion='"+usuario.getSeccion()+"', Id_nivel='"+usuario.getId_nivel()+"' where Id_seccion="+usuario.getId_seccion()+"";

                st.execute(sql);
                actualizado = true;
                st.close();
            }

        } catch (SQLException e) {
            actualizado = false;
        }

        return actualizado;
    }

    public static BeanProyecto ObtenerProyecto(String id) {
        BeanProyecto user = new BeanProyecto();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select id_proyecto, t_proyecto.nombre as nombre, num_convenio, descripcion, monto_total, direccion, t_municipio.nombre as municipio, fecha, tipo_proyecto as tipo\n"
                        + "from  t_proyecto, t_municipio, t_tipoproyecto\n"
                        + "where t_proyecto.id_municipio = t_municipio.id_municipio\n"
                        + "and t_proyecto.id_tipo_proyecto = t_tipoproyecto.id_tipoProyecto and estado = 1 and id_proyecto = " + id + " ORDER BY id_proyecto DESC")) {
                    while (rs.next()) {
                        user.setId_proyecto(rs.getString("id_proyecto"));
                        user.setNombre(rs.getString("nombre"));
                        user.setNum_convenio(rs.getString("num_convenio"));
                        user.setDescripcion(rs.getString("descripcion"));
                        user.setMonto_total(rs.getBigDecimal("monto_total"));
                        user.setDireccion(rs.getString("direccion"));
                        user.setId_municipio(rs.getString("municipio"));
                        user.setFecha(rs.getString("fecha_comit"));
                        user.setId_tipo_proyecto(rs.getInt("tipo"));

                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }
        return user;

    }

    public static boolean agregarProyecto(BeanProyecto Proyecto) {
        boolean agregado = false;
        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();

////    --campos de la tabla
//"INSERT INTO t_proyecto(nombre, num_convenio, descripcion, monto_total, id_municipio, fecha) VALUES ('"+Proyecto.getNombre()+"','"+Proyecto.getNum_convenio()+"','"+Proyecto.getDescripcion()+"','"+Proyecto.getMonto_total()+"','"+Proyecto.getMunicipio()+"','"+Proyecto.getFecha_comit()+"')";
                String sql = "INSERT INTO t_proyecto(nombre, num_convenio, descripcion, monto_total, direccion, fecha, id_municipio, id_tipo_proyecto) VALUES "
                        + "('" + Proyecto.getNombre() + "','" + Proyecto.getNum_convenio() + "','" + Proyecto.getDescripcion() + "','" + Proyecto.getMonto_total() + "', '" + Proyecto.getDireccion() + "','" + Proyecto.getFecha() + "','" + Proyecto.getId_municipio() + "','" + Proyecto.getId_tipo_proyecto() + "')";

                System.out.println(sql);
                st.execute(sql);

                agregado = true;
                st.close();
            }

        } catch (SQLException e) {
            agregado = false;
        }
        return agregado;
    }

}

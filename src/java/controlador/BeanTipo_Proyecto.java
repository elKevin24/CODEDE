package controlador;

public class BeanTipo_Proyecto {

    public String getId_tipoProyecto() {
        return id_tipoProyecto;
    }

    public void setId_tipoProyecto(String id_tipoProyecto) {
        this.id_tipoProyecto = id_tipoProyecto;
    }

    public String getTipo_proyecto() {
        return tipo_proyecto;
    }

    public void setTipo_proyecto(String tipo_proyecto) {
        this.tipo_proyecto = tipo_proyecto;
    }
    
    


    public BeanTipo_Proyecto( String tipo_proyecto) {
     
        this.tipo_proyecto = tipo_proyecto;
     
    }

    private String id_tipoProyecto  ;
    private String tipo_proyecto;
   
   
    
    
    public BeanTipo_Proyecto() {
    }

}

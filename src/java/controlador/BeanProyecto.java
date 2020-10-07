package controlador;

import java.math.BigDecimal;

public class BeanProyecto {

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_convenio() {
        return num_convenio;
    }

    public void setNum_convenio(String num_convenio) {
        this.num_convenio = num_convenio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(BigDecimal monto_total) {
        this.monto_total = monto_total;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(String id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId_tipo_proyecto() {
        return id_tipo_proyecto;
    }

    public void setId_tipo_proyecto(String id_tipo_proyecto) {
        this.id_tipo_proyecto = id_tipo_proyecto;
    }

    public BigDecimal getInvertido() {
        return invertido;
    }

    public void setInvertido(BigDecimal invertido) {
        this.invertido = invertido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
    
    


    public BeanProyecto(String nombre, String num_convenio, String descripcion, 
           BigDecimal monto_total, String direccion, String id_municipio, String fecha, String id_tipo_proyecto ) {
        
        
        this.nombre = nombre;
        this.num_convenio = num_convenio;
        this.descripcion = descripcion;     
        this.monto_total = monto_total;
        this.direccion = direccion;                      
        this.id_municipio = id_municipio;
        this.fecha = fecha; 
        this.id_tipo_proyecto = id_tipo_proyecto;
        


        
        
    }

    private String id_proyecto;
    private String nombre;
    private String num_convenio;    
    private String descripcion;
    private BigDecimal monto_total;
    private BigDecimal invertido;
    private BigDecimal total;
    private String direccion;    
    private String id_municipio;
    private String fecha;
    private String estado;
    private String id_tipo_proyecto;
    
    public BeanProyecto() {
    }

}

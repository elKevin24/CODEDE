package controlador;

import java.math.BigDecimal;

public class BeanUsuario {

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

    public String getFecha_comit() {
        return fecha_comit;
    }

    public void setFecha_comit(String fecha_comit) {
        this.fecha_comit = fecha_comit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   

    

    public String getId_check() {
        return id_check;
    }

    public void setId_check(String id_check) {
        this.id_check = id_check;
    }

    public String getId_avance() {
        return id_avance;
    }

    public void setId_avance(String id_avance) {
        this.id_avance = id_avance;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public BigDecimal getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(BigDecimal monto_total) {
        this.monto_total = monto_total;
    }

    public String getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(String id_municipio) {
        this.id_municipio = id_municipio;
    }
    
    

    


    public BeanUsuario(String nombre, String num_convenio, String descripcion, 
           BigDecimal monto_total, String fecha_comit,  String municipio) {
        
        
        this.nombre = nombre;
        this.num_convenio = num_convenio;
        this.descripcion = descripcion;
        this.fecha_comit = fecha_comit;
        this.cod_postal = cod_postal;
        this.id_avance = id_avance;
        this.id_check = id_check;
        this.monto_total = monto_total;
        this.municipio = municipio;
        this.id_municipio = id_municipio;


        
        
    }

    private String id_proyecto;
    private String nombre;
    private String num_convenio;
    private String fecha_comit;
    private String descripcion;
    private BigDecimal monto_total;
    private String id_check;
    private String id_avance;
    private String id_municipio;
    private String municipio;
    private String cod_postal;
    
    public BeanUsuario() {
    }

}

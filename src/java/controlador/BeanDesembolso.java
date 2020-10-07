package controlador;

import java.math.BigDecimal;

public class BeanDesembolso {

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getId_desembolso() {
        return id_desembolso;
    }

    public void setId_desembolso(String id_desembolso) {
        this.id_desembolso = id_desembolso;
    }

    public String getNum_desembolso() {
        return num_desembolso;
    }

    public void setNum_desembolso(String num_desembolso) {
        this.num_desembolso = num_desembolso;
    }

    public String getFecha_commit() {
        return fecha_commit;
    }

    public void setFecha_commit(String fecha_commit) {
        this.fecha_commit = fecha_commit;
    }

    public BigDecimal getDes_porciento() {
        return des_porciento;
    }

    public void setDes_porciento(BigDecimal des_porciento) {
        this.des_porciento = des_porciento;
    }

    public BigDecimal getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(BigDecimal diferencia) {
        this.diferencia = diferencia;
    }

    public BigDecimal getDes_porcentaje() {
        return des_porcentaje;
    }

    public void setDes_porcentaje(BigDecimal des_porcentaje) {
        this.des_porcentaje = des_porcentaje;
    }

    public String getId_tipo_desembolso() {
        return id_tipo_desembolso;
    }

    public void setId_tipo_desembolso(String id_tipo_desembolso) {
        this.id_tipo_desembolso = id_tipo_desembolso;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }
    
    

    
    

    


    public BeanDesembolso(BigDecimal des_porciento, String num_desembolso, String id_proyecto, String id_tipo_desembolso, String numero_documento) {
        
        
        
        
        this.num_desembolso = num_desembolso;
        this.des_porciento = des_porciento;
        this.id_proyecto = id_proyecto;
        this.id_tipo_desembolso = id_tipo_desembolso;
        this.numero_documento = numero_documento;
      
        


        
        
    }

    private String id_desembolso;
    private BigDecimal des_porcentaje;
    private String num_desembolso;
    private String id_proyecto;
    private String fecha_commit;
    private String id_tipo_desembolso;
    private String numero_documento;
    private BigDecimal des_porciento;
    private BigDecimal diferencia;
    
    
    public BeanDesembolso() {
    }

}

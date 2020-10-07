package controlador;

public class BeanMunicipio {

    public String getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(String id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

   
    
    

    
    

    


    public BeanMunicipio( String nombre, String cod_postal) {
        
        
        
        
        
        this.nombre = nombre;
        this.cod_postal = cod_postal;
      
        


        
        
    }

    private String id_municipio;
    private String nombre;
    private String cod_postal;
   
    
    
    public BeanMunicipio() {
    }

}

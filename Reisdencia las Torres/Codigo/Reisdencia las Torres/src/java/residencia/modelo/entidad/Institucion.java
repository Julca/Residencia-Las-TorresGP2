package residencia.modelo.entidad;
// Generated 19/06/2015 03:07:59 PM by Hibernate Tools 4.3.1



/**
 * Institucion generated by hbm2java
 */
public class Institucion  implements java.io.Serializable {


     private String idInstitucion;
     private String nombre;

    public Institucion() {
    }

	
    public Institucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }
    public Institucion(String idInstitucion, String nombre) {
       this.idInstitucion = idInstitucion;
       this.nombre = nombre;
    }
   
    public String getIdInstitucion() {
        return this.idInstitucion;
    }
    
    public void setIdInstitucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}



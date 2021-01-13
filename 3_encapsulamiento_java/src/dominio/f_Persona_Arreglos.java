
package dominio;


public class f_Persona_Arreglos {
    private String nombre;

    public f_Persona_Arreglos(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "f_Persona_Arreglos{" + "nombre=" + nombre + '}';
    }
    
    
}

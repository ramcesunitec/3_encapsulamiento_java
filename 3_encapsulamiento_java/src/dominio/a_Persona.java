
package dominio;


public class a_Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public a_Persona() {
    }

    
    public a_Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "a_Persona{" + "nombre=" + nombre + 
                ", sueldo=" + sueldo + 
                ", eliminado=" + eliminado + '}';
    }
    
    
}

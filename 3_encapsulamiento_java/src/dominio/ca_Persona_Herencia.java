package dominio;

public class ca_Persona_Herencia {
    
    //Variables
    protected String nombre; //protected se usa solo para herencia, aunque este en otro paquete la clases hijas pueden acceder a la variable ´por el protected
    protected char genero;
    protected int edad;
    protected String direccion;

    
    //Constructor(es)
    public ca_Persona_Herencia() {
    }

    public ca_Persona_Herencia(String nombre) {
        this.nombre = nombre;
    }

    public ca_Persona_Herencia(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    
    //Metodos set y get
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    //Metodo toString
    @Override
    public String toString() {
        return "ca_Persona_Herencia{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
}

package dominio;

public class b_Persona_ContextoEstatico {

    private int idPersona;
    private String nombre;
    private static int contadorPersona;

    public b_Persona_ContextoEstatico(String nombre) {
        this.nombre = nombre;

        //Incrementar el contador por cada objeto nuevo
        b_Persona_ContextoEstatico.contadorPersona++;

        //Asignar nuevo valor a la variable persona
        this.idPersona = b_Persona_ContextoEstatico.contadorPersona;

    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "b_Persona_ContextoEstatico{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}

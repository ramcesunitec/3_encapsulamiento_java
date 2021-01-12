package dominio;

public class cb_Empleado_Herencia extends ca_Persona_Herencia {

    //extends para indicar que esta clase es hija y el nombre de la clase padre(todas sus caracteristicas ys estan disponibles en esta clase)
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public cb_Empleado_Herencia() {
    }

    public cb_Empleado_Herencia(String nombre, double sueldo) {
        super(nombre);//con super nos permite ingresar a los contructores creados en la clase padre 
        this.idEmpleado=++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        return "cb_Empleado_Herencia{" + "idEmpleado=" + idEmpleado + ", {" + super.toString() +"} , sueldo=" + sueldo + '}';
    }

    

    
    
    
    
    
    

}


package ventas_DiseñoClase;


public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        this.idProducto=++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this(); //Se ejecuta el contructor privado
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
}


package z_laboratorio_final_fundamentos_java.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor=++contadorMonitores;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}

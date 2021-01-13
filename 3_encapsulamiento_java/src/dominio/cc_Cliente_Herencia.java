package dominio;

import java.util.*;

public class cc_Cliente_Herencia extends ca_Persona_Herencia {

    private int idCliente;
    private static int contadorCliente;
    private Date fechaRegistro;
    private boolean vip;

    public cc_Cliente_Herencia() {
    }

    public cc_Cliente_Herencia(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "cc_Cliente_Herencia{" + "idCliente=" + idCliente + ", {" + super.toString() + "} , fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }

}

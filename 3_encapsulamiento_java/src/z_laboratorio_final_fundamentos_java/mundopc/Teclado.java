
package z_laboratorio_final_fundamentos_java.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado=++contadorTeclados;
    }

    
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado +", {"+super.toString()+ "}}";
    }

    
    
    
}

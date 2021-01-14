package z_laboratorio_final_fundamentos_java.mundopc;


public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;

    public Orden() {
        this.idOrden=++contadorOrdenes;
        computadoras=new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras<MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras++]=computadora;
        }else{
            System.out.println("Has superado el limite");
        }
    }
    
    public void mostrarOrden(){
        
        System.out.println("Id Orden: "+idOrden);
        System.out.println("Computadoras de la orden:"+idOrden); 
       for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
    
}


package z_laboratorio_final_fundamentos_java.testMundopc;

import z_laboratorio_final_fundamentos_java.mundopc.*;





public class testMundoPc {
    public static void main(String[] args) {
        Monitor monitorHP=new Monitor("HP", 13);
        Teclado tecladoHP=new Teclado("Bluetooth", "HP");
        Raton ratomHP=new Raton("Bluetooth", "HP");
        Computadora computadoraHP= new Computadora("Computadora HP", monitorHP, tecladoHP, ratomHP);
        
        Monitor monitorDELL=new Monitor("DELL", 34);
        Teclado tecladoDELL=new Teclado("Cable", "DELL");
        Raton ratonDELL=new Raton("Cable", "DELL");
        Computadora computadoraDELL= new Computadora("Computadora DELL", monitorDELL, tecladoDELL, ratonDELL);
       
        Monitor monitorGAMER=new Monitor("GAMER", 55);
        Teclado tecladoGAMER=new Teclado("Bluetooth", "GAMER");
        Raton ratomGAMER=new Raton("Cable", "GAMER");
        Computadora computadoraGAMER= new Computadora("Computadora GAMER", monitorGAMER, tecladoGAMER, ratomGAMER);
        
        Orden orden1=new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDELL);
        orden1.agregarComputadora(computadoraGAMER);
        
        orden1.mostrarOrden();
    }
}

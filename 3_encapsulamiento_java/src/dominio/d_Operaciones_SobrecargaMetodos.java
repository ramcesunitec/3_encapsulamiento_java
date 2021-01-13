
package dominio;


public class d_Operaciones_SobrecargaMetodos {
    //Sobrecarga de Metodos es tener dos o mas funciones con el mismo nombre pero diferentes argumentos
    
    public static int sumar(int a, int b){
        System.out.println("Sumar(int a, int b) ");
        return a+b;
    }
    
    public static double sumar(double a, double b){
        System.out.println("Sumar(double a, double b) ");
        return a+b;
    }
}

package test;

import dominio.d_Operaciones_SobrecargaMetodos;

public class da_TestOperaciones_SobrecargaMetodos {

    public static void main(String[] args) {
        var resultado = d_Operaciones_SobrecargaMetodos.sumar(2, 2); //Metodo entero{
        System.out.println("resultado= " + resultado);
        System.out.println("");

        var resultado1 = d_Operaciones_SobrecargaMetodos.sumar(5.2, 5);//Metodo double
        System.out.println("resultado1= " + resultado1);
    }
}

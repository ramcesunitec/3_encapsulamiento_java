
package test;

import dominio.g_Persona_Matrices;


public class gb_TestMatricesObject_Matrices {
    public static void main(String[] args) {
        
        g_Persona_Matrices personas[][]=new g_Persona_Matrices[2][3];
        personas[0][0]=new g_Persona_Matrices("Ramces");
        personas[0][1]=new g_Persona_Matrices("Nancy");
        personas[0][2]=new g_Persona_Matrices("Santiago");
        
        personas[1][0]=new g_Persona_Matrices("Manuel");
        personas[1][1]=new g_Persona_Matrices("Lulu");
        personas[1][2]=new g_Persona_Matrices("Estrella");
        
        imprimir(personas);
        
        System.out.println("");
        String frutas[][]={{"Naranja", "Limon"},{"Fresa","Zarzamora","Mora"}};
        imprimir(frutas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.println("personas (fila " + f + " ,columna " + c + ")= " + matriz[f][c]);
            }
            
        }
    }
}

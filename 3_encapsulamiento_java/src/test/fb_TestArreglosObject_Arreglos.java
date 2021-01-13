
package test;

import dominio.f_Persona_Arreglos;


public class fb_TestArreglosObject_Arreglos {
    public static void main(String[] args) {
        f_Persona_Arreglos personas[]=new f_Persona_Arreglos[2];
        
        personas[0]=new f_Persona_Arreglos("Ramces");
        personas[1]=new f_Persona_Arreglos("Nancy");
        
        System.out.println("Persona(indice 0) "+personas[0]);
        System.out.println("Persona(indice 1) "+personas[1]);
        
        System.out.println("");
        
        for(int i=0;i<personas.length;i++){
            System.out.println("personas "+i+" ="+personas[i]);
        }
        
    }
}

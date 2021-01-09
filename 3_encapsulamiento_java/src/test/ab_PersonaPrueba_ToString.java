
package test;

import dominio.a_Persona;

public class ab_PersonaPrueba_ToString {
    public static void main(String[] args) {
        a_Persona persona1=new a_Persona("Nancy",25000, false);
        
        System.out.println("persona1 :"+persona1.toString());
        
        persona1.setNombre("Ramces");
        System.out.println("persona1: "+persona1);
    }
}

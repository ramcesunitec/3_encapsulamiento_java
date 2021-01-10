
package test;

import dominio.b_Persona_ContextoEstatico;


public class bb_PersonaPrueba_ContextoEstatico2 {
    public static void main(String[] args) {
        b_Persona_ContextoEstatico persona1=new b_Persona_ContextoEstatico("Ram");
        b_Persona_ContextoEstatico persona2=new b_Persona_ContextoEstatico("Nan");
        
        imprimir(persona1);
        imprimir(persona2);
    }
    
   public static void imprimir(b_Persona_ContextoEstatico persona){
       System.out.println("Persona= "+persona);
   }
}

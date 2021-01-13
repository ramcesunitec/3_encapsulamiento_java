
package test;

import dominio.e_Persona_PalabraFinal;


public class ea_TestFinal_PalabraFinal {
    public static void main(String[] args) {
        final int miVariable=10; //COn final no podemos modificar la variable
        System.out.println("miVariable "+miVariable);
        
        //Por final no se puede alterar MI_CONSTANTE
        //e_Persona_PalabraFinal.MI_CONSTANTE=10; 
        
        System.out.println("MI_CONSTANTE= "+e_Persona_PalabraFinal.MI_CONSTANTE);
        
        final e_Persona_PalabraFinal persona1=new e_Persona_PalabraFinal();
        
        persona1.setNombre("Ramces");
        System.out.println("nombre="+persona1.getNombre());
        
        
    }
   
}

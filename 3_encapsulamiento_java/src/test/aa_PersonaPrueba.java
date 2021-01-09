
package test;

import dominio.a_Persona;




public class aa_PersonaPrueba {
    public static void main(String[] args) {
        a_Persona persona1=new a_Persona();
        persona1.setNombre("Ramces");
        persona1.setSueldo(22000);
        persona1.setEliminado(false);
        
        System.out.println("Persona1 nombre: "+persona1.getNombre());
        System.out.println("Persona1 sueldo: "+persona1.getSueldo());
        System.out.println("Persona1 eliminado: "+persona1.isEliminado());
        
        a_Persona persona2=new a_Persona("Nancy",25000, true);
        System.out.println("Persona1 nombre: "+persona2.getNombre());
        System.out.println("Persona1 sueldo: "+persona2.getSueldo());
        System.out.println("Persona1 eliminado: "+persona2.isEliminado());
        
    }
}

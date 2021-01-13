
package test;

import dominio.cb_Empleado_Herencia;
import dominio.cc_Cliente_Herencia;
import java.util.Date;


public class c_TestHerencia {
    public static void main(String[] args) {
        cb_Empleado_Herencia empleado1=new cb_Empleado_Herencia("Ramces", 10000.0);
        System.out.println("empleado1: "+empleado1);
        
        cb_Empleado_Herencia empleado2=new cb_Empleado_Herencia("Nancy", 20000.0);
        System.out.println("empleado2: "+empleado2);
        
        
        System.out.println("");
        System.out.println("");
        
        
        var fecha=new Date();
        cc_Cliente_Herencia cliente1=new cc_Cliente_Herencia(fecha, true, "Nancy", 'F', 21, "Emilio Carranza No.9");
        System.out.println("cliente1: "+cliente1);
        
        
        cc_Cliente_Herencia cliente2=new cc_Cliente_Herencia(fecha, true, "Ramces", 'M', 22, "San Bernabe 125");
        System.out.println("cliente1: "+cliente2);
    }
 
}

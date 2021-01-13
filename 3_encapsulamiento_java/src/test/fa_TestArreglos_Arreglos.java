package test;

public class fa_TestArreglos_Arreglos {

    public static void main(String[] args) {
        //Arreglo tipo object
        
        int edades[] = new int[3]; //Lado izquierdo del igual, informamos que es un arreglo y lado derecho tamaño del arreglo
        System.out.println("" + edades);

        //Modificamos elementos del arreglo accediendo a sus elementos 
        edades[0] = 10;
        System.out.println("edades(indice 0)= " + edades[0]);

        edades[1] = 5;
        System.out.println("edades(indice 1)= " + edades[1]);

        edades[2] = 20;
        System.out.println("edades(indice 2)= " + edades[2]);
        
        //Iteracion de todos los elementos con cliclo for
        System.out.println("");
                
        for(int i=0; i<edades.length;i++){
            System.out.println("Edades elemento "+i+": "+edades[i]);
        }
        System.out.println("");
        
        //Sintaxis resumida
        String frutas[]={"Naranja","Platano","Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta "+i+" ="+frutas[i]);
        }
    }

}

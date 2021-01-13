package test;

public class ga_TestMatrices_Matrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];//Primer corchete filas, segundo corchete columnas; tamaño de la matriz 

        edades[0][0] = 5;
        edades[0][1] = 9;

        edades[1][0] = 10;
        edades[1][1] = 15;

        //MATRIZ
        //     0    1
        //0   [5]  [9]
        //1   [10] [15]   
        //2   [0]  [0]
        System.out.println("edades(fila 0, columna 0)= " + edades[0][0]);
        System.out.println("edades(fila 0, columna 1)= " + edades[0][1]);
        System.out.println("");

        System.out.println("edades(fila 1, columna 0)= " + edades[1][0]);
        System.out.println("edades(fila 1, columna 1)= " + edades[1][1]);
        System.out.println("");

        System.out.println("edades(fila 2, columna 0)= " + edades[2][0]);
        System.out.println("edades(fila 2, columna 1)= " + edades[2][1]);
        System.out.println("");
        System.out.println("");

        //Ciclo for anidado, se interan primero renglones, por cada renglon se interan las columnas
        for (int fil = 0; fil < edades.length; fil++) {  //Se interacion filas
            for (int col = 0; col < edades[fil].length; col++) {  //Se interan columnas(parametro filas)
                System.out.println("edades (fila " + fil + " ,columna " + col + ")= " + edades[fil][col]);
            }
        }
        
        //Sitaxis simplificada
        System.out.println("");
        String frutas[][]={{"Naranja", "Limon"},{"Fresa","Zarzamora","Mora"}};
        for (int f = 0; f < frutas.length; f++) {
            for (int c = 0; c < frutas[f].length; c++) {
                System.out.println("frutas (fila " + f + " ,columna " + c + ")= " + frutas[f][c]);
            }
            
        }
        
        

    }
}

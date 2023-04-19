
package actividades.Ejercicios;

import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     int[][] matriz = new int[3][3];
        System.out.println("Ingrese llos numero de la matriz");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[f][c] = leer.nextInt();

            }

        }
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(matriz[f][c] + " | ");

            }
            System.out.println("");
            
        }
        System.out.println("");
      
        
        for (int c = 0; c < matriz.length; c++) {
            for (int f = 0; f < matriz.length; f++) {
                System.out.print(matriz[f][c] + " | ");

            }
            System.out.println("");
        }
        boolean vOf = false;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
            if(matriz[f][c] == -matriz[c][f]){
                vOf = true;
            }
        }
            
        }
        System.out.println("\n");
        if(vOf == true){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("la matriz NO es antisimetrica");
             }

    }
}
    


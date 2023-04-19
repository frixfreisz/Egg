
package actividades.Ejercicios;

import java.util.Scanner;

public class paraProbar {

    public static void main(String[] args) {
        
        int n = 3;
        String[] vector = new String[n*n];
        
        for (int fila = 0; fila < vector.length; fila+=n) {
            for (int columna = fila; columna < fila+n; columna++) {
               if (fila == 0 || fila == vector.length - n || columna == fila || columna == fila + n-1){
                   vector[columna] = " *";
               }else
                   vector[columna] = "  ";
            }
            
            
        }
        for (int i = 0; i < vector.length; i++) {
            
            if(i > 0 && i%n == 0){
                
                System.out.println("");
            }
            System.out.print(vector[i]);
            
        }
        
    }
          
}


package actividades.Ejercicios;

import java.util.Scanner;

public class Ej15 {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
      int[] vector = new int[100];
      
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
            
         }
        for (int i = vector.length - 1; i >=0; i--) {
            System.out.println(vector[i]);
            
            
        }
        
        
    }
}        
    

             
                

    


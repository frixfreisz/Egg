
package actividades.Ejercicios;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Defina el tamanio del cuadrado");
        int n = leer.nextInt();
        
        for (int c = 0; c <= n; c++) 
            System.out.print(" *");
        System.out.println("");
            
            for (int f = 1; f < n; f++) {
                System.out.print(" *");
                for (int c = 1; c < n; c++)
                    System.out.print("  ");
                
                System.out.println(" *");

            }
            for (int c = 0; c <= n; c++)
            System.out.print(" *");
        
    }
    
}

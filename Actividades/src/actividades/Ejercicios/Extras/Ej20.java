
package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {
        int[] v = new int [4];
        
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random() * 10);
            System.out.print(v[i] + " | ");
            
        }
        
    }
    
}

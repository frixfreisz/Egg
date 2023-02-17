
package actividades.Ejercicios;

import java.util.Scanner;

public class Act04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrece el valor de grados centigrados");
        double gC = leer.nextDouble();
        double gF = 32 + (9 * gC / 5);
        
        System.out.println(gC + " Grados Centigrados equivalen a " + gF + " Grados Fahrenheit");
        
    }
    
}

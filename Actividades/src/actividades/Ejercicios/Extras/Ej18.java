
package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma = 0;
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        leer.nextLine();
        int [] vector = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("ingrese un numero");
            vector[i] = leer.nextInt();
            suma += vector[i];
            
            
        }
        System.out.println("La suma del vetor es: " + suma);
    } 
    
}

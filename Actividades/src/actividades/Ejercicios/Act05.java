
package actividades.Ejercicios;

import java.util.Scanner;

public class Act05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
         
        System.out.println("El doble de " + num + " es " + num * 2);
        System.out.println("El triple de " + num + " es " + num * 3);
        System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
        
    }
    
}

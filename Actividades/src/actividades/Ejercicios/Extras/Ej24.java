
package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej24 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        System.out.println("ingrese la cantidad de numeros");
        int n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                vector[i] = 1;
                System.out.print("*" + vector[i] + "*");

            } else {

                vector[i] = vector[i - 1] + vector[i - 2];
                System.out.print("*" + vector[i] + "*");

            }

        }

    }

}
    
    


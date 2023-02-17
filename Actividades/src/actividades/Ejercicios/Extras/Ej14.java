
package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej14 {
static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int n, cHijos, edades = 0, suma = 0;
        double prom = 0,contEdad = 0; 
        System.out.println("Ingrese el numero de familias");
        n = leer.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + i);
            cHijos = leer.nextInt();
            for (int j = 0; j < cHijos; j++) {
                System.out.println("Ingrese las edades de la famila ");
                edades = leer.nextInt();
                contEdad++;
                suma = suma + edades;
            }
            
        }
                prom =  suma / contEdad;
                System.out.println("El promedio de edades de las familias es de" + prom + "%");
    }
    
}



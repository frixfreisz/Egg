
package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un dividendo");
        int dividendo = leer.nextInt();
        System.out.println("Ingresa un divisoe");
        int divisor = leer.nextInt();
        int contador = 0;
        
        dividendo = dividendo - divisor;
        
        while(dividendo >= 0){
            contador++;
            dividendo = dividendo - divisor;
        }
        System.out.println("La divicion es igual a: " + contador);
    }
    
    
}

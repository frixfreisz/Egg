package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej11 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int numero, contador = 0;
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();
        System.out.println("El numero es: " + numero);
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("Cantidad de cifras: " + contador);
    }
}    
                
      

package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej01 {

        static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Convertidor de minutos.");
        System.out.println("cuantos minutos quiere convertir?");
        int min = leer.nextInt();
        convertidor(min);
    }
    
    public static void convertidor(int min){
    int dias, horas, resto;
    horas = min/60;
    dias = horas/24;
    resto = horas%24;
    System.out.println("para " + min + " minutos, el total de dias es de " + dias + " y de horas son " + resto +" horas");
    }

    
}


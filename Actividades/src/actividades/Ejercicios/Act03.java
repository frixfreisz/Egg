package actividades.Ejercicios;

import java.util.Scanner;

public class Act03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase.");
        String frase = leer.nextLine();
        String mayuscula = frase.toUpperCase();
        String minuscula = frase.toLowerCase();
        
        System.out.println("Mayuscula: " + mayuscula);
        System.out.println("Minuscula: " + minuscula);
        
    }
    
}

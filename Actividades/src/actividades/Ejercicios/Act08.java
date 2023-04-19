
package actividades.Ejercicios;

import java.util.Scanner;

public class Act08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase de ocho digitos:");
        String frase = leer.nextLine();
        
        if(frase.length() == 8){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
    
}


package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej10 {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int num1  = (int) (Math.random()*(1+10));
        int num2 = (int) (Math.random()*(1+10));
        int multi = num1 * num2;
        System.out.println("La multiplicacion secreta es: " + num1 + " x " + num2 + " =" + multi  );
        System.out.println("Adivina el resultado");
        int respuesta = leer.nextInt();
        while(respuesta != multi){
        System.out.println("Incorrecto, vuelve a intenta con otro numero");
        respuesta = leer.nextInt();
    }
        System.out.println("Acertaste, el resultado correcto es: " + respuesta);
        
        
        
    }
    
}

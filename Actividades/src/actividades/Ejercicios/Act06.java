
package actividades.Ejercicios;

import java.util.Scanner;

public class Act06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Es un numero PAR");
        }else{
            System.out.println("Es un numero IMPAR");
        }
    }
    
}


package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
       boolean reapuesta = tipo(num);
    }
    public static boolean tipo(int num){
        int suma = 0;
        boolean bandera = true;  
        for (int i = 1; i < num; i++) {
            int aux = num % i;
            if(aux == 0){
                suma = suma + 1 ;
            }
            
        }
        if(suma < 2){
            bandera = true;
            System.out.println("El numero es primo");
        }else{
            bandera = false;
            System.out.println("El numero NO es primo");
        }
        return bandera;
        
    }
    
}

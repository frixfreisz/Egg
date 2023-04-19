package actividades.Ejercicios;

import java.util.Scanner;

public class Act01 {
    
    public static void main (String[] args){
            
        Scanner leer = new Scanner(System.in);
        int resultado01;
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        
        resultado01 = num1 + num2;
        System.out.println("El resultado es: " + resultado01);
        
  
    
    }
    
    
}

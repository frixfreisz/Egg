package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
       int par = 0;
       int impar = 0;
       
       do{
       System.out.println("Ingresa un numero entero");
       num = leer.nextInt();
       if(num < 0){
        continue;   
       }else if(num % 2 == 0){
           par++;
           
       } else{
           impar++;
           
        }
       if(num % 5 == 0){
           impar--;
           break;
       }
       
       }while(num % 5 != 0); 
        System.out.println("contador = " + (par + impar));
        System.out.println("pares = " + par);
        System.out.println("impares = " + impar);
        
        
    }
    
}

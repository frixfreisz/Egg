
package actividades.Ejercicios;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int numero;
         int unD = 0, dosD = 0, tresD = 0, cuatroD = 0, cincoD = 0, fueraDeRango = 0;
         
         System.out.println("Que temaño tiene el vector?");
         int n = leer.nextInt();
         
         int [] vector = new int[n];
         System.out.println("el tamaño del vector es " + n);
         
         
         
         System.out.println("\n");
         System.out.println("Ingrese los valores del vector");
         for (int i = 0; i < vector.length; i++) {
             
                 
             vector[i] = leer.nextInt(); 
            
        }
         for (int i = 0; i < vector.length; i++) {
             if(vector[i] >=0 && vector[i] <=9){
                 unD++;
                 
             } 
             else if(vector[i] >=10 && vector[i] <=99){
                 dosD++;
                 
             } 
             else if(vector[i] >=100 && vector[i] <=999){
                 tresD++;
                 
             }
             else if(vector[i] >=1000 && vector[i] <=9999){
                 cuatroD++;
                 
             }
             else if(vector[i] >=10000 && vector[i] <=99999){
                 cincoD++;
                 
             }
             else{
                 fueraDeRango++;
                 
             }
             
         }
         System.out.println("numero de un digito: " + unD);
         System.out.println("numeros de dos digitos: " + dosD);
         System.out.println("numeros de tres digitos: " + tresD);
         System.out.println("numeros de cuatro digitos: " + cuatroD );
         System.out.println("numeros de cinco digitos: " + cincoD);
         System.out.println("Numero fueras de rango: " + fueraDeRango);
    }
    
}

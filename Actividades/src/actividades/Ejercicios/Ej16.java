
package actividades.Ejercicios;

import java.util.Scanner;

public class Ej16 {
static Scanner leer = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Ingrese el tamanio del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int num = 0;
        int c = 0;
        int aux = -1;
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*100);
            
        }
        
        System.out.println("Que numero desea buscar de 0 al 99");
        num = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if(num == vector[i]){
                c++;
                if(aux == -1){
                    aux = i;
                }
            }
           
        }
        if(aux == -1){
            System.out.println("El numero " + num + " no se encuentra en el vector");
        }else{
            System.out.println("El numero " + num + " se encontro en la posicion "  + aux + " y re repite " + c + " veces" );
        }
        
    }
        
}

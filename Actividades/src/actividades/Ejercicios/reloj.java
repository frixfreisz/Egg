
package actividades.Ejercicios;

import java.util.Scanner;

public class reloj {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int seg = 0;
        int min = 0;
        int horas = 0;
        int dias = 0;
        int[] reloj = new int[seg];
        System.out.println("Ingrese la cantidad de segundos");
        seg = leer.nextInt();
        for (int s = 0; s < reloj.length; s++) {
            if(s > 60){
                min++;
                
            }else if(min > 60){
                horas++;
            }else if(horas > 24){
                dias++;
            }
            
        }
        System.out.println(seg + " segundo equivales a " + min + " minutos " + horas + " hora/s " + dias + " dia/s.");
    }
    
}

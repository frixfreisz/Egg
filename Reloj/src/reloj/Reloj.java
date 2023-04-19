
package reloj;

import java.util.Scanner;

public class Reloj {

    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        int horas = 0, minutos = 0, segundos = 0;
        System.out.println("Ingrese la hora actual");
        System.out.println("Hora: ");
        horas = leer.nextInt();
        System.out.println("minutos: ");
        minutos = leer.nextInt();
        
        
        
        while(true){
            
            //Mostrar
            if(horas < 10){
                System.out.print("0");
            }
                
            System.out.print(horas+":");
            
            if(minutos < 10){
                System.out.print("0");
            }
            
            System.out.print(minutos+":");
            
            if(segundos < 10){
                System.out.print("0");
            }
            
            System.out.println(segundos);
            
            //Aumentar el tiempo
            segundos++;
            //Comprobar el tiempo
            
            if(segundos == 60){
                segundos = 0;
                minutos++; 
                if(minutos == 60){
                    minutos = 0;
                    horas++;
                    if(horas == 24){
                        horas = 0;
                    }
                }
            }
            
            Thread.sleep(1000); 
            
                
        }
    }
    
}

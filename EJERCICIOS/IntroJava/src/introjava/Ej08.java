
import java.util.Scanner;


public class Ej08 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la nota 1: ");
        int nota1 = leer.nextInt();
                
        while(nota1 <=1 || nota1 >= 10){
            System.out.println("Ingrese una nota correcta");
            nota1 = leer.nextInt();
            
        }
        System.out.println("La nota ingresada es " + nota1);
        
    
    
    
    }
    
    
}

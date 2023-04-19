package introjava;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos integrantes tiene su grupo?");
        
       int n = leer.nextInt();
       leer.nextLine();
       
       String[] equipo = new String[n];
        
        
        for(int i = 0; i < n; i++){
            System.out.println("Ingrese el nombre del " + i + " integrante: ");
            
            equipo[i] = leer.nextLine();
        }
        for(int i = 0; i < n; i++){
            System.out.println(equipo[i] + " | ");
            
        }
        
        
    }
    
}

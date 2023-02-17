
package mascotaapp;

import java.util.Scanner;
import mascotaApp.entidades.Mascota;

public class MascotaApp {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       Mascota m1 = new Mascota("fernando Chiquito", leer.next() , "Perro");
        
       m1.setNombre("Pepe Chiquito");
        
       System.out.println(m1.getNombre());
        
        
    }
    
}

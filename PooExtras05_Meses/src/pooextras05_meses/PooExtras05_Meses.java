
package pooextras05_meses;

import entidades.Secreto;
import java.util.Scanner;
import servicios.servicios;

public class PooExtras05_Meses {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Secreto s = new Secreto();
        s.llenar();
        servicios serv = new servicios();
        serv.secret();
        serv.adivinar(leer);
      
        
        
        
    }
    
}

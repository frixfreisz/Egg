
package pooextrasextras01_fraccion;

import Servicios.Servicios;
import java.util.Scanner;

public class PooExtrasExtras01_Fraccion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicios serv = new Servicios();
        serv.numeros(leer);
        serv.suma();
        serv.resta();
        serv.division();
       
    }
    
}

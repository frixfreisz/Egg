
package personaconlocaldate;

import Servicios.Servicios;
import java.util.Scanner;

public class PersonaConLocalDate {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Servicios serv = new Servicios();
        serv.crearPersona(leer);
        serv.mostrarPersona();
    }
    
}

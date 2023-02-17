
package ejercicio12_personacondate;

import ServiciosPersona.ServiciosPersona;
import java.util.Scanner;

public class Ejercicio12_PersonaConDate {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        ServiciosPersona serv = new ServiciosPersona();
        serv.crearPersona(leer);
        serv.calcularEdad();
        System.out.println("La fecha ingresada es anterior a la fecha de nacimiento de la persona? " + serv.menorQue(leer));
        serv.mostrarPersona();
    }
    
}

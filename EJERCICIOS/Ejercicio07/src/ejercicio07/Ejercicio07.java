package ejercicio07;

import Persona.servicioPersona;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

       // servicioPersona servicio = new servicioPersona(4);
       servicioPersona servicio = null;
        for (int i = 0; i < 4; i++) {
       try{
            servicio.crearPersona(leer);
            servicio.getCalcularIMC(i);
            servicio.esMayorDeEdad(i);
        }catch(NullPointerException e){
            System.out.println("Error " + e);
           servicio = new servicioPersona(4);
           i=0;
        }
       }
        System.out.println("\n");
        servicio.contadores();
        System.out.println("\n");
    
    }
}

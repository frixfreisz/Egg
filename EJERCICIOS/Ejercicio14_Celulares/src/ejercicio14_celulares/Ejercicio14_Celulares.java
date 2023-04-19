
package ejercicio14_celulares;

import Servicios.Servicios;
import java.util.Scanner;

public class Ejercicio14_Celulares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    Servicios serv = new Servicios();
    serv.cargarCelular(leer);
    serv.ingresarCodigo(leer);
    serv.mostrarDatos();
    }
    
}

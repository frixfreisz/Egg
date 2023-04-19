
package ejercicio03;

import ejercicio03.Operacion.Operacion;
import ejercicio03.Operacion.ServiciosOperacion;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServiciosOperacion serv = new ServiciosOperacion();
        Operacion op = serv.cargarNumeros(leer);
        System.out.println("El resultado de la suma es: " + serv.suma(op));
        System.out.println("El resultado de la resta es: " + serv.resta(op));
        serv.multiplicacion(op);
        serv.divicion(op);
        
        
    }
    
}

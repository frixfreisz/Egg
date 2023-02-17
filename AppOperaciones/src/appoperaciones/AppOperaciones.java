
package appoperaciones;

import Servicios.Servicios;
import java.util.Scanner;

public class AppOperaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Servicios serv = new Servicios();
        serv.cargarNumero(leer);
        System.out.println("El resultado de la suma es: " + serv.suma());
        System.out.println("El resultado de la resta es: " + serv.resta());
        System.out.println("El resultado de la multiplicacion es: " + serv.multiplicacion());
        
    }
    
}

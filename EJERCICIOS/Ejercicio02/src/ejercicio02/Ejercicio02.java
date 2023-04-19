
package ejercicio02;

import ejercicio02.circunferencia.Circunferencia;
import ejercicio02.circunferencia.ServicioCircunferencia;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioCircunferencia serv = new ServicioCircunferencia();
        Circunferencia circunferencia = serv.cargar(leer);
        System.out.println("El area de la Circunferencia es: " + serv.getArea(circunferencia));
        System.out.println("El perimetro de la circunferencia es: " + serv.getPerimetro(circunferencia));
    }
    
}

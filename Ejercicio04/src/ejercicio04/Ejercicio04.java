
package ejercicio04;

import ejercicio04.rectangulo.Rectangulo;
import ejercicio04.rectangulo.ServicioRectangulo;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioRectangulo serv = new ServicioRectangulo();
        Rectangulo rectangulo = serv.crearRectangulo(leer);
        System.out.println("El rectangulo tiene "  + serv.getCalcularPerimetro(rectangulo) + "cm de perimetro y " + serv.getCalcularSuperficie(rectangulo) + "cm de superficie");
        System.out.println("Asi se veria el rectangulo:");
        serv.mostrarRectangulo(rectangulo);
        
    }
    
}

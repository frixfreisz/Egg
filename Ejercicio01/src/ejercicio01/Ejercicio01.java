
package ejercicio01;

import ejercicio01.Libro.Libro;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        ServiciosLibro l1 = new ServiciosLibro();
        Libro libro1 = l1.cargarLibro(leer);
        l1.mostrarLibro(libro1);
    }
    
}

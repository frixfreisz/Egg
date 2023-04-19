
package ejercicio04.rectangulo;

import java.util.Scanner;

public class ServicioRectangulo {
    public Rectangulo crearRectangulo(Scanner leer){
        System.out.println("Por favor ingrese la medida de base del rectangulo: ");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        int altura = leer.nextInt();
        
        return new Rectangulo(base,altura);
    }
    
    public int getCalcularSuperficie(Rectangulo mostrar){
        int superficie = mostrar.getBase() * mostrar.getAltura();
        return superficie;
    }
    
    public int getCalcularPerimetro(Rectangulo mostrar){
        int perimetro = (mostrar.getBase() + mostrar.getAltura()) / 2;
        return perimetro;
    }
    
    public void mostrarRectangulo(Rectangulo mostrar){
        for (int altura = 0; altura < mostrar.getAltura(); altura++) {
            for (int base = 0; base < mostrar.getBase(); base++) {
                System.out.print(" * ");
                
            }
            System.out.println("");
        }
    }
}

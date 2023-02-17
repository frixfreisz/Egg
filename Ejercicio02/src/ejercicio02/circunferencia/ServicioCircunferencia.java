
package ejercicio02.circunferencia;

import java.util.Scanner;

public class ServicioCircunferencia {
    
    public Circunferencia cargar(Scanner leer){
        System.out.println("Por favor ingrese el radio");
        float radio = leer.nextFloat();
        
        return new Circunferencia(radio);
    }
    
    public double getPerimetro(Circunferencia mostrar){
        double perimetro = 2 * Math.PI * mostrar.getRadio();
        return perimetro;
    }
     public double getArea(Circunferencia mostrar){
        double area = Math.PI * Math.pow(mostrar.getRadio(), 2);
        return area;
}
}

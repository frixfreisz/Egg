
package ServicioPunto;

import java.util.Scanner;
import pooextras02.Ejercicio02Puntos.Puntos;

public class ServicioPunto {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   public Puntos crearPunto(){
        System.out.println("Ingrese el punto en x1");
        double x1 = leer.nextDouble();
        System.out.println("Ingrese el punto en y1");
        double y1 = leer.nextDouble();
        System.out.println("Ingrese el punto en x2");
        double x2 = leer.nextDouble();
        System.out.println("Ingrese el punto en y2");
        double y2 = leer.nextDouble();
        
        return new Puntos(x1,y1,x2,y2);
       
    }
    
    public void calcularDistancia(Puntos punto){
        double x1 = punto.getX1();
        double x2 = punto.getX2();
        double y1 = punto.getY1();
        double y2 = punto.getY2();
        
        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("La distancia entre los dos puntos es:" + Math.round(distancia));
    }
}

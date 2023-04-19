
package ejercicio06;

import Cafetera.servicioCafetera;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean out = false;
        int op;
        servicioCafetera serv = new servicioCafetera();
        serv.llenarCafetera();
        
        do{
            serv.estadoDeCafetera();
            System.out.println("1 - Servir taza");
            System.out.println("2 - Agregar cafe a la cafetera");
            System.out.println("3 - Vaciar la cafetera");
            System.out.println("4 - Volver a llenar la cafetera");
            System.out.println("5 - Salir");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    serv.llenarTaza(leer);
                    break;
                case 2:
                    serv.agregarCafe(leer);
                    break;
                case 3:
                    serv.vaciarCafetera();
                    break;
                case 4:
                    serv.llenarCafetera();
                    break;
                case 5:
                    out = true;
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
            }
            
        }while(out == false);
        System.out.println("Hasta la proxima.");
    }
    
}

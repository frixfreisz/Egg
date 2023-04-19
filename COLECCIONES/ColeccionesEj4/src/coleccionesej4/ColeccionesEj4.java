
package coleccionesej4;

import Servicios.ServPelicula;
import java.util.Scanner;

public class ColeccionesEj4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        boolean salir = false;       
        ServPelicula serv = new ServPelicula();
        
        do{
            System.out.println("-------Menu Peliculas--------");
            System.out.println("");
            System.out.println("1 - Cargar Pelicula");
            System.out.println("2 - Mostrar Listado de peliculas cargadas");
            System.out.println("3 - Peliculas de mayor duracion a una hora");
            System.out.println("4 - Ordenar peliculas por duracion de menor a mayor");
            System.out.println("5 - Ordenar peliculas por duracion de meyor a menor");
            System.out.println("6 - Ordenar peliculas por titulo");
            System.out.println("7 - Ordenar peliculas por director");
            System.out.println("8 - Salir");
            int op = leer.nextInt();
            
            switch(op){
            case 1:
                serv.cargarPelicula();
                break;
            case 2:
                serv.mostrarPeliculas();
                break;
            case 3:
                serv.mostrarPorHora();
                break;
            case 4:
                serv.mostrarDuracionMenorAMayor();
                break;
            case 5:
                serv.mostrarDuracionMayorAMenor();
                break;
            case 6:
                serv.ordenarTituloAlfa();
                break;
            case 7:
                serv.ordenarDirector();
                break;
            case 8:
                salir = true;
            }
        }while(salir == false);
        System.out.println("Muchas gracias, hasta la proxima");
        
    }
    
}


package Servicios;

import Comparador.Comparador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServPelicula {
    private Scanner leer;
    private ArrayList<Pelicula>Lista;

    public ServPelicula() {
        this.leer = new Scanner(System.in);
        this.Lista = new ArrayList();
    }
    
    public void cargarPelicula(){
        System.out.println("*******CARPETA DE PELICULAS*******");
        do{
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el Titulo de la pelicula");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion");
            pelicula.setDurecion(leer.nextFloat());
            Lista.add(pelicula);
            System.out.println("Desea cargar otra pelicula?");
            
        }while(leer.next().equalsIgnoreCase("si"));
    }
    
    public void mostrarPeliculas(){
        System.out.println("Listado de Peliculas");
        for (Pelicula pelicula : Lista) {
            System.out.println(pelicula);
            
        }
    }
    
    public void mostrarPorHora(){
        System.out.println("Peliculas con duracion mayor a una hora");
        for (Pelicula pelicula : Lista) {
            if(pelicula.getDurecion() > 1){
                System.out.println(pelicula);
                for (Pelicula pelicula1 : Lista) {
                    System.out.println(pelicula1);
                    break;
                }
            }else{
                System.out.println("No existen peliculas con duracion mayores a 1 hora");
                break;
            }
        }
                   
    }
    
    public void mostrarDuracionMayorAMenor(){
        System.out.println("Peliculas ordenadas por duracion de mayor a menor");
        Collections.sort(Lista, Comparador.compararDuracionDesc);
        for (Pelicula pelicula1 : Lista) {
                    System.out.println(pelicula1);
        }
            
    }
    
    public void mostrarDuracionMenorAMayor(){
        System.out.println("Peliculas ordenadas por duracion de menor a mayor");
        Collections.sort(Lista, Comparador.compararDuracionAsc);
        for (Pelicula pelicula1 : Lista) {
                    System.out.println(pelicula1);
        }
    }
    
    public void ordenarTituloAlfa(){
        System.out.println("Peliculas ordenadas por Titulo");
        Collections.sort(Lista, Comparador.compararTituloAlfa);
        for (Pelicula pelicula1 : Lista) {
                    System.out.println(pelicula1);
        }
    }
    
    public void ordenarDirector(){
        System.out.println("Peliculas ordenadas por Director");
        Collections.sort(Lista, Comparador.compararDirectorAlfa);
        for (Pelicula pelicula1 : Lista) {
                    System.out.println(pelicula1);
        }
    }
    
    

}

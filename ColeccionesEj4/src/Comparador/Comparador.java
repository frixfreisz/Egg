
package Comparador;

import Entidad.Pelicula;
import java.util.Comparator;

public class Comparador {
    
   public static Comparator<Pelicula> compararDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDurecion().compareTo(p1.getDurecion());
        }
   };
   
   public static Comparator<Pelicula> compararDuracionAsc = new Comparator<Pelicula>(){
       @Override
       public int compare(Pelicula p1, Pelicula p2) {
           return p1.getDurecion().compareTo(p2.getDurecion());
       }
   };
   
   public static Comparator<Pelicula> compararTituloAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
       }
   };
   
   public static Comparator<Pelicula> compararDirectorAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getTitulo());
       }
   };
    
}

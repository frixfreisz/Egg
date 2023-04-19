package Servicios;

import Entidad.Pelicula;
import Entidad.Persona;
import Entidad.Sala;
import java.util.ArrayList;

/**
 *
 * @author Carlitos
 */
public class ServSala { 
    
  private Sala sala;
  private ArrayList<Persona> espectadores;

    public ServSala() { 
        this.espectadores = new ArrayList();
        this.sala = new Sala();
        espectadores.add(new Persona("Fede", 37, (float)5000.5));
        espectadores.add(new Persona("Mauri", 43, (float)300.5));
        espectadores.add(new Persona("Gabriel", 34, (float)8000.5));
        espectadores.add(new Persona("Valentino", 18, (float)1000.5));
        espectadores.add(new Persona("Carlos", 39, (float)100.5));
        espectadores.add(new Persona("Tincho", 26, (float)2000.5));
        espectadores.add(new Persona("Santi", 18, (float)3000.5));
        sala.setPrecio((float)500);
        sala.setPelicula(new Pelicula("Star Wars", 2.35F, 21, "Lucas"));
    }
  
  
    public void crearSala(){
        ArrayList<ArrayList<String>>asientos = new ArrayList<>();
        for (int fila = 8; fila > 0; fila++) {
            ArrayList<String>Columna = new ArrayList<>();
            
            for (int columna = 0; columna < 6; columna++) {
                String letra = Character.toString((char)(65+columna));
                Columna.add(letra + "|x|");
            }
            asientos.add(Columna);
  
            }
            sala.setAsientos(asientos);
        }
    
    public void mostrarSala(){
        ArrayList<ArrayList<String>>asientos = sala.getAsientos();
        for (int fila = 0; fila < 8; fila++) {
            ArrayList<String>Columna = asientos.get(fila);
            for (int columna = 0; columna < 6; columna++) {
                System.out.print((fila + 1)+ " " + Columna.get(columna)+ " " );
                
            }
                System.out.println("");
            }
            
        }
            
}

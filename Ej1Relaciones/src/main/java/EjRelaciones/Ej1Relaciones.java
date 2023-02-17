
package EjRelaciones;

import Entidad.Dni;
import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author Carlitos
 */
public class Ej1Relaciones {

    public static void main(String[] args) {
       
        Persona p1 = new Persona("Carlos", "Perez", 25, new Dni(298512), new Perro("Laila", "Salchicha", 10, "chiquito"));
        
        Persona p2 = new Persona("Lisandro", "Garcia", 28, new Dni(298821), new Perro("Uma", "Chow Chow", 10, "mediano"));
    }
}

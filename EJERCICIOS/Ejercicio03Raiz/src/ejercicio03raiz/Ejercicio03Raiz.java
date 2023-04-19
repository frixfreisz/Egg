
package ejercicio03raiz;

import Entidades.Raiz;
import Servicios.Servicios;

public class Ejercicio03Raiz {

    public static void main(String[] args) {
         Raiz rc = new Raiz();
      Servicios sr = new Servicios();
      
      sr.getDiscriminante(rc);
      sr.tieneRaices(rc);
      sr.tieneRaiz(rc);
      sr.obtenerRaices(rc);
    }
   
    
}

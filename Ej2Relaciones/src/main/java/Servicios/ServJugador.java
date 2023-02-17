
package Servicios;

import Entidad.Jugador;
import Entidad.Revolver;

/**
 *
 * @author Carlitos
 */
public class ServJugador {

    
    public boolean disparo(Revolver r, Jugador j){
       ServRevolver servRev = new ServRevolver();
       if(servRev.mojar(r)){
           j.setMojado(true);
           return true;
       }else{
           servRev.siguienteChorro(r);
           return false;
       }
    }       
}

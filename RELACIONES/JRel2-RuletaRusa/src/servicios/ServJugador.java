
package servicios;

import entidades.Jugador;
import entidades.Revolver;
import static jrel2.main.JRel2RuletaRusa.scn;

public class ServJugador {

    public Jugador crearJugador(int id){
        System.out.println("Ingrese el nombre del valiente:");
        String valiente = scn.next();
        return new Jugador(id, valiente);
    }
    
    public boolean disparar(Revolver revolver, Jugador j1){
        ServRevolver sr = new ServRevolver();
        if (sr.cargada(revolver)) {
            j1.setMuerto(true);   
        }
        sr.siguienteBala(revolver);
        return sr.cargada(revolver);
    }
} //end ServJugador

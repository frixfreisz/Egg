package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import static jrel2.main.JRel2RuletaRusa.scn;

public class ServJuego {


    ServJugador sJu;
    ServRevolver sRev;

    public ServJuego() {

        this.sJu = new ServJugador();
        this.sRev = new ServRevolver();
    }

    public ArrayList<Jugador> llenarJugadores() {
        ArrayList<Jugador> jugadores  = new ArrayList();
        System.out.println("Ingresa la cantidad de suicidas que jugarán:");
        int nJugadores = scn.nextInt();
        if (nJugadores > 6) {
            nJugadores = 6;
        } else {
            for (int i = 0; i < nJugadores; i++) {
                jugadores.add(sJu.crearJugador(i + 1));
            }
        }
        return jugadores;
    }

    public void llenarJuego(Revolver revolver, Juego juego) {
        juego.setJugadores(llenarJugadores());
        juego.setRevolver(revolver);
    }

    public static void esperar(int miliSec) {
        try {
            Thread.sleep(miliSec);
        } catch (InterruptedException ignored) {
        }
    }
    
    public void ronda() {
        Juego juego = new Juego();

        llenarJuego(sRev.llenarRevolver(), juego);

        boolean todosVivos = true;
        int ronda = 1;
        do {
            System.out.println("");
            System.out.println("Ronda " + ronda);
            for (int i = 0; i < juego.getJugadores().size(); i++) {
                esperar(1000);
                if (sJu.disparar(juego.getRevolver(), juego.getJugadores().get(i))) {
                    System.out.println(juego.getJugadores().get(i).getNombre().toUpperCase() + " ah muerto.");
                    todosVivos = false;
                }
            }
            if (todosVivos) {
                System.out.println("Todos los jugadores sobrevivieron a la ronda " + ronda + ".");
                ronda += 1;
            }
        } while (todosVivos);
        System.out.println("");
        System.out.println("Gracias por jugar en Walter Olmos, Ruletas Interactivas!");
    } //end ronda

} //end ServJuego


package Servicios;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServJuego {
    Scanner leer = new Scanner(System.in);
        
    
    
    public Juego llenarJuego(){
        ServRevolver serv = new ServRevolver();
        Revolver r = new Revolver();
        serv.llenarRevolver(r);
        ArrayList<Jugador>jugadores = new ArrayList();
        System.out.print("Indique la cantidad de jugadores:");
        int cant = leer.nextInt();
        if(cant > 6 || cant < 1){
            cant = 6;
        }
        
        for (int i = 0; i < cant; i++) {
            Jugador j = new Jugador();
            j.setId(i + 1);
            jugadores.add(j);
            
        }
        
        System.out.println(r);
        System.out.println(jugadores);
        return new Juego();
    }
    
    public void ronda(Juego juego){
        ArrayList<Jugador> list = juego.getJugadores();
        ServJugador servJug = new ServJugador();
        for (Jugador jugador : list) {
            if(servJug.disparo(juego.getRevolver(), jugador)){
                System.out.println(jugador + "!!!!!MOJADO!!!!");
                break;
            }else{
                System.out.println("SALVADO");
            }
            
        }
        
        
    }
    
}

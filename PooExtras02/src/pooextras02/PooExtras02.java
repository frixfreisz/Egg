
package pooextras02;

import ServicioPunto.ServicioPunto;
import pooextras02.Ejercicio02Puntos.Puntos;

public class PooExtras02 {

    public static void main(String[] args) {
        ServicioPunto serv = new ServicioPunto();
        Puntos p1 = serv.crearPunto();
        serv.calcularDistancia(p1);
        
        
    }
    
}

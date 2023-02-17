/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ej2Relaciones;

import Entidad.Juego;
import Servicios.ServJuego;

/**
 *
 * @author Carlitos
 */
public class RuletaMain {

    public static void main(String[] args) {
    ServJuego servJuego = new ServJuego();
    Juego juego = servJuego.llenarJuego();
    servJuego.ronda(juego);
    
    }
}

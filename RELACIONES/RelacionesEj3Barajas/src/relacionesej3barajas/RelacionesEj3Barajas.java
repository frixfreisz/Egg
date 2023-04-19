/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej3barajas;

import Servicios.ServCarta;

/**
 *
 * @author Carlitos
 */
public class RelacionesEj3Barajas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServCarta serv = new ServCarta();
       serv.iniciarBaraja();
       serv.mostrarBaraja();
       
       serv.barajar();
       serv.darCartas();
       serv.mostrarBaraja();
       serv.mostrarMonton();
    }
    
}

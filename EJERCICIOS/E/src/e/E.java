/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

import Servicio.ServPersona;

/**
 *
 * @author Carlitos
 */
public class E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServPersona serv = new ServPersona();
        System.out.println("");
        serv.crearPersona();
        serv.mostrarPersona();
    }
    
}

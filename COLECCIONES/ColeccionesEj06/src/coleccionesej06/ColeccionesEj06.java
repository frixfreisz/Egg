/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej06;

import Servicio.Servicio;

/**
 *
 * @author Carlitos
 */
public class ColeccionesEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicio serv = new Servicio();
        serv.cargarTienda();
        System.out.println("");
        System.out.println("");
        serv.mostrarLista();
        System.out.println("");
        System.out.println("");
        serv.modificarPrecio();
        System.out.println("");
        System.out.println("");
        serv.mostrarLista();
        System.out.println("");
        System.out.println("");
        serv.eliminarProducto();
        System.out.println("");
        System.out.println("");
        serv.mostrarLista();
    }
    
}

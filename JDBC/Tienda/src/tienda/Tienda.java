/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.servicios.ServProducto;

/**
 *
 * @author Carlitox
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ServProducto serv = new ServProducto();
        serv.menu();
    }
    
}

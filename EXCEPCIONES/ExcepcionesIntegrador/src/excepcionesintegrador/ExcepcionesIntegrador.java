/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesintegrador;

import servicios.ServArmadura;


/**
 *
 * @author Carlitos
 */
public class ExcepcionesIntegrador {

    public static void main(String[] args) {

ServArmadura serv = new ServArmadura();
serv.material();
serv.color();
serv.mostrar();
serv.accion();
    }
    
}

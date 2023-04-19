/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooextra6;

import javapooextra6.Entidades.Ahorcado;
import javapooextra6.Servicios.AhorcadoService;

/**
 *
 * @author franc
 */
public class JavaPooExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AhorcadoService as = new AhorcadoService();
        Ahorcado a = new Ahorcado();
        as.juego(as, a);
    }
    
}

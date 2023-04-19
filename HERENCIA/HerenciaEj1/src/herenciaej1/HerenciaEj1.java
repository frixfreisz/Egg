/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej1;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author Carlitos
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro();
        perro1.Alimentase();
        Animal perro2 = new Perro();
        perro2.Alimentase();
        Animal gato1 = new Gato();
        gato1.Alimentase();
        Animal caballo1 = new Caballo();
        caballo1.Alimentase();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej4;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author Carlitos
 */
public class HerenciaEJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(10, 20);
        r1.perimetro();
        r1.area();
        Circulo c1 = new Circulo(10);
        c1.perimetro();
        c1.area();
        System.out.println(c1);
        System.out.println(r1);
    }
    
}

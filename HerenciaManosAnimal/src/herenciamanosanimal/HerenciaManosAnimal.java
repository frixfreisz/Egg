/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamanosanimal;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author Carlitos
 */
public class HerenciaManosAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.hacerRuido();
        
        Animal b = new Perro();
        b.hacerRuido();
        
        Animal c = new Gato();
        c.hacerRuido();
        
        ArrayList<Animal>lista = new ArrayList();
        lista.add(a);
//        lista.add(b);
//        lista.add(c);
        
        for (Animal animal : lista) {
            System.out.println(animal);
            
        }
    }
}

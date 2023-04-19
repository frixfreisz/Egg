/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Prueba;

import Animal.Animal;
import Interfaz.IAccion;

/**
 *
 * @author Carlitos
 */
public class Vaca extends Animal implements IAccion{

    public Vaca() {
      
    }

    
    @Override
    public String gritar() {
        return "Muuuuu";
        
    }
    
    
    
}

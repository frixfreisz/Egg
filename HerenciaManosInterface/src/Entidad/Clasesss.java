/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Interface.Interface;

/**
 *
 * @author Carlitos
 */
class Clasesss implements Interface {

    @Override
    public void metodo() {
        System.out.println("Implementacion del metodo"); 
    }

    @Override
    public int sumar() {
        int suma = 2+3;
        return suma;
    }
    
}

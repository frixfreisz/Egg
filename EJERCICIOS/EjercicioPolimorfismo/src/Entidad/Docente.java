/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Interfaz.IAccion;

/**
 *
 * @author Carlitos
 */
public class Docente extends Persona  {
    private float sueldo;
    
    public Docente(String nombre, int dni, String cargo, float sueldo) {
        super(nombre, dni, cargo);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        
        return super.toString() + " ....sobreecribiendo el metodo de persona";
    }

    @Override
    public String gritar() {
        return "Soy el docente GRITANDO!!";
    }
    
    
}

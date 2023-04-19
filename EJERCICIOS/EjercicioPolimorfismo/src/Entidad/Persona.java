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
public abstract class Persona implements IAccion {
    private String nombre;
    private int dni;
    private String cargo;

    public Persona(String nombre, int dni, String cargo) {
        this.nombre = nombre;
        this.dni = dni;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Soy " + getNombre()+ " y soy una " + getCargo();
    }
    
}

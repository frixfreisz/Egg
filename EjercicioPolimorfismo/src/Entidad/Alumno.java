/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Carlitos
 */
public class Alumno extends Persona {
    private String genero;
    public Alumno(String nombre, int dni, String cargo, String genero) {
        super(nombre, dni, cargo);
        this.genero = genero;
    }

    @Override
    public String gritar() {
        return "Soy un alumno";
    }
    
}

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
public class Alumno {
    
    private String nombreCompleto;
    private int dni;
    private int votos;
    
    public Alumno(String nombreCompleto, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votos = 0;
    }
    
    public void agregarVoto() {
        this.votos++;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public int getDni() {
        return dni;
    }
    
    public int getVotos() {
        return votos;
    }
}



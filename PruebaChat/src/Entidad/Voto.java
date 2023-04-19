/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carlitos
 */
public class Voto {
    
    private Alumno alumnoVotante;
    private Set<Alumno> alumnosVotados;
    
    public Voto(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = new HashSet<>();
    }
    
    public boolean agregarVoto(Alumno alumno) {
        if (alumnosVotados.contains(alumno) || alumnoVotante == alumno) {
            return false;
        }
        alumnosVotados.add(alumno);
        alumno.agregarVoto();
        return true;
    }
    
    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }
    
    public Set<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }
}



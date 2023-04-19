/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Carlitos
 */
public final class Estudiante extends Persona {
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombrePersona, String apellidoPersona, long dni, String estadoCivil) {
        super(nombrePersona, apellidoPersona, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() +"\nDesempeño: Estudiante" + "\nCurso: " + curso + "\n---------------------------------";
    }
    
    
}

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
public abstract class Persona {
    protected String nombrePersona;
    protected String apellidoPersona;
    protected long dni;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombrePersona, String apellidoPersona, long dni, String estadoCivil) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "---------------------------------"+"\nNombre: " + nombrePersona + "\nApellido: " + apellidoPersona + "\nDNI: " + dni + "\nEstado Civil: " + estadoCivil;
    }
    
}

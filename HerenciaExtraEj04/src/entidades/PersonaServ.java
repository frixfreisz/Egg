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
public final class PersonaServ extends Empleados {
    private String seccion;

    public PersonaServ() {
    }

    public PersonaServ(String seccion, int añoIncorporacion, int numeDespacho, String nombrePersona, String apellidoPersona, long dni, String estadoCivil) {
        super(añoIncorporacion, numeDespacho, nombrePersona, apellidoPersona, dni, estadoCivil);
        this.seccion = seccion;
    }

    

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "\nPersonal de servicio" +super.toString()+ "\nSeccion: " + seccion;
    }
    
}

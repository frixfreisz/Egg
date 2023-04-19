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
public class Profesor extends Empleados {
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int añoIncorporacion, int numeDespacho, String nombrePersona, String apellidoPersona, long dni, String estadoCivil) {
        super(añoIncorporacion, numeDespacho, nombrePersona, apellidoPersona, dni, estadoCivil);
        this.departamento = departamento;
    }

 

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDesempeño: Profesor" + "\nDepartamento:" + departamento + "\n---------------------------------";
    }
    
    
    
}

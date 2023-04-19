/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Carlitos
 */
public abstract class Empleados extends Persona{
    protected int añoIncorporacion;
    protected int numeDespacho;

    public Empleados() {
    }

    public Empleados(int añoIncorporacion, int numeDespacho, String nombrePersona, String apellidoPersona, long dni, String estadoCivil) {
        super(nombrePersona, apellidoPersona, dni, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeDespacho = numeDespacho;
       
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(int añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }
    
    public int getNumeDespacho() {
        return numeDespacho;
    }

    public void setNumeDespacho(int numeDespacho) {
        this.numeDespacho = numeDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDesempeño: Empleado" + "\nAño de Incorporacion a la Facultad: " + añoIncorporacion + "\nNumero de Despacho: " + numeDespacho +  "\n---------------------------------";
    }

}

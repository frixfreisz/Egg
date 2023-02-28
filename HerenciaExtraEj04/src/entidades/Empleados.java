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
public class Empleados extends Persona{
    private int añoIncorporacion;
    private String seccion;
    private int numeDespacho;

    public Empleados() {
    }

    public Empleados(int añoIncorporacion,String seccion, int numeDespacho, String nombrePersona, String apellidoPersona, long dni, String estadoCivil) {
        super(nombrePersona, apellidoPersona, dni, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeDespacho = numeDespacho;
        this.seccion = seccion;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(int añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getNumeDespacho() {
        return numeDespacho;
    }

    public void setNumeDespacho(int numeDespacho) {
        this.numeDespacho = numeDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDesempeño: Empleado" +"\nSeccion: " + seccion +"\nAño de Incorporacion a la Facultad: " + añoIncorporacion + "\nNumero de Despacho: " + numeDespacho +  "\n---------------------------------";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.añoIncorporacion;
        hash = 67 * hash + Objects.hashCode(this.seccion);
        hash = 67 * hash + this.numeDespacho;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleados other = (Empleados) obj;
        if (this.añoIncorporacion != other.añoIncorporacion) {
            return false;
        }
        if (this.numeDespacho != other.numeDespacho) {
            return false;
        }
        if (!Objects.equals(this.seccion, other.seccion)) {
            return false;
        }
        return true;
    }
    
    
}

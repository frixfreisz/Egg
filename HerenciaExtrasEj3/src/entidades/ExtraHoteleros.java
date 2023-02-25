/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import servicios.ServAlo;

/**
 *
 * @author Carlitos
 */
public abstract class ExtraHoteleros extends Alojamiento implements Comparable{
    
    protected String privado;
    protected float mts2;
    protected float precio;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(String privado, float mts2, String nombre, String domicilio, String localidad, String gerente) {
        super(nombre, domicilio, localidad, gerente);
        this.privado = privado;
        this.mts2 = mts2;
        this.precio = 10;
    }

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public float getMts2() {
        return mts2;
    }

    public void setMts2(float mts2) {
        this.mts2 = mts2;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nPrivado: " + privado + "\nCantidad de mts2=" + mts2;
    }
    
    protected abstract float precioFinal();

    @Override
    public int compareTo(Object t) {
        return (int )(this.precio - ((ExtraHoteleros)t).precio); 
    }
    
    
 
    
    
}

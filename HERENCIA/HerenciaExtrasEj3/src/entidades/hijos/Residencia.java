/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.hijos;

import entidades.ExtraHoteleros;

/**
 *
 * @author Carlitos
 */
public class Residencia extends ExtraHoteleros{
    private int cantHabitaciones;
    private Boolean descuentoGremio;
    private Boolean canpoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, Boolean descuentoGremio, Boolean canpoDeportivo, String privado, float mts2, String nombre, String domicilio, String localidad, String gerente) {
        super(privado, mts2, nombre, domicilio, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.canpoDeportivo = canpoDeportivo;
        this.precio = 25;
    }

    

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Boolean getDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(Boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public Boolean getCanpoDeportivo() {
        return canpoDeportivo;
    }

    public void setCanpoDeportivo(Boolean canpoDeportivo) {
        this.canpoDeportivo = canpoDeportivo;
    }

    @Override
    public String toString() {
        return "------------------Residencia-----------------"+ "\nResidencia " + this.nombre + "\n Domicilio: "+this.domicilio+ "-" + this.localidad + "\nCantidad de habitaciones: " + cantHabitaciones + "\nDescuentoGremio: " + (descuentoGremio ? "Si":"No") + "\nPosee canpo deportivo: " + (canpoDeportivo ? "Si":"No")  + super.toString()+ "\n"+"\n\t\tPrecio: " + this.precio + "\n---------------------------------------------";
    }
    
    public float valCamp(){
        if(this.canpoDeportivo.equals(true));
        return 10;
    }
    
    public float descObraSocial(){
        if(this.descuentoGremio.equals(true));
        return -5;
    }
    
    public float valHab(){
        return this.cantHabitaciones * 2;
    }

    @Override
    public float precioFinal() {
        this.precio += this.valCamp() + this.descObraSocial() + this.valHab();
        return this.precio;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**Los Hoteles tienen como atributos: Cantidad de Habitaciones, 
 * Número de Camas, Cantidad de Pisos, Precio de Habitaciones. 
 *
 * @author Carlitos
 */
public abstract class Hotel extends Alojamiento implements Comparable{
    protected int cantidadHabitaciones;
    protected int cantidadCamas;
    protected int cantidadPisos;
    protected float precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int cantidadHabitaciones, int cantidadCamas, int cantidadPisos, String nombre, String domicilio, String localidad, String gerente) {
        super(nombre, domicilio, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = 50;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public float getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(float precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    
    
   protected abstract float precioFinal();

    @Override
    public int compareTo(Object t){
        return (int) (this.precioHabitaciones - ((Hotel)t).precioHabitaciones);
    }
    

}


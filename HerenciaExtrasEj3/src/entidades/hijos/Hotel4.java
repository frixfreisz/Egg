/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.hijos;

import entidades.Hotel;

/**Hotel **** Cantidad de Habitaciones, Número de camas, 
 * Cantidad de Pisos, Gimnasio, Nombre del Restaurante, 
 * Capacidad del Restaurante, Precio de las Habitaciones.
 *
 * @author Carlitos
 */
public class Hotel4 extends Hotel {
    protected String gim;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(String gim, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int cantidadCamas, int cantidadPisos,  String nombre, String domicilio, String localidad, String gerente) {
        super(cantidadHabitaciones, cantidadCamas, cantidadPisos, nombre, domicilio, localidad, gerente);
        this.gim = gim;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String isGim() {
        return gim;
    }

    public void setGim(String gim) {
        this.gim = gim;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "--------------Hotel 4 Estrellas-------------- " + "\n" + "Hotel "+this.nombre + "\nDomicilio: " + this.domicilio + " - " + this.localidad +  
                "\nCantidad de habitaciones: " + this.cantidadHabitaciones + "\nCantidad de camas: " + this.cantidadCamas + "\nCantidad de pisos: " + this.cantidadPisos +
                 "\nRestaurante " + "\""  + this.nombreRestaurante + "\"" + 
                "\t- Capacidad: " + this.capacidadRestaurante + " personas" + "\nPosee gimnasio tipo: " + this.gim + "\nEncargado: " + this.gerente + 
                 "\n"+"\n\t\tPrecio Habitacion: $" + this.precioHabitaciones + "\n---------------------------------------------";       
    }
    
    public float valorGim(){
        if(this.gim.equalsIgnoreCase("A")){
           return 50;
           
        }else{
           return 30;
        }
        
    }
    
    public float valorRest(){
        if(this.capacidadRestaurante < 30){
            return 10;
        }else if(this.capacidadRestaurante >=30 && this.capacidadRestaurante <=50){
            return 30;
        }else{
            return 50;
        }
           
    }
    
    

    @Override
    public float precioFinal() {
        this.precioHabitaciones +=  this.cantidadCamas + this.valorGim() + this.valorRest();
        return this.precioHabitaciones;
    }
    
    
}

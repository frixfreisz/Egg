/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.hijos;

/**Hotel ***** Cantidad de Habitaciones, 
 * Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante,
* Cantidad Salones de Conferencia, Cantidad de Suites, 
* Cantidad de Limosinas, Precio de las Habitaciones
 *
 * @author Carlitos
 */
public final class Hotel5 extends Hotel4{
    private int cantSalones;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimosinas, String gim, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int cantidadCamas, int cantidadPisos, String nombre, String domicilio, String localidad, String gerente) {
        super(gim, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, cantidadCamas, cantidadPisos, nombre, domicilio, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
    public int valLim(){
        return this.cantLimosinas * 15;
    }

    @Override
    public String toString() {
        return "--------------Hotel 5 Estrellas-------------- " + "\n" + "Hotel "+this.nombre + "\nDomicilio: " + this.domicilio + " - " + this.localidad +  
                "\nCantidad de habitaciones: " + this.cantidadHabitaciones + "\nCantidad de camas: " + this.cantidadCamas + "\nCantidad de pisos: " + this.cantidadPisos +
                "\nCantidad de salones de conferencia: " + this.cantSalones + "\nCantidad de suites privadas: " + this.cantSuites +
                 "\nRestaurante " + "\""  + this.nombreRestaurante + "\"" + 
                "\nCapacidad: " + this.capacidadRestaurante + " personas" + "\nPosee gimnasio tipo: " + this.gim + 
                "\nCantidad de limosinas: " + this.cantLimosinas + "\nEncargado: " + this.gerente + 
                 "\n"+"\n\t\tPrecio Habitacion: $" + this.precioHabitaciones + "\n---------------------------------------------";   
    }

    @Override
    public float precioFinal() {
        this.precioHabitaciones += this.cantidadCamas + this.valorGim() + this.valorRest() + this.valLim();
        return this.precioHabitaciones;
    }
    

}

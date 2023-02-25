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
public final class Camping extends ExtraHoteleros{
    private int cantCarpas;
    private int cantbanios;
    private boolean restaurante;

    public Camping(int cantCarpas, int cantbanios, boolean restaurante, String privado, float mts2, String nombre, String domicilio, String localidad, String gerente) {
        super(privado, mts2, nombre, domicilio, localidad, gerente);
        this.cantCarpas = cantCarpas;
        this.cantbanios = cantbanios;
        this.restaurante = restaurante;
        this.precio = 10;
    }

   

    public Camping() {
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantbanios() {
        return cantbanios;
    }

    public void setCantbanios(int cantbanios) {
        this.cantbanios = cantbanios;
    }

    public boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "-------------------Camping------------------- " + "\nCamping " + this.nombre + "\n Domicilio: "+this.domicilio+ "-" + this.localidad +"\nCapacidad de carpas: " + cantCarpas + "\nCantidad de baños: " + cantbanios + "\nPosee Restaurante: " + (restaurante ? "Si":"No")  + "\n" +"\n\t\tPrecio: " + this.precio + "\n---------------------------------------------" ;
    }
    
    public float valRest(){
        if(this.restaurante==(true));
            return 10;
        }
    
    public float valbaños(){
        return this.cantbanios * 2;
    }

    @Override
    public float precioFinal() {
        this.precio += this.valRest() + this.cantbanios;
        return this.precio;
    }

   
    
    
}

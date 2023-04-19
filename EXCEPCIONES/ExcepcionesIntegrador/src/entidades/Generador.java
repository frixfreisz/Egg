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
class Generador {
    private final double energiaMaxima = 1000000;
    private double energia;

    public Generador() {
    this.energia = energiaMaxima;
    }
    
    public double recargar(){
        this.energia = this.energiaMaxima;
        return this.energia;
    }
    
    public double consumir(double energiaConsumida){
        this.energia -= energiaConsumida;
        return this.energia;
        
    }
    
}

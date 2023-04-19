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
class Consola extends Dispositivo{
    public Consola(){
        this.consumoEnergiaBajo = 0.0001;
        this.consumoEnergiaNormal = 0.005;
        this.consumoEnergiaAlto = 0.0010;
    }
    
}

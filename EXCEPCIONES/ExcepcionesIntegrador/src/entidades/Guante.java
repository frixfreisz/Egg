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
class Guante extends Dispositivo implements I_propulsor{

    public Guante(){
        this.consumoEnergiaBajo = 0.0005;
        this.consumoEnergiaNormal = 0.0015;
        this.consumoEnergiaAlto = 0.0030;
    }
    
    @Override
    public boolean volar() {
     return false;   
    }
    
    
}

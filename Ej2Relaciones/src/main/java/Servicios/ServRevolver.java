/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Revolver;

/**
 *
 * @author Carlitos
 */
public class ServRevolver {

    public void llenarRevolver(Revolver r){
        System.out.println("Cargado");
        r.setPosActual(((int)Math.random()*6)+1);
        r.setPosAgua(((int)Math.random()*6)+1);
    }
    
    public boolean mojar(Revolver r){
        boolean coincide = false;
        if(r.getPosAgua() == r.getPosActual()){
            coincide = true;
        }return coincide;
        
    }
    
    public void siguienteChorro(Revolver r){
         if(r.getPosActual()==6){
             r.setPosActual(1);
         }else{
             r.setPosActual(r.getPosActual()+1);
         }
     
    }
}

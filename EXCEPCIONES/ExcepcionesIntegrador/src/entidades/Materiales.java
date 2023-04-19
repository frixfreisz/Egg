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
public class Materiales {
   public int nivelResistencia;
   
    public Materiales(TipoMaterial tipo){
        switch(tipo){
            case Acero:
                this.nivelResistencia = 100;
                break;
            case Adamantio:
                this.nivelResistencia = 150;
                break;
            case Aluminio:
                this.nivelResistencia = 10;
                break;
                                   
        }
        
    }
    
}

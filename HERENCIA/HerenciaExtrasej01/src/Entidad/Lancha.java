/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author Carlitos
 */
public class Lancha extends Barco{
    private Integer potencia;

    public Lancha() {
    }

  

    public Lancha(Integer potencia, String matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public Integer calcularModulo(){
        return super.calcularModulo()+ this.potencia; 
    }
    
}

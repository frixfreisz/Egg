/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Carlitos
 */
public class Yate extends Barco{
    private Integer potencia;
    private Integer camarotes;

    public Yate() {
    }

  
    public Yate(Integer potencia, Integer camarotes, String matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
    @Override
    public Integer calcularModulo(){
        return super.calcularModulo()+ this.camarotes + this.potencia; 
    }
}

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
public class Velero extends Barco{
    private Integer mastiles;

    public Velero() {
    }

      public Velero(Integer mastiles, String matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
    @Override
    public Integer calcularModulo(){
        return super.calcularModulo()+ this.mastiles; 
    }
    
}

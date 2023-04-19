/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Carlitos
 */
public class Arreglo {
 private int[] arreglo = new int[5];

    public Arreglo() {
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }    

    @Override
    public String toString() {
        return "Arreglo: " + this.arreglo.toString();
    }
    
}

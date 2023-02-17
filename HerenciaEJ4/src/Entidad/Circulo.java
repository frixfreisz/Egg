/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Interface.Calculo;

/**
 *
 * @author Carlitos
 */
public class Circulo implements Calculo {
 protected int radio;
 protected double area;
 protected double perimetro;
 
 public Circulo(int radio){
     this.radio = radio;
 }

    @Override
    public void area() {
        area = PI*radio*radio;
    }

    @Override
    public void perimetro() {
       perimetro = PI*radio*2;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
}

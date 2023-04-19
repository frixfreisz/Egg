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
public class Rectangulo implements Calculo{

    protected int base;
    protected int altura;
    protected int area;
    protected int perimetro;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area() {
        area = base * altura; 
    }

    @Override
    public void perimetro() {
        perimetro = base*2 + altura*2; 
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
}

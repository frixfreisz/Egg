/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebzaaaa;

/**
 *
 * @author Carlitos
 */

    public class entidad {

    private int num;
    private int den;

    public entidad() {
        this.num = 22;
        this.den = 48;
    }

    public entidad(int num, int den) {
        this.num = num;
        if(den==0){
            den = 1;
        }
        this.den = den;
        simplificar();
    }

    public entidad(int num) {
        this.num = num;
        this.den = 1;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //sumar fracciones
    public entidad sumar(entidad f) {
        entidad aux = new entidad();
        aux.num = this.num * f.den + this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla                                                   
        return aux;
    }
   
    //restar fracciones
    public entidad restar(entidad f) {
        entidad aux = new entidad();
        aux.num = this.num * f.den - this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //multiplicar fracciones
    public entidad multiplicar(entidad f) {
        entidad aux = new entidad();
        aux.num = this.num * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }

    //dividir fracciones
    public entidad dividir(entidad f) {
        entidad aux = new entidad();
        aux.num = this.num * f.den;
        aux.den = this.den * f.num;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //Cálculo del máximo común divisor por el algoritmo de Euclides                                               
    private int mcd() {
        int u = Math.abs(num); //valor absoluto del numerador
        int v = Math.abs(den); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    //método para simplificar fracciones
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        num = num / n;
        den = den / n;
    }

    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }    
} //Fin de la clase Fraccion


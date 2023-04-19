/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class Servicios {
    static Scanner leer = new Scanner(System.in);
    private double aux;

    public double getDiscriminante(Raiz m1) {

        System.out.println("Ingrese los Valores de A B  y C ");
        m1.setA(leer.nextDouble());
        m1.setB(leer.nextDouble());
        m1.setC(leer.nextDouble());

        this.aux = ((Math.pow(m1.getB(), 2)) - 4 * m1.getA() * m1.getC());

        System.out.println(" El DISCRIMINANTE ES  [ " + this.aux + "]");
        return this.aux;
    }

    // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//    que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raiz m2) {
        if (this.aux >= 0) {
            System.out.println("El discriminante tiene raices");
            return true;

        } else {
            System.out.println("El Discriminante No tiene raices");
            return false;
        }
        //     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    } ////que esto ocurra, el discriminante debe ser igual que 0.

    public boolean tieneRaiz(Raiz m3) {
        if (this.aux == 0) {
            System.out.println("El discriminante tiene una unica solucion ");
            return true;

        } else {
            System.out.println("El Discriminante No tiene una unica solucion ");
            return false;
        }
    }

/// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
////posibles soluciones.
    public Raiz obtenerRaices(Raiz m4) {
        Servicios sp = new Servicios();
        if (sp.tieneRaices(m4) == true) {
            System.out.println("SOLUCIONES  " +  m4.getC());
        }
return m4;
    }
}

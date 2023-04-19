
package jrel2.main;

import java.util.Scanner;
import servicios.ServJuego;
/**
 * Autor: Gonzalo Lucien Dominguez
 */

public class JRel2RuletaRusa {

    public static Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        ServJuego sj = new ServJuego();
        sj.ronda();
        
    } //end main

} //end JRel2RuletaRusa class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebzaaaa;

import java.util.Scanner;

public class PRUEBZAAAA {
static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
    entidad n = new entidad();
    int op = 0;
    boolean salir = false;
        System.out.println("1-suma");
        System.out.println("2-resta");
        System.out.println("3-mult");
        System.out.println("4-divi");
        System.out.println("5-MCD");
        System.out.println("6-simplificar");
        op = leer.nextInt();
    switch(op){
        case 1:
            System.out.println(n.sumar(n));
            break;
        case 2:
            System.out.println(n.restar(n));
            break;
        case 3:
            System.out.println(n.multiplicar(n));
            break;
        case 4:
            System.out.println(n.dividir(n));
        case 5:
            System.out.println();
        case 7:
            salir = true;
    }
    
    }
}



package introjava;

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = leer.nextInt();
        
        multiplo(num1, num2);

    } 

    public static void multiplo(int num1, int num2) {

        if (num1 % num2 == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es multiplo de " + num1);
        } else {
            System.out.println("Los numero no son multiplos entre si");
        }

    }
}
